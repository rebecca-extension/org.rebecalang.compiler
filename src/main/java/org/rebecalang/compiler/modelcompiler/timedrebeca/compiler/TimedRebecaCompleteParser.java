// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimedRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFTER=1, DEADLINE=2, INTLITERAL=3, FLOATLITERAL=4, DOUBLELITERAL=5, CHARLITERAL=6, 
		STRINGLITERAL=7, WS=8, COMMENT=9, LINE_COMMENT=10, BREAK=11, CASE=12, 
		CLASS=13, CONTINUE=14, DEFAULT=15, ELSE=16, FOR=17, GOTO=18, IF=19, IMPORT=20, 
		NEW=21, PACKAGE=22, PRIVATE=23, PROTECTED=24, PUBLIC=25, RECORD=26, RETURN=27, 
		SWITCH=28, WHILE=29, ENV=30, INSTANCEOF=31, REACTIVECLASS=32, INTERFACE=33, 
		ABSTRACT=34, EXTENDS=35, IMPLEMENTS=36, MSGSRV=37, MAIN=38, STATEVARS=39, 
		KNOWNREBECS=40, THIS=41, TRUE=42, FALSE=43, NULL=44, LPAREN=45, RPAREN=46, 
		LBRACE=47, RBRACE=48, LBRACKET=49, RBRACKET=50, SEMI=51, COMMA=52, DOT=53, 
		EQ=54, BANG=55, TILDA=56, QUES=57, COLON=58, EQEQ=59, AMPAMP=60, BARBAR=61, 
		PLUSPLUS=62, SUBSUB=63, SUPER=64, PLUS=65, SUB=66, STAR=67, SLASH=68, 
		AMP=69, BAR=70, CARET=71, PERCENT=72, PLUSEQ=73, SUBEQ=74, STAREQ=75, 
		SLASHEQ=76, AMPEQ=77, BAREQ=78, CARETEQ=79, TILDAEQ=80, PERCENTEQ=81, 
		MONKEYS_AT=82, BANGEQ=83, GT=84, LT=85, LTLT=86, LTLTEQ=87, GTGT=88, GTGTEQ=89, 
		IDENTIFIER=90;
	public static final int
		RULE_primary = 0, RULE_rebecaModel = 1, RULE_packageDeclaration = 2, RULE_importDeclaration = 3, 
		RULE_rebecaCode = 4, RULE_recordDeclaration = 5, RULE_mainDeclaration = 6, 
		RULE_mainRebecDefinition = 7, RULE_environmentVariables = 8, RULE_fieldDeclaration = 9, 
		RULE_variableDeclarators = 10, RULE_variableDeclarator = 11, RULE_variableInitializer = 12, 
		RULE_arrayInitializer = 13, RULE_interfaceDeclaration = 14, RULE_reactiveClassDeclaration = 15, 
		RULE_methodDeclaration = 16, RULE_constructorDeclaration = 17, RULE_msgsrvDeclaration = 18, 
		RULE_synchMethodDeclaration = 19, RULE_formalParameters = 20, RULE_formalParametersDeclaration = 21, 
		RULE_formalParameterDeclaration = 22, RULE_block = 23, RULE_statement = 24, 
		RULE_forInit = 25, RULE_switchBlock = 26, RULE_statementExpression = 27, 
		RULE_annotation = 28, RULE_type = 29, RULE_genericTypeParams = 30, RULE_dimensions = 31, 
		RULE_expression = 32, RULE_assignmentOperator = 33, RULE_conditionalExpression = 34, 
		RULE_conditionalOrExpression = 35, RULE_conditionalAndExpression = 36, 
		RULE_inclusiveOrExpression = 37, RULE_exclusiveOrExpression = 38, RULE_andExpression = 39, 
		RULE_equalityExpression = 40, RULE_instanceOfExpression = 41, RULE_relationalExpression = 42, 
		RULE_relationalOp = 43, RULE_shiftExpression = 44, RULE_shiftOp = 45, 
		RULE_additiveExpression = 46, RULE_multiplicativeExpression = 47, RULE_unaryExpression = 48, 
		RULE_unaryExpressionNotPlusMinus = 49, RULE_castExpression = 50, RULE_expressionList = 51, 
		RULE_literal = 52;
	public static final String[] ruleNames = {
		"primary", "rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
		"recordDeclaration", "mainDeclaration", "mainRebecDefinition", "environmentVariables", 
		"fieldDeclaration", "variableDeclarators", "variableDeclarator", "variableInitializer", 
		"arrayInitializer", "interfaceDeclaration", "reactiveClassDeclaration", 
		"methodDeclaration", "constructorDeclaration", "msgsrvDeclaration", "synchMethodDeclaration", 
		"formalParameters", "formalParametersDeclaration", "formalParameterDeclaration", 
		"block", "statement", "forInit", "switchBlock", "statementExpression", 
		"annotation", "type", "genericTypeParams", "dimensions", "expression", 
		"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "expressionList", 
		"literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'after'", "'deadline'", null, null, null, null, null, null, null, 
		null, "'break'", "'case'", "'class'", "'continue'", "'default'", "'else'", 
		"'for'", "'goto'", "'if'", "'import'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'record'", "'return'", "'switch'", "'while'", 
		"'env'", "'instanceof'", "'reactiveclass'", "'interface'", "'abstract'", 
		"'extends'", "'implements'", "'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", 
		"'this'", "'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'&&'", "'||'", "'++'", "'--'", "'super'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'~='", "'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", 
		"'>>'", "'>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AFTER", "DEADLINE", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", 
		"CHARLITERAL", "STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "BREAK", 
		"CASE", "CLASS", "CONTINUE", "DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "RETURN", 
		"SWITCH", "WHILE", "ENV", "INSTANCEOF", "REACTIVECLASS", "INTERFACE", 
		"ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", 
		"THIS", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", 
		"QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "SUPER", 
		"PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", 
		"SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", 
		"PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", 
		"GTGTEQ", "IDENTIFIER"
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
	public String getGrammarFileName() { return "TimedRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimedRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext ef;
		public ExpressionContext ed;
		public ExpressionContext e2;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(TimedRebecaCompleteParser.AFTER, 0); }
		public TerminalNode DEADLINE() { return getToken(TimedRebecaCompleteParser.DEADLINE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(108);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(110);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(115);
				match(RPAREN);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(116);
					match(AFTER);
					setState(117);
					match(LPAREN);
					setState(118);
					((PrimaryContext)_localctx).ef = expression();
					setState(119);
					match(RPAREN);
					psp.setAfterExpression(((PrimaryContext)_localctx).ef.e);
					}
				}

				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEADLINE) {
					{
					setState(124);
					match(DEADLINE);
					setState(125);
					match(LPAREN);
					setState(126);
					((PrimaryContext)_localctx).ed = expression();
					setState(127);
					match(RPAREN);
					psp.setDeadlineExpression(((PrimaryContext)_localctx).ed.e);
					}
				}

				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(134);
				match(LBRACKET);
				setState(135);
				((PrimaryContext)_localctx).e2 = expression();
				setState(136);
				match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(143);
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

	public static class RebecaModelContext extends ParserRuleContext {
		public RebecaModel r;
		public PackageDeclarationContext p;
		public ImportDeclarationContext i;
		public RebecaCodeContext t1;
		public RebecaCodeContext rebecaCode() {
			return getRuleContext(RebecaCodeContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public RebecaModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(145);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(150);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(158);
			((RebecaModelContext)_localctx).t1 = rebecaCode();
			_localctx.r.setRebecaCode(((RebecaModelContext)_localctx).t1.rc);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclaration p;
		public TerminalNode PACKAGE() { return getToken(TimedRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(PACKAGE);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclaration i;
		public TerminalNode IMPORT() { return getToken(TimedRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IMPORT);
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

	public static class RebecaCodeContext extends ParserRuleContext {
		public RebecaCode rc;
		public RecordDeclarationContext rd;
		public EnvironmentVariablesContext e;
		public ReactiveClassDeclarationContext rcd;
		public InterfaceDeclarationContext intd;
		public MainDeclarationContext md;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public EnvironmentVariablesContext environmentVariables() {
			return getRuleContext(EnvironmentVariablesContext.class,0);
		}
		public List<RecordDeclarationContext> recordDeclaration() {
			return getRuleContexts(RecordDeclarationContext.class);
		}
		public RecordDeclarationContext recordDeclaration(int i) {
			return getRuleContext(RecordDeclarationContext.class,i);
		}
		public List<ReactiveClassDeclarationContext> reactiveClassDeclaration() {
			return getRuleContexts(ReactiveClassDeclarationContext.class);
		}
		public ReactiveClassDeclarationContext reactiveClassDeclaration(int i) {
			return getRuleContext(ReactiveClassDeclarationContext.class,i);
		}
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public RebecaCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebecaCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new RebecaCode();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(166);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(174);
			((RebecaCodeContext)_localctx).e = environmentVariables();
			_localctx.rc.getEnvironmentVariables().addAll(((RebecaCodeContext)_localctx).e.fds);
			}
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(177);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(180);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (REACTIVECLASS - 32)) | (1L << (INTERFACE - 32)) | (1L << (ABSTRACT - 32)) | (1L << (MONKEYS_AT - 32)))) != 0) );
			setState(187);
			((RebecaCodeContext)_localctx).md = mainDeclaration();
			_localctx.rc.setMainDeclaration(((RebecaCodeContext)_localctx).md.md);
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

	public static class RecordDeclarationContext extends ParserRuleContext {
		public RecordDeclaration rd;
		public TerminalNode RECORD() { return getToken(TimedRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RECORD);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration md;
		public Token MAIN;
		public MainRebecDefinitionContext mrd;
		public Token RBRACE;
		public TerminalNode MAIN() { return getToken(TimedRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<MainRebecDefinitionContext> mainRebecDefinition() {
			return getRuleContexts(MainRebecDefinitionContext.class);
		}
		public MainRebecDefinitionContext mainRebecDefinition(int i) {
			return getRuleContext(MainRebecDefinitionContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(193);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(195);
			match(LBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(196);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			((MainDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.md.setEndLineNumber(((MainDeclarationContext)_localctx).RBRACE.getLine());_localctx.md.setEndCharacter(((MainDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class MainRebecDefinitionContext extends ParserRuleContext {
		public MainRebecDefinition mrd;
		public TypeContext t;
		public Token rebecName;
		public ExpressionListContext el;
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public MainRebecDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRebecDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(208);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(209);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(211);
			match(LPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(212);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(217);
			match(RPAREN);
			setState(218);
			match(COLON);
			setState(219);
			match(LPAREN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(220);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(225);
			match(RPAREN);
			setState(226);
			match(SEMI);
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

	public static class EnvironmentVariablesContext extends ParserRuleContext {
		public List<FieldDeclaration> fds;
		public FieldDeclarationContext fd;
		public List<TerminalNode> ENV() { return getTokens(TimedRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(TimedRebecaCompleteParser.ENV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public EnvironmentVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEnvironmentVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEnvironmentVariables(this);
		}
	}

	public final EnvironmentVariablesContext environmentVariables() throws RecognitionException {
		EnvironmentVariablesContext _localctx = new EnvironmentVariablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_environmentVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EnvironmentVariablesContext)_localctx).fds =  new ArrayList<FieldDeclaration>();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV) {
				{
				{
				setState(229);
				match(ENV);
				setState(230);
				((EnvironmentVariablesContext)_localctx).fd = fieldDeclaration();
				_localctx.fds.add(((EnvironmentVariablesContext)_localctx).fd.fd);
				setState(232);
				match(SEMI);
				}
				}
				setState(238);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclaration fd;
		public AnnotationContext an;
		public TypeContext t;
		public VariableDeclaratorsContext vds;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(240);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			((FieldDeclarationContext)_localctx).t = type();
			setState(249);
			((FieldDeclarationContext)_localctx).vds = variableDeclarators();
			_localctx.fd.setType(((FieldDeclarationContext)_localctx).t.t); _localctx.fd.getVariableDeclarators().addAll(((FieldDeclarationContext)_localctx).vds.vds);
			    		_localctx.fd.setCharacter(((FieldDeclarationContext)_localctx).t.t.getCharacter()); _localctx.fd.setLineNumber(((FieldDeclarationContext)_localctx).t.t.getLineNumber());
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclarator> vds;
		public VariableDeclaratorContext vd;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(253);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(263);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclarator vd;
		public Token name;
		public VariableInitializerContext vi;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(265);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(267);
				match(EQ);
				setState(268);
				((VariableDeclaratorContext)_localctx).vi = variableInitializer();
				_localctx.vd.setVariableInitializer(((VariableDeclaratorContext)_localctx).vi.vi);
				}
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializer vi;
		public ArrayInitializerContext ai;
		public ExpressionContext e;
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableInitializer);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((VariableInitializerContext)_localctx).ai = arrayInitializer();
				((VariableInitializerContext)_localctx).vi =  ((VariableInitializerContext)_localctx).ai.avi;
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case PLUSPLUS:
			case SUBSUB:
			case PLUS:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((VariableInitializerContext)_localctx).e = expression();
				if(((VariableInitializerContext)_localctx).e.e != null) {
				    						((VariableInitializerContext)_localctx).vi =  new OrdinaryVariableInitializer();
				    						((OrdinaryVariableInitializer)_localctx.vi).setValue(((VariableInitializerContext)_localctx).e.e);
				    						_localctx.vi.setLineNumber(((VariableInitializerContext)_localctx).e.e.getLineNumber());
				    						_localctx.vi.setCharacter(((VariableInitializerContext)_localctx).e.e.getCharacter());
				    					}
				    					
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayVariableInitializer avi;
		public Token LBRACE;
		public VariableInitializerContext vi;
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(282);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(283);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285);
					match(COMMA);
					setState(286);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(296);
			match(RBRACE);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclaration intd;
		public AnnotationContext an;
		public Token interfaceName;
		public Token extendingInterfaceName;
		public Token name;
		public FormalParametersContext fps;
		public Token RBRACE;
		public TerminalNode INTERFACE() { return getToken(TimedRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<FormalParametersContext> formalParameters() {
			return getRuleContexts(FormalParametersContext.class);
		}
		public FormalParametersContext formalParameters(int i) {
			return getRuleContext(FormalParametersContext.class,i);
		}
		public List<TerminalNode> MSGSRV() { return getTokens(TimedRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(TimedRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(299);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(INTERFACE);
			setState(308);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(310);
				match(EXTENDS);
				setState(311);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
			match(LBRACE);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV) {
				{
				{
				MethodDeclaration md;
				{
				setState(325);
				match(MSGSRV);
				md = new MsgsrvDeclaration(); md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				}
				setState(328);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(330);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(332);
				match(SEMI);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			((InterfaceDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.intd.setEndLineNumber(((InterfaceDeclarationContext)_localctx).RBRACE.getLine());_localctx.intd.setEndCharacter(((InterfaceDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class ReactiveClassDeclarationContext extends ParserRuleContext {
		public ReactiveClassDeclaration rcd;
		public AnnotationContext an;
		public Token reactiveClassName;
		public Token extendingReactiveClassName;
		public Token implementingInterfaceName;
		public Token queueSize;
		public FieldDeclarationContext fd;
		public Token RBRACE;
		public ConstructorDeclarationContext cd;
		public MsgsrvDeclarationContext md;
		public SynchMethodDeclarationContext smd;
		public TerminalNode REACTIVECLASS() { return getToken(TimedRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TimedRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TimedRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TimedRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TimedRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(TimedRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(TimedRebecaCompleteParser.IMPLEMENTS, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(TimedRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(TimedRebecaCompleteParser.STATEVARS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
		public List<MsgsrvDeclarationContext> msgsrvDeclaration() {
			return getRuleContexts(MsgsrvDeclarationContext.class);
		}
		public MsgsrvDeclarationContext msgsrvDeclaration(int i) {
			return getRuleContext(MsgsrvDeclarationContext.class,i);
		}
		public List<SynchMethodDeclarationContext> synchMethodDeclaration() {
			return getRuleContexts(SynchMethodDeclarationContext.class);
		}
		public SynchMethodDeclarationContext synchMethodDeclaration(int i) {
			return getRuleContext(SynchMethodDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ReactiveClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactiveClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(343);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(351);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(355);
			match(REACTIVECLASS);
			setState(356);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(358);
				match(EXTENDS);
				setState(359);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(363);
				match(IMPLEMENTS);
				setState(364);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(366);
					match(COMMA);
					setState(367);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(376);
			match(LPAREN);
			setState(377);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(379);
			match(RPAREN);
			setState(380);
			match(LBRACE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(381);
				match(KNOWNREBECS);
				setState(382);
				match(LBRACE);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(383);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(385);
					match(SEMI);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(395);
				match(STATEVARS);
				setState(396);
				match(LBRACE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(397);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(399);
					match(SEMI);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (ABSTRACT - 34)) | (1L << (MSGSRV - 34)) | (1L << (MONKEYS_AT - 34)) | (1L << (IDENTIFIER - 34)))) != 0)) {
				{
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(409);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(412);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 3:
					{
					setState(415);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
			_localctx.rcd.setEndLineNumber(((ReactiveClassDeclarationContext)_localctx).RBRACE.getLine());_localctx.rcd.setEndCharacter(((ReactiveClassDeclarationContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration md;
		public Token name;
		public FormalParametersContext fps;
		public BlockContext b;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TimedRebecaCompleteParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, MethodDeclaration md) {
			super(parent, invokingState);
			this.md = md;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 32, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(428);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(430);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(433);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaration cd;
		public AnnotationContext an;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(437);
				((ConstructorDeclarationContext)_localctx).an = annotation();
				_localctx.cd.getAnnotations().add(((ConstructorDeclarationContext)_localctx).an.an);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			methodDeclaration(_localctx.cd);
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

	public static class MsgsrvDeclarationContext extends ParserRuleContext {
		public MsgsrvDeclaration md;
		public AnnotationContext an;
		public TerminalNode MSGSRV() { return getToken(TimedRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MsgsrvDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(448);
				((MsgsrvDeclarationContext)_localctx).an = annotation();
				_localctx.md.getAnnotations().add(((MsgsrvDeclarationContext)_localctx).an.an);
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(456);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(460);
			match(MSGSRV);
			setState(461);
			methodDeclaration(_localctx.md);
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

	public static class SynchMethodDeclarationContext extends ParserRuleContext {
		public SynchMethodDeclaration smd;
		public AnnotationContext an;
		public TypeContext t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(TimedRebecaCompleteParser.ABSTRACT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public SynchMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(464);
				((SynchMethodDeclarationContext)_localctx).an = annotation();
				_localctx.smd.getAnnotations().add(((SynchMethodDeclarationContext)_localctx).an.an);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(472);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(476);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(478);
			methodDeclaration(_localctx.smd);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fps;
		public FormalParametersDeclarationContext fpds;
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(481);
			match(LPAREN);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(482);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(487);
			match(RPAREN);
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

	public static class FormalParametersDeclarationContext extends ParserRuleContext {
		public List<FormalParameterDeclaration> fpds;
		public FormalParameterDeclarationContext fpd;
		public List<FormalParameterDeclarationContext> formalParameterDeclaration() {
			return getRuleContexts(FormalParameterDeclarationContext.class);
		}
		public FormalParameterDeclarationContext formalParameterDeclaration(int i) {
			return getRuleContext(FormalParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(490);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492);
				match(COMMA);
				setState(493);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(500);
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

	public static class FormalParameterDeclarationContext extends ParserRuleContext {
		public FormalParameterDeclaration fpd;
		public TypeContext t;
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(502);
			((FormalParameterDeclarationContext)_localctx).name = match(IDENTIFIER);

			            ((FormalParameterDeclarationContext)_localctx).fpd =  new FormalParameterDeclaration();
						_localctx.fpd.setLineNumber(((FormalParameterDeclarationContext)_localctx).name.getLine());
						_localctx.fpd.setCharacter(((FormalParameterDeclarationContext)_localctx).name.getCharPositionInLine());
			            _localctx.fpd.setName((((FormalParameterDeclarationContext)_localctx).name!=null?((FormalParameterDeclarationContext)_localctx).name.getText():null));
			            _localctx.fpd.setType(((FormalParameterDeclarationContext)_localctx).t.t);
			        
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStatement bs;
		public Token LBRACE;
		public StatementContext s;
		public Token RBRACE;
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(506);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(508);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			((BlockContext)_localctx).RBRACE = match(RBRACE);
			_localctx.bs.setEndLineNumber(((BlockContext)_localctx).RBRACE.getLine());_localctx.bs.setEndCharacter(((BlockContext)_localctx).RBRACE.getCharPositionInLine());
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

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public FieldDeclarationContext fd;
		public BlockContext b;
		public Token IF;
		public ExpressionContext e;
		public StatementContext st;
		public StatementContext est;
		public Token WHILE;
		public Token FOR;
		public ForInitContext fi;
		public ExpressionListContext el;
		public Token SWITCH;
		public SwitchBlockContext sb;
		public Token RETURN;
		public Token BREAK;
		public Token CONTINUE;
		public StatementExpressionContext se;
		public List<TerminalNode> SEMI() { return getTokens(TimedRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(TimedRebecaCompleteParser.SEMI, i);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(TimedRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TimedRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(TimedRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(TimedRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(TimedRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(TimedRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimedRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(TimedRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(TimedRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(TimedRebecaCompleteParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(521);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(528);
				match(LPAREN);
				setState(529);
				((StatementContext)_localctx).e = expression();
				setState(530);
				match(RPAREN);
				setState(531);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(533);
					match(ELSE);
					setState(534);
					((StatementContext)_localctx).est = statement();
					((ConditionalStatement)_localctx.s).setElseStatement(((StatementContext)_localctx).est.s);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(541);
				match(LPAREN);
				setState(542);
				((StatementContext)_localctx).e = expression();
				setState(543);
				match(RPAREN);
				setState(544);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(549);
				match(LPAREN);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(550);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(555);
				match(SEMI);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(556);
					((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(561);
				match(SEMI);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(562);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(567);
				match(RPAREN);
				setState(568);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(571);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(572);
				match(LPAREN);
				setState(573);
				((StatementContext)_localctx).e = expression();
				setState(574);
				match(RPAREN);
				setState(575);
				match(LBRACE);
				setState(576);
				((StatementContext)_localctx).sb = switchBlock();
				setState(577);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(581);
					((StatementContext)_localctx).e = expression();
					}
				}

				setState(584);
				match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(586);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(587);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(589);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(590);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(592);
				match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(594);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(596);
				match(SEMI);
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

	public static class ForInitContext extends ParserRuleContext {
		public ForInitializer fi;
		public FieldDeclarationContext fd;
		public ExpressionListContext el;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forInit);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				((ForInitContext)_localctx).el = expressionList();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.getExpressions().addAll(((ForInitContext)_localctx).el.el);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchStatement ss;
		public ExpressionContext e;
		public Token DEFAULT;
		public StatementContext st;
		public List<TerminalNode> COLON() { return getTokens(TimedRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TimedRebecaCompleteParser.COLON, i);
		}
		public List<TerminalNode> CASE() { return getTokens(TimedRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(TimedRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(TimedRebecaCompleteParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(TimedRebecaCompleteParser.DEFAULT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				setState(616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(610);
					match(CASE);
					setState(611);
					((SwitchBlockContext)_localctx).e = expression();

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
					    			
					}
					break;
				case DEFAULT:
					{
					setState(614);
					((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
					    			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(618);
				match(COLON);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(619);
					((SwitchBlockContext)_localctx).st = statement();
					_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(631);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public Statement se;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			((StatementExpressionContext)_localctx).e = expression();
			((StatementExpressionContext)_localctx).se =  ((StatementExpressionContext)_localctx).e.e;
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

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation an;
		public Token annotationName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(636);
			match(MONKEYS_AT);
			setState(637);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(639);
				match(LPAREN);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(640);
					((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(645);
				match(RPAREN);
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

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token typeName;
		public GenericTypeParamsContext gts;
		public DimensionsContext ds;
		public TerminalNode IDENTIFIER() { return getToken(TimedRebecaCompleteParser.IDENTIFIER, 0); }
		public GenericTypeParamsContext genericTypeParams() {
			return getRuleContext(GenericTypeParamsContext.class,0);
		}
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(650);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(655);
				((TypeContext)_localctx).ds = dimensions();
				OrdinaryPrimitiveType newpt = (OrdinaryPrimitiveType)_localctx.t; ((TypeContext)_localctx).t =  new ArrayType(); ((ArrayType)_localctx.t).setOrdinaryPrimitiveType(newpt); ((ArrayType)_localctx.t).getDimensions().addAll(((TypeContext)_localctx).ds.ds);
				}
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

	public static class GenericTypeParamsContext extends ParserRuleContext {
		public List<Type> gts;
		public TypeContext t;
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(662);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(664);
				match(COMMA);
				setState(665);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
			match(GT);
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

	public static class DimensionsContext extends ParserRuleContext {
		public List<Integer> ds;
		public Token i;
		public List<TerminalNode> LBRACKET() { return getTokens(TimedRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(TimedRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(TimedRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(TimedRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(TimedRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(680); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(676);
				match(LBRACKET);
				setState(677);
				((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(678);
				match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalExpressionContext e1;
		public AssignmentOperatorContext ao;
		public ExpressionContext e2;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(686);
				((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(687);
				((ExpressionContext)_localctx).e2 = expression();
				BinaryExpression e3 = new BinaryExpression();
							e3.setOperator(((ExpressionContext)_localctx).ao.ao); e3.setLeft(((ExpressionContext)_localctx).e1.e); e3.setRight(((ExpressionContext)_localctx).e2.e);
							e3.setLineNumber(((ExpressionContext)_localctx).e1.e.getLineNumber());e3.setCharacter(((ExpressionContext)_localctx).e1.e.getCharacter()); ((ExpressionContext)_localctx).e =  e3;
							
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public String ao;
		public Token EQ;
		public Token PLUSEQ;
		public Token SUBEQ;
		public Token STAREQ;
		public Token SLASHEQ;
		public Token AMPEQ;
		public Token BAREQ;
		public Token CARETEQ;
		public Token TILDAEQ;
		public Token PERCENTEQ;
		public Token LTLTEQ;
		public Token GTGTEQ;
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(TimedRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(TimedRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(TimedRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(TimedRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(TimedRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(TimedRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(TimedRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(TimedRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(TimedRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(TimedRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(TimedRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentOperator);
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(700);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(702);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(704);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(706);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(708);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(710);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(712);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(714);
				((AssignmentOperatorContext)_localctx).GTGTEQ = match(GTGTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).GTGTEQ!=null?((AssignmentOperatorContext)_localctx).GTGTEQ.getText():null);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalOrExpressionContext e1;
		public ExpressionContext e2;
		public ConditionalExpressionContext e3;
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(720);
				match(QUES);
				setState(721);
				((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(722);
				match(COLON);
				setState(723);
				((ConditionalExpressionContext)_localctx).e3 = conditionalExpression();
				TernaryExpression e4 = new TernaryExpression();
							e4.setCondition(((ConditionalExpressionContext)_localctx).e1.e); e4.setLeft(((ConditionalExpressionContext)_localctx).e2.e); e4.setRight(((ConditionalExpressionContext)_localctx).e3.e);
							e4.setLineNumber(((ConditionalExpressionContext)_localctx).e1.e.getLineNumber());e4.setCharacter(((ConditionalExpressionContext)_localctx).e1.e.getCharacter()); ((ConditionalExpressionContext)_localctx).e =  e4;
							
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ConditionalAndExpressionContext e1;
		public Token BARBAR;
		public ConditionalAndExpressionContext e2;
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> BARBAR() { return getTokens(TimedRebecaCompleteParser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(TimedRebecaCompleteParser.BARBAR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(731);
					((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Expression e;
		public InclusiveOrExpressionContext e1;
		public Token AMPAMP;
		public InclusiveOrExpressionContext e2;
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(TimedRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(742);
					((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public ExclusiveOrExpressionContext e1;
		public Token BAR;
		public ExclusiveOrExpressionContext e2;
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(TimedRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(TimedRebecaCompleteParser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(752);
					((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(753);
					((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Expression e;
		public AndExpressionContext e1;
		public Token CARET;
		public AndExpressionContext e2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(TimedRebecaCompleteParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(TimedRebecaCompleteParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(763);
					((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(764);
					((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression e;
		public EqualityExpressionContext e1;
		public Token AMP;
		public EqualityExpressionContext e2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(TimedRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(TimedRebecaCompleteParser.AMP, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(774);
					((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(775);
					((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression e;
		public InstanceOfExpressionContext e1;
		public Token EQEQ;
		public Token BANGEQ;
		public InstanceOfExpressionContext e2;
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(TimedRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(TimedRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(790);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(786);
					((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(788);
					((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(792);
				((EqualityExpressionContext)_localctx).e2 = instanceOfExpression();
				((BinaryExpression)_localctx.e).setRight(((EqualityExpressionContext)_localctx).e2.e);
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

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public Expression e;
		public RelationalExpressionContext e1;
		public TypeContext t;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(TimedRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(799);
				match(INSTANCEOF);
				setState(800);
				((InstanceOfExpressionContext)_localctx).t = type();
				((InstanceOfExpressionContext)_localctx).e =  new InstanceofExpression(); 
				        					((InstanceofExpression)_localctx.e).setValue(((InstanceOfExpressionContext)_localctx).e1.e); 
				        					((InstanceofExpression)_localctx.e).setEvaluationType(((InstanceOfExpressionContext)_localctx).t.t);
				        					_localctx.e.setType(TypesUtilities.BOOLEAN_TYPE);
				        					_localctx.e.setLineNumber(((InstanceOfExpressionContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((InstanceOfExpressionContext)_localctx).t.t.getCharacter());
				        					
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression e;
		public ShiftExpressionContext e1;
		public RelationalOpContext ro;
		public ShiftExpressionContext e2;
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(808);
					((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(TimedRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(TimedRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(TimedRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relationalOp);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(817);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(820);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(824);
				((RelationalOpContext)_localctx).GT = match(GT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public Expression e;
		public AdditiveExpressionContext e1;
		public ShiftOpContext so;
		public AdditiveExpressionContext e2;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(831);
					((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(TimedRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(TimedRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(TimedRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(TimedRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_shiftOp);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(LT);
				setState(840);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(GT);
				setState(843);
				match(GT);
				((ShiftOpContext)_localctx).so =  ">>";
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression e;
		public MultiplicativeExpressionContext e1;
		public Token PLUS;
		public Token SUB;
		public MultiplicativeExpressionContext e2;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(TimedRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TimedRebecaCompleteParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(TimedRebecaCompleteParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(TimedRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(854);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(850);
						((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(852);
						((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(856);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext e1;
		public Token STAR;
		public Token SLASH;
		public Token PERCENT;
		public UnaryExpressionContext e2;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(TimedRebecaCompleteParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(TimedRebecaCompleteParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(TimedRebecaCompleteParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(TimedRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(TimedRebecaCompleteParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(TimedRebecaCompleteParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(873);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(867);
						((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(869);
						((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(871);
						((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(875);
					((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression e;
		public UnaryExpressionContext ep;
		public Token SUB;
		public UnaryExpressionContext es;
		public Token PLUSPLUS;
		public UnaryExpressionContext epp;
		public Token SUBSUB;
		public UnaryExpressionContext ess;
		public UnaryExpressionNotPlusMinusContext eu;
		public TerminalNode PLUS() { return getToken(TimedRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TimedRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unaryExpression);
		try {
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(PLUS);
				setState(884);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(888);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(892);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(895);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(896);
				((UnaryExpressionContext)_localctx).ess = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUBSUB!=null?((UnaryExpressionContext)_localctx).SUBSUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).ess.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).ess.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).ess.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case BANG:
			case TILDA:
			case QUES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(899);
				((UnaryExpressionContext)_localctx).eu = unaryExpressionNotPlusMinus();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).eu.e;
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public Expression e;
		public Token TILDA;
		public UnaryExpressionContext e1;
		public Token BANG;
		public CastExpressionContext ec;
		public ExpressionContext ep;
		public PrimaryContext p;
		public LiteralContext l;
		public Token QUES;
		public ExpressionListContext el;
		public TypeContext t;
		public Token DOT;
		public PrimaryContext p2;
		public Token PLUSPLUS;
		public Token SUBSUB;
		public TerminalNode TILDA() { return getToken(TimedRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(TimedRebecaCompleteParser.BANG, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(TimedRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TimedRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TimedRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(TimedRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(TimedRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(TimedRebecaCompleteParser.COLON, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TimedRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TimedRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(TimedRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(TimedRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(905);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(909);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).BANG!=null?((UnaryExpressionNotPlusMinusContext)_localctx).BANG.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case INTLITERAL:
			case FLOATLITERAL:
			case DOUBLELITERAL:
			case CHARLITERAL:
			case STRINGLITERAL:
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case QUES:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(912);
					((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;
				case 2:
					{
					setState(915);
					match(LPAREN);
					setState(916);
					((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(918);
					match(RPAREN);
					}
					break;
				case 3:
					{
					setState(920);
					((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;
				case 4:
					{
					setState(923);
					((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;
				case 5:
					{
					setState(926);
					((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(927);
					match(LPAREN);
					setState(928);
					((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(929);
					match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;
				case 6:
					{
					setState(932);
					match(NEW);
					setState(933);
					((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(935);
					match(LPAREN);
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
						{
						setState(936);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(941);
					match(RPAREN);
					setState(942);
					match(COLON);
					setState(943);
					match(LPAREN);
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (MONKEYS_AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
						{
						setState(944);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(949);
					match(RPAREN);
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(953);
						((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(954);
						((UnaryExpressionNotPlusMinusContext)_localctx).p2 = primary();

						        	DotPrimary de = new DotPrimary(); de.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getLine()); de.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).DOT.getCharPositionInLine());
						        	if (_localctx.e instanceof DotPrimary) {
						        		DotPrimary temp = (DotPrimary)_localctx.e;
						        		while(temp.getRight() instanceof DotPrimary)
						        			temp = (DotPrimary)temp.getRight();
						        		de.setLeft(temp.getRight());
						        		temp.setRight(de);
						        		de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
						        	} else {
						        		de.setLeft(_localctx.e); de.setRight(((UnaryExpressionNotPlusMinusContext)_localctx).p2.tp);
							        	((UnaryExpressionNotPlusMinusContext)_localctx).e =  de;
						        	}
						        	
						}
						} 
					}
					setState(961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(962);
					((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;
				case 2:
					{
					setState(964);
					((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB = match(SUBSUB);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("--");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).SUBSUB.getCharPositionInLine());
					}
					break;
				}
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

	public static class CastExpressionContext extends ParserRuleContext {
		public Expression e;
		public TypeContext t;
		public ExpressionContext e1;
		public TerminalNode LPAREN() { return getToken(TimedRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TimedRebecaCompleteParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(LPAREN);
			setState(971);
			((CastExpressionContext)_localctx).t = type();
			setState(972);
			match(RPAREN);
			setState(973);
			((CastExpressionContext)_localctx).e1 = expression();
			((CastExpressionContext)_localctx).e =  new CastExpression();
			    	((CastExpression)_localctx.e).setExpression(((CastExpressionContext)_localctx).e1.e); ((CastExpression)_localctx.e).setType(((CastExpressionContext)_localctx).t.t);
					_localctx.e.setLineNumber(((CastExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((CastExpressionContext)_localctx).e1.e.getCharacter());
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public AnnotationContext a;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimedRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimedRebecaCompleteParser.COMMA, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(977);
				((ExpressionListContext)_localctx).a = annotation();
				ans.add(((ExpressionListContext)_localctx).a.an);
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			((ExpressionListContext)_localctx).e = expression();
			((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(987);
				match(COMMA);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT) {
					{
					{
					setState(988);
					((ExpressionListContext)_localctx).a = annotation();
					ans.add(((ExpressionListContext)_localctx).a.an);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996);
				((ExpressionListContext)_localctx).e = expression();
				((ExpressionListContext)_localctx).e.e.getAnnotations().addAll(ans); ans.clear(); _localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(1003);
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

	public static class LiteralContext extends ParserRuleContext {
		public Literal l;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public Token DOUBLELITERAL;
		public Token CHARLITERAL;
		public Token STRINGLITERAL;
		public Token TRUE;
		public Token FALSE;
		public Token NULL;
		public TerminalNode INTLITERAL() { return getToken(TimedRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(TimedRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(TimedRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(TimedRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(TimedRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(TimedRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TimedRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(TimedRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimedRebecaCompleteListener ) ((TimedRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		try {
			setState(1020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1014);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1016);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1018);
				((LiteralContext)_localctx).NULL = match(NULL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("null");
				    	_localctx.l.setType(TypesUtilities.NULL_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).NULL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).NULL.getCharPositionInLine());
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u0401\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2}\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0085\n\2\5\2"+
		"\u0087\n\2\3\2\3\2\3\2\3\2\3\2\7\2\u008e\n\2\f\2\16\2\u0091\13\2\3\3\3"+
		"\3\3\3\3\3\5\3\u0097\n\3\3\3\3\3\3\3\7\3\u009c\n\3\f\3\16\3\u009f\13\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00ba\n\6\r\6\16\6\u00bb"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ca\n\b\f\b\16"+
		"\b\u00cd\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00da\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00ed\n\n\f\n\16\n\u00f0\13\n\3\13\3\13\3\13\3\13\7\13\u00f6"+
		"\n\13\f\13\16\13\u00f9\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0106\n\f\f\f\16\f\u0109\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0112\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u0124\n\17\f\17\16\17\u0127\13\17\5"+
		"\17\u0129\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0131\n\20\f\20\16\20"+
		"\u0134\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u013f\n"+
		"\20\f\20\16\20\u0142\13\20\5\20\u0144\n\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u0151\n\20\f\20\16\20\u0154\13\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u015d\n\21\f\21\16\21\u0160\13"+
		"\21\3\21\3\21\5\21\u0164\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u016c"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0174\n\21\f\21\16\21\u0177\13"+
		"\21\5\21\u0179\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0186\n\21\f\21\16\21\u0189\13\21\3\21\5\21\u018c\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0194\n\21\f\21\16\21\u0197\13\21\3\21"+
		"\5\21\u019a\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01a5"+
		"\n\21\f\21\16\21\u01a8\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u01b5\n\22\3\23\3\23\3\23\3\23\7\23\u01bb\n\23\f\23"+
		"\16\23\u01be\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u01c6\n\24\f\24"+
		"\16\24\u01c9\13\24\3\24\3\24\5\24\u01cd\n\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u01d6\n\25\f\25\16\25\u01d9\13\25\3\25\3\25\5\25\u01dd"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u01e8\n\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01f3\n\27\f\27\16\27\u01f6"+
		"\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0202\n"+
		"\31\f\31\16\31\u0205\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u021c"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u022c\n\32\3\32\3\32\3\32\3\32\5\32\u0232\n\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0238\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0249\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0259\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0261\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u026b\n\34\3\34\3\34\3\34\3\34\7\34\u0271\n\34\f\34\16\34\u0274"+
		"\13\34\7\34\u0276\n\34\f\34\16\34\u0279\13\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0286\n\36\3\36\5\36\u0289\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0290\n\37\3\37\3\37\3\37\5\37\u0295\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \7 \u029f\n \f \16 \u02a2\13 \3 \3 \3!\3!\3!\3"+
		"!\3!\6!\u02ab\n!\r!\16!\u02ac\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02b5\n\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u02cf\n#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u02d9\n$\3%\3%\3%\3%\3%\3%\7"+
		"%\u02e1\n%\f%\16%\u02e4\13%\3&\3&\3&\3&\3&\3&\7&\u02ec\n&\f&\16&\u02ef"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02f7\n\'\f\'\16\'\u02fa\13\'\3(\3(\3"+
		"(\3(\3(\3(\7(\u0302\n(\f(\16(\u0305\13(\3)\3)\3)\3)\3)\3)\7)\u030d\n)"+
		"\f)\16)\u0310\13)\3*\3*\3*\3*\3*\3*\3*\5*\u0319\n*\3*\3*\3*\5*\u031e\n"+
		"*\3+\3+\3+\3+\3+\3+\5+\u0326\n+\3,\3,\3,\3,\3,\3,\7,\u032e\n,\f,\16,\u0331"+
		"\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u033d\n-\3.\3.\3.\3.\3.\3.\7.\u0345"+
		"\n.\f.\16.\u0348\13.\3/\3/\3/\3/\3/\3/\5/\u0350\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0359\n\60\3\60\3\60\3\60\7\60\u035e\n\60\f\60\16"+
		"\60\u0361\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u036c"+
		"\n\61\3\61\3\61\3\61\7\61\u0371\n\61\f\61\16\61\u0374\13\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0389\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u03ae\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u03b6\n\63\3\63\3\63\5"+
		"\63\u03ba\n\63\3\63\3\63\3\63\3\63\7\63\u03c0\n\63\f\63\16\63\u03c3\13"+
		"\63\3\63\3\63\3\63\3\63\5\63\u03c9\n\63\5\63\u03cb\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u03d7\n\65\f\65\16\65\u03da\13"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u03e2\n\65\f\65\16\65\u03e5\13"+
		"\65\3\65\3\65\3\65\7\65\u03ea\n\65\f\65\16\65\u03ed\13\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5"+
		"\66\u03ff\n\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2\2\u044b\2l\3\2\2\2\4"+
		"\u0092\3\2\2\2\6\u00a3\3\2\2\2\b\u00a5\3\2\2\2\n\u00a7\3\2\2\2\f\u00c0"+
		"\3\2\2\2\16\u00c2\3\2\2\2\20\u00d1\3\2\2\2\22\u00e6\3\2\2\2\24\u00f1\3"+
		"\2\2\2\26\u00fe\3\2\2\2\30\u010a\3\2\2\2\32\u0119\3\2\2\2\34\u011b\3\2"+
		"\2\2\36\u012c\3\2\2\2 \u0158\3\2\2\2\"\u01ac\3\2\2\2$\u01b6\3\2\2\2&\u01c1"+
		"\3\2\2\2(\u01d1\3\2\2\2*\u01e2\3\2\2\2,\u01eb\3\2\2\2.\u01f7\3\2\2\2\60"+
		"\u01fb\3\2\2\2\62\u0258\3\2\2\2\64\u0260\3\2\2\2\66\u0262\3\2\2\28\u027a"+
		"\3\2\2\2:\u027d\3\2\2\2<\u028a\3\2\2\2>\u0296\3\2\2\2@\u02a5\3\2\2\2B"+
		"\u02ae\3\2\2\2D\u02ce\3\2\2\2F\u02d0\3\2\2\2H\u02da\3\2\2\2J\u02e5\3\2"+
		"\2\2L\u02f0\3\2\2\2N\u02fb\3\2\2\2P\u0306\3\2\2\2R\u0311\3\2\2\2T\u031f"+
		"\3\2\2\2V\u0327\3\2\2\2X\u033c\3\2\2\2Z\u033e\3\2\2\2\\\u034f\3\2\2\2"+
		"^\u0351\3\2\2\2`\u0362\3\2\2\2b\u0388\3\2\2\2d\u03ca\3\2\2\2f\u03cc\3"+
		"\2\2\2h\u03d2\3\2\2\2j\u03fe\3\2\2\2lm\7\\\2\2m\u0086\b\2\1\2no\7/\2\2"+
		"os\b\2\1\2pq\5h\65\2qr\b\2\1\2rt\3\2\2\2sp\3\2\2\2st\3\2\2\2tu\3\2\2\2"+
		"u|\7\60\2\2vw\7\3\2\2wx\7/\2\2xy\5B\"\2yz\7\60\2\2z{\b\2\1\2{}\3\2\2\2"+
		"|v\3\2\2\2|}\3\2\2\2}\u0084\3\2\2\2~\177\7\4\2\2\177\u0080\7/\2\2\u0080"+
		"\u0081\5B\"\2\u0081\u0082\7\60\2\2\u0082\u0083\b\2\1\2\u0083\u0085\3\2"+
		"\2\2\u0084~\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086n\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008f\3\2\2\2\u0088\u0089\7\63\2\2\u0089"+
		"\u008a\5B\"\2\u008a\u008b\7\64\2\2\u008b\u008c\b\2\1\2\u008c\u008e\3\2"+
		"\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\3\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\b\3\1\2"+
		"\u0093\u0094\5\6\4\2\u0094\u0095\b\3\1\2\u0095\u0097\3\2\2\2\u0096\u0093"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009d\3\2\2\2\u0098\u0099\5\b\5\2\u0099"+
		"\u009a\b\3\1\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\b\3\1\2\u00a2\5\3\2\2\2"+
		"\u00a3\u00a4\7\30\2\2\u00a4\7\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\t\3\2"+
		"\2\2\u00a7\u00ad\b\6\1\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\b\6\1\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\5\22\n\2\u00b1\u00b2\b\6\1\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4\5"+
		" \21\2\u00b4\u00b5\b\6\1\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"\u00b8\b\6\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\b\6\1\2\u00bf\13\3\2\2"+
		"\2\u00c0\u00c1\7\34\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\b\b\1\2\u00c3\u00c4"+
		"\7(\2\2\u00c4\u00c5\b\b\1\2\u00c5\u00cb\7\61\2\2\u00c6\u00c7\5\20\t\2"+
		"\u00c7\u00c8\b\b\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\62\2\2\u00cf\u00d0\b\b\1\2\u00d0\17\3\2\2"+
		"\2\u00d1\u00d2\b\t\1\2\u00d2\u00d3\5<\37\2\u00d3\u00d4\7\\\2\2\u00d4\u00d5"+
		"\b\t\1\2\u00d5\u00d9\7/\2\2\u00d6\u00d7\5h\65\2\u00d7\u00d8\b\t\1\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7<\2\2\u00dd\u00e1\7/\2\2\u00de"+
		"\u00df\5h\65\2\u00df\u00e0\b\t\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4"+
		"\u00e5\7\65\2\2\u00e5\21\3\2\2\2\u00e6\u00ee\b\n\1\2\u00e7\u00e8\7 \2"+
		"\2\u00e8\u00e9\5\24\13\2\u00e9\u00ea\b\n\1\2\u00ea\u00eb\7\65\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f7"+
		"\b\13\1\2\u00f2\u00f3\5:\36\2\u00f3\u00f4\b\13\1\2\u00f4\u00f6\3\2\2\2"+
		"\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5<\37\2\u00fb"+
		"\u00fc\5\26\f\2\u00fc\u00fd\b\13\1\2\u00fd\25\3\2\2\2\u00fe\u00ff\b\f"+
		"\1\2\u00ff\u0100\5\30\r\2\u0100\u0107\b\f\1\2\u0101\u0102\7\66\2\2\u0102"+
		"\u0103\5\30\r\2\u0103\u0104\b\f\1\2\u0104\u0106\3\2\2\2\u0105\u0101\3"+
		"\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\27\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b\r\1\2\u010b\u010c\7\\\2"+
		"\2\u010c\u0111\b\r\1\2\u010d\u010e\78\2\2\u010e\u010f\5\32\16\2\u010f"+
		"\u0110\b\r\1\2\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\31\3\2\2\2\u0113\u0114\5\34\17\2\u0114\u0115\b\16\1\2\u0115"+
		"\u011a\3\2\2\2\u0116\u0117\5B\"\2\u0117\u0118\b\16\1\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0113\3\2\2\2\u0119\u0116\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c"+
		"\b\17\1\2\u011c\u0128\7\61\2\2\u011d\u011e\5\32\16\2\u011e\u0125\b\17"+
		"\1\2\u011f\u0120\7\66\2\2\u0120\u0121\5\32\16\2\u0121\u0122\b\17\1\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u011d\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\62"+
		"\2\2\u012b\35\3\2\2\2\u012c\u0132\b\20\1\2\u012d\u012e\5:\36\2\u012e\u012f"+
		"\b\20\1\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\7#\2\2\u0136\u0137\7\\\2\2\u0137\u0143\b\20\1\2\u0138"+
		"\u0139\7%\2\2\u0139\u013a\7\\\2\2\u013a\u0140\b\20\1\2\u013b\u013c\7\66"+
		"\2\2\u013c\u013d\7\\\2\2\u013d\u013f\b\20\1\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0138\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0152\7\61\2\2\u0146\u0147\b\20\1\2\u0147\u0148\7"+
		"\'\2\2\u0148\u0149\b\20\1\2\u0149\u014a\3\2\2\2\u014a\u014b\7\\\2\2\u014b"+
		"\u014c\b\20\1\2\u014c\u014d\5*\26\2\u014d\u014e\b\20\1\2\u014e\u014f\7"+
		"\65\2\2\u014f\u0151\3\2\2\2\u0150\u0146\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0156\7\62\2\2\u0156\u0157\b\20\1\2\u0157\37\3\2\2\2\u0158"+
		"\u015e\b\21\1\2\u0159\u015a\5:\36\2\u015a\u015b\b\21\1\2\u015b\u015d\3"+
		"\2\2\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7$"+
		"\2\2\u0162\u0164\b\21\1\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7\\\2\2\u0167\u016b\b\21"+
		"\1\2\u0168\u0169\7%\2\2\u0169\u016a\7\\\2\2\u016a\u016c\b\21\1\2\u016b"+
		"\u0168\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0178\3\2\2\2\u016d\u016e\7&"+
		"\2\2\u016e\u016f\7\\\2\2\u016f\u0175\b\21\1\2\u0170\u0171\7\66\2\2\u0171"+
		"\u0172\7\\\2\2\u0172\u0174\b\21\1\2\u0173\u0170\3\2\2\2\u0174\u0177\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u016d\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017b\7/\2\2\u017b\u017c\7\5\2\2\u017c\u017d\b\21\1\2\u017d"+
		"\u017e\7\60\2\2\u017e\u018b\7\61\2\2\u017f\u0180\7*\2\2\u0180\u0187\7"+
		"\61\2\2\u0181\u0182\5\24\13\2\u0182\u0183\b\21\1\2\u0183\u0184\7\65\2"+
		"\2\u0184\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018c\7\62\2\2\u018b\u017f\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0199\3"+
		"\2\2\2\u018d\u018e\7)\2\2\u018e\u0195\7\61\2\2\u018f\u0190\5\24\13\2\u0190"+
		"\u0191\b\21\1\2\u0191\u0192\7\65\2\2\u0192\u0194\3\2\2\2\u0193\u018f\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7\62\2\2\u0199\u018d\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a6\3\2\2\2\u019b\u019c\5$\23\2\u019c"+
		"\u019d\b\21\1\2\u019d\u01a5\3\2\2\2\u019e\u019f\5&\24\2\u019f\u01a0\b"+
		"\21\1\2\u01a0\u01a5\3\2\2\2\u01a1\u01a2\5(\25\2\u01a2\u01a3\b\21\1\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u019b\3\2\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a1\3\2"+
		"\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\62\2\2\u01aa\u01ab\b"+
		"\21\1\2\u01ab!\3\2\2\2\u01ac\u01ad\7\\\2\2\u01ad\u01ae\b\22\1\2\u01ae"+
		"\u01af\5*\26\2\u01af\u01b4\b\22\1\2\u01b0\u01b1\5\60\31\2\u01b1\u01b2"+
		"\b\22\1\2\u01b2\u01b5\3\2\2\2\u01b3\u01b5\7\65\2\2\u01b4\u01b0\3\2\2\2"+
		"\u01b4\u01b3\3\2\2\2\u01b5#\3\2\2\2\u01b6\u01bc\b\23\1\2\u01b7\u01b8\5"+
		":\36\2\u01b8\u01b9\b\23\1\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5\"\22\2\u01c0%\3\2\2\2\u01c1\u01c7"+
		"\b\24\1\2\u01c2\u01c3\5:\36\2\u01c3\u01c4\b\24\1\2\u01c4\u01c6\3\2\2\2"+
		"\u01c5\u01c2\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7$\2\2\u01cb"+
		"\u01cd\b\24\1\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3"+
		"\2\2\2\u01ce\u01cf\7\'\2\2\u01cf\u01d0\5\"\22\2\u01d0\'\3\2\2\2\u01d1"+
		"\u01d7\b\25\1\2\u01d2\u01d3\5:\36\2\u01d3\u01d4\b\25\1\2\u01d4\u01d6\3"+
		"\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7$"+
		"\2\2\u01db\u01dd\b\25\1\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\5<\37\2\u01df\u01e0\b\25\1\2\u01e0\u01e1\5"+
		"\"\22\2\u01e1)\3\2\2\2\u01e2\u01e3\b\26\1\2\u01e3\u01e7\7/\2\2\u01e4\u01e5"+
		"\5,\27\2\u01e5\u01e6\b\26\1\2\u01e6\u01e8\3\2\2\2\u01e7\u01e4\3\2\2\2"+
		"\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea+\3"+
		"\2\2\2\u01eb\u01ec\b\27\1\2\u01ec\u01ed\5.\30\2\u01ed\u01f4\b\27\1\2\u01ee"+
		"\u01ef\7\66\2\2\u01ef\u01f0\5.\30\2\u01f0\u01f1\b\27\1\2\u01f1\u01f3\3"+
		"\2\2\2\u01f2\u01ee\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5-\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\5<\37\2"+
		"\u01f8\u01f9\7\\\2\2\u01f9\u01fa\b\30\1\2\u01fa/\3\2\2\2\u01fb\u01fc\b"+
		"\31\1\2\u01fc\u01fd\7\61\2\2\u01fd\u0203\b\31\1\2\u01fe\u01ff\5\62\32"+
		"\2\u01ff\u0200\b\31\1\2\u0200\u0202\3\2\2\2\u0201\u01fe\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\62\2\2\u0207\u0208\b\31\1\2\u0208"+
		"\61\3\2\2\2\u0209\u020a\5\24\13\2\u020a\u020b\b\32\1\2\u020b\u020c\7\65"+
		"\2\2\u020c\u0259\3\2\2\2\u020d\u020e\5\60\31\2\u020e\u020f\b\32\1\2\u020f"+
		"\u0259\3\2\2\2\u0210\u0211\7\25\2\2\u0211\u0212\b\32\1\2\u0212\u0213\7"+
		"/\2\2\u0213\u0214\5B\"\2\u0214\u0215\7\60\2\2\u0215\u0216\5\62\32\2\u0216"+
		"\u021b\b\32\1\2\u0217\u0218\7\22\2\2\u0218\u0219\5\62\32\2\u0219\u021a"+
		"\b\32\1\2\u021a\u021c\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u021c\3\2\2\2"+
		"\u021c\u0259\3\2\2\2\u021d\u021e\7\37\2\2\u021e\u021f\b\32\1\2\u021f\u0220"+
		"\7/\2\2\u0220\u0221\5B\"\2\u0221\u0222\7\60\2\2\u0222\u0223\5\62\32\2"+
		"\u0223\u0224\b\32\1\2\u0224\u0259\3\2\2\2\u0225\u0226\7\23\2\2\u0226\u0227"+
		"\b\32\1\2\u0227\u022b\7/\2\2\u0228\u0229\5\64\33\2\u0229\u022a\b\32\1"+
		"\2\u022a\u022c\3\2\2\2\u022b\u0228\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u0231\7\65\2\2\u022e\u022f\5B\"\2\u022f\u0230\b\32\1\2"+
		"\u0230\u0232\3\2\2\2\u0231\u022e\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0237\7\65\2\2\u0234\u0235\5h\65\2\u0235\u0236\b\32\1\2"+
		"\u0236\u0238\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\7\60\2\2\u023a\u023b\5\62\32\2\u023b\u023c\b\32\1"+
		"\2\u023c\u0259\3\2\2\2\u023d\u023e\7\36\2\2\u023e\u023f\7/\2\2\u023f\u0240"+
		"\5B\"\2\u0240\u0241\7\60\2\2\u0241\u0242\7\61\2\2\u0242\u0243\5\66\34"+
		"\2\u0243\u0244\7\62\2\2\u0244\u0245\b\32\1\2\u0245\u0259\3\2\2\2\u0246"+
		"\u0248\7\35\2\2\u0247\u0249\5B\"\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7\65\2\2\u024b\u0259\b\32\1\2\u024c"+
		"\u024d\7\r\2\2\u024d\u024e\7\65\2\2\u024e\u0259\b\32\1\2\u024f\u0250\7"+
		"\20\2\2\u0250\u0251\7\65\2\2\u0251\u0259\b\32\1\2\u0252\u0253\7\65\2\2"+
		"\u0253\u0259\b\32\1\2\u0254\u0255\58\35\2\u0255\u0256\b\32\1\2\u0256\u0257"+
		"\7\65\2\2\u0257\u0259\3\2\2\2\u0258\u0209\3\2\2\2\u0258\u020d\3\2\2\2"+
		"\u0258\u0210\3\2\2\2\u0258\u021d\3\2\2\2\u0258\u0225\3\2\2\2\u0258\u023d"+
		"\3\2\2\2\u0258\u0246\3\2\2\2\u0258\u024c\3\2\2\2\u0258\u024f\3\2\2\2\u0258"+
		"\u0252\3\2\2\2\u0258\u0254\3\2\2\2\u0259\63\3\2\2\2\u025a\u025b\5\24\13"+
		"\2\u025b\u025c\b\33\1\2\u025c\u0261\3\2\2\2\u025d\u025e\5h\65\2\u025e"+
		"\u025f\b\33\1\2\u025f\u0261\3\2\2\2\u0260\u025a\3\2\2\2\u0260\u025d\3"+
		"\2\2\2\u0261\65\3\2\2\2\u0262\u0277\b\34\1\2\u0263\u026a\b\34\1\2\u0264"+
		"\u0265\7\16\2\2\u0265\u0266\5B\"\2\u0266\u0267\b\34\1\2\u0267\u026b\3"+
		"\2\2\2\u0268\u0269\7\21\2\2\u0269\u026b\b\34\1\2\u026a\u0264\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0272\7<\2\2\u026d\u026e\5\62"+
		"\32\2\u026e\u026f\b\34\1\2\u026f\u0271\3\2\2\2\u0270\u026d\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0263\3\2\2\2\u0276\u0279\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\67\3\2\2\2\u0279\u0277\3\2\2"+
		"\2\u027a\u027b\5B\"\2\u027b\u027c\b\35\1\2\u027c9\3\2\2\2\u027d\u027e"+
		"\b\36\1\2\u027e\u027f\7T\2\2\u027f\u0280\7\\\2\2\u0280\u0288\b\36\1\2"+
		"\u0281\u0285\7/\2\2\u0282\u0283\5B\"\2\u0283\u0284\b\36\1\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0289\7\60\2\2\u0288\u0281\3\2\2\2\u0288\u0289\3\2\2\2\u0289;\3\2\2\2"+
		"\u028a\u028b\7\\\2\2\u028b\u028f\b\37\1\2\u028c\u028d\5> \2\u028d\u028e"+
		"\b\37\1\2\u028e\u0290\3\2\2\2\u028f\u028c\3\2\2\2\u028f\u0290\3\2\2\2"+
		"\u0290\u0294\3\2\2\2\u0291\u0292\5@!\2\u0292\u0293\b\37\1\2\u0293\u0295"+
		"\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295=\3\2\2\2\u0296"+
		"\u0297\7W\2\2\u0297\u0298\b \1\2\u0298\u0299\5<\37\2\u0299\u02a0\b \1"+
		"\2\u029a\u029b\7\66\2\2\u029b\u029c\5<\37\2\u029c\u029d\b \1\2\u029d\u029f"+
		"\3\2\2\2\u029e\u029a\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\7V"+
		"\2\2\u02a4?\3\2\2\2\u02a5\u02aa\b!\1\2\u02a6\u02a7\7\63\2\2\u02a7\u02a8"+
		"\7\5\2\2\u02a8\u02a9\7\64\2\2\u02a9\u02ab\b!\1\2\u02aa\u02a6\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02adA\3\2\2\2"+
		"\u02ae\u02af\5F$\2\u02af\u02b4\b\"\1\2\u02b0\u02b1\5D#\2\u02b1\u02b2\5"+
		"B\"\2\u02b2\u02b3\b\"\1\2\u02b3\u02b5\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5C\3\2\2\2\u02b6\u02b7\78\2\2\u02b7\u02cf\b#\1\2\u02b8"+
		"\u02b9\7K\2\2\u02b9\u02cf\b#\1\2\u02ba\u02bb\7L\2\2\u02bb\u02cf\b#\1\2"+
		"\u02bc\u02bd\7M\2\2\u02bd\u02cf\b#\1\2\u02be\u02bf\7N\2\2\u02bf\u02cf"+
		"\b#\1\2\u02c0\u02c1\7O\2\2\u02c1\u02cf\b#\1\2\u02c2\u02c3\7P\2\2\u02c3"+
		"\u02cf\b#\1\2\u02c4\u02c5\7Q\2\2\u02c5\u02cf\b#\1\2\u02c6\u02c7\7R\2\2"+
		"\u02c7\u02cf\b#\1\2\u02c8\u02c9\7S\2\2\u02c9\u02cf\b#\1\2\u02ca\u02cb"+
		"\7Y\2\2\u02cb\u02cf\b#\1\2\u02cc\u02cd\7[\2\2\u02cd\u02cf\b#\1\2\u02ce"+
		"\u02b6\3\2\2\2\u02ce\u02b8\3\2\2\2\u02ce\u02ba\3\2\2\2\u02ce\u02bc\3\2"+
		"\2\2\u02ce\u02be\3\2\2\2\u02ce\u02c0\3\2\2\2\u02ce\u02c2\3\2\2\2\u02ce"+
		"\u02c4\3\2\2\2\u02ce\u02c6\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce\u02ca\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cfE\3\2\2\2\u02d0\u02d1\5H%\2\u02d1\u02d8"+
		"\b$\1\2\u02d2\u02d3\7;\2\2\u02d3\u02d4\5B\"\2\u02d4\u02d5\7<\2\2\u02d5"+
		"\u02d6\5F$\2\u02d6\u02d7\b$\1\2\u02d7\u02d9\3\2\2\2\u02d8\u02d2\3\2\2"+
		"\2\u02d8\u02d9\3\2\2\2\u02d9G\3\2\2\2\u02da\u02db\5J&\2\u02db\u02e2\b"+
		"%\1\2\u02dc\u02dd\7?\2\2\u02dd\u02de\5J&\2\u02de\u02df\b%\1\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3I\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\5L\'\2\u02e6"+
		"\u02ed\b&\1\2\u02e7\u02e8\7>\2\2\u02e8\u02e9\5L\'\2\u02e9\u02ea\b&\1\2"+
		"\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02eeK\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0"+
		"\u02f1\5N(\2\u02f1\u02f8\b\'\1\2\u02f2\u02f3\7H\2\2\u02f3\u02f4\5N(\2"+
		"\u02f4\u02f5\b\'\1\2\u02f5\u02f7\3\2\2\2\u02f6\u02f2\3\2\2\2\u02f7\u02fa"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9M\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fb\u02fc\5P)\2\u02fc\u0303\b(\1\2\u02fd\u02fe\7I\2\2"+
		"\u02fe\u02ff\5P)\2\u02ff\u0300\b(\1\2\u0300\u0302\3\2\2\2\u0301\u02fd"+
		"\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"O\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\5R*\2\u0307\u030e\b)\1\2\u0308"+
		"\u0309\7G\2\2\u0309\u030a\5R*\2\u030a\u030b\b)\1\2\u030b\u030d\3\2\2\2"+
		"\u030c\u0308\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030fQ\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\5T+\2\u0312\u031d"+
		"\b*\1\2\u0313\u0318\b*\1\2\u0314\u0315\7=\2\2\u0315\u0319\b*\1\2\u0316"+
		"\u0317\7U\2\2\u0317\u0319\b*\1\2\u0318\u0314\3\2\2\2\u0318\u0316\3\2\2"+
		"\2\u0319\u031a\3\2\2\2\u031a\u031b\5T+\2\u031b\u031c\b*\1\2\u031c\u031e"+
		"\3\2\2\2\u031d\u0313\3\2\2\2\u031d\u031e\3\2\2\2\u031eS\3\2\2\2\u031f"+
		"\u0320\5V,\2\u0320\u0325\b+\1\2\u0321\u0322\7!\2\2\u0322\u0323\5<\37\2"+
		"\u0323\u0324\b+\1\2\u0324\u0326\3\2\2\2\u0325\u0321\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326U\3\2\2\2\u0327\u0328\5Z.\2\u0328\u032f\b,\1\2\u0329\u032a"+
		"\5X-\2\u032a\u032b\5Z.\2\u032b\u032c\b,\1\2\u032c\u032e\3\2\2\2\u032d"+
		"\u0329\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330W\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\7W\2\2\u0333\u0334"+
		"\78\2\2\u0334\u033d\b-\1\2\u0335\u0336\7V\2\2\u0336\u0337\78\2\2\u0337"+
		"\u033d\b-\1\2\u0338\u0339\7W\2\2\u0339\u033d\b-\1\2\u033a\u033b\7V\2\2"+
		"\u033b\u033d\b-\1\2\u033c\u0332\3\2\2\2\u033c\u0335\3\2\2\2\u033c\u0338"+
		"\3\2\2\2\u033c\u033a\3\2\2\2\u033dY\3\2\2\2\u033e\u033f\5^\60\2\u033f"+
		"\u0346\b.\1\2\u0340\u0341\5\\/\2\u0341\u0342\5^\60\2\u0342\u0343\b.\1"+
		"\2\u0343\u0345\3\2\2\2\u0344\u0340\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347[\3\2\2\2\u0348\u0346\3\2\2\2\u0349"+
		"\u034a\7W\2\2\u034a\u034b\7W\2\2\u034b\u0350\b/\1\2\u034c\u034d\7V\2\2"+
		"\u034d\u034e\7V\2\2\u034e\u0350\b/\1\2\u034f\u0349\3\2\2\2\u034f\u034c"+
		"\3\2\2\2\u0350]\3\2\2\2\u0351\u0352\5`\61\2\u0352\u035f\b\60\1\2\u0353"+
		"\u0358\b\60\1\2\u0354\u0355\7C\2\2\u0355\u0359\b\60\1\2\u0356\u0357\7"+
		"D\2\2\u0357\u0359\b\60\1\2\u0358\u0354\3\2\2\2\u0358\u0356\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\5`\61\2\u035b\u035c\b\60\1\2\u035c\u035e\3"+
		"\2\2\2\u035d\u0353\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360_\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363\5b\62\2"+
		"\u0363\u0372\b\61\1\2\u0364\u036b\b\61\1\2\u0365\u0366\7E\2\2\u0366\u036c"+
		"\b\61\1\2\u0367\u0368\7F\2\2\u0368\u036c\b\61\1\2\u0369\u036a\7J\2\2\u036a"+
		"\u036c\b\61\1\2\u036b\u0365\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0369\3"+
		"\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\5b\62\2\u036e\u036f\b\61\1\2\u036f"+
		"\u0371\3\2\2\2\u0370\u0364\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373a\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0376"+
		"\7C\2\2\u0376\u0377\5b\62\2\u0377\u0378\b\62\1\2\u0378\u0389\3\2\2\2\u0379"+
		"\u037a\7D\2\2\u037a\u037b\5b\62\2\u037b\u037c\b\62\1\2\u037c\u0389\3\2"+
		"\2\2\u037d\u037e\7@\2\2\u037e\u037f\5b\62\2\u037f\u0380\b\62\1\2\u0380"+
		"\u0389\3\2\2\2\u0381\u0382\7A\2\2\u0382\u0383\5b\62\2\u0383\u0384\b\62"+
		"\1\2\u0384\u0389\3\2\2\2\u0385\u0386\5d\63\2\u0386\u0387\b\62\1\2\u0387"+
		"\u0389\3\2\2\2\u0388\u0375\3\2\2\2\u0388\u0379\3\2\2\2\u0388\u037d\3\2"+
		"\2\2\u0388\u0381\3\2\2\2\u0388\u0385\3\2\2\2\u0389c\3\2\2\2\u038a\u038b"+
		"\7:\2\2\u038b\u038c\5b\62\2\u038c\u038d\b\63\1\2\u038d\u03cb\3\2\2\2\u038e"+
		"\u038f\79\2\2\u038f\u0390\5b\62\2\u0390\u0391\b\63\1\2\u0391\u03cb\3\2"+
		"\2\2\u0392\u0393\5f\64\2\u0393\u0394\b\63\1\2\u0394\u03ba\3\2\2\2\u0395"+
		"\u0396\7/\2\2\u0396\u0397\5B\"\2\u0397\u0398\b\63\1\2\u0398\u0399\7\60"+
		"\2\2\u0399\u03ba\3\2\2\2\u039a\u039b\5\2\2\2\u039b\u039c\b\63\1\2\u039c"+
		"\u03ba\3\2\2\2\u039d\u039e\5j\66\2\u039e\u039f\b\63\1\2\u039f\u03ba\3"+
		"\2\2\2\u03a0\u03a1\7;\2\2\u03a1\u03a2\7/\2\2\u03a2\u03a3\5h\65\2\u03a3"+
		"\u03a4\7\60\2\2\u03a4\u03a5\b\63\1\2\u03a5\u03ba\3\2\2\2\u03a6\u03a7\7"+
		"\27\2\2\u03a7\u03a8\5<\37\2\u03a8\u03a9\b\63\1\2\u03a9\u03ad\7/\2\2\u03aa"+
		"\u03ab\5h\65\2\u03ab\u03ac\b\63\1\2\u03ac\u03ae\3\2\2\2\u03ad\u03aa\3"+
		"\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7\60\2\2\u03b0"+
		"\u03b1\7<\2\2\u03b1\u03b5\7/\2\2\u03b2\u03b3\5h\65\2\u03b3\u03b4\b\63"+
		"\1\2\u03b4\u03b6\3\2\2\2\u03b5\u03b2\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03b8\7\60\2\2\u03b8\u03ba\3\2\2\2\u03b9\u0392\3"+
		"\2\2\2\u03b9\u0395\3\2\2\2\u03b9\u039a\3\2\2\2\u03b9\u039d\3\2\2\2\u03b9"+
		"\u03a0\3\2\2\2\u03b9\u03a6\3\2\2\2\u03ba\u03c1\3\2\2\2\u03bb\u03bc\7\67"+
		"\2\2\u03bc\u03bd\5\2\2\2\u03bd\u03be\b\63\1\2\u03be\u03c0\3\2\2\2\u03bf"+
		"\u03bb\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c8\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c5\7@\2\2\u03c5"+
		"\u03c9\b\63\1\2\u03c6\u03c7\7A\2\2\u03c7\u03c9\b\63\1\2\u03c8\u03c4\3"+
		"\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca"+
		"\u038a\3\2\2\2\u03ca\u038e\3\2\2\2\u03ca\u03b9\3\2\2\2\u03cbe\3\2\2\2"+
		"\u03cc\u03cd\7/\2\2\u03cd\u03ce\5<\37\2\u03ce\u03cf\7\60\2\2\u03cf\u03d0"+
		"\5B\"\2\u03d0\u03d1\b\64\1\2\u03d1g\3\2\2\2\u03d2\u03d8\b\65\1\2\u03d3"+
		"\u03d4\5:\36\2\u03d4\u03d5\b\65\1\2\u03d5\u03d7\3\2\2\2\u03d6\u03d3\3"+
		"\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03db\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\5B\"\2\u03dc\u03eb\b\65"+
		"\1\2\u03dd\u03e3\7\66\2\2\u03de\u03df\5:\36\2\u03df\u03e0\b\65\1\2\u03e0"+
		"\u03e2\3\2\2\2\u03e1\u03de\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2"+
		"\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6"+
		"\u03e7\5B\"\2\u03e7\u03e8\b\65\1\2\u03e8\u03ea\3\2\2\2\u03e9\u03dd\3\2"+
		"\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"i\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\7\5\2\2\u03ef\u03ff\b\66\1\2"+
		"\u03f0\u03f1\7\6\2\2\u03f1\u03ff\b\66\1\2\u03f2\u03f3\7\7\2\2\u03f3\u03ff"+
		"\b\66\1\2\u03f4\u03f5\7\b\2\2\u03f5\u03ff\b\66\1\2\u03f6\u03f7\7\t\2\2"+
		"\u03f7\u03ff\b\66\1\2\u03f8\u03f9\7,\2\2\u03f9\u03ff\b\66\1\2\u03fa\u03fb"+
		"\7-\2\2\u03fb\u03ff\b\66\1\2\u03fc\u03fd\7.\2\2\u03fd\u03ff\b\66\1\2\u03fe"+
		"\u03ee\3\2\2\2\u03fe\u03f0\3\2\2\2\u03fe\u03f2\3\2\2\2\u03fe\u03f4\3\2"+
		"\2\2\u03fe\u03f6\3\2\2\2\u03fe\u03f8\3\2\2\2\u03fe\u03fa\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03ffk\3\2\2\2\\s|\u0084\u0086\u008f\u0096\u009d\u00ad"+
		"\u00b9\u00bb\u00cb\u00d9\u00e1\u00ee\u00f7\u0107\u0111\u0119\u0125\u0128"+
		"\u0132\u0140\u0143\u0152\u015e\u0163\u016b\u0175\u0178\u0187\u018b\u0195"+
		"\u0199\u01a4\u01a6\u01b4\u01bc\u01c7\u01cc\u01d7\u01dc\u01e7\u01f4\u0203"+
		"\u021b\u022b\u0231\u0237\u0248\u0258\u0260\u026a\u0272\u0277\u0285\u0288"+
		"\u028f\u0294\u02a0\u02ac\u02b4\u02ce\u02d8\u02e2\u02ed\u02f8\u0303\u030e"+
		"\u0318\u031d\u0325\u032f\u033c\u0346\u034f\u0358\u035f\u036b\u0372\u0388"+
		"\u03ad\u03b5\u03b9\u03c1\u03c8\u03ca\u03d8\u03e3\u03eb\u03fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}