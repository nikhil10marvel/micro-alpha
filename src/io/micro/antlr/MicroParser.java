// Generated from /home/nikhil/Documents/Java/Micro/src/Micro.g4 by ANTLR 4.7
package io.micro.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, FLOAT_ID=24, 
		DOUBLE_ID=25, INT_ID=26, VOID_ID=27, UNION_DEF=28, BOOL_ID=29, SHORT_ID=30, 
		LONG_ID=31, INTEGER=32, HEXADECIMAL=33, FLOAT=34, DOUBLE=35, STRING=36, 
		TRUE=37, FALSE=38, IMPORT=39, EOS=40, MODULE_SP=41, CMTCH=42, MCOMO=43, 
		MCOMC=44, DEF=45, LPRM=46, RPRM=47, LBRC=48, RBRC=49, LSQB=50, RSQB=51, 
		AND=52, OR=53, LT=54, GT=55, LTE=56, GTE=57, IF=58, WHILE=59, FOR=60, 
		EQ=61, NOT=62, CONST=63, ELIF=64, ELSE=65, PARAM_SEP=66, LOAD=67, INCLUDE=68, 
		TRY=69, EXCEPT=70, URL=71, CALL_t=72, UNION_t=73, SIMP_CHARS=74, COMPLEX_CHARS=75, 
		LINE_COMMENT=76, MULTI_COMMENT=77, WS=78;
	public static final int
		RULE_type_id = 0, RULE_id = 1, RULE_mid = 2, RULE_bx_type = 3, RULE_type = 4, 
		RULE_add = 5, RULE_sub = 6, RULE_mul = 7, RULE_div = 8, RULE_mod = 9, 
		RULE_strcval = 10, RULE_string_concat = 11, RULE_value = 12, RULE_negative_value = 13, 
		RULE_expr = 14, RULE_load_inst = 15, RULE_include_inst = 16, RULE_compiler_inst = 17, 
		RULE_import_stmt = 18, RULE_module_dec = 19, RULE_field = 20, RULE_array_field = 21, 
		RULE_array_def = 22, RULE_formalParam = 23, RULE_func_call_out = 24, RULE_func_call_local = 25, 
		RULE_func_call_local_stmt = 26, RULE_func_call_out_stmt = 27, RULE_varset = 28, 
		RULE_local_vardef = 29, RULE_array_ref = 30, RULE_array_set_stmt = 31, 
		RULE_type_casting = 32, RULE_arrayname = 33, RULE_return_stmt = 34, RULE_greaterthan = 35, 
		RULE_lesserthan = 36, RULE_greaterthanE = 37, RULE_lesserthanE = 38, RULE_notequalto = 39, 
		RULE_equalto = 40, RULE_false_con = 41, RULE_true_con = 42, RULE_value_collection = 43, 
		RULE_boolval = 44, RULE_notboolval = 45, RULE_logicexpr = 46, RULE_enclosed_boolval = 47, 
		RULE_andboolexpr = 48, RULE_orboolexpr = 49, RULE_boolexpr = 50, RULE_boolparseexpr = 51, 
		RULE_if_stmt = 52, RULE_elif_stmt = 53, RULE_else_stmt = 54, RULE_while_stmt = 55, 
		RULE_tryblock = 56, RULE_exceptblock = 57, RULE_try_stmt = 58, RULE_for_stmt = 59, 
		RULE_foreach_stmt = 60, RULE_uval_stmt = 61, RULE_uval_get = 62, RULE_sub_inc = 63, 
		RULE_add_inc = 64, RULE_mul_inc = 65, RULE_div_inc = 66, RULE_add_inc_stmt = 67, 
		RULE_sub_inc_stmt = 68, RULE_mul_inc_stmt = 69, RULE_div_inc_stmt = 70, 
		RULE_var_Set = 71, RULE_stmt = 72, RULE_ptype = 73, RULE_param = 74, RULE_paramList = 75, 
		RULE_function = 76, RULE_elem = 77, RULE_specList = 78, RULE_union_def_key = 79, 
		RULE_union_def = 80, RULE_load_union_def = 81, RULE_program = 82;
	public static final String[] ruleNames = {
		"type_id", "id", "mid", "bx_type", "type", "add", "sub", "mul", "div", 
		"mod", "strcval", "string_concat", "value", "negative_value", "expr", 
		"load_inst", "include_inst", "compiler_inst", "import_stmt", "module_dec", 
		"field", "array_field", "array_def", "formalParam", "func_call_out", "func_call_local", 
		"func_call_local_stmt", "func_call_out_stmt", "varset", "local_vardef", 
		"array_ref", "array_set_stmt", "type_casting", "arrayname", "return_stmt", 
		"greaterthan", "lesserthan", "greaterthanE", "lesserthanE", "notequalto", 
		"equalto", "false_con", "true_con", "value_collection", "boolval", "notboolval", 
		"logicexpr", "enclosed_boolval", "andboolexpr", "orboolexpr", "boolexpr", 
		"boolparseexpr", "if_stmt", "elif_stmt", "else_stmt", "while_stmt", "tryblock", 
		"exceptblock", "try_stmt", "for_stmt", "foreach_stmt", "uval_stmt", "uval_get", 
		"sub_inc", "add_inc", "mul_inc", "div_inc", "add_inc_stmt", "sub_inc_stmt", 
		"mul_inc_stmt", "div_inc_stmt", "var_Set", "stmt", "ptype", "param", "paramList", 
		"function", "elem", "specList", "union_def_key", "union_def", "load_union_def", 
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'var'", "'='", "'return'", "'!='", 
		"'FALSE'", "'False'", "'false'", "'TRUE'", "'True'", "'true'", "'set'", 
		"'?'", "':'", "'-='", "'+='", "'*='", "'/='", "'@'", "'float'", "'double'", 
		"'int'", "'void'", "'union_def'", "'bool'", "'short'", "'long'", null, 
		null, null, null, null, null, null, "'import'", "';'", "'module'", "'##'", 
		"'#^'", "'^#'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", null, 
		null, "'<'", "'>'", "'<='", "'>='", "'if'", "'while'", "'for'", "'=='", 
		null, "'const'", "'elif'", "'else'", "','", "'require'", "'include'", 
		"'try'", "'except'", "'url'", "'->'", "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"FLOAT_ID", "DOUBLE_ID", "INT_ID", "VOID_ID", "UNION_DEF", "BOOL_ID", 
		"SHORT_ID", "LONG_ID", "INTEGER", "HEXADECIMAL", "FLOAT", "DOUBLE", "STRING", 
		"TRUE", "FALSE", "IMPORT", "EOS", "MODULE_SP", "CMTCH", "MCOMO", "MCOMC", 
		"DEF", "LPRM", "RPRM", "LBRC", "RBRC", "LSQB", "RSQB", "AND", "OR", "LT", 
		"GT", "LTE", "GTE", "IF", "WHILE", "FOR", "EQ", "NOT", "CONST", "ELIF", 
		"ELSE", "PARAM_SEP", "LOAD", "INCLUDE", "TRY", "EXCEPT", "URL", "CALL_t", 
		"UNION_t", "SIMP_CHARS", "COMPLEX_CHARS", "LINE_COMMENT", "MULTI_COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Type_idContext extends ParserRuleContext {
		public TerminalNode INT_ID() { return getToken(MicroParser.INT_ID, 0); }
		public TerminalNode DOUBLE_ID() { return getToken(MicroParser.DOUBLE_ID, 0); }
		public TerminalNode FLOAT_ID() { return getToken(MicroParser.FLOAT_ID, 0); }
		public TerminalNode VOID_ID() { return getToken(MicroParser.VOID_ID, 0); }
		public TerminalNode BOOL_ID() { return getToken(MicroParser.BOOL_ID, 0); }
		public TerminalNode SHORT_ID() { return getToken(MicroParser.SHORT_ID, 0); }
		public TerminalNode LONG_ID() { return getToken(MicroParser.LONG_ID, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT_ID) | (1L << DOUBLE_ID) | (1L << INT_ID) | (1L << VOID_ID) | (1L << BOOL_ID) | (1L << SHORT_ID) | (1L << LONG_ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode SIMP_CHARS() { return getToken(MicroParser.SIMP_CHARS, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(SIMP_CHARS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidContext extends ParserRuleContext {
		public TerminalNode COMPLEX_CHARS() { return getToken(MicroParser.COMPLEX_CHARS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMid(this);
		}
	}

	public final MidContext mid() throws RecognitionException {
		MidContext _localctx = new MidContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mid);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPLEX_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(COMPLEX_CHARS);
				}
				break;
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bx_typeContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Bx_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bx_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBx_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBx_type(this);
		}
	}

	public final Bx_typeContext bx_type() throws RecognitionException {
		Bx_typeContext _localctx = new Bx_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bx_type);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				type_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				mid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MicroParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MicroParser.FALSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(MicroParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(MicroParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(MicroParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MicroParser.STRING, 0); }
		public Func_call_outContext func_call_out() {
			return getRuleContext(Func_call_outContext.class,0);
		}
		public Func_call_localContext func_call_local() {
			return getRuleContext(Func_call_localContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_castingContext type_casting() {
			return getRuleContext(Type_castingContext.class,0);
		}
		public Array_refContext array_ref() {
			return getRuleContext(Array_refContext.class,0);
		}
		public Uval_getContext uval_get() {
			return getRuleContext(Uval_getContext.class,0);
		}
		public String_concatContext string_concat() {
			return getRuleContext(String_concatContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				mid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				func_call_out();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				func_call_local();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				expr(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(190);
				type_casting();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(191);
				array_ref();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(192);
				uval_get();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				string_concat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrcvalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MicroParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StrcvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strcval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStrcval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStrcval(this);
		}
	}

	public final StrcvalContext strcval() throws RecognitionException {
		StrcvalContext _localctx = new StrcvalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strcval);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(STRING);
				}
				break;
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case LPRM:
			case SIMP_CHARS:
			case COMPLEX_CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_concatContext extends ParserRuleContext {
		public List<StrcvalContext> strcval() {
			return getRuleContexts(StrcvalContext.class);
		}
		public StrcvalContext strcval(int i) {
			return getRuleContext(StrcvalContext.class,i);
		}
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public String_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterString_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitString_concat(this);
		}
	}

	public final String_concatContext string_concat() throws RecognitionException {
		String_concatContext _localctx = new String_concatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			strcval();
			setState(214); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(211);
					add();
					setState(212);
					strcval();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(MicroParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(MicroParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(MicroParser.DOUBLE, 0); }
		public Func_call_localContext func_call_local() {
			return getRuleContext(Func_call_localContext.class,0);
		}
		public Func_call_outContext func_call_out() {
			return getRuleContext(Func_call_outContext.class,0);
		}
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public Type_castingContext type_casting() {
			return getRuleContext(Type_castingContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Array_refContext array_ref() {
			return getRuleContext(Array_refContext.class,0);
		}
		public Uval_getContext uval_get() {
			return getRuleContext(Uval_getContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				func_call_local();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				func_call_out();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				match(LPRM);
				setState(224);
				expr(0);
				setState(225);
				match(RPRM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				type_casting();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				mid();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(229);
				array_ref();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(230);
				uval_get();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_valueContext extends ParserRuleContext {
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Negative_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterNegative_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitNegative_value(this);
		}
	}

	public final Negative_valueContext negative_value() throws RecognitionException {
		Negative_valueContext _localctx = new Negative_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_negative_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			sub();
			setState(234);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Negative_valueContext negative_value() {
			return getRuleContext(Negative_valueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case LPRM:
			case SIMP_CHARS:
			case COMPLEX_CHARS:
				{
				setState(237);
				value();
				}
				break;
			case T__1:
				{
				setState(238);
				negative_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(242);
						add();
						setState(243);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(246);
						sub();
						setState(247);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						mul();
						setState(251);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						div();
						setState(255);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						mod();
						setState(259);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Load_instContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(MicroParser.LOAD, 0); }
		public TerminalNode STRING() { return getToken(MicroParser.STRING, 0); }
		public TerminalNode URL() { return getToken(MicroParser.URL, 0); }
		public Load_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLoad_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLoad_inst(this);
		}
	}

	public final Load_instContext load_inst() throws RecognitionException {
		Load_instContext _localctx = new Load_instContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_load_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LOAD);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==URL) {
				{
				setState(267);
				match(URL);
				}
			}

			setState(270);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_instContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(MicroParser.INCLUDE, 0); }
		public TerminalNode STRING() { return getToken(MicroParser.STRING, 0); }
		public TerminalNode URL() { return getToken(MicroParser.URL, 0); }
		public Include_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterInclude_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitInclude_inst(this);
		}
	}

	public final Include_instContext include_inst() throws RecognitionException {
		Include_instContext _localctx = new Include_instContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_include_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(INCLUDE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==URL) {
				{
				setState(273);
				match(URL);
				}
			}

			setState(276);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_instContext extends ParserRuleContext {
		public Load_instContext load_inst() {
			return getRuleContext(Load_instContext.class,0);
		}
		public Include_instContext include_inst() {
			return getRuleContext(Include_instContext.class,0);
		}
		public Compiler_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCompiler_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCompiler_inst(this);
		}
	}

	public final Compiler_instContext compiler_inst() throws RecognitionException {
		Compiler_instContext _localctx = new Compiler_instContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compiler_inst);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				load_inst();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				include_inst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MicroParser.IMPORT, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitImport_stmt(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_import_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IMPORT);
			setState(283);
			mid();
			setState(284);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_decContext extends ParserRuleContext {
		public TerminalNode MODULE_SP() { return getToken(MicroParser.MODULE_SP, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Module_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterModule_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitModule_dec(this);
		}
	}

	public final Module_decContext module_dec() throws RecognitionException {
		Module_decContext _localctx = new Module_decContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_module_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(MODULE_SP);
			setState(287);
			mid();
			setState(288);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public PtypeContext ptype() {
			return getRuleContext(PtypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public TerminalNode CONST() { return getToken(MicroParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__5);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(291);
				match(CONST);
				}
			}

			setState(294);
			ptype();
			setState(295);
			id();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(296);
				match(T__6);
				setState(297);
				type();
				}
			}

			setState(300);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_fieldContext extends ParserRuleContext {
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public Array_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterArray_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitArray_field(this);
		}
	}

	public final Array_fieldContext array_field() throws RecognitionException {
		Array_fieldContext _localctx = new Array_fieldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__5);
			setState(303);
			array_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_defContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public List<TerminalNode> LSQB() { return getTokens(MicroParser.LSQB); }
		public TerminalNode LSQB(int i) {
			return getToken(MicroParser.LSQB, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> RSQB() { return getTokens(MicroParser.RSQB); }
		public TerminalNode RSQB(int i) {
			return getToken(MicroParser.RSQB, i);
		}
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterArray_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitArray_def(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			type_id();
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				match(LSQB);
				setState(307);
				type();
				setState(308);
				match(RSQB);
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSQB );
			setState(314);
			id();
			setState(315);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParamContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> PARAM_SEP() { return getTokens(MicroParser.PARAM_SEP); }
		public TerminalNode PARAM_SEP(int i) {
			return getToken(MicroParser.PARAM_SEP, i);
		}
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFormalParam(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LPRM);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << LPRM))) != 0) || _la==SIMP_CHARS || _la==COMPLEX_CHARS) {
				{
				setState(318);
				type();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(319);
					match(PARAM_SEP);
					setState(320);
					type();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_call_outContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode CALL_t() { return getToken(MicroParser.CALL_t, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParamContext formalParam() {
			return getRuleContext(FormalParamContext.class,0);
		}
		public Func_call_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_call_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_call_out(this);
		}
	}

	public final Func_call_outContext func_call_out() throws RecognitionException {
		Func_call_outContext _localctx = new Func_call_outContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func_call_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			mid();
			setState(331);
			match(CALL_t);
			setState(332);
			id();
			setState(333);
			formalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_call_localContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormalParamContext formalParam() {
			return getRuleContext(FormalParamContext.class,0);
		}
		public Func_call_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_call_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_call_local(this);
		}
	}

	public final Func_call_localContext func_call_local() throws RecognitionException {
		Func_call_localContext _localctx = new Func_call_localContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_func_call_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			id();
			setState(336);
			formalParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_call_local_stmtContext extends ParserRuleContext {
		public Func_call_localContext func_call_local() {
			return getRuleContext(Func_call_localContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Func_call_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_local_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_call_local_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_call_local_stmt(this);
		}
	}

	public final Func_call_local_stmtContext func_call_local_stmt() throws RecognitionException {
		Func_call_local_stmtContext _localctx = new Func_call_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_func_call_local_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			func_call_local();
			setState(339);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_call_out_stmtContext extends ParserRuleContext {
		public Func_call_outContext func_call_out() {
			return getRuleContext(Func_call_outContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Func_call_out_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_out_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_call_out_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_call_out_stmt(this);
		}
	}

	public final Func_call_out_stmtContext func_call_out_stmt() throws RecognitionException {
		Func_call_out_stmtContext _localctx = new Func_call_out_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_func_call_out_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			func_call_out();
			setState(342);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsetContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public VarsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVarset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVarset(this);
		}
	}

	public final VarsetContext varset() throws RecognitionException {
		VarsetContext _localctx = new VarsetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			mid();
			setState(345);
			match(T__6);
			setState(346);
			type();
			setState(347);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_vardefContext extends ParserRuleContext {
		public PtypeContext ptype() {
			return getRuleContext(PtypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public TerminalNode CONST() { return getToken(MicroParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Local_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLocal_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLocal_vardef(this);
		}
	}

	public final Local_vardefContext local_vardef() throws RecognitionException {
		Local_vardefContext _localctx = new Local_vardefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_local_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(349);
				match(CONST);
				}
			}

			setState(352);
			ptype();
			setState(353);
			id();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(354);
				match(T__6);
				setState(355);
				type();
				}
			}

			setState(358);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_refContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public List<TerminalNode> LSQB() { return getTokens(MicroParser.LSQB); }
		public TerminalNode LSQB(int i) {
			return getToken(MicroParser.LSQB, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> RSQB() { return getTokens(MicroParser.RSQB); }
		public TerminalNode RSQB(int i) {
			return getToken(MicroParser.RSQB, i);
		}
		public Array_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterArray_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitArray_ref(this);
		}
	}

	public final Array_refContext array_ref() throws RecognitionException {
		Array_refContext _localctx = new Array_refContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			mid();
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(361);
					match(LSQB);
					setState(362);
					type();
					setState(363);
					match(RSQB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_set_stmtContext extends ParserRuleContext {
		public Array_refContext array_ref() {
			return getRuleContext(Array_refContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Array_set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterArray_set_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitArray_set_stmt(this);
		}
	}

	public final Array_set_stmtContext array_set_stmt() throws RecognitionException {
		Array_set_stmtContext _localctx = new Array_set_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			array_ref();
			setState(370);
			match(T__6);
			setState(371);
			type();
			setState(372);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_castingContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public PtypeContext ptype() {
			return getRuleContext(PtypeContext.class,0);
		}
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_castingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterType_casting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitType_casting(this);
		}
	}

	public final Type_castingContext type_casting() throws RecognitionException {
		Type_castingContext _localctx = new Type_castingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(LPRM);
			setState(375);
			ptype();
			setState(376);
			match(RPRM);
			setState(377);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraynameContext extends ParserRuleContext {
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public List<TerminalNode> LSQB() { return getTokens(MicroParser.LSQB); }
		public TerminalNode LSQB(int i) {
			return getToken(MicroParser.LSQB, i);
		}
		public List<TerminalNode> RSQB() { return getTokens(MicroParser.RSQB); }
		public TerminalNode RSQB(int i) {
			return getToken(MicroParser.RSQB, i);
		}
		public ArraynameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterArrayname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitArrayname(this);
		}
	}

	public final ArraynameContext arrayname() throws RecognitionException {
		ArraynameContext _localctx = new ArraynameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			bx_type();
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				match(LSQB);
				setState(381);
				match(RSQB);
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSQB );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__7);
			setState(387);
			type();
			setState(388);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterthanContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(MicroParser.GT, 0); }
		public GreaterthanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterthan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterGreaterthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitGreaterthan(this);
		}
	}

	public final GreaterthanContext greaterthan() throws RecognitionException {
		GreaterthanContext _localctx = new GreaterthanContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_greaterthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			type();
			setState(391);
			match(GT);
			setState(392);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LesserthanContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LT() { return getToken(MicroParser.LT, 0); }
		public LesserthanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesserthan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLesserthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLesserthan(this);
		}
	}

	public final LesserthanContext lesserthan() throws RecognitionException {
		LesserthanContext _localctx = new LesserthanContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lesserthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			type();
			setState(395);
			match(LT);
			setState(396);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterthanEContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GTE() { return getToken(MicroParser.GTE, 0); }
		public GreaterthanEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterthanE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterGreaterthanE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitGreaterthanE(this);
		}
	}

	public final GreaterthanEContext greaterthanE() throws RecognitionException {
		GreaterthanEContext _localctx = new GreaterthanEContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_greaterthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			type();
			setState(399);
			match(GTE);
			setState(400);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LesserthanEContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LTE() { return getToken(MicroParser.LTE, 0); }
		public LesserthanEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesserthanE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLesserthanE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLesserthanE(this);
		}
	}

	public final LesserthanEContext lesserthanE() throws RecognitionException {
		LesserthanEContext _localctx = new LesserthanEContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lesserthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			type();
			setState(403);
			match(LTE);
			setState(404);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotequaltoContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public NotequaltoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notequalto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterNotequalto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitNotequalto(this);
		}
	}

	public final NotequaltoContext notequalto() throws RecognitionException {
		NotequaltoContext _localctx = new NotequaltoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_notequalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			type();
			setState(407);
			match(T__8);
			setState(408);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualtoContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MicroParser.EQ, 0); }
		public EqualtoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterEqualto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitEqualto(this);
		}
	}

	public final EqualtoContext equalto() throws RecognitionException {
		EqualtoContext _localctx = new EqualtoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			type();
			setState(411);
			match(EQ);
			setState(412);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class False_conContext extends ParserRuleContext {
		public False_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFalse_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFalse_con(this);
		}
	}

	public final False_conContext false_con() throws RecognitionException {
		False_conContext _localctx = new False_conContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_false_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_conContext extends ParserRuleContext {
		public True_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterTrue_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitTrue_con(this);
		}
	}

	public final True_conContext true_con() throws RecognitionException {
		True_conContext _localctx = new True_conContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_true_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_collectionContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(MicroParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(MicroParser.RSQB, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> PARAM_SEP() { return getTokens(MicroParser.PARAM_SEP); }
		public TerminalNode PARAM_SEP(int i) {
			return getToken(MicroParser.PARAM_SEP, i);
		}
		public Value_collectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterValue_collection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitValue_collection(this);
		}
	}

	public final Value_collectionContext value_collection() throws RecognitionException {
		Value_collectionContext _localctx = new Value_collectionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			type_id();
			setState(419);
			match(T__15);
			{
			setState(420);
			match(LSQB);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << LPRM))) != 0) || _la==SIMP_CHARS || _la==COMPLEX_CHARS) {
				{
				setState(421);
				type();
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEP) {
				{
				{
				setState(424);
				match(PARAM_SEP);
				setState(425);
				type();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RSQB);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolvalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GreaterthanContext greaterthan() {
			return getRuleContext(GreaterthanContext.class,0);
		}
		public LesserthanContext lesserthan() {
			return getRuleContext(LesserthanContext.class,0);
		}
		public GreaterthanEContext greaterthanE() {
			return getRuleContext(GreaterthanEContext.class,0);
		}
		public LesserthanEContext lesserthanE() {
			return getRuleContext(LesserthanEContext.class,0);
		}
		public EqualtoContext equalto() {
			return getRuleContext(EqualtoContext.class,0);
		}
		public NotequaltoContext notequalto() {
			return getRuleContext(NotequaltoContext.class,0);
		}
		public False_conContext false_con() {
			return getRuleContext(False_conContext.class,0);
		}
		public True_conContext true_con() {
			return getRuleContext(True_conContext.class,0);
		}
		public BoolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBoolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBoolval(this);
		}
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolval);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				greaterthan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				lesserthan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				greaterthanE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				lesserthanE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				equalto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				notequalto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				false_con();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(441);
				true_con();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotboolvalContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MicroParser.NOT, 0); }
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public NotboolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notboolval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterNotboolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitNotboolval(this);
		}
	}

	public final NotboolvalContext notboolval() throws RecognitionException {
		NotboolvalContext _localctx = new NotboolvalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_notboolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(NOT);
			setState(445);
			match(LPRM);
			setState(446);
			boolval();
			setState(447);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicexprContext extends ParserRuleContext {
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public NotboolvalContext notboolval() {
			return getRuleContext(NotboolvalContext.class,0);
		}
		public AndboolexprContext andboolexpr() {
			return getRuleContext(AndboolexprContext.class,0);
		}
		public OrboolexprContext orboolexpr() {
			return getRuleContext(OrboolexprContext.class,0);
		}
		public LogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLogicexpr(this);
		}
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		LogicexprContext _localctx = new LogicexprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_logicexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(449);
				boolval();
				}
				break;
			case 2:
				{
				setState(450);
				notboolval();
				}
				break;
			case 3:
				{
				setState(451);
				andboolexpr();
				}
				break;
			case 4:
				{
				setState(452);
				orboolexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enclosed_boolvalContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public Enclosed_boolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosed_boolval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterEnclosed_boolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitEnclosed_boolval(this);
		}
	}

	public final Enclosed_boolvalContext enclosed_boolval() throws RecognitionException {
		Enclosed_boolvalContext _localctx = new Enclosed_boolvalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enclosed_boolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LPRM);
			setState(456);
			boolval();
			setState(457);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndboolexprContext extends ParserRuleContext {
		public List<TerminalNode> LPRM() { return getTokens(MicroParser.LPRM); }
		public TerminalNode LPRM(int i) {
			return getToken(MicroParser.LPRM, i);
		}
		public List<LogicexprContext> logicexpr() {
			return getRuleContexts(LogicexprContext.class);
		}
		public LogicexprContext logicexpr(int i) {
			return getRuleContext(LogicexprContext.class,i);
		}
		public List<TerminalNode> RPRM() { return getTokens(MicroParser.RPRM); }
		public TerminalNode RPRM(int i) {
			return getToken(MicroParser.RPRM, i);
		}
		public TerminalNode AND() { return getToken(MicroParser.AND, 0); }
		public AndboolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andboolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAndboolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAndboolexpr(this);
		}
	}

	public final AndboolexprContext andboolexpr() throws RecognitionException {
		AndboolexprContext _localctx = new AndboolexprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_andboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(LPRM);
			setState(460);
			logicexpr();
			setState(461);
			match(RPRM);
			setState(462);
			match(AND);
			setState(463);
			match(LPRM);
			setState(464);
			logicexpr();
			setState(465);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrboolexprContext extends ParserRuleContext {
		public List<TerminalNode> LPRM() { return getTokens(MicroParser.LPRM); }
		public TerminalNode LPRM(int i) {
			return getToken(MicroParser.LPRM, i);
		}
		public List<LogicexprContext> logicexpr() {
			return getRuleContexts(LogicexprContext.class);
		}
		public LogicexprContext logicexpr(int i) {
			return getRuleContext(LogicexprContext.class,i);
		}
		public List<TerminalNode> RPRM() { return getTokens(MicroParser.RPRM); }
		public TerminalNode RPRM(int i) {
			return getToken(MicroParser.RPRM, i);
		}
		public TerminalNode OR() { return getToken(MicroParser.OR, 0); }
		public OrboolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orboolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterOrboolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitOrboolexpr(this);
		}
	}

	public final OrboolexprContext orboolexpr() throws RecognitionException {
		OrboolexprContext _localctx = new OrboolexprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_orboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LPRM);
			setState(468);
			logicexpr();
			setState(469);
			match(RPRM);
			setState(470);
			match(OR);
			setState(471);
			match(LPRM);
			setState(472);
			logicexpr();
			setState(473);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolexprContext extends ParserRuleContext {
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public AndboolexprContext andboolexpr() {
			return getRuleContext(AndboolexprContext.class,0);
		}
		public OrboolexprContext orboolexpr() {
			return getRuleContext(OrboolexprContext.class,0);
		}
		public Enclosed_boolvalContext enclosed_boolval() {
			return getRuleContext(Enclosed_boolvalContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBoolexpr(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_boolexpr);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				boolval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				andboolexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				orboolexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				enclosed_boolval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolparseexprContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MicroParser.NOT, 0); }
		public BoolparseexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolparseexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBoolparseexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBoolparseexpr(this);
		}
	}

	public final BoolparseexprContext boolparseexpr() throws RecognitionException {
		BoolparseexprContext _localctx = new BoolparseexprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_boolparseexpr);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case TRUE:
			case FALSE:
			case LPRM:
			case SIMP_CHARS:
			case COMPLEX_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				boolexpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(NOT);
				setState(483);
				boolexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MicroParser.IF, 0); }
		public BoolparseexprContext boolparseexpr() {
			return getRuleContext(BoolparseexprContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(IF);
			setState(487);
			boolparseexpr();
			setState(488);
			match(LBRC);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(489);
					stmt();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(495);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_stmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(MicroParser.ELIF, 0); }
		public BoolparseexprContext boolparseexpr() {
			return getRuleContext(BoolparseexprContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElif_stmt(this);
		}
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elif_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(ELIF);
			setState(498);
			boolparseexpr();
			setState(499);
			match(LBRC);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(500);
					stmt();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(506);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MicroParser.ELSE, 0); }
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElse_stmt(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_else_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ELSE);
			setState(509);
			match(LBRC);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(510);
					stmt();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(516);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MicroParser.WHILE, 0); }
		public BoolparseexprContext boolparseexpr() {
			return getRuleContext(BoolparseexprContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_while_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(WHILE);
			setState(519);
			boolparseexpr();
			setState(520);
			match(LBRC);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(521);
					stmt();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(527);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(MicroParser.TRY, 0); }
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tryblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(TRY);
			setState(530);
			match(LBRC);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(531);
					stmt();
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(537);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptblockContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(MicroParser.EXCEPT, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ExceptblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExceptblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExceptblock(this);
		}
	}

	public final ExceptblockContext exceptblock() throws RecognitionException {
		ExceptblockContext _localctx = new ExceptblockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_exceptblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(EXCEPT);
			setState(540);
			mid();
			setState(541);
			id();
			setState(542);
			match(LBRC);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(543);
					stmt();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(549);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_stmtContext extends ParserRuleContext {
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public ExceptblockContext exceptblock() {
			return getRuleContext(ExceptblockContext.class,0);
		}
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterTry_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitTry_stmt(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_try_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			tryblock();
			setState(552);
			exceptblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MicroParser.FOR, 0); }
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> EOS() { return getTokens(MicroParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(MicroParser.EOS, i);
		}
		public BoolparseexprContext boolparseexpr() {
			return getRuleContext(BoolparseexprContext.class,0);
		}
		public Var_SetContext var_Set() {
			return getRuleContext(Var_SetContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_for_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(FOR);
			setState(555);
			bx_type();
			setState(556);
			id();
			setState(557);
			match(T__6);
			setState(558);
			type();
			setState(559);
			match(EOS);
			setState(560);
			boolparseexpr();
			setState(561);
			match(EOS);
			setState(562);
			var_Set();
			setState(563);
			match(LBRC);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(564);
					stmt();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(570);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MicroParser.FOR, 0); }
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterForeach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitForeach_stmt(this);
		}
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_foreach_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(FOR);
			setState(573);
			bx_type();
			setState(574);
			id();
			setState(575);
			match(T__16);
			setState(576);
			mid();
			setState(577);
			match(LBRC);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(578);
					stmt();
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(584);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uval_stmtContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Uval_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uval_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterUval_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitUval_stmt(this);
		}
	}

	public final Uval_stmtContext uval_stmt() throws RecognitionException {
		Uval_stmtContext _localctx = new Uval_stmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_uval_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			mid();
			setState(587);
			match(T__17);
			setState(588);
			id();
			setState(589);
			match(T__6);
			setState(590);
			type();
			setState(591);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uval_getContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode UNION_t() { return getToken(MicroParser.UNION_t, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public Uval_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uval_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterUval_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitUval_get(this);
		}
	}

	public final Uval_getContext uval_get() throws RecognitionException {
		Uval_getContext _localctx = new Uval_getContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_uval_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			id();
			setState(594);
			match(UNION_t);
			setState(595);
			mid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_incContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Sub_incContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterSub_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitSub_inc(this);
		}
	}

	public final Sub_incContext sub_inc() throws RecognitionException {
		Sub_incContext _localctx = new Sub_incContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sub_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			mid();
			setState(598);
			match(T__18);
			setState(599);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_incContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Add_incContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAdd_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAdd_inc(this);
		}
	}

	public final Add_incContext add_inc() throws RecognitionException {
		Add_incContext _localctx = new Add_incContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_add_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			mid();
			setState(602);
			match(T__19);
			setState(603);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_incContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mul_incContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMul_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMul_inc(this);
		}
	}

	public final Mul_incContext mul_inc() throws RecognitionException {
		Mul_incContext _localctx = new Mul_incContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mul_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			mid();
			setState(606);
			match(T__20);
			setState(607);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_incContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Div_incContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDiv_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDiv_inc(this);
		}
	}

	public final Div_incContext div_inc() throws RecognitionException {
		Div_incContext _localctx = new Div_incContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_div_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			mid();
			setState(610);
			match(T__21);
			setState(611);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_inc_stmtContext extends ParserRuleContext {
		public Add_incContext add_inc() {
			return getRuleContext(Add_incContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Add_inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAdd_inc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAdd_inc_stmt(this);
		}
	}

	public final Add_inc_stmtContext add_inc_stmt() throws RecognitionException {
		Add_inc_stmtContext _localctx = new Add_inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_add_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			add_inc();
			setState(614);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_inc_stmtContext extends ParserRuleContext {
		public Sub_incContext sub_inc() {
			return getRuleContext(Sub_incContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Sub_inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterSub_inc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitSub_inc_stmt(this);
		}
	}

	public final Sub_inc_stmtContext sub_inc_stmt() throws RecognitionException {
		Sub_inc_stmtContext _localctx = new Sub_inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sub_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			sub_inc();
			setState(617);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_inc_stmtContext extends ParserRuleContext {
		public Mul_incContext mul_inc() {
			return getRuleContext(Mul_incContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Mul_inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMul_inc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMul_inc_stmt(this);
		}
	}

	public final Mul_inc_stmtContext mul_inc_stmt() throws RecognitionException {
		Mul_inc_stmtContext _localctx = new Mul_inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_mul_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			mul_inc();
			setState(620);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_inc_stmtContext extends ParserRuleContext {
		public Div_incContext div_inc() {
			return getRuleContext(Div_incContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Div_inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDiv_inc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDiv_inc_stmt(this);
		}
	}

	public final Div_inc_stmtContext div_inc_stmt() throws RecognitionException {
		Div_inc_stmtContext _localctx = new Div_inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_div_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			div_inc();
			setState(623);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_SetContext extends ParserRuleContext {
		public VarsetContext varset() {
			return getRuleContext(VarsetContext.class,0);
		}
		public Add_incContext add_inc() {
			return getRuleContext(Add_incContext.class,0);
		}
		public Sub_incContext sub_inc() {
			return getRuleContext(Sub_incContext.class,0);
		}
		public Mul_incContext mul_inc() {
			return getRuleContext(Mul_incContext.class,0);
		}
		public Div_incContext div_inc() {
			return getRuleContext(Div_incContext.class,0);
		}
		public Array_set_stmtContext array_set_stmt() {
			return getRuleContext(Array_set_stmtContext.class,0);
		}
		public Var_SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_Set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_Set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_Set(this);
		}
	}

	public final Var_SetContext var_Set() throws RecognitionException {
		Var_SetContext _localctx = new Var_SetContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_var_Set);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				varset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				add_inc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				sub_inc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				mul_inc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				div_inc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(630);
				array_set_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public VarsetContext varset() {
			return getRuleContext(VarsetContext.class,0);
		}
		public Func_call_out_stmtContext func_call_out_stmt() {
			return getRuleContext(Func_call_out_stmtContext.class,0);
		}
		public Func_call_local_stmtContext func_call_local_stmt() {
			return getRuleContext(Func_call_local_stmtContext.class,0);
		}
		public Local_vardefContext local_vardef() {
			return getRuleContext(Local_vardefContext.class,0);
		}
		public Array_set_stmtContext array_set_stmt() {
			return getRuleContext(Array_set_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public Add_inc_stmtContext add_inc_stmt() {
			return getRuleContext(Add_inc_stmtContext.class,0);
		}
		public Sub_inc_stmtContext sub_inc_stmt() {
			return getRuleContext(Sub_inc_stmtContext.class,0);
		}
		public Mul_inc_stmtContext mul_inc_stmt() {
			return getRuleContext(Mul_inc_stmtContext.class,0);
		}
		public Div_inc_stmtContext div_inc_stmt() {
			return getRuleContext(Div_inc_stmtContext.class,0);
		}
		public Uval_stmtContext uval_stmt() {
			return getRuleContext(Uval_stmtContext.class,0);
		}
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public Load_union_defContext load_union_def() {
			return getRuleContext(Load_union_defContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_stmt);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				varset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				func_call_out_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				func_call_local_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				local_vardef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				array_set_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(638);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(639);
				elif_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(640);
				else_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(641);
				while_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(642);
				try_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(643);
				add_inc_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(644);
				sub_inc_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(645);
				mul_inc_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(646);
				div_inc_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(647);
				uval_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(648);
				array_def();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(649);
				load_union_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtypeContext extends ParserRuleContext {
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public ArraynameContext arrayname() {
			return getRuleContext(ArraynameContext.class,0);
		}
		public PtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPtype(this);
		}
	}

	public final PtypeContext ptype() throws RecognitionException {
		PtypeContext _localctx = new PtypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ptype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(652);
				bx_type();
				}
				break;
			case 2:
				{
				setState(653);
				arrayname();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public PtypeContext ptype() {
			return getRuleContext(PtypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			ptype();
			setState(657);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public TerminalNode LPRM() { return getToken(MicroParser.LPRM, 0); }
		public TerminalNode RPRM() { return getToken(MicroParser.RPRM, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> PARAM_SEP() { return getTokens(MicroParser.PARAM_SEP); }
		public TerminalNode PARAM_SEP(int i) {
			return getToken(MicroParser.PARAM_SEP, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(LPRM);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (FLOAT_ID - 24)) | (1L << (DOUBLE_ID - 24)) | (1L << (INT_ID - 24)) | (1L << (VOID_ID - 24)) | (1L << (BOOL_ID - 24)) | (1L << (SHORT_ID - 24)) | (1L << (LONG_ID - 24)) | (1L << (SIMP_CHARS - 24)) | (1L << (COMPLEX_CHARS - 24)))) != 0)) {
				{
				setState(660);
				param();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(661);
					match(PARAM_SEP);
					setState(662);
					param();
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(670);
			match(RPRM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(MicroParser.DEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public ArraynameContext arrayname() {
			return getRuleContext(ArraynameContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(DEF);
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(673);
				bx_type();
				}
				break;
			case 2:
				{
				setState(674);
				arrayname();
				}
				break;
			}
			setState(677);
			id();
			setState(678);
			paramList();
			setState(679);
			match(LBRC);
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(680);
					stmt();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(686);
				return_stmt();
				}
			}

			setState(689);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode CONST() { return getToken(MicroParser.CONST, 0); }
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElem(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(691);
				match(CONST);
				}
			}

			setState(694);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecListContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<TerminalNode> PARAM_SEP() { return getTokens(MicroParser.PARAM_SEP); }
		public TerminalNode PARAM_SEP(int i) {
			return getToken(MicroParser.PARAM_SEP, i);
		}
		public SpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterSpecList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitSpecList(this);
		}
	}

	public final SpecListContext specList() throws RecognitionException {
		SpecListContext _localctx = new SpecListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_specList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			elem();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEP) {
				{
				{
				setState(697);
				match(PARAM_SEP);
				setState(698);
				elem();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_def_keyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public SpecListContext specList() {
			return getRuleContext(SpecListContext.class,0);
		}
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Union_def_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterUnion_def_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitUnion_def_key(this);
		}
	}

	public final Union_def_keyContext union_def_key() throws RecognitionException {
		Union_def_keyContext _localctx = new Union_def_keyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_union_def_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			id();
			setState(705);
			match(T__6);
			setState(706);
			match(LBRC);
			setState(707);
			specList();
			setState(708);
			match(RBRC);
			setState(709);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_defContext extends ParserRuleContext {
		public TerminalNode UNION_DEF() { return getToken(MicroParser.UNION_DEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public List<Union_def_keyContext> union_def_key() {
			return getRuleContexts(Union_def_keyContext.class);
		}
		public Union_def_keyContext union_def_key(int i) {
			return getRuleContext(Union_def_keyContext.class,i);
		}
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterUnion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitUnion_def(this);
		}
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_union_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(UNION_DEF);
			setState(712);
			id();
			setState(713);
			match(LBRC);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIMP_CHARS) {
				{
				{
				setState(714);
				union_def_key();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Load_union_defContext extends ParserRuleContext {
		public TerminalNode UNION_DEF() { return getToken(MicroParser.UNION_DEF, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public Load_union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterLoad_union_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitLoad_union_def(this);
		}
	}

	public final Load_union_defContext load_union_def() throws RecognitionException {
		Load_union_defContext _localctx = new Load_union_defContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_load_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(UNION_DEF);
			setState(723);
			match(T__22);
			setState(724);
			mid();
			setState(725);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Module_decContext module_dec() {
			return getRuleContext(Module_decContext.class,0);
		}
		public List<Compiler_instContext> compiler_inst() {
			return getRuleContexts(Compiler_instContext.class);
		}
		public Compiler_instContext compiler_inst(int i) {
			return getRuleContext(Compiler_instContext.class,i);
		}
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public List<Union_defContext> union_def() {
			return getRuleContexts(Union_defContext.class);
		}
		public Union_defContext union_def(int i) {
			return getRuleContext(Union_defContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<Array_fieldContext> array_field() {
			return getRuleContexts(Array_fieldContext.class);
		}
		public Array_fieldContext array_field(int i) {
			return getRuleContext(Array_fieldContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(727);
					compiler_inst();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(733);
				import_stmt();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			module_dec();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION_DEF) {
				{
				{
				setState(740);
				union_def();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				setState(748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(746);
					field();
					}
					break;
				case 2:
					{
					setState(747);
					array_field();
					}
					break;
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(753);
				function();
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u02fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u00af\n\4\3\5\3\5\3\5\5\5\u00b4\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c5\n\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u00d3\n\f\3\r\3\r"+
		"\3\r\3\r\6\r\u00d9\n\r\r\r\16\r\u00da\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00f2\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0108\n\20"+
		"\f\20\16\20\u010b\13\20\3\21\3\21\5\21\u010f\n\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0115\n\22\3\22\3\22\3\23\3\23\5\23\u011b\n\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0127\n\26\3\26\3\26\3\26\3\26"+
		"\5\26\u012d\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\6\30"+
		"\u0139\n\30\r\30\16\30\u013a\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0144"+
		"\n\31\f\31\16\31\u0147\13\31\5\31\u0149\n\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\5\37\u0161\n\37\3\37\3\37\3\37\3\37\5\37\u0167\n\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \6 \u0170\n \r \16 \u0171\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\6#\u0181\n#\r#\16#\u0182\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3-\3-\5-\u01a9\n-\3-\3-\7-\u01ad\n-\f-\16-\u01b0\13-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01bd\n.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\5\60\u01c8\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\5\64\u01e2\n\64\3\65\3\65\3\65\5\65\u01e7\n\65\3\66\3\66\3\66\3"+
		"\66\7\66\u01ed\n\66\f\66\16\66\u01f0\13\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\7\67\u01f8\n\67\f\67\16\67\u01fb\13\67\3\67\3\67\38\38\38\78\u0202"+
		"\n8\f8\168\u0205\138\38\38\39\39\39\39\79\u020d\n9\f9\169\u0210\139\3"+
		"9\39\3:\3:\3:\7:\u0217\n:\f:\16:\u021a\13:\3:\3:\3;\3;\3;\3;\3;\7;\u0223"+
		"\n;\f;\16;\u0226\13;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7"+
		"=\u0238\n=\f=\16=\u023b\13=\3=\3=\3>\3>\3>\3>\3>\3>\3>\7>\u0246\n>\f>"+
		"\16>\u0249\13>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3"+
		"I\3I\3I\3I\3I\3I\5I\u027a\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\5J\u028d\nJ\3K\3K\5K\u0291\nK\3L\3L\3L\3M\3M\3M\3M\7M\u029a"+
		"\nM\fM\16M\u029d\13M\5M\u029f\nM\3M\3M\3N\3N\3N\5N\u02a6\nN\3N\3N\3N\3"+
		"N\7N\u02ac\nN\fN\16N\u02af\13N\3N\5N\u02b2\nN\3N\3N\3O\5O\u02b7\nO\3O"+
		"\3O\3P\3P\3P\7P\u02be\nP\fP\16P\u02c1\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\3R\7R\u02ce\nR\fR\16R\u02d1\13R\3R\3R\3S\3S\3S\3S\3S\3T\7T\u02db\nT"+
		"\fT\16T\u02de\13T\3T\7T\u02e1\nT\fT\16T\u02e4\13T\3T\3T\7T\u02e8\nT\f"+
		"T\16T\u02eb\13T\3T\3T\7T\u02ef\nT\fT\16T\u02f2\13T\3T\7T\u02f5\nT\fT\16"+
		"T\u02f8\13T\3T\f\u01ee\u01f9\u0203\u020e\u0218\u0224\u0239\u0247\u02ad"+
		"\u02dc\3\36U\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\2\5\4\2\32\35\37!\3\2\f\16\3\2\17\21\2\u0311\2\u00a8"+
		"\3\2\2\2\4\u00aa\3\2\2\2\6\u00ae\3\2\2\2\b\u00b3\3\2\2\2\n\u00c4\3\2\2"+
		"\2\f\u00c6\3\2\2\2\16\u00c8\3\2\2\2\20\u00ca\3\2\2\2\22\u00cc\3\2\2\2"+
		"\24\u00ce\3\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3\2\2\2\32\u00e9\3\2\2\2\34"+
		"\u00eb\3\2\2\2\36\u00f1\3\2\2\2 \u010c\3\2\2\2\"\u0112\3\2\2\2$\u011a"+
		"\3\2\2\2&\u011c\3\2\2\2(\u0120\3\2\2\2*\u0124\3\2\2\2,\u0130\3\2\2\2."+
		"\u0133\3\2\2\2\60\u013f\3\2\2\2\62\u014c\3\2\2\2\64\u0151\3\2\2\2\66\u0154"+
		"\3\2\2\28\u0157\3\2\2\2:\u015a\3\2\2\2<\u0160\3\2\2\2>\u016a\3\2\2\2@"+
		"\u0173\3\2\2\2B\u0178\3\2\2\2D\u017d\3\2\2\2F\u0184\3\2\2\2H\u0188\3\2"+
		"\2\2J\u018c\3\2\2\2L\u0190\3\2\2\2N\u0194\3\2\2\2P\u0198\3\2\2\2R\u019c"+
		"\3\2\2\2T\u01a0\3\2\2\2V\u01a2\3\2\2\2X\u01a4\3\2\2\2Z\u01bc\3\2\2\2\\"+
		"\u01be\3\2\2\2^\u01c7\3\2\2\2`\u01c9\3\2\2\2b\u01cd\3\2\2\2d\u01d5\3\2"+
		"\2\2f\u01e1\3\2\2\2h\u01e6\3\2\2\2j\u01e8\3\2\2\2l\u01f3\3\2\2\2n\u01fe"+
		"\3\2\2\2p\u0208\3\2\2\2r\u0213\3\2\2\2t\u021d\3\2\2\2v\u0229\3\2\2\2x"+
		"\u022c\3\2\2\2z\u023e\3\2\2\2|\u024c\3\2\2\2~\u0253\3\2\2\2\u0080\u0257"+
		"\3\2\2\2\u0082\u025b\3\2\2\2\u0084\u025f\3\2\2\2\u0086\u0263\3\2\2\2\u0088"+
		"\u0267\3\2\2\2\u008a\u026a\3\2\2\2\u008c\u026d\3\2\2\2\u008e\u0270\3\2"+
		"\2\2\u0090\u0279\3\2\2\2\u0092\u028c\3\2\2\2\u0094\u0290\3\2\2\2\u0096"+
		"\u0292\3\2\2\2\u0098\u0295\3\2\2\2\u009a\u02a2\3\2\2\2\u009c\u02b6\3\2"+
		"\2\2\u009e\u02ba\3\2\2\2\u00a0\u02c2\3\2\2\2\u00a2\u02c9\3\2\2\2\u00a4"+
		"\u02d4\3\2\2\2\u00a6\u02dc\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\3\3\2\2\2"+
		"\u00aa\u00ab\7L\2\2\u00ab\5\3\2\2\2\u00ac\u00af\7M\2\2\u00ad\u00af\5\4"+
		"\3\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\7\3\2\2\2\u00b0\u00b4"+
		"\5\2\2\2\u00b1\u00b4\5\4\3\2\u00b2\u00b4\5\6\4\2\u00b3\u00b0\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\t\3\2\2\2\u00b5\u00c5\7\'\2\2"+
		"\u00b6\u00c5\7(\2\2\u00b7\u00c5\5\4\3\2\u00b8\u00c5\5\6\4\2\u00b9\u00c5"+
		"\7$\2\2\u00ba\u00c5\7\"\2\2\u00bb\u00c5\7%\2\2\u00bc\u00c5\7&\2\2\u00bd"+
		"\u00c5\5\62\32\2\u00be\u00c5\5\64\33\2\u00bf\u00c5\5\36\20\2\u00c0\u00c5"+
		"\5B\"\2\u00c1\u00c5\5> \2\u00c2\u00c5\5~@\2\u00c3\u00c5\5\30\r\2\u00c4"+
		"\u00b5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00b7\3\2\2\2\u00c4\u00b8\3\2"+
		"\2\2\u00c4\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4"+
		"\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\13\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\r\3\2\2\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\17\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\21\3\2\2\2\u00cc"+
		"\u00cd\7\6\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf\25\3\2\2\2\u00d0"+
		"\u00d3\7&\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\27\3\2\2\2\u00d4\u00d8\5\26\f\2\u00d5\u00d6\5\f\7\2\u00d6"+
		"\u00d7\5\26\f\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\31\3\2\2\2\u00dc"+
		"\u00ea\7$\2\2\u00dd\u00ea\7\"\2\2\u00de\u00ea\7%\2\2\u00df\u00ea\5\64"+
		"\33\2\u00e0\u00ea\5\62\32\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\5\36\20\2"+
		"\u00e3\u00e4\7\61\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00ea\5B\"\2\u00e6\u00ea"+
		"\5\6\4\2\u00e7\u00ea\5> \2\u00e8\u00ea\5~@\2\u00e9\u00dc\3\2\2\2\u00e9"+
		"\u00dd\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\5\16\b"+
		"\2\u00ec\u00ed\5\32\16\2\u00ed\35\3\2\2\2\u00ee\u00ef\b\20\1\2\u00ef\u00f2"+
		"\5\32\16\2\u00f0\u00f2\5\34\17\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0\3\2\2"+
		"\2\u00f2\u0109\3\2\2\2\u00f3\u00f4\f\t\2\2\u00f4\u00f5\5\f\7\2\u00f5\u00f6"+
		"\5\36\20\n\u00f6\u0108\3\2\2\2\u00f7\u00f8\f\b\2\2\u00f8\u00f9\5\16\b"+
		"\2\u00f9\u00fa\5\36\20\t\u00fa\u0108\3\2\2\2\u00fb\u00fc\f\7\2\2\u00fc"+
		"\u00fd\5\20\t\2\u00fd\u00fe\5\36\20\b\u00fe\u0108\3\2\2\2\u00ff\u0100"+
		"\f\6\2\2\u0100\u0101\5\22\n\2\u0101\u0102\5\36\20\7\u0102\u0108\3\2\2"+
		"\2\u0103\u0104\f\5\2\2\u0104\u0105\5\24\13\2\u0105\u0106\5\36\20\6\u0106"+
		"\u0108\3\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00f7\3\2\2\2\u0107\u00fb\3\2"+
		"\2\2\u0107\u00ff\3\2\2\2\u0107\u0103\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\37\3\2\2\2\u010b\u0109\3\2\2"+
		"\2\u010c\u010e\7E\2\2\u010d\u010f\7I\2\2\u010e\u010d\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7&\2\2\u0111!\3\2\2\2\u0112\u0114"+
		"\7F\2\2\u0113\u0115\7I\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7&\2\2\u0117#\3\2\2\2\u0118\u011b\5 \21\2\u0119"+
		"\u011b\5\"\22\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b%\3\2\2\2"+
		"\u011c\u011d\7)\2\2\u011d\u011e\5\6\4\2\u011e\u011f\7*\2\2\u011f\'\3\2"+
		"\2\2\u0120\u0121\7+\2\2\u0121\u0122\5\6\4\2\u0122\u0123\7*\2\2\u0123)"+
		"\3\2\2\2\u0124\u0126\7\b\2\2\u0125\u0127\7A\2\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\u0094K\2\u0129\u012c"+
		"\5\4\3\2\u012a\u012b\7\t\2\2\u012b\u012d\5\n\6\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7*\2\2\u012f+\3\2\2\2\u0130"+
		"\u0131\7\b\2\2\u0131\u0132\5.\30\2\u0132-\3\2\2\2\u0133\u0138\5\2\2\2"+
		"\u0134\u0135\7\64\2\2\u0135\u0136\5\n\6\2\u0136\u0137\7\65\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5\4\3\2\u013d\u013e\7*"+
		"\2\2\u013e/\3\2\2\2\u013f\u0148\7\60\2\2\u0140\u0145\5\n\6\2\u0141\u0142"+
		"\7D\2\2\u0142\u0144\5\n\6\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0148\u0140\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7\61\2\2\u014b\61\3\2\2\2\u014c\u014d\5\6\4\2\u014d\u014e\7J\2"+
		"\2\u014e\u014f\5\4\3\2\u014f\u0150\5\60\31\2\u0150\63\3\2\2\2\u0151\u0152"+
		"\5\4\3\2\u0152\u0153\5\60\31\2\u0153\65\3\2\2\2\u0154\u0155\5\64\33\2"+
		"\u0155\u0156\7*\2\2\u0156\67\3\2\2\2\u0157\u0158\5\62\32\2\u0158\u0159"+
		"\7*\2\2\u01599\3\2\2\2\u015a\u015b\5\6\4\2\u015b\u015c\7\t\2\2\u015c\u015d"+
		"\5\n\6\2\u015d\u015e\7*\2\2\u015e;\3\2\2\2\u015f\u0161\7A\2\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\5\u0094K"+
		"\2\u0163\u0166\5\4\3\2\u0164\u0165\7\t\2\2\u0165\u0167\5\n\6\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7*\2\2\u0169"+
		"=\3\2\2\2\u016a\u016f\5\6\4\2\u016b\u016c\7\64\2\2\u016c\u016d\5\n\6\2"+
		"\u016d\u016e\7\65\2\2\u016e\u0170\3\2\2\2\u016f\u016b\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172?\3\2\2\2\u0173"+
		"\u0174\5> \2\u0174\u0175\7\t\2\2\u0175\u0176\5\n\6\2\u0176\u0177\7*\2"+
		"\2\u0177A\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017a\5\u0094K\2\u017a\u017b"+
		"\7\61\2\2\u017b\u017c\5\n\6\2\u017cC\3\2\2\2\u017d\u0180\5\b\5\2\u017e"+
		"\u017f\7\64\2\2\u017f\u0181\7\65\2\2\u0180\u017e\3\2\2\2\u0181\u0182\3"+
		"\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183E\3\2\2\2\u0184\u0185"+
		"\7\n\2\2\u0185\u0186\5\n\6\2\u0186\u0187\7*\2\2\u0187G\3\2\2\2\u0188\u0189"+
		"\5\n\6\2\u0189\u018a\79\2\2\u018a\u018b\5\n\6\2\u018bI\3\2\2\2\u018c\u018d"+
		"\5\n\6\2\u018d\u018e\78\2\2\u018e\u018f\5\n\6\2\u018fK\3\2\2\2\u0190\u0191"+
		"\5\n\6\2\u0191\u0192\7;\2\2\u0192\u0193\5\n\6\2\u0193M\3\2\2\2\u0194\u0195"+
		"\5\n\6\2\u0195\u0196\7:\2\2\u0196\u0197\5\n\6\2\u0197O\3\2\2\2\u0198\u0199"+
		"\5\n\6\2\u0199\u019a\7\13\2\2\u019a\u019b\5\n\6\2\u019bQ\3\2\2\2\u019c"+
		"\u019d\5\n\6\2\u019d\u019e\7?\2\2\u019e\u019f\5\n\6\2\u019fS\3\2\2\2\u01a0"+
		"\u01a1\t\3\2\2\u01a1U\3\2\2\2\u01a2\u01a3\t\4\2\2\u01a3W\3\2\2\2\u01a4"+
		"\u01a5\5\2\2\2\u01a5\u01a6\7\22\2\2\u01a6\u01a8\7\64\2\2\u01a7\u01a9\5"+
		"\n\6\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ae\3\2\2\2\u01aa"+
		"\u01ab\7D\2\2\u01ab\u01ad\5\n\6\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b2\7\65\2\2\u01b2Y\3\2\2\2\u01b3\u01bd\5\n\6\2"+
		"\u01b4\u01bd\5H%\2\u01b5\u01bd\5J&\2\u01b6\u01bd\5L\'\2\u01b7\u01bd\5"+
		"N(\2\u01b8\u01bd\5R*\2\u01b9\u01bd\5P)\2\u01ba\u01bd\5T+\2\u01bb\u01bd"+
		"\5V,\2\u01bc\u01b3\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc"+
		"\u01b6\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01b9\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd[\3\2\2\2\u01be\u01bf"+
		"\7@\2\2\u01bf\u01c0\7\60\2\2\u01c0\u01c1\5Z.\2\u01c1\u01c2\7\61\2\2\u01c2"+
		"]\3\2\2\2\u01c3\u01c8\5Z.\2\u01c4\u01c8\5\\/\2\u01c5\u01c8\5b\62\2\u01c6"+
		"\u01c8\5d\63\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c6\3\2\2\2\u01c8_\3\2\2\2\u01c9\u01ca\7\60\2\2\u01ca\u01cb"+
		"\5Z.\2\u01cb\u01cc\7\61\2\2\u01cca\3\2\2\2\u01cd\u01ce\7\60\2\2\u01ce"+
		"\u01cf\5^\60\2\u01cf\u01d0\7\61\2\2\u01d0\u01d1\7\66\2\2\u01d1\u01d2\7"+
		"\60\2\2\u01d2\u01d3\5^\60\2\u01d3\u01d4\7\61\2\2\u01d4c\3\2\2\2\u01d5"+
		"\u01d6\7\60\2\2\u01d6\u01d7\5^\60\2\u01d7\u01d8\7\61\2\2\u01d8\u01d9\7"+
		"\67\2\2\u01d9\u01da\7\60\2\2\u01da\u01db\5^\60\2\u01db\u01dc\7\61\2\2"+
		"\u01dce\3\2\2\2\u01dd\u01e2\5Z.\2\u01de\u01e2\5b\62\2\u01df\u01e2\5d\63"+
		"\2\u01e0\u01e2\5`\61\2\u01e1\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2g\3\2\2\2\u01e3\u01e7\5f\64\2\u01e4"+
		"\u01e5\7@\2\2\u01e5\u01e7\5f\64\2\u01e6\u01e3\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7i\3\2\2\2\u01e8\u01e9\7<\2\2\u01e9\u01ea\5h\65\2\u01ea\u01ee"+
		"\7\62\2\2\u01eb\u01ed\5\u0092J\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f1\u01f2\7\63\2\2\u01f2k\3\2\2\2\u01f3\u01f4\7B\2\2\u01f4"+
		"\u01f5\5h\65\2\u01f5\u01f9\7\62\2\2\u01f6\u01f8\5\u0092J\2\u01f7\u01f6"+
		"\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\63\2\2\u01fdm\3\2\2\2"+
		"\u01fe\u01ff\7C\2\2\u01ff\u0203\7\62\2\2\u0200\u0202\5\u0092J\2\u0201"+
		"\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0204\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\63\2\2\u0207"+
		"o\3\2\2\2\u0208\u0209\7=\2\2\u0209\u020a\5h\65\2\u020a\u020e\7\62\2\2"+
		"\u020b\u020d\5\u0092J\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2"+
		"\2\2\u0211\u0212\7\63\2\2\u0212q\3\2\2\2\u0213\u0214\7G\2\2\u0214\u0218"+
		"\7\62\2\2\u0215\u0217\5\u0092J\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2"+
		"\2\u0218\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021c\7\63\2\2\u021cs\3\2\2\2\u021d\u021e\7H\2\2\u021e"+
		"\u021f\5\6\4\2\u021f\u0220\5\4\3\2\u0220\u0224\7\62\2\2\u0221\u0223\5"+
		"\u0092J\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0225\3\2\2\2"+
		"\u0224\u0222\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228"+
		"\7\63\2\2\u0228u\3\2\2\2\u0229\u022a\5r:\2\u022a\u022b\5t;\2\u022bw\3"+
		"\2\2\2\u022c\u022d\7>\2\2\u022d\u022e\5\b\5\2\u022e\u022f\5\4\3\2\u022f"+
		"\u0230\7\t\2\2\u0230\u0231\5\n\6\2\u0231\u0232\7*\2\2\u0232\u0233\5h\65"+
		"\2\u0233\u0234\7*\2\2\u0234\u0235\5\u0090I\2\u0235\u0239\7\62\2\2\u0236"+
		"\u0238\5\u0092J\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c"+
		"\u023d\7\63\2\2\u023dy\3\2\2\2\u023e\u023f\7>\2\2\u023f\u0240\5\b\5\2"+
		"\u0240\u0241\5\4\3\2\u0241\u0242\7\23\2\2\u0242\u0243\5\6\4\2\u0243\u0247"+
		"\7\62\2\2\u0244\u0246\5\u0092J\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u024a\u024b\7\63\2\2\u024b{\3\2\2\2\u024c\u024d\5\6\4\2\u024d"+
		"\u024e\7\24\2\2\u024e\u024f\5\4\3\2\u024f\u0250\7\t\2\2\u0250\u0251\5"+
		"\n\6\2\u0251\u0252\7*\2\2\u0252}\3\2\2\2\u0253\u0254\5\4\3\2\u0254\u0255"+
		"\7K\2\2\u0255\u0256\5\6\4\2\u0256\177\3\2\2\2\u0257\u0258\5\6\4\2\u0258"+
		"\u0259\7\25\2\2\u0259\u025a\5\n\6\2\u025a\u0081\3\2\2\2\u025b\u025c\5"+
		"\6\4\2\u025c\u025d\7\26\2\2\u025d\u025e\5\n\6\2\u025e\u0083\3\2\2\2\u025f"+
		"\u0260\5\6\4\2\u0260\u0261\7\27\2\2\u0261\u0262\5\n\6\2\u0262\u0085\3"+
		"\2\2\2\u0263\u0264\5\6\4\2\u0264\u0265\7\30\2\2\u0265\u0266\5\n\6\2\u0266"+
		"\u0087\3\2\2\2\u0267\u0268\5\u0082B\2\u0268\u0269\7*\2\2\u0269\u0089\3"+
		"\2\2\2\u026a\u026b\5\u0080A\2\u026b\u026c\7*\2\2\u026c\u008b\3\2\2\2\u026d"+
		"\u026e\5\u0084C\2\u026e\u026f\7*\2\2\u026f\u008d\3\2\2\2\u0270\u0271\5"+
		"\u0086D\2\u0271\u0272\7*\2\2\u0272\u008f\3\2\2\2\u0273\u027a\5:\36\2\u0274"+
		"\u027a\5\u0082B\2\u0275\u027a\5\u0080A\2\u0276\u027a\5\u0084C\2\u0277"+
		"\u027a\5\u0086D\2\u0278\u027a\5@!\2\u0279\u0273\3\2\2\2\u0279\u0274\3"+
		"\2\2\2\u0279\u0275\3\2\2\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u0278\3\2\2\2\u027a\u0091\3\2\2\2\u027b\u028d\5:\36\2\u027c\u028d\58"+
		"\35\2\u027d\u028d\5\66\34\2\u027e\u028d\5<\37\2\u027f\u028d\5@!\2\u0280"+
		"\u028d\5j\66\2\u0281\u028d\5l\67\2\u0282\u028d\5n8\2\u0283\u028d\5p9\2"+
		"\u0284\u028d\5v<\2\u0285\u028d\5\u0088E\2\u0286\u028d\5\u008aF\2\u0287"+
		"\u028d\5\u008cG\2\u0288\u028d\5\u008eH\2\u0289\u028d\5|?\2\u028a\u028d"+
		"\5.\30\2\u028b\u028d\5\u00a4S\2\u028c\u027b\3\2\2\2\u028c\u027c\3\2\2"+
		"\2\u028c\u027d\3\2\2\2\u028c\u027e\3\2\2\2\u028c\u027f\3\2\2\2\u028c\u0280"+
		"\3\2\2\2\u028c\u0281\3\2\2\2\u028c\u0282\3\2\2\2\u028c\u0283\3\2\2\2\u028c"+
		"\u0284\3\2\2\2\u028c\u0285\3\2\2\2\u028c\u0286\3\2\2\2\u028c\u0287\3\2"+
		"\2\2\u028c\u0288\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028b\3\2\2\2\u028d\u0093\3\2\2\2\u028e\u0291\5\b\5\2\u028f\u0291\5D"+
		"#\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291\u0095\3\2\2\2\u0292"+
		"\u0293\5\u0094K\2\u0293\u0294\5\4\3\2\u0294\u0097\3\2\2\2\u0295\u029e"+
		"\7\60\2\2\u0296\u029b\5\u0096L\2\u0297\u0298\7D\2\2\u0298\u029a\5\u0096"+
		"L\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u0296\3\2"+
		"\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\61\2\2\u02a1"+
		"\u0099\3\2\2\2\u02a2\u02a5\7/\2\2\u02a3\u02a6\5\b\5\2\u02a4\u02a6\5D#"+
		"\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8"+
		"\5\4\3\2\u02a8\u02a9\5\u0098M\2\u02a9\u02ad\7\62\2\2\u02aa\u02ac\5\u0092"+
		"J\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b2\5F"+
		"$\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b4\7\63\2\2\u02b4\u009b\3\2\2\2\u02b5\u02b7\7A\2\2\u02b6\u02b5\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\5\4\3\2\u02b9"+
		"\u009d\3\2\2\2\u02ba\u02bf\5\u009cO\2\u02bb\u02bc\7D\2\2\u02bc\u02be\5"+
		"\u009cO\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2"+
		"\u02bf\u02c0\3\2\2\2\u02c0\u009f\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3"+
		"\5\4\3\2\u02c3\u02c4\7\t\2\2\u02c4\u02c5\7\62\2\2\u02c5\u02c6\5\u009e"+
		"P\2\u02c6\u02c7\7\63\2\2\u02c7\u02c8\7*\2\2\u02c8\u00a1\3\2\2\2\u02c9"+
		"\u02ca\7\36\2\2\u02ca\u02cb\5\4\3\2\u02cb\u02cf\7\62\2\2\u02cc\u02ce\5"+
		"\u00a0Q\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2"+
		"\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3"+
		"\7\63\2\2\u02d3\u00a3\3\2\2\2\u02d4\u02d5\7\36\2\2\u02d5\u02d6\7\31\2"+
		"\2\u02d6\u02d7\5\6\4\2\u02d7\u02d8\7*\2\2\u02d8\u00a5\3\2\2\2\u02d9\u02db"+
		"\5$\23\2\u02da\u02d9\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dd\u02e2\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1\5&"+
		"\24\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\5("+
		"\25\2\u02e6\u02e8\5\u00a2R\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02f0\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02ec\u02ef\5*\26\2\u02ed\u02ef\5,\27\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u02f6\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f5\5\u009aN\2\u02f4"+
		"\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u00a7\3\2\2\2\u02f8\u02f6\3\2\2\2\66\u00ae\u00b3\u00c4\u00d2"+
		"\u00da\u00e9\u00f1\u0107\u0109\u010e\u0114\u011a\u0126\u012c\u013a\u0145"+
		"\u0148\u0160\u0166\u0171\u0182\u01a8\u01ae\u01bc\u01c7\u01e1\u01e6\u01ee"+
		"\u01f9\u0203\u020e\u0218\u0224\u0239\u0247\u0279\u028c\u0290\u029b\u029e"+
		"\u02a5\u02ad\u02b1\u02b6\u02bf\u02cf\u02dc\u02e2\u02e9\u02ee\u02f0\u02f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}