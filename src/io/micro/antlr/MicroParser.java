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
		T__17=18, T__18=19, FLOAT_ID=20, DOUBLE_ID=21, INT_ID=22, VOID_ID=23, 
		UNION_DEF=24, BOOL_ID=25, SHORT_ID=26, LONG_ID=27, INTEGER=28, HEXADECIMAL=29, 
		FLOAT=30, DOUBLE=31, STRING=32, TRUE=33, FALSE=34, IMPORT=35, EOS=36, 
		MODULE_SP=37, CMTCH=38, MCOMO=39, MCOMC=40, DEF=41, LPRM=42, RPRM=43, 
		LBRC=44, RBRC=45, LSQB=46, RSQB=47, AND=48, OR=49, LT=50, GT=51, LTE=52, 
		GTE=53, IF=54, WHILE=55, EQ=56, NOT=57, CONST=58, ELIF=59, ELSE=60, PARAM_SEP=61, 
		LOAD=62, INCLUDE=63, URL=64, CALL_t=65, UNION_t=66, INIT=67, SIMP_CHARS=68, 
		COMPLEX_CHARS=69, LINE_COMMENT=70, MULTI_COMMENT=71, WS=72;
	public static final int
		RULE_type_id = 0, RULE_id = 1, RULE_mid = 2, RULE_bx_type = 3, RULE_type = 4, 
		RULE_add = 5, RULE_sub = 6, RULE_mul = 7, RULE_div = 8, RULE_value = 9, 
		RULE_negative_value = 10, RULE_expr = 11, RULE_load_inst = 12, RULE_include_inst = 13, 
		RULE_compiler_inst = 14, RULE_import_stmt = 15, RULE_module_dec = 16, 
		RULE_field = 17, RULE_array_def = 18, RULE_formalParam = 19, RULE_func_call_out = 20, 
		RULE_func_call_local = 21, RULE_func_call_local_stmt = 22, RULE_func_call_out_stmt = 23, 
		RULE_varset = 24, RULE_local_vardef = 25, RULE_array_ref = 26, RULE_array_set_stmt = 27, 
		RULE_type_casting = 28, RULE_arrayname = 29, RULE_return_stmt = 30, RULE_greaterthan = 31, 
		RULE_lesserthan = 32, RULE_greaterthanE = 33, RULE_lesserthanE = 34, RULE_notequalto = 35, 
		RULE_equalto = 36, RULE_false_con = 37, RULE_true_con = 38, RULE_boolval = 39, 
		RULE_notboolval = 40, RULE_logicexpr = 41, RULE_enclosed_boolval = 42, 
		RULE_andboolexpr = 43, RULE_orboolexpr = 44, RULE_boolexpr = 45, RULE_boolparseexpr = 46, 
		RULE_if_stmt = 47, RULE_elif_stmt = 48, RULE_else_stmt = 49, RULE_while_stmt = 50, 
		RULE_init_stmt = 51, RULE_uval_stmt = 52, RULE_uval_get = 53, RULE_add_inc_stmt = 54, 
		RULE_sub_inc_stmt = 55, RULE_mul_inc_stmt = 56, RULE_div_inc_stmt = 57, 
		RULE_stmt = 58, RULE_ptype = 59, RULE_param = 60, RULE_paramList = 61, 
		RULE_function = 62, RULE_elem = 63, RULE_specList = 64, RULE_union_def_key = 65, 
		RULE_union_def = 66, RULE_program = 67;
	public static final String[] ruleNames = {
		"type_id", "id", "mid", "bx_type", "type", "add", "sub", "mul", "div", 
		"value", "negative_value", "expr", "load_inst", "include_inst", "compiler_inst", 
		"import_stmt", "module_dec", "field", "array_def", "formalParam", "func_call_out", 
		"func_call_local", "func_call_local_stmt", "func_call_out_stmt", "varset", 
		"local_vardef", "array_ref", "array_set_stmt", "type_casting", "arrayname", 
		"return_stmt", "greaterthan", "lesserthan", "greaterthanE", "lesserthanE", 
		"notequalto", "equalto", "false_con", "true_con", "boolval", "notboolval", 
		"logicexpr", "enclosed_boolval", "andboolexpr", "orboolexpr", "boolexpr", 
		"boolparseexpr", "if_stmt", "elif_stmt", "else_stmt", "while_stmt", "init_stmt", 
		"uval_stmt", "uval_get", "add_inc_stmt", "sub_inc_stmt", "mul_inc_stmt", 
		"div_inc_stmt", "stmt", "ptype", "param", "paramList", "function", "elem", 
		"specList", "union_def_key", "union_def", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'var'", "'='", "'return'", "'!='", 
		"'FALSE'", "'False'", "'false'", "'TRUE'", "'True'", "'true'", "':'", 
		"'+='", "'-='", "'*='", "'/='", "'float'", "'double'", "'int'", "'void'", 
		"'union_def'", "'bool'", "'short'", "'long'", null, null, null, null, 
		null, null, null, "'import'", "';'", "'module'", "'##'", "'#^'", "'^#'", 
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, "'<'", "'>'", 
		"'<='", "'>='", "'if'", "'while'", "'=='", null, "'const'", "'elif'", 
		"'else'", "','", "'require'", "'include'", "'url'", "'->'", "'<<'", "'init'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "FLOAT_ID", "DOUBLE_ID", 
		"INT_ID", "VOID_ID", "UNION_DEF", "BOOL_ID", "SHORT_ID", "LONG_ID", "INTEGER", 
		"HEXADECIMAL", "FLOAT", "DOUBLE", "STRING", "TRUE", "FALSE", "IMPORT", 
		"EOS", "MODULE_SP", "CMTCH", "MCOMO", "MCOMC", "DEF", "LPRM", "RPRM", 
		"LBRC", "RBRC", "LSQB", "RSQB", "AND", "OR", "LT", "GT", "LTE", "GTE", 
		"IF", "WHILE", "EQ", "NOT", "CONST", "ELIF", "ELSE", "PARAM_SEP", "LOAD", 
		"INCLUDE", "URL", "CALL_t", "UNION_t", "INIT", "SIMP_CHARS", "COMPLEX_CHARS", 
		"LINE_COMMENT", "MULTI_COMMENT", "WS"
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
			setState(136);
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
			setState(138);
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPLEX_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(COMPLEX_CHARS);
				}
				break;
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				type_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				mid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				func_call_out();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				func_call_local();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(159);
				expr(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(160);
				type_casting();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(161);
				array_ref();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(162);
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
			setState(165);
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
			setState(167);
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
			setState(169);
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
			setState(171);
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				func_call_local();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				func_call_out();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(LPRM);
				setState(179);
				expr(0);
				setState(180);
				match(RPRM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				type_casting();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				mid();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				array_ref();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
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
		enterRule(_localctx, 20, RULE_negative_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			sub();
			setState(189);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case DOUBLE:
			case LPRM:
			case SIMP_CHARS:
			case COMPLEX_CHARS:
				{
				setState(192);
				value();
				}
				break;
			case T__1:
				{
				setState(193);
				negative_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(197);
						add();
						setState(198);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						sub();
						setState(202);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						mul();
						setState(206);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						div();
						setState(210);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 24, RULE_load_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LOAD);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==URL) {
				{
				setState(218);
				match(URL);
				}
			}

			setState(221);
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
		enterRule(_localctx, 26, RULE_include_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(INCLUDE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==URL) {
				{
				setState(224);
				match(URL);
				}
			}

			setState(227);
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
		enterRule(_localctx, 28, RULE_compiler_inst);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				load_inst();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
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
		enterRule(_localctx, 30, RULE_import_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IMPORT);
			setState(234);
			mid();
			setState(235);
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
		enterRule(_localctx, 32, RULE_module_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(MODULE_SP);
			setState(238);
			mid();
			setState(239);
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
		enterRule(_localctx, 34, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__4);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(242);
				match(CONST);
				}
			}

			setState(245);
			ptype();
			setState(246);
			id();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(247);
				match(T__5);
				setState(248);
				type();
				}
			}

			setState(251);
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
		enterRule(_localctx, 36, RULE_array_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type_id();
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(LSQB);
				setState(255);
				type();
				setState(256);
				match(RSQB);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSQB );
			setState(262);
			id();
			setState(263);
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
		enterRule(_localctx, 38, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LPRM);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INTEGER) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << LPRM))) != 0) || _la==SIMP_CHARS || _la==COMPLEX_CHARS) {
				{
				setState(266);
				type();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(267);
					match(PARAM_SEP);
					setState(268);
					type();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(276);
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
		enterRule(_localctx, 40, RULE_func_call_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			mid();
			setState(279);
			match(CALL_t);
			setState(280);
			id();
			setState(281);
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
		enterRule(_localctx, 42, RULE_func_call_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			id();
			setState(284);
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
		enterRule(_localctx, 44, RULE_func_call_local_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			func_call_local();
			setState(287);
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
		enterRule(_localctx, 46, RULE_func_call_out_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			func_call_out();
			setState(290);
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
		enterRule(_localctx, 48, RULE_varset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			mid();
			setState(293);
			match(T__5);
			setState(294);
			type();
			setState(295);
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
		enterRule(_localctx, 50, RULE_local_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(297);
				match(CONST);
				}
			}

			setState(300);
			ptype();
			setState(301);
			id();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(302);
				match(T__5);
				setState(303);
				type();
				}
			}

			setState(306);
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
		enterRule(_localctx, 52, RULE_array_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			mid();
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(309);
					match(LSQB);
					setState(310);
					type();
					setState(311);
					match(RSQB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 54, RULE_array_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			array_ref();
			setState(318);
			match(T__5);
			setState(319);
			type();
			setState(320);
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
		enterRule(_localctx, 56, RULE_type_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LPRM);
			setState(323);
			ptype();
			setState(324);
			match(RPRM);
			setState(325);
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
		enterRule(_localctx, 58, RULE_arrayname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			bx_type();
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				match(LSQB);
				setState(329);
				match(RSQB);
				}
				}
				setState(332); 
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
		enterRule(_localctx, 60, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__6);
			setState(335);
			type();
			setState(336);
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
		enterRule(_localctx, 62, RULE_greaterthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			type();
			setState(339);
			match(GT);
			setState(340);
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
		enterRule(_localctx, 64, RULE_lesserthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			type();
			setState(343);
			match(LT);
			setState(344);
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
		enterRule(_localctx, 66, RULE_greaterthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			type();
			setState(347);
			match(GTE);
			setState(348);
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
		enterRule(_localctx, 68, RULE_lesserthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			type();
			setState(351);
			match(LTE);
			setState(352);
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
		enterRule(_localctx, 70, RULE_notequalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			type();
			setState(355);
			match(T__7);
			setState(356);
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
		enterRule(_localctx, 72, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			type();
			setState(359);
			match(EQ);
			setState(360);
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
		enterRule(_localctx, 74, RULE_false_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_true_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_boolval);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				greaterthan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				lesserthan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				greaterthanE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				lesserthanE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				equalto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				notequalto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				false_con();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
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
		enterRule(_localctx, 80, RULE_notboolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(NOT);
			setState(378);
			match(LPRM);
			setState(379);
			boolval();
			setState(380);
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
		enterRule(_localctx, 82, RULE_logicexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(382);
				boolval();
				}
				break;
			case 2:
				{
				setState(383);
				notboolval();
				}
				break;
			case 3:
				{
				setState(384);
				andboolexpr();
				}
				break;
			case 4:
				{
				setState(385);
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
		enterRule(_localctx, 84, RULE_enclosed_boolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LPRM);
			setState(389);
			boolval();
			setState(390);
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
		enterRule(_localctx, 86, RULE_andboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LPRM);
			setState(393);
			logicexpr();
			setState(394);
			match(RPRM);
			setState(395);
			match(AND);
			setState(396);
			match(LPRM);
			setState(397);
			logicexpr();
			setState(398);
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
		enterRule(_localctx, 88, RULE_orboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LPRM);
			setState(401);
			logicexpr();
			setState(402);
			match(RPRM);
			setState(403);
			match(OR);
			setState(404);
			match(LPRM);
			setState(405);
			logicexpr();
			setState(406);
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
		enterRule(_localctx, 90, RULE_boolexpr);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				boolval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				andboolexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				orboolexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
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
		enterRule(_localctx, 92, RULE_boolparseexpr);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
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
				setState(414);
				boolexpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(NOT);
				setState(416);
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
		enterRule(_localctx, 94, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(IF);
			setState(420);
			boolparseexpr();
			setState(421);
			match(LBRC);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(422);
					stmt();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(428);
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
		enterRule(_localctx, 96, RULE_elif_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ELIF);
			setState(431);
			boolparseexpr();
			setState(432);
			match(LBRC);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(433);
					stmt();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(439);
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
		enterRule(_localctx, 98, RULE_else_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ELSE);
			setState(442);
			match(LBRC);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(443);
					stmt();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(449);
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
		enterRule(_localctx, 100, RULE_while_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(WHILE);
			setState(452);
			boolparseexpr();
			setState(453);
			match(LBRC);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(454);
					stmt();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(460);
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

	public static class Init_stmtContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(MicroParser.INIT, 0); }
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public FormalParamContext formalParam() {
			return getRuleContext(FormalParamContext.class,0);
		}
		public Init_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterInit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitInit_stmt(this);
		}
	}

	public final Init_stmtContext init_stmt() throws RecognitionException {
		Init_stmtContext _localctx = new Init_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_init_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(INIT);
			setState(463);
			mid();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPRM) {
				{
				setState(464);
				formalParam();
				}
			}

			setState(467);
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
		enterRule(_localctx, 104, RULE_uval_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			mid();
			setState(470);
			match(T__14);
			setState(471);
			id();
			setState(472);
			match(T__5);
			setState(473);
			type();
			setState(474);
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
		enterRule(_localctx, 106, RULE_uval_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			id();
			setState(477);
			match(UNION_t);
			setState(478);
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

	public static class Add_inc_stmtContext extends ParserRuleContext {
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 108, RULE_add_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			mid();
			setState(481);
			match(T__15);
			setState(482);
			type();
			setState(483);
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
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 110, RULE_sub_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			mid();
			setState(486);
			match(T__16);
			setState(487);
			type();
			setState(488);
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
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 112, RULE_mul_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			mid();
			setState(491);
			match(T__17);
			setState(492);
			type();
			setState(493);
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
		public MidContext mid() {
			return getRuleContext(MidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 114, RULE_div_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			mid();
			setState(496);
			match(T__18);
			setState(497);
			type();
			setState(498);
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
		public Init_stmtContext init_stmt() {
			return getRuleContext(Init_stmtContext.class,0);
		}
		public Uval_stmtContext uval_stmt() {
			return getRuleContext(Uval_stmtContext.class,0);
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
		enterRule(_localctx, 116, RULE_stmt);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				varset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				func_call_out_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				func_call_local_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				local_vardef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				array_set_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(506);
				elif_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(507);
				else_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(508);
				while_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(509);
				add_inc_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(510);
				sub_inc_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(511);
				mul_inc_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(512);
				div_inc_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(513);
				init_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(514);
				uval_stmt();
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
		enterRule(_localctx, 118, RULE_ptype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(517);
				bx_type();
				}
				break;
			case 2:
				{
				setState(518);
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
		enterRule(_localctx, 120, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			ptype();
			setState(522);
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
		enterRule(_localctx, 122, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(LPRM);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (FLOAT_ID - 20)) | (1L << (DOUBLE_ID - 20)) | (1L << (INT_ID - 20)) | (1L << (VOID_ID - 20)) | (1L << (BOOL_ID - 20)) | (1L << (SHORT_ID - 20)) | (1L << (LONG_ID - 20)) | (1L << (SIMP_CHARS - 20)) | (1L << (COMPLEX_CHARS - 20)))) != 0)) {
				{
				setState(525);
				param();
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(526);
					match(PARAM_SEP);
					setState(527);
					param();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(535);
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
		public Bx_typeContext bx_type() {
			return getRuleContext(Bx_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
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
		enterRule(_localctx, 124, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(DEF);
			setState(538);
			bx_type();
			setState(539);
			id();
			setState(540);
			paramList();
			setState(541);
			match(LBRC);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(542);
					stmt();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(548);
				return_stmt();
				}
			}

			setState(551);
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
		enterRule(_localctx, 126, RULE_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(553);
				match(CONST);
				}
			}

			setState(556);
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
		enterRule(_localctx, 128, RULE_specList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			elem();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEP) {
				{
				{
				setState(559);
				match(PARAM_SEP);
				setState(560);
				elem();
				}
				}
				setState(565);
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
		enterRule(_localctx, 130, RULE_union_def_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			id();
			setState(567);
			match(T__5);
			setState(568);
			match(LBRC);
			setState(569);
			specList();
			setState(570);
			match(RBRC);
			setState(571);
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
		enterRule(_localctx, 132, RULE_union_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(UNION_DEF);
			setState(574);
			id();
			setState(575);
			match(LBRC);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIMP_CHARS) {
				{
				{
				setState(576);
				union_def_key();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
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
		enterRule(_localctx, 134, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(584);
					compiler_inst();
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(590);
				import_stmt();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			module_dec();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION_DEF) {
				{
				{
				setState(597);
				union_def();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(603);
				field();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(609);
				function();
				}
				}
				setState(614);
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u026a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\5\4\u0091\n\4\3\5\3\5\3\5\5\5\u0096\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00bd\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00c5\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d7\n\r\f\r\16"+
		"\r\u00da\13\r\3\16\3\16\5\16\u00de\n\16\3\16\3\16\3\17\3\17\5\17\u00e4"+
		"\n\17\3\17\3\17\3\20\3\20\5\20\u00ea\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\23\3\23\5\23\u00fc\n"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u0105\n\24\r\24\16\24\u0106"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0110\n\25\f\25\16\25\u0113\13"+
		"\25\5\25\u0115\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u012d"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u0133\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\6\34\u013c\n\34\r\34\16\34\u013d\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\6\37\u014d\n\37\r\37\16\37\u014e\3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u017a\n)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u0185\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\5/\u019f\n/\3\60\3\60\3\60"+
		"\5\60\u01a4\n\60\3\61\3\61\3\61\3\61\7\61\u01aa\n\61\f\61\16\61\u01ad"+
		"\13\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u01b5\n\62\f\62\16\62\u01b8"+
		"\13\62\3\62\3\62\3\63\3\63\3\63\7\63\u01bf\n\63\f\63\16\63\u01c2\13\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u01ca\n\64\f\64\16\64\u01cd\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\5\65\u01d4\n\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\5<\u0206\n<\3=\3=\5=\u020a\n=\3>\3>\3>\3?\3?\3?\3?\7?\u0213\n?\f?\16"+
		"?\u0216\13?\5?\u0218\n?\3?\3?\3@\3@\3@\3@\3@\3@\7@\u0222\n@\f@\16@\u0225"+
		"\13@\3@\5@\u0228\n@\3@\3@\3A\5A\u022d\nA\3A\3A\3B\3B\3B\7B\u0234\nB\f"+
		"B\16B\u0237\13B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\7D\u0244\nD\fD\16D\u0247"+
		"\13D\3D\3D\3E\7E\u024c\nE\fE\16E\u024f\13E\3E\7E\u0252\nE\fE\16E\u0255"+
		"\13E\3E\3E\7E\u0259\nE\fE\16E\u025c\13E\3E\7E\u025f\nE\fE\16E\u0262\13"+
		"E\3E\7E\u0265\nE\fE\16E\u0268\13E\3E\b\u01ab\u01b6\u01c0\u01cb\u0223\u024d"+
		"\3\30F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2\5\4"+
		"\2\26\31\33\35\3\2\13\r\3\2\16\20\2\u027e\2\u008a\3\2\2\2\4\u008c\3\2"+
		"\2\2\6\u0090\3\2\2\2\b\u0095\3\2\2\2\n\u00a5\3\2\2\2\f\u00a7\3\2\2\2\16"+
		"\u00a9\3\2\2\2\20\u00ab\3\2\2\2\22\u00ad\3\2\2\2\24\u00bc\3\2\2\2\26\u00be"+
		"\3\2\2\2\30\u00c4\3\2\2\2\32\u00db\3\2\2\2\34\u00e1\3\2\2\2\36\u00e9\3"+
		"\2\2\2 \u00eb\3\2\2\2\"\u00ef\3\2\2\2$\u00f3\3\2\2\2&\u00ff\3\2\2\2(\u010b"+
		"\3\2\2\2*\u0118\3\2\2\2,\u011d\3\2\2\2.\u0120\3\2\2\2\60\u0123\3\2\2\2"+
		"\62\u0126\3\2\2\2\64\u012c\3\2\2\2\66\u0136\3\2\2\28\u013f\3\2\2\2:\u0144"+
		"\3\2\2\2<\u0149\3\2\2\2>\u0150\3\2\2\2@\u0154\3\2\2\2B\u0158\3\2\2\2D"+
		"\u015c\3\2\2\2F\u0160\3\2\2\2H\u0164\3\2\2\2J\u0168\3\2\2\2L\u016c\3\2"+
		"\2\2N\u016e\3\2\2\2P\u0179\3\2\2\2R\u017b\3\2\2\2T\u0184\3\2\2\2V\u0186"+
		"\3\2\2\2X\u018a\3\2\2\2Z\u0192\3\2\2\2\\\u019e\3\2\2\2^\u01a3\3\2\2\2"+
		"`\u01a5\3\2\2\2b\u01b0\3\2\2\2d\u01bb\3\2\2\2f\u01c5\3\2\2\2h\u01d0\3"+
		"\2\2\2j\u01d7\3\2\2\2l\u01de\3\2\2\2n\u01e2\3\2\2\2p\u01e7\3\2\2\2r\u01ec"+
		"\3\2\2\2t\u01f1\3\2\2\2v\u0205\3\2\2\2x\u0209\3\2\2\2z\u020b\3\2\2\2|"+
		"\u020e\3\2\2\2~\u021b\3\2\2\2\u0080\u022c\3\2\2\2\u0082\u0230\3\2\2\2"+
		"\u0084\u0238\3\2\2\2\u0086\u023f\3\2\2\2\u0088\u024d\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b\3\3\2\2\2\u008c\u008d\7F\2\2\u008d\5\3\2\2\2\u008e\u0091"+
		"\7G\2\2\u008f\u0091\5\4\3\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\7\3\2\2\2\u0092\u0096\5\2\2\2\u0093\u0096\5\4\3\2\u0094\u0096\5\6\4\2"+
		"\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\t\3"+
		"\2\2\2\u0097\u00a6\7#\2\2\u0098\u00a6\7$\2\2\u0099\u00a6\5\4\3\2\u009a"+
		"\u00a6\5\6\4\2\u009b\u00a6\7 \2\2\u009c\u00a6\7\36\2\2\u009d\u00a6\7!"+
		"\2\2\u009e\u00a6\7\"\2\2\u009f\u00a6\5*\26\2\u00a0\u00a6\5,\27\2\u00a1"+
		"\u00a6\5\30\r\2\u00a2\u00a6\5:\36\2\u00a3\u00a6\5\66\34\2\u00a4\u00a6"+
		"\5l\67\2\u00a5\u0097\3\2\2\2\u00a5\u0098\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5"+
		"\u009a\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2"+
		"\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\13\3\2\2\2\u00a7\u00a8\7\3\2\2\u00a8\r\3\2\2\2\u00a9\u00aa"+
		"\7\4\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\21\3\2\2\2\u00ad\u00ae"+
		"\7\6\2\2\u00ae\23\3\2\2\2\u00af\u00bd\7 \2\2\u00b0\u00bd\7\36\2\2\u00b1"+
		"\u00bd\7!\2\2\u00b2\u00bd\5,\27\2\u00b3\u00bd\5*\26\2\u00b4\u00b5\7,\2"+
		"\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\7-\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00bd"+
		"\5:\36\2\u00b9\u00bd\5\6\4\2\u00ba\u00bd\5\66\34\2\u00bb\u00bd\5l\67\2"+
		"\u00bc\u00af\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1\3\2\2\2\u00bc\u00b2"+
		"\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25\3\2\2"+
		"\2\u00be\u00bf\5\16\b\2\u00bf\u00c0\5\24\13\2\u00c0\27\3\2\2\2\u00c1\u00c2"+
		"\b\r\1\2\u00c2\u00c5\5\24\13\2\u00c3\u00c5\5\26\f\2\u00c4\u00c1\3\2\2"+
		"\2\u00c4\u00c3\3\2\2\2\u00c5\u00d8\3\2\2\2\u00c6\u00c7\f\b\2\2\u00c7\u00c8"+
		"\5\f\7\2\u00c8\u00c9\5\30\r\t\u00c9\u00d7\3\2\2\2\u00ca\u00cb\f\7\2\2"+
		"\u00cb\u00cc\5\16\b\2\u00cc\u00cd\5\30\r\b\u00cd\u00d7\3\2\2\2\u00ce\u00cf"+
		"\f\6\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\5\30\r\7\u00d1\u00d7\3\2\2\2"+
		"\u00d2\u00d3\f\5\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\5\30\r\6\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00c6\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6"+
		"\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\31\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\7@\2\2\u00dc\u00de"+
		"\7B\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\7\"\2\2\u00e0\33\3\2\2\2\u00e1\u00e3\7A\2\2\u00e2\u00e4\7B\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\7\"\2\2\u00e6\35\3\2\2\2\u00e7\u00ea\5\32\16\2\u00e8\u00ea\5\34\17\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\37\3\2\2\2\u00eb\u00ec"+
		"\7%\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ee\7&\2\2\u00ee!\3\2\2\2\u00ef\u00f0"+
		"\7\'\2\2\u00f0\u00f1\5\6\4\2\u00f1\u00f2\7&\2\2\u00f2#\3\2\2\2\u00f3\u00f5"+
		"\7\7\2\2\u00f4\u00f6\7<\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\5x=\2\u00f8\u00fb\5\4\3\2\u00f9\u00fa\7\b\2"+
		"\2\u00fa\u00fc\5\n\6\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\7&\2\2\u00fe%\3\2\2\2\u00ff\u0104\5\2\2\2\u0100\u0101"+
		"\7\60\2\2\u0101\u0102\5\n\6\2\u0102\u0103\7\61\2\2\u0103\u0105\3\2\2\2"+
		"\u0104\u0100\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\5\4\3\2\u0109\u010a\7&\2\2\u010a"+
		"\'\3\2\2\2\u010b\u0114\7,\2\2\u010c\u0111\5\n\6\2\u010d\u010e\7?\2\2\u010e"+
		"\u0110\5\n\6\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7-"+
		"\2\2\u0117)\3\2\2\2\u0118\u0119\5\6\4\2\u0119\u011a\7C\2\2\u011a\u011b"+
		"\5\4\3\2\u011b\u011c\5(\25\2\u011c+\3\2\2\2\u011d\u011e\5\4\3\2\u011e"+
		"\u011f\5(\25\2\u011f-\3\2\2\2\u0120\u0121\5,\27\2\u0121\u0122\7&\2\2\u0122"+
		"/\3\2\2\2\u0123\u0124\5*\26\2\u0124\u0125\7&\2\2\u0125\61\3\2\2\2\u0126"+
		"\u0127\5\6\4\2\u0127\u0128\7\b\2\2\u0128\u0129\5\n\6\2\u0129\u012a\7&"+
		"\2\2\u012a\63\3\2\2\2\u012b\u012d\7<\2\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5x=\2\u012f\u0132\5\4\3\2\u0130"+
		"\u0131\7\b\2\2\u0131\u0133\5\n\6\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7&\2\2\u0135\65\3\2\2\2\u0136\u013b"+
		"\5\6\4\2\u0137\u0138\7\60\2\2\u0138\u0139\5\n\6\2\u0139\u013a\7\61\2\2"+
		"\u013a\u013c\3\2\2\2\u013b\u0137\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\67\3\2\2\2\u013f\u0140\5\66\34\2\u0140"+
		"\u0141\7\b\2\2\u0141\u0142\5\n\6\2\u0142\u0143\7&\2\2\u01439\3\2\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0146\5x=\2\u0146\u0147\7-\2\2\u0147\u0148\5\n\6\2"+
		"\u0148;\3\2\2\2\u0149\u014c\5\b\5\2\u014a\u014b\7\60\2\2\u014b\u014d\7"+
		"\61\2\2\u014c\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f=\3\2\2\2\u0150\u0151\7\t\2\2\u0151\u0152\5\n\6\2"+
		"\u0152\u0153\7&\2\2\u0153?\3\2\2\2\u0154\u0155\5\n\6\2\u0155\u0156\7\65"+
		"\2\2\u0156\u0157\5\n\6\2\u0157A\3\2\2\2\u0158\u0159\5\n\6\2\u0159\u015a"+
		"\7\64\2\2\u015a\u015b\5\n\6\2\u015bC\3\2\2\2\u015c\u015d\5\n\6\2\u015d"+
		"\u015e\7\67\2\2\u015e\u015f\5\n\6\2\u015fE\3\2\2\2\u0160\u0161\5\n\6\2"+
		"\u0161\u0162\7\66\2\2\u0162\u0163\5\n\6\2\u0163G\3\2\2\2\u0164\u0165\5"+
		"\n\6\2\u0165\u0166\7\n\2\2\u0166\u0167\5\n\6\2\u0167I\3\2\2\2\u0168\u0169"+
		"\5\n\6\2\u0169\u016a\7:\2\2\u016a\u016b\5\n\6\2\u016bK\3\2\2\2\u016c\u016d"+
		"\t\3\2\2\u016dM\3\2\2\2\u016e\u016f\t\4\2\2\u016fO\3\2\2\2\u0170\u017a"+
		"\5\n\6\2\u0171\u017a\5@!\2\u0172\u017a\5B\"\2\u0173\u017a\5D#\2\u0174"+
		"\u017a\5F$\2\u0175\u017a\5J&\2\u0176\u017a\5H%\2\u0177\u017a\5L\'\2\u0178"+
		"\u017a\5N(\2\u0179\u0170\3\2\2\2\u0179\u0171\3\2\2\2\u0179\u0172\3\2\2"+
		"\2\u0179\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u0176"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017aQ\3\2\2\2\u017b"+
		"\u017c\7;\2\2\u017c\u017d\7,\2\2\u017d\u017e\5P)\2\u017e\u017f\7-\2\2"+
		"\u017fS\3\2\2\2\u0180\u0185\5P)\2\u0181\u0185\5R*\2\u0182\u0185\5X-\2"+
		"\u0183\u0185\5Z.\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185U\3\2\2\2\u0186\u0187\7,\2\2\u0187\u0188"+
		"\5P)\2\u0188\u0189\7-\2\2\u0189W\3\2\2\2\u018a\u018b\7,\2\2\u018b\u018c"+
		"\5T+\2\u018c\u018d\7-\2\2\u018d\u018e\7\62\2\2\u018e\u018f\7,\2\2\u018f"+
		"\u0190\5T+\2\u0190\u0191\7-\2\2\u0191Y\3\2\2\2\u0192\u0193\7,\2\2\u0193"+
		"\u0194\5T+\2\u0194\u0195\7-\2\2\u0195\u0196\7\63\2\2\u0196\u0197\7,\2"+
		"\2\u0197\u0198\5T+\2\u0198\u0199\7-\2\2\u0199[\3\2\2\2\u019a\u019f\5P"+
		")\2\u019b\u019f\5X-\2\u019c\u019f\5Z.\2\u019d\u019f\5V,\2\u019e\u019a"+
		"\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f"+
		"]\3\2\2\2\u01a0\u01a4\5\\/\2\u01a1\u01a2\7;\2\2\u01a2\u01a4\5\\/\2\u01a3"+
		"\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4_\3\2\2\2\u01a5\u01a6\78\2\2\u01a6"+
		"\u01a7\5^\60\2\u01a7\u01ab\7.\2\2\u01a8\u01aa\5v<\2\u01a9\u01a8\3\2\2"+
		"\2\u01aa\u01ad\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7/\2\2\u01afa\3\2\2\2\u01b0\u01b1"+
		"\7=\2\2\u01b1\u01b2\5^\60\2\u01b2\u01b6\7.\2\2\u01b3\u01b5\5v<\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7/\2\2\u01ba"+
		"c\3\2\2\2\u01bb\u01bc\7>\2\2\u01bc\u01c0\7.\2\2\u01bd\u01bf\5v<\2\u01be"+
		"\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7/\2\2\u01c4"+
		"e\3\2\2\2\u01c5\u01c6\79\2\2\u01c6\u01c7\5^\60\2\u01c7\u01cb\7.\2\2\u01c8"+
		"\u01ca\5v<\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01cc\3\2\2"+
		"\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf"+
		"\7/\2\2\u01cfg\3\2\2\2\u01d0\u01d1\7E\2\2\u01d1\u01d3\5\6\4\2\u01d2\u01d4"+
		"\5(\25\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\7&\2\2\u01d6i\3\2\2\2\u01d7\u01d8\5\6\4\2\u01d8\u01d9\7\21\2\2"+
		"\u01d9\u01da\5\4\3\2\u01da\u01db\7\b\2\2\u01db\u01dc\5\n\6\2\u01dc\u01dd"+
		"\7&\2\2\u01ddk\3\2\2\2\u01de\u01df\5\4\3\2\u01df\u01e0\7D\2\2\u01e0\u01e1"+
		"\5\6\4\2\u01e1m\3\2\2\2\u01e2\u01e3\5\6\4\2\u01e3\u01e4\7\22\2\2\u01e4"+
		"\u01e5\5\n\6\2\u01e5\u01e6\7&\2\2\u01e6o\3\2\2\2\u01e7\u01e8\5\6\4\2\u01e8"+
		"\u01e9\7\23\2\2\u01e9\u01ea\5\n\6\2\u01ea\u01eb\7&\2\2\u01ebq\3\2\2\2"+
		"\u01ec\u01ed\5\6\4\2\u01ed\u01ee\7\24\2\2\u01ee\u01ef\5\n\6\2\u01ef\u01f0"+
		"\7&\2\2\u01f0s\3\2\2\2\u01f1\u01f2\5\6\4\2\u01f2\u01f3\7\25\2\2\u01f3"+
		"\u01f4\5\n\6\2\u01f4\u01f5\7&\2\2\u01f5u\3\2\2\2\u01f6\u0206\5\62\32\2"+
		"\u01f7\u0206\5\60\31\2\u01f8\u0206\5.\30\2\u01f9\u0206\5\64\33\2\u01fa"+
		"\u0206\58\35\2\u01fb\u0206\5`\61\2\u01fc\u0206\5b\62\2\u01fd\u0206\5d"+
		"\63\2\u01fe\u0206\5f\64\2\u01ff\u0206\5n8\2\u0200\u0206\5p9\2\u0201\u0206"+
		"\5r:\2\u0202\u0206\5t;\2\u0203\u0206\5h\65\2\u0204\u0206\5j\66\2\u0205"+
		"\u01f6\3\2\2\2\u0205\u01f7\3\2\2\2\u0205\u01f8\3\2\2\2\u0205\u01f9\3\2"+
		"\2\2\u0205\u01fa\3\2\2\2\u0205\u01fb\3\2\2\2\u0205\u01fc\3\2\2\2\u0205"+
		"\u01fd\3\2\2\2\u0205\u01fe\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0200\3\2"+
		"\2\2\u0205\u0201\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206w\3\2\2\2\u0207\u020a\5\b\5\2\u0208\u020a\5<\37\2"+
		"\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020ay\3\2\2\2\u020b\u020c\5"+
		"x=\2\u020c\u020d\5\4\3\2\u020d{\3\2\2\2\u020e\u0217\7,\2\2\u020f\u0214"+
		"\5z>\2\u0210\u0211\7?\2\2\u0211\u0213\5z>\2\u0212\u0210\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0218\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u020f\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\7-\2\2\u021a}\3\2\2\2\u021b\u021c\7+\2\2\u021c"+
		"\u021d\5\b\5\2\u021d\u021e\5\4\3\2\u021e\u021f\5|?\2\u021f\u0223\7.\2"+
		"\2\u0220\u0222\5v<\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\5> \2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2"+
		"\2\u0229\u022a\7/\2\2\u022a\177\3\2\2\2\u022b\u022d\7<\2\2\u022c\u022b"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5\4\3\2\u022f"+
		"\u0081\3\2\2\2\u0230\u0235\5\u0080A\2\u0231\u0232\7?\2\2\u0232\u0234\5"+
		"\u0080A\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2"+
		"\u0235\u0236\3\2\2\2\u0236\u0083\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239"+
		"\5\4\3\2\u0239\u023a\7\b\2\2\u023a\u023b\7.\2\2\u023b\u023c\5\u0082B\2"+
		"\u023c\u023d\7/\2\2\u023d\u023e\7&\2\2\u023e\u0085\3\2\2\2\u023f\u0240"+
		"\7\32\2\2\u0240\u0241\5\4\3\2\u0241\u0245\7.\2\2\u0242\u0244\5\u0084C"+
		"\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7/\2\2\u0249"+
		"\u0087\3\2\2\2\u024a\u024c\5\36\20\2\u024b\u024a\3\2\2\2\u024c\u024f\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0253\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0252\5 \21\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u025a\5\"\22\2\u0257\u0259\5\u0086D\2\u0258\u0257"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u0260\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\5$\23\2\u025e\u025d\3\2"+
		"\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0266\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\5~@\2\u0264\u0263\3\2\2"+
		"\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0089"+
		"\3\2\2\2\u0268\u0266\3\2\2\2,\u0090\u0095\u00a5\u00bc\u00c4\u00d6\u00d8"+
		"\u00dd\u00e3\u00e9\u00f5\u00fb\u0106\u0111\u0114\u012c\u0132\u013d\u014e"+
		"\u0179\u0184\u019e\u01a3\u01ab\u01b6\u01c0\u01cb\u01d3\u0205\u0209\u0214"+
		"\u0217\u0223\u0227\u022c\u0235\u0245\u024d\u0253\u025a\u0260\u0266";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}