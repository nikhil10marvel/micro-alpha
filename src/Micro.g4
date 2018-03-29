grammar Micro;

fragment LETTER: [a-z]|[A-Z];
fragment DIGIT: [0-9];
fragment HEX_DIGIT: DIGIT|[a-f]|[A-F];
fragment NOMSYM: [_];
fragment DOTSYM: [_|.];

FLOAT_ID: 'float';
DOUBLE_ID: 'double';
INT_ID: 'int';
VOID_ID: 'void';
UNION_DEF: 'union_def';
BOOL_ID: 'bool';
SHORT_ID: 'short';
LONG_ID:'long';
INTEGER: DIGIT+|HEXADECIMAL;
HEXADECIMAL:'0x'HEX_DIGIT+;
FLOAT: DIGIT+'.'DIGIT+('f'|'F');
DOUBLE: DIGIT+'.'DIGIT+('d'|'D')?;
STRING: '"' .*? '"';
TRUE: 'true' | 'True';
FALSE: 'false' | 'false';
IMPORT: 'import';
EOS: ';';
MODULE_SP: 'module';
CMTCH: '##';
MCOMO: '#^';
MCOMC: '^#';
DEF: 'def'|'DEF';
LPRM: '(';
RPRM: ')';
LBRC: '{';
RBRC: '}';
LSQB: '[';
RSQB: ']';
AND: 'and' | '&&';
OR: 'or' | '||';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
IF: 'if';
WHILE:'while';
EQ: '==';
NOT: 'not' | 'NOT' | '!';
CONST: 'const';
ELIF: 'elif';
ELSE: 'else';
PARAM_SEP: ',';
LOAD: 'require';
INCLUDE: 'include';
URL:'url';
CALL_t: '->';
UNION_t:'<<';
INIT: 'init';

SIMP_CHARS: LETTER(LETTER|DIGIT|NOMSYM)+;
COMPLEX_CHARS: LETTER(LETTER|DIGIT|DOTSYM)+;

type_id: INT_ID | DOUBLE_ID | FLOAT_ID | VOID_ID | BOOL_ID | SHORT_ID | LONG_ID;
id:SIMP_CHARS;
mid:COMPLEX_CHARS|id;

bx_type: type_id | id | mid;
type: TRUE | FALSE | id | mid | FLOAT | INTEGER | DOUBLE | STRING| func_call_out | func_call_local | expr | type_casting | array_ref | uval_get;

add: '+';
sub: '-';
mul: '*';
div: '/';

value: FLOAT | INTEGER | DOUBLE | func_call_local | func_call_out | LPRM expr RPRM | type_casting | mid | array_ref | uval_get;
negative_value: sub value;
expr: expr add expr
    | expr sub expr
    | expr mul expr
    | expr div expr
    | value
    | negative_value;

load_inst:LOAD URL? STRING;
include_inst: INCLUDE URL? STRING;
compiler_inst: load_inst
             | include_inst;

import_stmt: IMPORT mid EOS;
module_dec: MODULE_SP mid EOS;

/**
 * Variables
 */

field: 'var' CONST? ptype id ('=' type)? EOS;
array_def: type_id(LSQB type RSQB)+ id EOS;
formalParam: LPRM (type (PARAM_SEP type)*)? RPRM;
func_call_out: mid CALL_t id formalParam;
func_call_local: id formalParam;
func_call_local_stmt: func_call_local EOS;
func_call_out_stmt: func_call_out EOS;
varset: mid '=' type EOS;
local_vardef:CONST? ptype id ('=' type)? EOS;
array_ref: mid(LSQB type RSQB)+;
array_set_stmt: array_ref '=' type EOS;
type_casting: LPRM ptype RPRM type;
arrayname: bx_type(LSQB RSQB)+;
return_stmt: 'return' type EOS;

// INCREMENTALS
/*
varaddinc_stmt: id '+=' type EOS;
varsubinc_stmt: id '-=' type EOS;
varmulinc_stmt: id '*=' type EOS;
vardivinc_stmt: id '/=' type EOS;*/

// BOOL EXPR

greaterthan: type GT type;
lesserthan: type LT type;
greaterthanE: type GTE type;
lesserthanE: type LTE type;
notequalto: type '!=' type;
equalto: type EQ type;
false_con: 'FALSE' | 'False' | 'false';
true_con: 'TRUE' | 'True' | 'true';

boolval:
    type
    |greaterthan
    |lesserthan
    |greaterthanE
    |lesserthanE
    |equalto
    |notequalto
    |false_con
    |true_con
    ;

notboolval: NOT LPRM boolval RPRM;

logicexpr:  (boolval|notboolval|andboolexpr|orboolexpr);

enclosed_boolval: LPRM boolval RPRM;

andboolexpr: LPRM logicexpr RPRM AND LPRM logicexpr RPRM;
orboolexpr: LPRM logicexpr RPRM OR LPRM logicexpr RPRM;

boolexpr:
    boolval
    |andboolexpr
    |orboolexpr
    |enclosed_boolval
    ;

boolparseexpr: boolexpr | NOT boolexpr;
if_stmt: IF boolparseexpr LBRC stmt*? RBRC;
elif_stmt:ELIF boolparseexpr LBRC stmt*? RBRC;
else_stmt: ELSE LBRC stmt*? RBRC;
while_stmt: WHILE boolparseexpr LBRC stmt*? RBRC;
uval_stmt: mid':'id '=' type EOS;
uval_get: id UNION_t mid;

add_inc_stmt: mid '+=' type EOS;
sub_inc_stmt: mid '-=' type EOS;
mul_inc_stmt: mid '*=' type EOS;
div_inc_stmt: mid '/=' type EOS;

stmt
    : varset
    | func_call_out_stmt
    | func_call_local_stmt
    | local_vardef
    | array_set_stmt
    | if_stmt
    | elif_stmt
    | else_stmt
    | while_stmt
    | add_inc_stmt
    | sub_inc_stmt
    | mul_inc_stmt
    | div_inc_stmt
    | init_stmt
    | uval_stmt
    ;

/**
 * Functions are static
 * They go about like this
 * def <ret> <name> (parameter){<statements>}
 */

ptype: (bx_type|arrayname);
param: ptype id;
paramList: LPRM (param(PARAM_SEP param)*)? RPRM;
function: DEF bx_type id paramList LBRC stmt*? return_stmt? RBRC;

/**
 * Union section
 * uniondef id{
 *  mid = { field1, field2, field3 };
 *  ...
 * }
 */
elem: CONST? id;
specList: elem(PARAM_SEP elem)*;
union_def_key: id '=' LBRC specList RBRC EOS;
union_def: UNION_DEF id LBRC union_def_key* RBRC;

program:compiler_inst*? import_stmt* module_dec union_def* field* function*;

LINE_COMMENT
    : CMTCH~[\r\n]* -> channel(HIDDEN);

MULTI_COMMENT
    : MCOMO.*? MCOMC -> channel(HIDDEN);

WS: [\r\n\tab ] -> skip;