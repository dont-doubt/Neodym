// Generated from ../neodym/antlr/Neodym.g4 by ANTLR 4.13.1
package neodym.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NeodymParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Uniform=7, In=8, Out=9, 
		Void=10, Int=11, Int2=12, Int3=13, Int4=14, UInt=15, UInt2=16, UInt3=17, 
		UInt4=18, Float=19, Float2=20, Float3=21, Float4=22, Bool=23, Bool2=24, 
		Bool3=25, Bool4=26, Double=27, Double2=28, Double3=29, Double4=30, Mat22=31, 
		Mat23=32, Mat24=33, Mat32=34, Mat33=35, Mat34=36, Mat42=37, Mat43=38, 
		Mat44=39, DMat22=40, DMat23=41, DMat24=42, DMat32=43, DMat33=44, DMat34=45, 
		DMat42=46, DMat43=47, DMat44=48, Shadow1d=49, Shadow2d=50, Shadow3d=51, 
		Texture1d=52, Texture2d=53, Texture3d=54, Cubemap=55, Shadowcube=56, PLUS=57, 
		MINUS=58, MULT=59, DIVIDE=60, MOD=61, POW=62, INCR=63, DECR=64, NEG=65, 
		ASSIGN=66, A_PLUS=67, A_MINUS=68, A_MULT=69, A_DIVIDE=70, A_POW=71, EQUAL=72, 
		NOT_EQUAL=73, GREATER=74, LESSER=75, GREATER_EQ=76, LESSER_EQ=77, AND=78, 
		OR=79, DOT=80, COMMA=81, Identifier=82, NL=83, WS=84, BlockComment=85, 
		LineComment=86;
	public static final int
		RULE_prog = 0, RULE_member = 1, RULE_func = 2, RULE_mainFunc = 3, RULE_funcBody = 4, 
		RULE_params = 5, RULE_param = 6, RULE_typedParam = 7, RULE_expr = 8, RULE_expr1 = 9, 
		RULE_uniform = 10, RULE_optSeparator = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "member", "func", "mainFunc", "funcBody", "params", "param", 
			"typedParam", "expr", "expr1", "uniform", "optSeparator", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'{'", "'}'", "'('", "')'", "';'", "'uniform'", "'in'", 
			"'out'", "'void'", null, "'int2'", "'int3'", "'int4'", null, "'uint2'", 
			"'uint3'", "'uint4'", null, "'float2'", "'float3'", "'float4'", null, 
			"'bool2'", "'bool3'", "'bool4'", null, "'double2'", "'double3'", "'double4'", 
			null, "'mat23'", "'mat24'", "'mat32'", null, "'mat34'", "'mat42'", "'mat43'", 
			null, null, "'dmat23'", "'dmat24'", "'dmat32'", null, "'dmat34'", "'dmat42'", 
			"'dmat43'", null, "'shadow1d'", "'shadow2d'", "'shadow3d'", "'texture1d'", 
			"'texture2d'", "'texture3d'", "'cubemap'", "'shadowcube'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'++'", "'--'", "'!'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'^='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'&&'", "'||'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Uniform", "In", "Out", "Void", 
			"Int", "Int2", "Int3", "Int4", "UInt", "UInt2", "UInt3", "UInt4", "Float", 
			"Float2", "Float3", "Float4", "Bool", "Bool2", "Bool3", "Bool4", "Double", 
			"Double2", "Double3", "Double4", "Mat22", "Mat23", "Mat24", "Mat32", 
			"Mat33", "Mat34", "Mat42", "Mat43", "Mat44", "DMat22", "DMat23", "DMat24", 
			"DMat32", "DMat33", "DMat34", "DMat42", "DMat43", "DMat44", "Shadow1d", 
			"Shadow2d", "Shadow3d", "Texture1d", "Texture2d", "Texture3d", "Cubemap", 
			"Shadowcube", "PLUS", "MINUS", "MULT", "DIVIDE", "MOD", "POW", "INCR", 
			"DECR", "NEG", "ASSIGN", "A_PLUS", "A_MINUS", "A_MULT", "A_DIVIDE", "A_POW", 
			"EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_EQ", "LESSER_EQ", 
			"AND", "OR", "DOT", "COMMA", "Identifier", "NL", "WS", "BlockComment", 
			"LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Neodym.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NeodymParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NeodymParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(NeodymParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NeodymParser.NL, i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<OptSeparatorContext> optSeparator() {
			return getRuleContexts(OptSeparatorContext.class);
		}
		public OptSeparatorContext optSeparator(int i) {
			return getRuleContext(OptSeparatorContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188075854978L) != 0) || _la==Identifier || _la==NL) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NL:
					{
					setState(26);
					match(NL);
					}
					break;
				case T__0:
				case Uniform:
				case Void:
				case Int:
				case Int2:
				case Int3:
				case Int4:
				case UInt:
				case UInt2:
				case UInt3:
				case UInt4:
				case Float:
				case Float2:
				case Float3:
				case Float4:
				case Bool:
				case Bool2:
				case Bool3:
				case Bool4:
				case Double:
				case Double2:
				case Double3:
				case Double4:
				case Mat22:
				case Mat23:
				case Mat24:
				case Mat32:
				case Mat33:
				case Mat34:
				case Mat42:
				case Mat43:
				case Mat44:
				case DMat22:
				case DMat23:
				case DMat24:
				case DMat32:
				case DMat33:
				case DMat34:
				case DMat42:
				case DMat43:
				case DMat44:
				case Shadow1d:
				case Shadow2d:
				case Shadow3d:
				case Texture1d:
				case Texture2d:
				case Texture3d:
				case Cubemap:
				case Shadowcube:
				case Identifier:
					{
					setState(27);
					member();
					setState(28);
					optSeparator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberContext extends ParserRuleContext {
		public UniformContext uniform() {
			return getRuleContext(UniformContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_member);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Uniform:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				uniform();
				}
				break;
			case T__0:
			case Void:
			case Int:
			case Int2:
			case Int3:
			case Int4:
			case UInt:
			case UInt2:
			case UInt3:
			case UInt4:
			case Float:
			case Float2:
			case Float3:
			case Float4:
			case Bool:
			case Bool2:
			case Bool3:
			case Bool4:
			case Double:
			case Double2:
			case Double3:
			case Double4:
			case Mat22:
			case Mat23:
			case Mat24:
			case Mat32:
			case Mat33:
			case Mat34:
			case Mat42:
			case Mat43:
			case Mat44:
			case DMat22:
			case DMat23:
			case DMat24:
			case DMat32:
			case DMat33:
			case DMat34:
			case DMat42:
			case DMat43:
			case DMat44:
			case Shadow1d:
			case Shadow2d:
			case Shadow3d:
			case Texture1d:
			case Texture2d:
			case Texture3d:
			case Cubemap:
			case Shadowcube:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				func();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public MainFuncContext mainFunc() {
			return getRuleContext(MainFuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Int:
			case Int2:
			case Int3:
			case Int4:
			case UInt:
			case UInt2:
			case UInt3:
			case UInt4:
			case Float:
			case Float2:
			case Float3:
			case Float4:
			case Bool:
			case Bool2:
			case Bool3:
			case Bool4:
			case Double:
			case Double2:
			case Double3:
			case Double4:
			case Mat22:
			case Mat23:
			case Mat24:
			case Mat32:
			case Mat33:
			case Mat34:
			case Mat42:
			case Mat43:
			case Mat44:
			case DMat22:
			case DMat23:
			case DMat24:
			case DMat32:
			case DMat33:
			case DMat34:
			case DMat42:
			case DMat43:
			case DMat44:
			case Shadow1d:
			case Shadow2d:
			case Shadow3d:
			case Texture1d:
			case Texture2d:
			case Texture3d:
			case Cubemap:
			case Shadowcube:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				type();
				setState(42);
				match(Identifier);
				setState(43);
				params();
				setState(44);
				funcBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				mainFunc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainFuncContext extends ParserRuleContext {
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public MainFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterMainFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitMainFunc(this);
		}
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			funcBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(NeodymParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(NeodymParser.NL, i);
		}
		public TerminalNode ASSIGN() { return getToken(NeodymParser.ASSIGN, 0); }
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitFuncBody(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcBody);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__1);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier || _la==NL) {
					{
					setState(55);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(53);
						expr();
						}
						break;
					case NL:
						{
						setState(54);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(T__2);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ASSIGN);
				setState(62);
				expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TypedParamContext typedParam() {
			return getRuleContext(TypedParamContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NeodymParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NeodymParser.COMMA, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188075854848L) != 0) || _la==Identifier) {
				{
				setState(66);
				typedParam();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(67);
					match(COMMA);
					setState(68);
					param();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypedParamContext typedParam() {
			return getRuleContext(TypedParamContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				typedParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypedParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public TypedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitTypedParam(this);
		}
	}

	public final TypedParamContext typedParam() throws RecognitionException {
		TypedParamContext _localctx = new TypedParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typedParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			type();
			setState(83);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public OptSeparatorContext optSeparator() {
			return getRuleContext(OptSeparatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			expr1();
			setState(86);
			optSeparator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UniformContext extends ParserRuleContext {
		public TerminalNode Uniform() { return getToken(NeodymParser.Uniform, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public UniformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterUniform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitUniform(this);
		}
	}

	public final UniformContext uniform() throws RecognitionException {
		UniformContext _localctx = new UniformContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_uniform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Uniform);
			setState(91);
			type();
			setState(92);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OptSeparatorContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(NeodymParser.NL, 0); }
		public OptSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterOptSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitOptSeparator(this);
		}
	}

	public final OptSeparatorContext optSeparator() throws RecognitionException {
		OptSeparatorContext _localctx = new OptSeparatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_optSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==NL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(NeodymParser.Void, 0); }
		public TerminalNode Int() { return getToken(NeodymParser.Int, 0); }
		public TerminalNode Int2() { return getToken(NeodymParser.Int2, 0); }
		public TerminalNode Int3() { return getToken(NeodymParser.Int3, 0); }
		public TerminalNode Int4() { return getToken(NeodymParser.Int4, 0); }
		public TerminalNode UInt() { return getToken(NeodymParser.UInt, 0); }
		public TerminalNode UInt2() { return getToken(NeodymParser.UInt2, 0); }
		public TerminalNode UInt3() { return getToken(NeodymParser.UInt3, 0); }
		public TerminalNode UInt4() { return getToken(NeodymParser.UInt4, 0); }
		public TerminalNode Float() { return getToken(NeodymParser.Float, 0); }
		public TerminalNode Float2() { return getToken(NeodymParser.Float2, 0); }
		public TerminalNode Float3() { return getToken(NeodymParser.Float3, 0); }
		public TerminalNode Float4() { return getToken(NeodymParser.Float4, 0); }
		public TerminalNode Bool() { return getToken(NeodymParser.Bool, 0); }
		public TerminalNode Bool2() { return getToken(NeodymParser.Bool2, 0); }
		public TerminalNode Bool3() { return getToken(NeodymParser.Bool3, 0); }
		public TerminalNode Bool4() { return getToken(NeodymParser.Bool4, 0); }
		public TerminalNode Double() { return getToken(NeodymParser.Double, 0); }
		public TerminalNode Double2() { return getToken(NeodymParser.Double2, 0); }
		public TerminalNode Double3() { return getToken(NeodymParser.Double3, 0); }
		public TerminalNode Double4() { return getToken(NeodymParser.Double4, 0); }
		public TerminalNode Mat22() { return getToken(NeodymParser.Mat22, 0); }
		public TerminalNode Mat23() { return getToken(NeodymParser.Mat23, 0); }
		public TerminalNode Mat24() { return getToken(NeodymParser.Mat24, 0); }
		public TerminalNode Mat32() { return getToken(NeodymParser.Mat32, 0); }
		public TerminalNode Mat33() { return getToken(NeodymParser.Mat33, 0); }
		public TerminalNode Mat34() { return getToken(NeodymParser.Mat34, 0); }
		public TerminalNode Mat42() { return getToken(NeodymParser.Mat42, 0); }
		public TerminalNode Mat43() { return getToken(NeodymParser.Mat43, 0); }
		public TerminalNode Mat44() { return getToken(NeodymParser.Mat44, 0); }
		public TerminalNode DMat22() { return getToken(NeodymParser.DMat22, 0); }
		public TerminalNode DMat23() { return getToken(NeodymParser.DMat23, 0); }
		public TerminalNode DMat24() { return getToken(NeodymParser.DMat24, 0); }
		public TerminalNode DMat32() { return getToken(NeodymParser.DMat32, 0); }
		public TerminalNode DMat33() { return getToken(NeodymParser.DMat33, 0); }
		public TerminalNode DMat34() { return getToken(NeodymParser.DMat34, 0); }
		public TerminalNode DMat42() { return getToken(NeodymParser.DMat42, 0); }
		public TerminalNode DMat43() { return getToken(NeodymParser.DMat43, 0); }
		public TerminalNode DMat44() { return getToken(NeodymParser.DMat44, 0); }
		public TerminalNode Shadow1d() { return getToken(NeodymParser.Shadow1d, 0); }
		public TerminalNode Shadow2d() { return getToken(NeodymParser.Shadow2d, 0); }
		public TerminalNode Shadow3d() { return getToken(NeodymParser.Shadow3d, 0); }
		public TerminalNode Texture1d() { return getToken(NeodymParser.Texture1d, 0); }
		public TerminalNode Texture2d() { return getToken(NeodymParser.Texture2d, 0); }
		public TerminalNode Texture3d() { return getToken(NeodymParser.Texture3d, 0); }
		public TerminalNode Cubemap() { return getToken(NeodymParser.Cubemap, 0); }
		public TerminalNode Shadowcube() { return getToken(NeodymParser.Shadowcube, 0); }
		public TerminalNode Identifier() { return getToken(NeodymParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NeodymListener ) ((NeodymListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188075854848L) != 0) || _la==Identifier) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001Vc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00048\b"+
		"\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0003\u0005K\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006Q\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0002\u0002\u0000\u0006\u0006SS\u0002\u0000\n8RR_\u0000"+
		" \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004/\u0001"+
		"\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000"+
		"\u0000\nA\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eR\u0001"+
		"\u0000\u0000\u0000\u0010U\u0001\u0000\u0000\u0000\u0012X\u0001\u0000\u0000"+
		"\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016^\u0001\u0000\u0000\u0000\u0018"+
		"`\u0001\u0000\u0000\u0000\u001a\u001f\u0005S\u0000\u0000\u001b\u001c\u0003"+
		"\u0002\u0001\u0000\u001c\u001d\u0003\u0016\u000b\u0000\u001d\u001f\u0001"+
		"\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000"+
		"\u0000%(\u0003\u0014\n\u0000&(\u0003\u0004\u0002\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0003\u0018\f\u0000*+\u0005R\u0000\u0000+,\u0003\n\u0005\u0000,-\u0003"+
		"\b\u0004\u0000-0\u0001\u0000\u0000\u0000.0\u0003\u0006\u0003\u0000/)\u0001"+
		"\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000"+
		"\u000012\u0005\u0001\u0000\u000023\u0003\b\u0004\u00003\u0007\u0001\u0000"+
		"\u0000\u000049\u0005\u0002\u0000\u000058\u0003\u0010\b\u000068\u0005S"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0005\u0003\u0000"+
		"\u0000=>\u0005B\u0000\u0000>@\u0003\u0010\b\u0000?4\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000AJ\u0005\u0004"+
		"\u0000\u0000BG\u0003\u000e\u0007\u0000CD\u0005Q\u0000\u0000DF\u0003\f"+
		"\u0006\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0005\u0000\u0000M\u000b\u0001"+
		"\u0000\u0000\u0000NQ\u0003\u000e\u0007\u0000OQ\u0005R\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000"+
		"RS\u0003\u0018\f\u0000ST\u0005R\u0000\u0000T\u000f\u0001\u0000\u0000\u0000"+
		"UV\u0003\u0012\t\u0000VW\u0003\u0016\u000b\u0000W\u0011\u0001\u0000\u0000"+
		"\u0000XY\u0005R\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005\u0007"+
		"\u0000\u0000[\\\u0003\u0018\f\u0000\\]\u0005R\u0000\u0000]\u0015\u0001"+
		"\u0000\u0000\u0000^_\u0007\u0000\u0000\u0000_\u0017\u0001\u0000\u0000"+
		"\u0000`a\u0007\u0001\u0000\u0000a\u0019\u0001\u0000\u0000\u0000\n\u001e"+
		" \'/79?GJP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}