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
		T__17=18, FLOAT_ID=19, DOUBLE_ID=20, INT_ID=21, VOID_ID=22, UNION_DEF=23, 
		BOOL_ID=24, SHORT_ID=25, LONG_ID=26, INTEGER=27, HEXADECIMAL=28, FLOAT=29, 
		DOUBLE=30, STRING=31, TRUE=32, FALSE=33, IMPORT=34, EOS=35, MODULE_SP=36, 
		CMTCH=37, MCOMO=38, MCOMC=39, DEF=40, LPRM=41, RPRM=42, LBRC=43, RBRC=44, 
		LSQB=45, RSQB=46, AND=47, OR=48, LT=49, GT=50, LTE=51, GTE=52, IF=53, 
		WHILE=54, EQ=55, NOT=56, CONST=57, ELIF=58, ELSE=59, PARAM_SEP=60, LOAD=61, 
		AUTO=62, URL=63, CALL_t=64, SIMP_CHARS=65, COMPLEX_CHARS=66, LINE_COMMENT=67, 
		MULTI_COMMENT=68, WS=69;
	public static final int
		RULE_type_id = 0, RULE_id = 1, RULE_mid = 2, RULE_bx_type = 3, RULE_type = 4, 
		RULE_add = 5, RULE_sub = 6, RULE_mul = 7, RULE_div = 8, RULE_value = 9, 
		RULE_expr = 10, RULE_load_inst = 11, RULE_compiler_inst = 12, RULE_import_stmt = 13, 
		RULE_module_dec = 14, RULE_field = 15, RULE_formalParam = 16, RULE_func_call_out = 17, 
		RULE_func_call_local = 18, RULE_func_call_local_stmt = 19, RULE_func_call_out_stmt = 20, 
		RULE_varset = 21, RULE_local_vardef = 22, RULE_array_ref = 23, RULE_array_set_stmt = 24, 
		RULE_type_casting = 25, RULE_arrayname = 26, RULE_return_stmt = 27, RULE_greaterthan = 28, 
		RULE_lesserthan = 29, RULE_greaterthanE = 30, RULE_lesserthanE = 31, RULE_notequalto = 32, 
		RULE_equalto = 33, RULE_false_con = 34, RULE_true_con = 35, RULE_boolval = 36, 
		RULE_notboolval = 37, RULE_logicexpr = 38, RULE_enclosed_boolval = 39, 
		RULE_andboolexpr = 40, RULE_orboolexpr = 41, RULE_boolexpr = 42, RULE_boolparseexpr = 43, 
		RULE_if_stmt = 44, RULE_elif_stmt = 45, RULE_else_stmt = 46, RULE_while_stmt = 47, 
		RULE_add_inc_stmt = 48, RULE_sub_inc_stmt = 49, RULE_mul_inc_stmt = 50, 
		RULE_div_inc_stmt = 51, RULE_stmt = 52, RULE_ptype = 53, RULE_param = 54, 
		RULE_paramList = 55, RULE_function = 56, RULE_union_def_key = 57, RULE_union_def = 58, 
		RULE_program = 59;
	public static final String[] ruleNames = {
		"type_id", "id", "mid", "bx_type", "type", "add", "sub", "mul", "div", 
		"value", "expr", "load_inst", "compiler_inst", "import_stmt", "module_dec", 
		"field", "formalParam", "func_call_out", "func_call_local", "func_call_local_stmt", 
		"func_call_out_stmt", "varset", "local_vardef", "array_ref", "array_set_stmt", 
		"type_casting", "arrayname", "return_stmt", "greaterthan", "lesserthan", 
		"greaterthanE", "lesserthanE", "notequalto", "equalto", "false_con", "true_con", 
		"boolval", "notboolval", "logicexpr", "enclosed_boolval", "andboolexpr", 
		"orboolexpr", "boolexpr", "boolparseexpr", "if_stmt", "elif_stmt", "else_stmt", 
		"while_stmt", "add_inc_stmt", "sub_inc_stmt", "mul_inc_stmt", "div_inc_stmt", 
		"stmt", "ptype", "param", "paramList", "function", "union_def_key", "union_def", 
		"program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'var'", "'='", "'return'", "'!='", 
		"'FALSE'", "'False'", "'false'", "'TRUE'", "'True'", "'true'", "'+='", 
		"'-='", "'*='", "'/='", "'float'", "'double'", "'int'", "'void'", "'union_def'", 
		"'bool'", "'short'", "'long'", null, null, null, null, null, null, null, 
		"'import'", "';'", "'module'", "'##'", "'#^'", "'^#'", null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'", null, null, "'<'", "'>'", "'<='", "'>='", 
		"'if'", "'while'", "'=='", null, "'const'", "'elif'", "'else'", "','", 
		"'require'", "'auto'", "'url'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "FLOAT_ID", "DOUBLE_ID", "INT_ID", 
		"VOID_ID", "UNION_DEF", "BOOL_ID", "SHORT_ID", "LONG_ID", "INTEGER", "HEXADECIMAL", 
		"FLOAT", "DOUBLE", "STRING", "TRUE", "FALSE", "IMPORT", "EOS", "MODULE_SP", 
		"CMTCH", "MCOMO", "MCOMC", "DEF", "LPRM", "RPRM", "LBRC", "RBRC", "LSQB", 
		"RSQB", "AND", "OR", "LT", "GT", "LTE", "GTE", "IF", "WHILE", "EQ", "NOT", 
		"CONST", "ELIF", "ELSE", "PARAM_SEP", "LOAD", "AUTO", "URL", "CALL_t", 
		"SIMP_CHARS", "COMPLEX_CHARS", "LINE_COMMENT", "MULTI_COMMENT", "WS"
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
			setState(120);
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
			setState(122);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPLEX_CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(COMPLEX_CHARS);
				}
				break;
			case SIMP_CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				type_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				mid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				func_call_out();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				func_call_local();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				expr(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				type_casting();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				array_ref();
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
			setState(148);
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
			setState(150);
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
			setState(152);
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
			setState(154);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				func_call_local();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				func_call_out();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(LPRM);
				setState(162);
				expr(0);
				setState(163);
				match(RPRM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				type_casting();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				mid();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				array_ref();
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

	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(174);
						add();
						setState(175);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						sub();
						setState(179);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						mul();
						setState(183);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						div();
						setState(187);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 22, RULE_load_inst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LOAD);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==URL) {
				{
				setState(195);
				match(URL);
				}
			}

			setState(198);
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
		enterRule(_localctx, 24, RULE_compiler_inst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			load_inst();
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
		enterRule(_localctx, 26, RULE_import_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IMPORT);
			setState(203);
			mid();
			setState(204);
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
		enterRule(_localctx, 28, RULE_module_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(MODULE_SP);
			setState(207);
			mid();
			setState(208);
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
		enterRule(_localctx, 30, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__4);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(211);
				match(CONST);
				}
			}

			setState(214);
			ptype();
			setState(215);
			id();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(216);
				match(T__5);
				setState(217);
				type();
				}
			}

			setState(220);
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
		enterRule(_localctx, 32, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LPRM);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (INTEGER - 27)) | (1L << (FLOAT - 27)) | (1L << (DOUBLE - 27)) | (1L << (STRING - 27)) | (1L << (TRUE - 27)) | (1L << (FALSE - 27)) | (1L << (LPRM - 27)) | (1L << (SIMP_CHARS - 27)) | (1L << (COMPLEX_CHARS - 27)))) != 0)) {
				{
				setState(223);
				type();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(224);
					match(PARAM_SEP);
					setState(225);
					type();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(233);
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
		enterRule(_localctx, 34, RULE_func_call_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			mid();
			setState(236);
			match(CALL_t);
			setState(237);
			id();
			setState(238);
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
		enterRule(_localctx, 36, RULE_func_call_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			id();
			setState(241);
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
		public Func_call_outContext func_call_out() {
			return getRuleContext(Func_call_outContext.class,0);
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
		enterRule(_localctx, 38, RULE_func_call_local_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			func_call_out();
			setState(244);
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
		enterRule(_localctx, 40, RULE_func_call_out_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			func_call_out();
			setState(247);
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
		enterRule(_localctx, 42, RULE_varset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			mid();
			setState(250);
			match(T__5);
			setState(251);
			type();
			setState(252);
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
		enterRule(_localctx, 44, RULE_local_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(254);
				match(CONST);
				}
			}

			setState(257);
			ptype();
			setState(258);
			id();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(259);
				match(T__5);
				setState(260);
				type();
				}
			}

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
		enterRule(_localctx, 46, RULE_array_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			mid();
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(266);
					match(LSQB);
					setState(267);
					type();
					setState(268);
					match(RSQB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 48, RULE_array_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			array_ref();
			setState(275);
			match(T__5);
			setState(276);
			type();
			setState(277);
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
		enterRule(_localctx, 50, RULE_type_casting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LPRM);
			setState(280);
			ptype();
			setState(281);
			match(RPRM);
			setState(282);
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
		enterRule(_localctx, 52, RULE_arrayname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			bx_type();
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				match(LSQB);
				setState(286);
				match(RSQB);
				}
				}
				setState(289); 
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
		enterRule(_localctx, 54, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__6);
			setState(292);
			type();
			setState(293);
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
		enterRule(_localctx, 56, RULE_greaterthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			type();
			setState(296);
			match(GT);
			setState(297);
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
		enterRule(_localctx, 58, RULE_lesserthan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			type();
			setState(300);
			match(LT);
			setState(301);
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
		enterRule(_localctx, 60, RULE_greaterthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			type();
			setState(304);
			match(GTE);
			setState(305);
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
		enterRule(_localctx, 62, RULE_lesserthanE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			type();
			setState(308);
			match(LTE);
			setState(309);
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
		enterRule(_localctx, 64, RULE_notequalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			type();
			setState(312);
			match(T__7);
			setState(313);
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
		enterRule(_localctx, 66, RULE_equalto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			type();
			setState(316);
			match(EQ);
			setState(317);
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
		enterRule(_localctx, 68, RULE_false_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 70, RULE_true_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 72, RULE_boolval);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				greaterthan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				lesserthan();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				greaterthanE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				lesserthanE();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				equalto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				notequalto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(330);
				false_con();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(331);
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
		enterRule(_localctx, 74, RULE_notboolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(NOT);
			setState(335);
			match(LPRM);
			setState(336);
			boolval();
			setState(337);
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
		enterRule(_localctx, 76, RULE_logicexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(339);
				boolval();
				}
				break;
			case 2:
				{
				setState(340);
				notboolval();
				}
				break;
			case 3:
				{
				setState(341);
				andboolexpr();
				}
				break;
			case 4:
				{
				setState(342);
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
		enterRule(_localctx, 78, RULE_enclosed_boolval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LPRM);
			setState(346);
			boolval();
			setState(347);
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
		enterRule(_localctx, 80, RULE_andboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LPRM);
			setState(350);
			logicexpr();
			setState(351);
			match(RPRM);
			setState(352);
			match(AND);
			setState(353);
			match(LPRM);
			setState(354);
			logicexpr();
			setState(355);
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
		enterRule(_localctx, 82, RULE_orboolexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LPRM);
			setState(358);
			logicexpr();
			setState(359);
			match(RPRM);
			setState(360);
			match(OR);
			setState(361);
			match(LPRM);
			setState(362);
			logicexpr();
			setState(363);
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
		enterRule(_localctx, 84, RULE_boolexpr);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				boolval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				andboolexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				orboolexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
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
		enterRule(_localctx, 86, RULE_boolparseexpr);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(371);
				boolexpr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(NOT);
				setState(373);
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
		enterRule(_localctx, 88, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IF);
			setState(377);
			boolparseexpr();
			setState(378);
			match(LBRC);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(379);
					stmt();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(385);
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
		enterRule(_localctx, 90, RULE_elif_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ELIF);
			setState(388);
			boolparseexpr();
			setState(389);
			match(LBRC);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(390);
					stmt();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(396);
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
		enterRule(_localctx, 92, RULE_else_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ELSE);
			setState(399);
			match(LBRC);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(400);
					stmt();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(406);
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
		enterRule(_localctx, 94, RULE_while_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(WHILE);
			setState(409);
			boolparseexpr();
			setState(410);
			match(LBRC);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(411);
					stmt();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(417);
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
		enterRule(_localctx, 96, RULE_add_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			mid();
			setState(420);
			match(T__14);
			setState(421);
			type();
			setState(422);
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
		enterRule(_localctx, 98, RULE_sub_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			mid();
			setState(425);
			match(T__15);
			setState(426);
			type();
			setState(427);
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
		enterRule(_localctx, 100, RULE_mul_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			mid();
			setState(430);
			match(T__16);
			setState(431);
			type();
			setState(432);
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
		enterRule(_localctx, 102, RULE_div_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			mid();
			setState(435);
			match(T__17);
			setState(436);
			type();
			setState(437);
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
		enterRule(_localctx, 104, RULE_stmt);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				varset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				func_call_out_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				func_call_local_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				local_vardef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				array_set_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
				elif_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(446);
				else_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(447);
				while_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(448);
				add_inc_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(449);
				sub_inc_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(450);
				mul_inc_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(451);
				div_inc_stmt();
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
		enterRule(_localctx, 106, RULE_ptype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(454);
				bx_type();
				}
				break;
			case 2:
				{
				setState(455);
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
		enterRule(_localctx, 108, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			ptype();
			setState(459);
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
		enterRule(_localctx, 110, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LPRM);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (FLOAT_ID - 19)) | (1L << (DOUBLE_ID - 19)) | (1L << (INT_ID - 19)) | (1L << (VOID_ID - 19)) | (1L << (BOOL_ID - 19)) | (1L << (SHORT_ID - 19)) | (1L << (LONG_ID - 19)) | (1L << (SIMP_CHARS - 19)) | (1L << (COMPLEX_CHARS - 19)))) != 0)) {
				{
				setState(462);
				param();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARAM_SEP) {
					{
					{
					setState(463);
					match(PARAM_SEP);
					setState(464);
					param();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(472);
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
		enterRule(_localctx, 112, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(DEF);
			setState(475);
			bx_type();
			setState(476);
			id();
			setState(477);
			paramList();
			setState(478);
			match(LBRC);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(479);
					stmt();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(485);
				return_stmt();
				}
			}

			setState(488);
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

	public static class Union_def_keyContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LBRC() { return getToken(MicroParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(MicroParser.RBRC, 0); }
		public TerminalNode EOS() { return getToken(MicroParser.EOS, 0); }
		public List<TerminalNode> PARAM_SEP() { return getTokens(MicroParser.PARAM_SEP); }
		public TerminalNode PARAM_SEP(int i) {
			return getToken(MicroParser.PARAM_SEP, i);
		}
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
		enterRule(_localctx, 114, RULE_union_def_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			id();
			setState(491);
			match(T__5);
			setState(492);
			match(LBRC);
			setState(493);
			id();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_SEP) {
				{
				{
				setState(494);
				match(PARAM_SEP);
				setState(495);
				id();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(RBRC);
			setState(502);
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
		public TerminalNode AUTO() { return getToken(MicroParser.AUTO, 0); }
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
		enterRule(_localctx, 116, RULE_union_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTO) {
				{
				setState(504);
				match(AUTO);
				}
			}

			setState(507);
			match(UNION_DEF);
			setState(508);
			id();
			setState(509);
			match(LBRC);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIMP_CHARS) {
				{
				{
				setState(510);
				union_def_key();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 118, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(518);
					compiler_inst();
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(524);
				import_stmt();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			module_dec();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION_DEF || _la==AUTO) {
				{
				{
				setState(531);
				union_def();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(537);
				field();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(543);
				function();
				}
				}
				setState(548);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0228\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095\n\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f"+
		"\3\r\3\r\5\r\u00c7\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\5\21\u00d7\n\21\3\21\3\21\3\21\3\21\5\21\u00dd\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00e5\n\22\f\22\16\22\u00e8\13"+
		"\22\5\22\u00ea\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u0102"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u0108\n\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\6\31\u0111\n\31\r\31\16\31\u0112\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\6\34\u0122\n\34\r\34\16\34\u0123\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u014f\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5(\u015a\n(\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,"+
		"\u0174\n,\3-\3-\3-\5-\u0179\n-\3.\3.\3.\3.\7.\u017f\n.\f.\16.\u0182\13"+
		".\3.\3.\3/\3/\3/\3/\7/\u018a\n/\f/\16/\u018d\13/\3/\3/\3\60\3\60\3\60"+
		"\7\60\u0194\n\60\f\60\16\60\u0197\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u019f\n\61\f\61\16\61\u01a2\13\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u01c7\n\66\3\67\3\67\5\67\u01cb\n\67\38\38\38\39\39\39\39\7"+
		"9\u01d4\n9\f9\169\u01d7\139\59\u01d9\n9\39\39\3:\3:\3:\3:\3:\3:\7:\u01e3"+
		"\n:\f:\16:\u01e6\13:\3:\5:\u01e9\n:\3:\3:\3;\3;\3;\3;\3;\3;\7;\u01f3\n"+
		";\f;\16;\u01f6\13;\3;\3;\3;\3<\5<\u01fc\n<\3<\3<\3<\3<\7<\u0202\n<\f<"+
		"\16<\u0205\13<\3<\3<\3=\7=\u020a\n=\f=\16=\u020d\13=\3=\7=\u0210\n=\f"+
		"=\16=\u0213\13=\3=\3=\7=\u0217\n=\f=\16=\u021a\13=\3=\7=\u021d\n=\f=\16"+
		"=\u0220\13=\3=\7=\u0223\n=\f=\16=\u0226\13=\3=\b\u0180\u018b\u0195\u01a0"+
		"\u01e4\u020b\3\26>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\5\4\2\25\30\32\34\3\2\13"+
		"\r\3\2\16\20\2\u023b\2z\3\2\2\2\4|\3\2\2\2\6\u0080\3\2\2\2\b\u0085\3\2"+
		"\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u009a\3\2\2\2"+
		"\22\u009c\3\2\2\2\24\u00aa\3\2\2\2\26\u00ac\3\2\2\2\30\u00c4\3\2\2\2\32"+
		"\u00ca\3\2\2\2\34\u00cc\3\2\2\2\36\u00d0\3\2\2\2 \u00d4\3\2\2\2\"\u00e0"+
		"\3\2\2\2$\u00ed\3\2\2\2&\u00f2\3\2\2\2(\u00f5\3\2\2\2*\u00f8\3\2\2\2,"+
		"\u00fb\3\2\2\2.\u0101\3\2\2\2\60\u010b\3\2\2\2\62\u0114\3\2\2\2\64\u0119"+
		"\3\2\2\2\66\u011e\3\2\2\28\u0125\3\2\2\2:\u0129\3\2\2\2<\u012d\3\2\2\2"+
		">\u0131\3\2\2\2@\u0135\3\2\2\2B\u0139\3\2\2\2D\u013d\3\2\2\2F\u0141\3"+
		"\2\2\2H\u0143\3\2\2\2J\u014e\3\2\2\2L\u0150\3\2\2\2N\u0159\3\2\2\2P\u015b"+
		"\3\2\2\2R\u015f\3\2\2\2T\u0167\3\2\2\2V\u0173\3\2\2\2X\u0178\3\2\2\2Z"+
		"\u017a\3\2\2\2\\\u0185\3\2\2\2^\u0190\3\2\2\2`\u019a\3\2\2\2b\u01a5\3"+
		"\2\2\2d\u01aa\3\2\2\2f\u01af\3\2\2\2h\u01b4\3\2\2\2j\u01c6\3\2\2\2l\u01ca"+
		"\3\2\2\2n\u01cc\3\2\2\2p\u01cf\3\2\2\2r\u01dc\3\2\2\2t\u01ec\3\2\2\2v"+
		"\u01fb\3\2\2\2x\u020b\3\2\2\2z{\t\2\2\2{\3\3\2\2\2|}\7C\2\2}\5\3\2\2\2"+
		"~\u0081\7D\2\2\177\u0081\5\4\3\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\7\3\2\2\2\u0082\u0086\5\2\2\2\u0083\u0086\5\4\3\2\u0084\u0086\5\6\4\2"+
		"\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\t\3"+
		"\2\2\2\u0087\u0095\7\"\2\2\u0088\u0095\7#\2\2\u0089\u0095\5\4\3\2\u008a"+
		"\u0095\5\6\4\2\u008b\u0095\7\37\2\2\u008c\u0095\7\35\2\2\u008d\u0095\7"+
		" \2\2\u008e\u0095\7!\2\2\u008f\u0095\5$\23\2\u0090\u0095\5&\24\2\u0091"+
		"\u0095\5\26\f\2\u0092\u0095\5\64\33\2\u0093\u0095\5\60\31\2\u0094\u0087"+
		"\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u008a\3\2\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097\7\3\2"+
		"\2\u0097\r\3\2\2\2\u0098\u0099\7\4\2\2\u0099\17\3\2\2\2\u009a\u009b\7"+
		"\5\2\2\u009b\21\3\2\2\2\u009c\u009d\7\6\2\2\u009d\23\3\2\2\2\u009e\u00ab"+
		"\7\37\2\2\u009f\u00ab\7\35\2\2\u00a0\u00ab\7 \2\2\u00a1\u00ab\5&\24\2"+
		"\u00a2\u00ab\5$\23\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6"+
		"\7,\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00ab\5\64\33\2\u00a8\u00ab\5\6\4\2"+
		"\u00a9\u00ab\5\60\31\2\u00aa\u009e\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a0"+
		"\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\b\f\1\2\u00ad\u00ae\5\24\13\2\u00ae\u00c1\3\2\2\2\u00af"+
		"\u00b0\f\7\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\5\26\f\b\u00b2\u00c0\3"+
		"\2\2\2\u00b3\u00b4\f\6\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\5\26\f\7\u00b6"+
		"\u00c0\3\2\2\2\u00b7\u00b8\f\5\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\5"+
		"\26\f\6\u00ba\u00c0\3\2\2\2\u00bb\u00bc\f\4\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\u00be\5\26\f\5\u00be\u00c0\3\2\2\2\u00bf\u00af\3\2\2\2\u00bf\u00b3\3"+
		"\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c6\7?\2\2\u00c5\u00c7\7A\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7!\2\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00cb\5\30\r\2\u00cb\33\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd\u00ce\5\6\4"+
		"\2\u00ce\u00cf\7%\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1\u00d2"+
		"\5\6\4\2\u00d2\u00d3\7%\2\2\u00d3\37\3\2\2\2\u00d4\u00d6\7\7\2\2\u00d5"+
		"\u00d7\7;\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\5l\67\2\u00d9\u00dc\5\4\3\2\u00da\u00db\7\b\2\2\u00db"+
		"\u00dd\5\n\6\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\7%\2\2\u00df!\3\2\2\2\u00e0\u00e9\7+\2\2\u00e1\u00e6"+
		"\5\n\6\2\u00e2\u00e3\7>\2\2\u00e3\u00e5\5\n\6\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec#\3\2\2\2\u00ed\u00ee\5\6\4\2\u00ee"+
		"\u00ef\7B\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\5\"\22\2\u00f1%\3\2\2\2"+
		"\u00f2\u00f3\5\4\3\2\u00f3\u00f4\5\"\22\2\u00f4\'\3\2\2\2\u00f5\u00f6"+
		"\5$\23\2\u00f6\u00f7\7%\2\2\u00f7)\3\2\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa"+
		"\7%\2\2\u00fa+\3\2\2\2\u00fb\u00fc\5\6\4\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe"+
		"\5\n\6\2\u00fe\u00ff\7%\2\2\u00ff-\3\2\2\2\u0100\u0102\7;\2\2\u0101\u0100"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5l\67\2\u0104"+
		"\u0107\5\4\3\2\u0105\u0106\7\b\2\2\u0106\u0108\5\n\6\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7%\2\2\u010a"+
		"/\3\2\2\2\u010b\u0110\5\6\4\2\u010c\u010d\7/\2\2\u010d\u010e\5\n\6\2\u010e"+
		"\u010f\7\60\2\2\u010f\u0111\3\2\2\2\u0110\u010c\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\61\3\2\2\2\u0114"+
		"\u0115\5\60\31\2\u0115\u0116\7\b\2\2\u0116\u0117\5\n\6\2\u0117\u0118\7"+
		"%\2\2\u0118\63\3\2\2\2\u0119\u011a\7+\2\2\u011a\u011b\5l\67\2\u011b\u011c"+
		"\7,\2\2\u011c\u011d\5\n\6\2\u011d\65\3\2\2\2\u011e\u0121\5\b\5\2\u011f"+
		"\u0120\7/\2\2\u0120\u0122\7\60\2\2\u0121\u011f\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\67\3\2\2\2\u0125\u0126"+
		"\7\t\2\2\u0126\u0127\5\n\6\2\u0127\u0128\7%\2\2\u01289\3\2\2\2\u0129\u012a"+
		"\5\n\6\2\u012a\u012b\7\64\2\2\u012b\u012c\5\n\6\2\u012c;\3\2\2\2\u012d"+
		"\u012e\5\n\6\2\u012e\u012f\7\63\2\2\u012f\u0130\5\n\6\2\u0130=\3\2\2\2"+
		"\u0131\u0132\5\n\6\2\u0132\u0133\7\66\2\2\u0133\u0134\5\n\6\2\u0134?\3"+
		"\2\2\2\u0135\u0136\5\n\6\2\u0136\u0137\7\65\2\2\u0137\u0138\5\n\6\2\u0138"+
		"A\3\2\2\2\u0139\u013a\5\n\6\2\u013a\u013b\7\n\2\2\u013b\u013c\5\n\6\2"+
		"\u013cC\3\2\2\2\u013d\u013e\5\n\6\2\u013e\u013f\79\2\2\u013f\u0140\5\n"+
		"\6\2\u0140E\3\2\2\2\u0141\u0142\t\3\2\2\u0142G\3\2\2\2\u0143\u0144\t\4"+
		"\2\2\u0144I\3\2\2\2\u0145\u014f\5\n\6\2\u0146\u014f\5:\36\2\u0147\u014f"+
		"\5<\37\2\u0148\u014f\5> \2\u0149\u014f\5@!\2\u014a\u014f\5D#\2\u014b\u014f"+
		"\5B\"\2\u014c\u014f\5F$\2\u014d\u014f\5H%\2\u014e\u0145\3\2\2\2\u014e"+
		"\u0146\3\2\2\2\u014e\u0147\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u0149\3\2"+
		"\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014fK\3\2\2\2\u0150\u0151\7:\2\2\u0151\u0152\7+\2\2\u0152"+
		"\u0153\5J&\2\u0153\u0154\7,\2\2\u0154M\3\2\2\2\u0155\u015a\5J&\2\u0156"+
		"\u015a\5L\'\2\u0157\u015a\5R*\2\u0158\u015a\5T+\2\u0159\u0155\3\2\2\2"+
		"\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015aO\3"+
		"\2\2\2\u015b\u015c\7+\2\2\u015c\u015d\5J&\2\u015d\u015e\7,\2\2\u015eQ"+
		"\3\2\2\2\u015f\u0160\7+\2\2\u0160\u0161\5N(\2\u0161\u0162\7,\2\2\u0162"+
		"\u0163\7\61\2\2\u0163\u0164\7+\2\2\u0164\u0165\5N(\2\u0165\u0166\7,\2"+
		"\2\u0166S\3\2\2\2\u0167\u0168\7+\2\2\u0168\u0169\5N(\2\u0169\u016a\7,"+
		"\2\2\u016a\u016b\7\62\2\2\u016b\u016c\7+\2\2\u016c\u016d\5N(\2\u016d\u016e"+
		"\7,\2\2\u016eU\3\2\2\2\u016f\u0174\5J&\2\u0170\u0174\5R*\2\u0171\u0174"+
		"\5T+\2\u0172\u0174\5P)\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174W\3\2\2\2\u0175\u0179\5V,\2\u0176"+
		"\u0177\7:\2\2\u0177\u0179\5V,\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2"+
		"\2\u0179Y\3\2\2\2\u017a\u017b\7\67\2\2\u017b\u017c\5X-\2\u017c\u0180\7"+
		"-\2\2\u017d\u017f\5j\66\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7.\2\2\u0184[\3\2\2\2\u0185\u0186\7<\2\2\u0186\u0187"+
		"\5X-\2\u0187\u018b\7-\2\2\u0188\u018a\5j\66\2\u0189\u0188\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7.\2\2\u018f]\3\2\2\2\u0190\u0191"+
		"\7=\2\2\u0191\u0195\7-\2\2\u0192\u0194\5j\66\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7.\2\2\u0199_\3\2\2\2\u019a\u019b"+
		"\78\2\2\u019b\u019c\5X-\2\u019c\u01a0\7-\2\2\u019d\u019f\5j\66\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7.\2\2\u01a4"+
		"a\3\2\2\2\u01a5\u01a6\5\6\4\2\u01a6\u01a7\7\21\2\2\u01a7\u01a8\5\n\6\2"+
		"\u01a8\u01a9\7%\2\2\u01a9c\3\2\2\2\u01aa\u01ab\5\6\4\2\u01ab\u01ac\7\22"+
		"\2\2\u01ac\u01ad\5\n\6\2\u01ad\u01ae\7%\2\2\u01aee\3\2\2\2\u01af\u01b0"+
		"\5\6\4\2\u01b0\u01b1\7\23\2\2\u01b1\u01b2\5\n\6\2\u01b2\u01b3\7%\2\2\u01b3"+
		"g\3\2\2\2\u01b4\u01b5\5\6\4\2\u01b5\u01b6\7\24\2\2\u01b6\u01b7\5\n\6\2"+
		"\u01b7\u01b8\7%\2\2\u01b8i\3\2\2\2\u01b9\u01c7\5,\27\2\u01ba\u01c7\5*"+
		"\26\2\u01bb\u01c7\5(\25\2\u01bc\u01c7\5.\30\2\u01bd\u01c7\5\62\32\2\u01be"+
		"\u01c7\5Z.\2\u01bf\u01c7\5\\/\2\u01c0\u01c7\5^\60\2\u01c1\u01c7\5`\61"+
		"\2\u01c2\u01c7\5b\62\2\u01c3\u01c7\5d\63\2\u01c4\u01c7\5f\64\2\u01c5\u01c7"+
		"\5h\65\2\u01c6\u01b9\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01bb\3\2\2\2\u01c6"+
		"\u01bc\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01bf\3\2"+
		"\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7k\3\2\2\2"+
		"\u01c8\u01cb\5\b\5\2\u01c9\u01cb\5\66\34\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cbm\3\2\2\2\u01cc\u01cd\5l\67\2\u01cd\u01ce\5\4\3\2\u01ce"+
		"o\3\2\2\2\u01cf\u01d8\7+\2\2\u01d0\u01d5\5n8\2\u01d1\u01d2\7>\2\2\u01d2"+
		"\u01d4\5n8\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d0"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7,\2\2\u01db"+
		"q\3\2\2\2\u01dc\u01dd\7*\2\2\u01dd\u01de\5\b\5\2\u01de\u01df\5\4\3\2\u01df"+
		"\u01e0\5p9\2\u01e0\u01e4\7-\2\2\u01e1\u01e3\5j\66\2\u01e2\u01e1\3\2\2"+
		"\2\u01e3\u01e6\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\58\35\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7.\2\2\u01ebs\3\2\2\2\u01ec"+
		"\u01ed\5\4\3\2\u01ed\u01ee\7\b\2\2\u01ee\u01ef\7-\2\2\u01ef\u01f4\5\4"+
		"\3\2\u01f0\u01f1\7>\2\2\u01f1\u01f3\5\4\3\2\u01f2\u01f0\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7.\2\2\u01f8\u01f9\7%\2\2\u01f9u"+
		"\3\2\2\2\u01fa\u01fc\7@\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\7\31\2\2\u01fe\u01ff\5\4\3\2\u01ff\u0203\7"+
		"-\2\2\u0200\u0202\5t;\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0207\7.\2\2\u0207w\3\2\2\2\u0208\u020a\5\32\16\2\u0209\u0208"+
		"\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u0211\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0210\5\34\17\2\u020f\u020e\3"+
		"\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0218\5\36\20\2\u0215\u0217\5"+
		"v<\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021e\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\5 "+
		"\21\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0224\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\5r"+
		":\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225y\3\2\2\2\u0226\u0224\3\2\2\2\'\u0080\u0085\u0094"+
		"\u00aa\u00bf\u00c1\u00c6\u00d6\u00dc\u00e6\u00e9\u0101\u0107\u0112\u0123"+
		"\u014e\u0159\u0173\u0178\u0180\u018b\u0195\u01a0\u01c6\u01ca\u01d5\u01d8"+
		"\u01e4\u01e8\u01f4\u01fb\u0203\u020b\u0211\u0218\u021e\u0224";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}