// Generated from C:\_java\mywork\codeseq\compiler\expression\Lisp.g4 by ANTLR 4.7.1
package expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, WS=11;
	public static final int
		RULE_file = 0, RULE_expr = 1, RULE_define = 2, RULE_setexpr = 3, RULE_ifexpr = 4, 
		RULE_lambda = 5, RULE_begin = 6, RULE_self = 7, RULE_compound = 8, RULE_op = 9, 
		RULE_args = 10;
	public static final String[] ruleNames = {
		"file", "expr", "define", "setexpr", "ifexpr", "lambda", "begin", "self", 
		"compound", "op", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'define'", "')'", "'set'", "'if'", "'else'", "'lambda'", 
		"'begin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "Lisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				expr();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << INT))) != 0) );
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_exprContext extends ExprContext {
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public If_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitIf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIf_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_exprContext extends ExprContext {
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public Self_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSelf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSelf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSelf_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Lambda_exprContext extends ExprContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public Lambda_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterLambda_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitLambda_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLambda_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Begin_exprContext extends ExprContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public Begin_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterBegin_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitBegin_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitBegin_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Define_exprContext extends ExprContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public Define_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterDefine_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitDefine_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDefine_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Set_exprContext extends ExprContext {
		public SetexprContext setexpr() {
			return getRuleContext(SetexprContext.class,0);
		}
		public Set_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSet_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSet_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSet_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Compound_exprContext extends ExprContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public Compound_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCompound_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCompound_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCompound_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Define_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				define();
				}
				break;
			case 2:
				_localctx = new If_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				ifexpr();
				}
				break;
			case 3:
				_localctx = new Lambda_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				lambda();
				}
				break;
			case 4:
				_localctx = new Begin_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				begin();
				}
				break;
			case 5:
				_localctx = new Self_exprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				self();
				}
				break;
			case 6:
				_localctx = new Compound_exprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				compound();
				}
				break;
			case 7:
				_localctx = new Set_exprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				setexpr();
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);
			setState(38);
			match(ID);
			setState(39);
			expr();
			setState(40);
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

	public static class SetexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSetexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSetexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSetexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetexprContext setexpr() throws RecognitionException {
		SetexprContext _localctx = new SetexprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(T__3);
			setState(44);
			match(ID);
			setState(45);
			expr();
			setState(46);
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

	public static class IfexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterIfexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitIfexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(T__4);
			setState(50);
			expr();
			setState(51);
			expr();
			setState(52);
			match(T__5);
			setState(53);
			expr();
			setState(54);
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

	public static class LambdaContext extends ParserRuleContext {
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(T__6);
			setState(58);
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

	public static class BeginContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(T__7);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				expr();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << INT))) != 0) );
			setState(67);
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

	public static class SelfContext extends ParserRuleContext {
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
	 
		public SelfContext() { }
		public void copyFrom(SelfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Self_idContext extends SelfContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public Self_idContext(SelfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSelf_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSelf_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSelf_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_intContext extends SelfContext {
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public Self_intContext(SelfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSelf_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSelf_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSelf_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_self);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Self_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				}
				break;
			case INT:
				_localctx = new Self_intContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(INT);
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

	public static class CompoundContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__0);
			setState(74);
			op();
			setState(75);
			args();
			setState(76);
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

	public static class OpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			expr();
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

	public static class ArgsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			expr();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rU\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bB\n\b\r\b\16\bC\3\b\3\b\3\t"+
		"\3\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\2\2R\2\31\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b,\3\2\2"+
		"\2\n\62\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20I\3\2\2\2\22K\3\2\2\2\24P\3\2"+
		"\2\2\26R\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2"+
		"\2\33\34\3\2\2\2\34\3\3\2\2\2\35%\5\6\4\2\36%\5\n\6\2\37%\5\f\7\2 %\5"+
		"\16\b\2!%\5\20\t\2\"%\5\22\n\2#%\5\b\5\2$\35\3\2\2\2$\36\3\2\2\2$\37\3"+
		"\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\3\2\2"+
		"\'(\7\4\2\2()\7\13\2\2)*\5\4\3\2*+\7\5\2\2+\7\3\2\2\2,-\7\3\2\2-.\7\6"+
		"\2\2./\7\13\2\2/\60\5\4\3\2\60\61\7\5\2\2\61\t\3\2\2\2\62\63\7\3\2\2\63"+
		"\64\7\7\2\2\64\65\5\4\3\2\65\66\5\4\3\2\66\67\7\b\2\2\678\5\4\3\289\7"+
		"\5\2\29\13\3\2\2\2:;\7\3\2\2;<\7\t\2\2<=\7\5\2\2=\r\3\2\2\2>?\7\3\2\2"+
		"?A\7\n\2\2@B\5\4\3\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2"+
		"EF\7\5\2\2F\17\3\2\2\2GJ\7\13\2\2HJ\7\f\2\2IG\3\2\2\2IH\3\2\2\2J\21\3"+
		"\2\2\2KL\7\3\2\2LM\5\24\13\2MN\5\26\f\2NO\7\5\2\2O\23\3\2\2\2PQ\5\4\3"+
		"\2Q\25\3\2\2\2RS\5\4\3\2S\27\3\2\2\2\6\33$CI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}