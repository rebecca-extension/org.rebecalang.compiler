// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
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
public class CoreRebecaCompleteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLITERAL=1, FLOATLITERAL=2, DOUBLELITERAL=3, CHARLITERAL=4, STRINGLITERAL=5, 
		WS=6, COMMENT=7, LINE_COMMENT=8, BREAK=9, CASE=10, CLASS=11, CONTINUE=12, 
		DEFAULT=13, ELSE=14, FOR=15, GOTO=16, IF=17, IMPORT=18, NEW=19, PACKAGE=20, 
		PRIVATE=21, PROTECTED=22, PUBLIC=23, RECORD=24, RETURN=25, SWITCH=26, 
		WHILE=27, ENV=28, INSTANCEOF=29, REACTIVECLASS=30, INTERFACE=31, ABSTRACT=32, 
		EXTENDS=33, IMPLEMENTS=34, MSGSRV=35, MAIN=36, STATEVARS=37, KNOWNREBECS=38, 
		THIS=39, TRUE=40, FALSE=41, NULL=42, LPAREN=43, RPAREN=44, LBRACE=45, 
		RBRACE=46, LBRACKET=47, RBRACKET=48, SEMI=49, COMMA=50, DOT=51, EQ=52, 
		BANG=53, TILDA=54, QUES=55, COLON=56, EQEQ=57, AMPAMP=58, BARBAR=59, PLUSPLUS=60, 
		SUBSUB=61, SUPER=62, PLUS=63, SUB=64, STAR=65, SLASH=66, AMP=67, BAR=68, 
		CARET=69, PERCENT=70, PLUSEQ=71, SUBEQ=72, STAREQ=73, SLASHEQ=74, AMPEQ=75, 
		BAREQ=76, CARETEQ=77, TILDAEQ=78, PERCENTEQ=79, MONKEYS_AT=80, BANGEQ=81, 
		GT=82, LT=83, LTLT=84, LTLTEQ=85, GTGT=86, GTGTEQ=87, IDENTIFIER=88;
	public static final int
		RULE_rebecaModel = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_rebecaCode = 3, RULE_recordDeclaration = 4, RULE_mainDeclaration = 5, 
		RULE_mainRebecDefinition = 6, RULE_environmentVariables = 7, RULE_fieldDeclaration = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_variableInitializer = 11, 
		RULE_arrayInitializer = 12, RULE_interfaceDeclaration = 13, RULE_reactiveClassDeclaration = 14, 
		RULE_methodDeclaration = 15, RULE_constructorDeclaration = 16, RULE_msgsrvDeclaration = 17, 
		RULE_synchMethodDeclaration = 18, RULE_formalParameters = 19, RULE_formalParametersDeclaration = 20, 
		RULE_formalParameterDeclaration = 21, RULE_block = 22, RULE_statement = 23, 
		RULE_forInit = 24, RULE_switchBlock = 25, RULE_statementExpression = 26, 
		RULE_annotation = 27, RULE_type = 28, RULE_genericTypeParams = 29, RULE_dimensions = 30, 
		RULE_expression = 31, RULE_assignmentOperator = 32, RULE_conditionalExpression = 33, 
		RULE_conditionalOrExpression = 34, RULE_conditionalAndExpression = 35, 
		RULE_inclusiveOrExpression = 36, RULE_exclusiveOrExpression = 37, RULE_andExpression = 38, 
		RULE_equalityExpression = 39, RULE_instanceOfExpression = 40, RULE_relationalExpression = 41, 
		RULE_relationalOp = 42, RULE_shiftExpression = 43, RULE_shiftOp = 44, 
		RULE_additiveExpression = 45, RULE_multiplicativeExpression = 46, RULE_unaryExpression = 47, 
		RULE_unaryExpressionNotPlusMinus = 48, RULE_castExpression = 49, RULE_primary = 50, 
		RULE_expressionList = 51, RULE_literal = 52;
	public static final String[] ruleNames = {
		"rebecaModel", "packageDeclaration", "importDeclaration", "rebecaCode", 
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
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
		"expressionList", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'break'", "'case'", 
		"'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", "'if'", 
		"'import'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'record'", "'return'", "'switch'", "'while'", "'env'", "'instanceof'", 
		"'reactiveclass'", "'interface'", "'abstract'", "'extends'", "'implements'", 
		"'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", "'this'", "'true'", 
		"'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", "'&&'", "'||'", 
		"'++'", "'--'", "'super'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'~='", 
		"'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", "'>>'", "'>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", 
		"WS", "COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", "CONTINUE", 
		"DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", "PACKAGE", "PRIVATE", 
		"PROTECTED", "PUBLIC", "RECORD", "RETURN", "SWITCH", "WHILE", "ENV", "INSTANCEOF", 
		"REACTIVECLASS", "INTERFACE", "ABSTRACT", "EXTENDS", "IMPLEMENTS", "MSGSRV", 
		"MAIN", "STATEVARS", "KNOWNREBECS", "THIS", "TRUE", "FALSE", "NULL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", 
		"DOT", "EQ", "BANG", "TILDA", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", 
		"PLUSPLUS", "SUBSUB", "SUPER", "PLUS", "SUB", "STAR", "SLASH", "AMP", 
		"BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", 
		"BAREQ", "CARETEQ", "TILDAEQ", "PERCENTEQ", "MONKEYS_AT", "BANGEQ", "GT", 
		"LT", "LTLT", "LTLTEQ", "GTGT", "GTGTEQ", "IDENTIFIER"
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
	public String getGrammarFileName() { return "CoreRebecaComplete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoreRebecaCompleteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRebecaModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRebecaModel(this);
		}
	}

	public final RebecaModelContext rebecaModel() throws RecognitionException {
		RebecaModelContext _localctx = new RebecaModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rebecaModel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaModelContext)_localctx).r =  new RebecaModel();
			        
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(107);
				((RebecaModelContext)_localctx).p = packageDeclaration();
				_localctx.r.setPackageDeclaration(((RebecaModelContext)_localctx).p.p);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(112);
				((RebecaModelContext)_localctx).i = importDeclaration();
				_localctx.r.getImportDeclaration().add(((RebecaModelContext)_localctx).i.i);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(120);
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
		public TerminalNode PACKAGE() { return getToken(CoreRebecaCompleteParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		public TerminalNode IMPORT() { return getToken(CoreRebecaCompleteParser.IMPORT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRebecaCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRebecaCode(this);
		}
	}

	public final RebecaCodeContext rebecaCode() throws RecognitionException {
		RebecaCodeContext _localctx = new RebecaCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rebecaCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RebecaCodeContext)_localctx).rc =  new RebecaCode();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECORD) {
				{
				{
				setState(128);
				((RebecaCodeContext)_localctx).rd = recordDeclaration();
				_localctx.rc.getRecordDeclaration().add(((RebecaCodeContext)_localctx).rd.rd);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(136);
			((RebecaCodeContext)_localctx).e = environmentVariables();
			_localctx.rc.getEnvironmentVariables().addAll(((RebecaCodeContext)_localctx).e.fds);
			}
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(139);
					((RebecaCodeContext)_localctx).rcd = reactiveClassDeclaration();
					_localctx.rc.getReactiveClassDeclaration().add(((RebecaCodeContext)_localctx).rcd.rcd);
					}
					break;
				case 2:
					{
					setState(142);
					((RebecaCodeContext)_localctx).intd = interfaceDeclaration();
					_localctx.rc.getInterfaceDeclaration().add(((RebecaCodeContext)_localctx).intd.intd);
					}
					break;
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (REACTIVECLASS - 30)) | (1L << (INTERFACE - 30)) | (1L << (ABSTRACT - 30)) | (1L << (MONKEYS_AT - 30)))) != 0) );
			setState(149);
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
		public TerminalNode RECORD() { return getToken(CoreRebecaCompleteParser.RECORD, 0); }
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRecordDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRecordDeclaration(this);
		}
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recordDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		public TerminalNode MAIN() { return getToken(CoreRebecaCompleteParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMainDeclaration(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).md =  new MainDeclaration();
			setState(155);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			_localctx.md.setLineNumber(((MainDeclarationContext)_localctx).MAIN.getLine());_localctx.md.setCharacter(((MainDeclarationContext)_localctx).MAIN.getCharPositionInLine());
			setState(157);
			match(LBRACE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(158);
				((MainDeclarationContext)_localctx).mrd = mainRebecDefinition();
				_localctx.md.getMainRebecDefinition().add(((MainDeclarationContext)_localctx).mrd.mrd);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMainRebecDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMainRebecDefinition(this);
		}
	}

	public final MainRebecDefinitionContext mainRebecDefinition() throws RecognitionException {
		MainRebecDefinitionContext _localctx = new MainRebecDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainRebecDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainRebecDefinitionContext)_localctx).mrd =  new MainRebecDefinition();
			setState(170);
			((MainRebecDefinitionContext)_localctx).t = type();
			setState(171);
			((MainRebecDefinitionContext)_localctx).rebecName = match(IDENTIFIER);
			_localctx.mrd.setType(((MainRebecDefinitionContext)_localctx).t.t);_localctx.mrd.setName((((MainRebecDefinitionContext)_localctx).rebecName!=null?((MainRebecDefinitionContext)_localctx).rebecName.getText():null));
						_localctx.mrd.setLineNumber(((MainRebecDefinitionContext)_localctx).rebecName.getLine()); _localctx.mrd.setCharacter(((MainRebecDefinitionContext)_localctx).rebecName.getCharPositionInLine());
			setState(173);
			match(LPAREN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				setState(174);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getBindings().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(179);
			match(RPAREN);
			setState(180);
			match(COLON);
			setState(181);
			match(LPAREN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				setState(182);
				((MainRebecDefinitionContext)_localctx).el = expressionList();
				_localctx.mrd.getArguments().addAll(((MainRebecDefinitionContext)_localctx).el.el);
				}
			}

			setState(187);
			match(RPAREN);
			setState(188);
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
		public List<TerminalNode> ENV() { return getTokens(CoreRebecaCompleteParser.ENV); }
		public TerminalNode ENV(int i) {
			return getToken(CoreRebecaCompleteParser.ENV, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterEnvironmentVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitEnvironmentVariables(this);
		}
	}

	public final EnvironmentVariablesContext environmentVariables() throws RecognitionException {
		EnvironmentVariablesContext _localctx = new EnvironmentVariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_environmentVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EnvironmentVariablesContext)_localctx).fds =  new ArrayList<FieldDeclaration>();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENV) {
				{
				{
				setState(191);
				match(ENV);
				setState(192);
				((EnvironmentVariablesContext)_localctx).fd = fieldDeclaration();
				_localctx.fds.add(((EnvironmentVariablesContext)_localctx).fd.fd);
				setState(194);
				match(SEMI);
				}
				}
				setState(200);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FieldDeclarationContext)_localctx).fd =  new FieldDeclaration();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(202);
				((FieldDeclarationContext)_localctx).an = annotation();
				_localctx.fd.getAnnotations().add(((FieldDeclarationContext)_localctx).an.an);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			((FieldDeclarationContext)_localctx).t = type();
			setState(211);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorsContext)_localctx).vds =  new LinkedList<VariableDeclarator>();
			setState(215);
			((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
			_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				((VariableDeclaratorsContext)_localctx).vd = variableDeclarator();
				_localctx.vds.add(((VariableDeclaratorsContext)_localctx).vd.vd);
				}
				}
				setState(225);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorContext)_localctx).vd =  new VariableDeclarator();
			setState(227);
			((VariableDeclaratorContext)_localctx).name = match(IDENTIFIER);
			_localctx.vd.setVariableName((((VariableDeclaratorContext)_localctx).name!=null?((VariableDeclaratorContext)_localctx).name.getText():null)); _localctx.vd.setLineNumber(((VariableDeclaratorContext)_localctx).name.getLine());_localctx.vd.setCharacter(((VariableDeclaratorContext)_localctx).name.getCharPositionInLine());
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(229);
				match(EQ);
				setState(230);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableInitializer);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
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
				setState(238);
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
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArrayInitializerContext)_localctx).avi =  new ArrayVariableInitializer();
			setState(244);
			((ArrayInitializerContext)_localctx).LBRACE = match(LBRACE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
				{
				setState(245);
				((ArrayInitializerContext)_localctx).vi = variableInitializer();
				_localctx.avi.setCharacter(((ArrayInitializerContext)_localctx).LBRACE.getCharPositionInLine()); _localctx.avi.setLineNumber(((ArrayInitializerContext)_localctx).LBRACE.getLine());
				    		_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(247);
					match(COMMA);
					setState(248);
					((ArrayInitializerContext)_localctx).vi = variableInitializer();
					_localctx.avi.getValues().add(((ArrayInitializerContext)_localctx).vi.vi);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258);
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
		public TerminalNode INTERFACE() { return getToken(CoreRebecaCompleteParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
		public List<TerminalNode> MSGSRV() { return getTokens(CoreRebecaCompleteParser.MSGSRV); }
		public TerminalNode MSGSRV(int i) {
			return getToken(CoreRebecaCompleteParser.MSGSRV, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InterfaceDeclarationContext)_localctx).intd =  new InterfaceDeclaration();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(261);
				((InterfaceDeclarationContext)_localctx).an = annotation();
				_localctx.intd.getAnnotations().add(((InterfaceDeclarationContext)_localctx).an.an);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(INTERFACE);
			setState(270);
			((InterfaceDeclarationContext)_localctx).interfaceName = match(IDENTIFIER);
				_localctx.intd.setName((((InterfaceDeclarationContext)_localctx).interfaceName!=null?((InterfaceDeclarationContext)_localctx).interfaceName.getText():null)); 
			        		_localctx.intd.setLineNumber(((InterfaceDeclarationContext)_localctx).interfaceName.getLine()); _localctx.intd.setCharacter(((InterfaceDeclarationContext)_localctx).interfaceName.getCharPositionInLine());
			        	
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(272);
				match(EXTENDS);
				setState(273);
				((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
				        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
				        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
				        		_localctx.intd.getExtends().add(opt);
				        	
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(275);
					match(COMMA);
					setState(276);
					((InterfaceDeclarationContext)_localctx).extendingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((InterfaceDeclarationContext)_localctx).extendingInterfaceName!=null?((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getText():null));
						        		opt.setLineNumber(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getLine());
						        		opt.setCharacter(((InterfaceDeclarationContext)_localctx).extendingInterfaceName.getCharPositionInLine());
						        		_localctx.intd.getExtends().add(opt);
					        		
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(LBRACE);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGSRV) {
				{
				{
				MethodDeclaration md;
				{
				setState(287);
				match(MSGSRV);
				md = new MsgsrvDeclaration(); md.setAbstract(true); _localctx.intd.getMsgsrvs().add((MsgsrvDeclaration)md);
				}
				setState(290);
				((InterfaceDeclarationContext)_localctx).name = match(IDENTIFIER);
				md.setName((((InterfaceDeclarationContext)_localctx).name!=null?((InterfaceDeclarationContext)_localctx).name.getText():null)); md.setLineNumber(((InterfaceDeclarationContext)_localctx).name.getLine());md.setCharacter(((InterfaceDeclarationContext)_localctx).name.getCharPositionInLine());
				setState(292);
				((InterfaceDeclarationContext)_localctx).fps = formalParameters();
				md.getFormalParameters().addAll(((InterfaceDeclarationContext)_localctx).fps.fps);
				setState(294);
				match(SEMI);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		public TerminalNode REACTIVECLASS() { return getToken(CoreRebecaCompleteParser.REACTIVECLASS, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(CoreRebecaCompleteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CoreRebecaCompleteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CoreRebecaCompleteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CoreRebecaCompleteParser.IDENTIFIER, i);
		}
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public TerminalNode EXTENDS() { return getToken(CoreRebecaCompleteParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(CoreRebecaCompleteParser.IMPLEMENTS, 0); }
		public TerminalNode KNOWNREBECS() { return getToken(CoreRebecaCompleteParser.KNOWNREBECS, 0); }
		public TerminalNode STATEVARS() { return getToken(CoreRebecaCompleteParser.STATEVARS, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterReactiveClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitReactiveClassDeclaration(this);
		}
	}

	public final ReactiveClassDeclarationContext reactiveClassDeclaration() throws RecognitionException {
		ReactiveClassDeclarationContext _localctx = new ReactiveClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reactiveClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReactiveClassDeclarationContext)_localctx).rcd =  new ReactiveClassDeclaration();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONKEYS_AT) {
				{
				{
				setState(305);
				((ReactiveClassDeclarationContext)_localctx).an = annotation();
				_localctx.rcd.getAnnotations().add(((ReactiveClassDeclarationContext)_localctx).an.an);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(313);
				match(ABSTRACT);
				_localctx.rcd.setAbstract(true);
				}
			}

			setState(317);
			match(REACTIVECLASS);
			setState(318);
			((ReactiveClassDeclarationContext)_localctx).reactiveClassName = match(IDENTIFIER);
				_localctx.rcd.setName((((ReactiveClassDeclarationContext)_localctx).reactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getText():null)); 
			        		_localctx.rcd.setLineNumber(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getLine()); _localctx.rcd.setCharacter(((ReactiveClassDeclarationContext)_localctx).reactiveClassName.getCharPositionInLine());
			        	
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(320);
				match(EXTENDS);
				setState(321);
				((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName!=null?((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).extendingReactiveClassName.getCharPositionInLine());
				        		_localctx.rcd.setExtends(opt);
				        	
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(325);
				match(IMPLEMENTS);
				setState(326);
				((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

				        		OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
				        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
				        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
				        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
				        		_localctx.rcd.getImplements().add(opt);
				        	
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName = match(IDENTIFIER);

						        		opt = new OrdinaryPrimitiveType();
						        		opt.setName((((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName!=null?((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getText():null));
						        		opt.setLineNumber(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getLine());
						        		opt.setCharacter(((ReactiveClassDeclarationContext)_localctx).implementingInterfaceName.getCharPositionInLine());
						        		_localctx.rcd.getImplements().add(opt);
					        		
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			match(LPAREN);
			setState(339);
			((ReactiveClassDeclarationContext)_localctx).queueSize = match(INTLITERAL);
			if(!((ReactiveClassDeclarationContext)_localctx).queueSize.getText().equals("<missing INTLITERAL>")) _localctx.rcd.setQueueSize(Integer.parseInt((((ReactiveClassDeclarationContext)_localctx).queueSize!=null?((ReactiveClassDeclarationContext)_localctx).queueSize.getText():null)));
			setState(341);
			match(RPAREN);
			setState(342);
			match(LBRACE);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KNOWNREBECS) {
				{
				setState(343);
				match(KNOWNREBECS);
				setState(344);
				match(LBRACE);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(345);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getKnownRebecs().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(347);
					match(SEMI);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEVARS) {
				{
				setState(357);
				match(STATEVARS);
				setState(358);
				match(LBRACE);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MONKEYS_AT || _la==IDENTIFIER) {
					{
					{
					setState(359);
					((ReactiveClassDeclarationContext)_localctx).fd = fieldDeclaration();
					_localctx.rcd.getStatevars().add(((ReactiveClassDeclarationContext)_localctx).fd.fd);
					setState(361);
					match(SEMI);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				((ReactiveClassDeclarationContext)_localctx).RBRACE = match(RBRACE);
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (ABSTRACT - 32)) | (1L << (MSGSRV - 32)) | (1L << (IDENTIFIER - 32)))) != 0)) {
				{
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(371);
					((ReactiveClassDeclarationContext)_localctx).cd = constructorDeclaration();
					_localctx.rcd.getConstructors().add(((ReactiveClassDeclarationContext)_localctx).cd.cd);
					}
					break;
				case 2:
					{
					setState(374);
					((ReactiveClassDeclarationContext)_localctx).md = msgsrvDeclaration();
					_localctx.rcd.getMsgsrvs().add(((ReactiveClassDeclarationContext)_localctx).md.md);
					}
					break;
				case 3:
					{
					setState(377);
					((ReactiveClassDeclarationContext)_localctx).smd = synchMethodDeclaration();
					_localctx.rcd.getSynchMethods().add(((ReactiveClassDeclarationContext)_localctx).smd.smd);
					}
					break;
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoreRebecaCompleteParser.SEMI, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(MethodDeclaration md) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), md);
		enterRule(_localctx, 30, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((MethodDeclarationContext)_localctx).name = match(IDENTIFIER);
			_localctx.md.setName((((MethodDeclarationContext)_localctx).name!=null?((MethodDeclarationContext)_localctx).name.getText():null)); _localctx.md.setLineNumber(((MethodDeclarationContext)_localctx).name.getLine());_localctx.md.setCharacter(((MethodDeclarationContext)_localctx).name.getCharPositionInLine());
			setState(390);
			((MethodDeclarationContext)_localctx).fps = formalParameters();
			_localctx.md.getFormalParameters().addAll(((MethodDeclarationContext)_localctx).fps.fps);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(392);
				((MethodDeclarationContext)_localctx).b = block();
				_localctx.md.setBlock(((MethodDeclarationContext)_localctx).b.bs);_localctx.md.setEndLineNumber(((MethodDeclarationContext)_localctx).b.bs.getEndLineNumber());_localctx.md.setEndCharacter(((MethodDeclarationContext)_localctx).b.bs.getEndCharacter());
				}
				break;
			case SEMI:
				{
				setState(395);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorDeclarationContext)_localctx).cd =  new ConstructorDeclaration();
			setState(399);
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
		public TerminalNode MSGSRV() { return getToken(CoreRebecaCompleteParser.MSGSRV, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public MsgsrvDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgsrvDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMsgsrvDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMsgsrvDeclaration(this);
		}
	}

	public final MsgsrvDeclarationContext msgsrvDeclaration() throws RecognitionException {
		MsgsrvDeclarationContext _localctx = new MsgsrvDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_msgsrvDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MsgsrvDeclarationContext)_localctx).md =  new MsgsrvDeclaration();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(402);
				match(ABSTRACT);
				_localctx.md.setAbstract(true);
				}
			}

			setState(406);
			match(MSGSRV);
			setState(407);
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
		public TypeContext t;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(CoreRebecaCompleteParser.ABSTRACT, 0); }
		public SynchMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSynchMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSynchMethodDeclaration(this);
		}
	}

	public final SynchMethodDeclarationContext synchMethodDeclaration() throws RecognitionException {
		SynchMethodDeclarationContext _localctx = new SynchMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_synchMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SynchMethodDeclarationContext)_localctx).smd =  new SynchMethodDeclaration();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(410);
				match(ABSTRACT);
				_localctx.smd.setAbstract(true);
				}
			}

			setState(414);
			((SynchMethodDeclarationContext)_localctx).t = type();
			_localctx.smd.setReturnType(((SynchMethodDeclarationContext)_localctx).t.t);
			setState(416);
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public FormalParametersDeclarationContext formalParametersDeclaration() {
			return getRuleContext(FormalParametersDeclarationContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersContext)_localctx).fps =  new ArrayList<FormalParameterDeclaration>();
			setState(419);
			match(LPAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(420);
				((FormalParametersContext)_localctx).fpds = formalParametersDeclaration();
				_localctx.fps.addAll(((FormalParametersContext)_localctx).fpds.fpds);
				}
			}

			setState(425);
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
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public FormalParametersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParametersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParametersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParametersDeclaration(this);
		}
	}

	public final FormalParametersDeclarationContext formalParametersDeclaration() throws RecognitionException {
		FormalParametersDeclarationContext _localctx = new FormalParametersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParametersDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FormalParametersDeclarationContext)_localctx).fpds =  new ArrayList<FormalParameterDeclaration>();
			setState(428);
			((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
			_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(430);
				match(COMMA);
				setState(431);
				((FormalParametersDeclarationContext)_localctx).fpd = formalParameterDeclaration();
				_localctx.fpds.add(((FormalParametersDeclarationContext)_localctx).fpd.fpd);
				}
				}
				setState(438);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public FormalParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterFormalParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitFormalParameterDeclaration(this);
		}
	}

	public final FormalParameterDeclarationContext formalParameterDeclaration() throws RecognitionException {
		FormalParameterDeclarationContext _localctx = new FormalParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			((FormalParameterDeclarationContext)_localctx).t = type();
			setState(440);
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
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).bs =  new BlockStatement();
			setState(444);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			_localctx.bs.setLineNumber(((BlockContext)_localctx).LBRACE.getLine());_localctx.bs.setCharacter(((BlockContext)_localctx).LBRACE.getCharPositionInLine());
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(446);
				((BlockContext)_localctx).s = statement();
				_localctx.bs.getStatements().add (((BlockContext)_localctx).s.s);
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
		public List<TerminalNode> SEMI() { return getTokens(CoreRebecaCompleteParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoreRebecaCompleteParser.SEMI, i);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(CoreRebecaCompleteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoreRebecaCompleteParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CoreRebecaCompleteParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(CoreRebecaCompleteParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(CoreRebecaCompleteParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(CoreRebecaCompleteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoreRebecaCompleteParser.RBRACE, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CoreRebecaCompleteParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(CoreRebecaCompleteParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(CoreRebecaCompleteParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((StatementContext)_localctx).fd = fieldDeclaration();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).fd.fd;
				setState(459);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).b.bs;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				((StatementContext)_localctx).IF = match(IF);
				((StatementContext)_localctx).s =  new ConditionalStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).IF.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).IF.getCharPositionInLine());
				setState(466);
				match(LPAREN);
				setState(467);
				((StatementContext)_localctx).e = expression();
				setState(468);
				match(RPAREN);
				setState(469);
				((StatementContext)_localctx).st = statement();
				((ConditionalStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((ConditionalStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(471);
					match(ELSE);
					setState(472);
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
				setState(477);
				((StatementContext)_localctx).WHILE = match(WHILE);
				((StatementContext)_localctx).s =  new WhileStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).WHILE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).WHILE.getCharPositionInLine());
				setState(479);
				match(LPAREN);
				setState(480);
				((StatementContext)_localctx).e = expression();
				setState(481);
				match(RPAREN);
				setState(482);
				((StatementContext)_localctx).st = statement();
				((WhileStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e); ((WhileStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				((StatementContext)_localctx).FOR = match(FOR);
				((StatementContext)_localctx).s =  new ForStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).FOR.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).FOR.getCharPositionInLine());
				setState(487);
				match(LPAREN);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(488);
					((StatementContext)_localctx).fi = forInit();
					((ForStatement)_localctx.s).setForInitializer(((StatementContext)_localctx).fi.fi);
					}
				}

				setState(493);
				match(SEMI);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(494);
					((StatementContext)_localctx).e = expression();
					((ForStatement)_localctx.s).setCondition(((StatementContext)_localctx).e.e);
					}
				}

				setState(499);
				match(SEMI);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(500);
					((StatementContext)_localctx).el = expressionList();
					((ForStatement)_localctx.s).getForIncrement().addAll(((StatementContext)_localctx).el.el); 
					}
				}

				setState(505);
				match(RPAREN);
				setState(506);
				((StatementContext)_localctx).st = statement();
				((ForStatement)_localctx.s).setStatement(((StatementContext)_localctx).st.s);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				((StatementContext)_localctx).SWITCH = match(SWITCH);
				setState(510);
				match(LPAREN);
				setState(511);
				((StatementContext)_localctx).e = expression();
				setState(512);
				match(RPAREN);
				setState(513);
				match(LBRACE);
				setState(514);
				((StatementContext)_localctx).sb = switchBlock();
				setState(515);
				match(RBRACE);
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).sb.ss; ((SwitchStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).SWITCH.getLine()); _localctx.s.setCharacter(((StatementContext)_localctx).SWITCH.getCharPositionInLine());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				((StatementContext)_localctx).RETURN = match(RETURN);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(519);
					((StatementContext)_localctx).e = expression();
					}
				}

				setState(522);
				match(SEMI);
				((StatementContext)_localctx).s =  new ReturnStatement(); ((ReturnStatement)_localctx.s).setExpression(((StatementContext)_localctx).e.e); _localctx.s.setLineNumber(((StatementContext)_localctx).RETURN.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).RETURN.getCharPositionInLine());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(524);
				((StatementContext)_localctx).BREAK = match(BREAK);
				setState(525);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).BREAK.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).BREAK.getCharPositionInLine());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(527);
				((StatementContext)_localctx).CONTINUE = match(CONTINUE);
				setState(528);
				match(SEMI);
				((StatementContext)_localctx).s =  new BreakStatement(); _localctx.s.setLineNumber(((StatementContext)_localctx).CONTINUE.getLine());_localctx.s.setCharacter(((StatementContext)_localctx).CONTINUE.getCharPositionInLine());
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(530);
				match(SEMI);
				((StatementContext)_localctx).s =  new Statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(532);
				((StatementContext)_localctx).se = statementExpression();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).se.se;
				setState(534);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInit);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				((ForInitContext)_localctx).fd = fieldDeclaration();
				((ForInitContext)_localctx).fi =  new ForInitializer(); _localctx.fi.setFieldDeclaration(((ForInitContext)_localctx).fd.fd); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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
		public List<TerminalNode> COLON() { return getTokens(CoreRebecaCompleteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoreRebecaCompleteParser.COLON, i);
		}
		public List<TerminalNode> CASE() { return getTokens(CoreRebecaCompleteParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(CoreRebecaCompleteParser.CASE, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(CoreRebecaCompleteParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(CoreRebecaCompleteParser.DEFAULT, i);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SwitchBlockContext)_localctx).ss =  new SwitchStatement();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				_localctx.ss.getSwitchStatementGroups().add(new SwitchStatementGroup());
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(548);
					match(CASE);
					setState(549);
					((SwitchBlockContext)_localctx).e = expression();

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setExpression(((SwitchBlockContext)_localctx).e.e);
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).e.e.getLineNumber());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).e.e.getCharacter());
					    			
					}
					break;
				case DEFAULT:
					{
					setState(552);
					((SwitchBlockContext)_localctx).DEFAULT = match(DEFAULT);

					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setLineNumber(((SwitchBlockContext)_localctx).DEFAULT.getCharPositionInLine());
					    			_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).setCharacter(((SwitchBlockContext)_localctx).DEFAULT.getLine());
					    			
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(556);
				match(COLON);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << NEW) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SUB - 64)) | (1L << (MONKEYS_AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(557);
					((SwitchBlockContext)_localctx).st = statement();
					_localctx.ss.getSwitchStatementGroups().get(_localctx.ss.getSwitchStatementGroups().size() - 1).getStatements().add(((SwitchBlockContext)_localctx).st.s);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(569);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AnnotationContext)_localctx).an =  new Annotation();
			setState(574);
			match(MONKEYS_AT);
			setState(575);
			((AnnotationContext)_localctx).annotationName = match(IDENTIFIER);
			_localctx.an.setIdentifier((((AnnotationContext)_localctx).annotationName!=null?((AnnotationContext)_localctx).annotationName.getText():null));
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(577);
				match(LPAREN);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(578);
					((AnnotationContext)_localctx).exp = expression();
					_localctx.an.setValue(((AnnotationContext)_localctx).exp.e);
					}
				}

				setState(583);
				match(RPAREN);
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

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token typeName;
		public GenericTypeParamsContext gts;
		public DimensionsContext ds;
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			((TypeContext)_localctx).typeName = match(IDENTIFIER);
			((TypeContext)_localctx).t =  new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)_localctx.t).setName((((TypeContext)_localctx).typeName!=null?((TypeContext)_localctx).typeName.getText():null));
				 	 _localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(588);
				((TypeContext)_localctx).gts = genericTypeParams();
				GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)_localctx.t).getName()); gt.setNumberOfParameters(((TypeContext)_localctx).gts.gts.size());
							GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll(((TypeContext)_localctx).gts.gts); ((TypeContext)_localctx).t =  gti;
							_localctx.t.setLineNumber(((TypeContext)_localctx).typeName.getLine());_localctx.t.setCharacter(((TypeContext)_localctx).typeName.getCharPositionInLine());
				}
				break;
			}
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(593);
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
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public GenericTypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterGenericTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitGenericTypeParams(this);
		}
	}

	public final GenericTypeParamsContext genericTypeParams() throws RecognitionException {
		GenericTypeParamsContext _localctx = new GenericTypeParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericTypeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LT);
			((GenericTypeParamsContext)_localctx).gts =  new LinkedList<Type>();
			setState(600);
			((GenericTypeParamsContext)_localctx).t = type();
			_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(602);
				match(COMMA);
				setState(603);
				((GenericTypeParamsContext)_localctx).t = type();
				_localctx.gts.add(((GenericTypeParamsContext)_localctx).t.t);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public List<TerminalNode> INTLITERAL() { return getTokens(CoreRebecaCompleteParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(CoreRebecaCompleteParser.INTLITERAL, i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DimensionsContext)_localctx).ds =  new LinkedList();
			setState(618); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(614);
				match(LBRACKET);
				setState(615);
				((DimensionsContext)_localctx).i = match(INTLITERAL);
				setState(616);
				match(RBRACKET);
				_localctx.ds.add(Integer.parseInt((((DimensionsContext)_localctx).i!=null?((DimensionsContext)_localctx).i.getText():null)));
				}
				}
				setState(620); 
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			((ExpressionContext)_localctx).e1 = conditionalExpression();
			((ExpressionContext)_localctx).e =  ((ExpressionContext)_localctx).e1.e;
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(624);
				((ExpressionContext)_localctx).ao = assignmentOperator();
				setState(625);
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
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(CoreRebecaCompleteParser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(CoreRebecaCompleteParser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(CoreRebecaCompleteParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(CoreRebecaCompleteParser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(CoreRebecaCompleteParser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(CoreRebecaCompleteParser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(CoreRebecaCompleteParser.CARETEQ, 0); }
		public TerminalNode TILDAEQ() { return getToken(CoreRebecaCompleteParser.TILDAEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(CoreRebecaCompleteParser.PERCENTEQ, 0); }
		public TerminalNode LTLTEQ() { return getToken(CoreRebecaCompleteParser.LTLTEQ, 0); }
		public TerminalNode GTGTEQ() { return getToken(CoreRebecaCompleteParser.GTGTEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignmentOperator);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				((AssignmentOperatorContext)_localctx).EQ = match(EQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).EQ!=null?((AssignmentOperatorContext)_localctx).EQ.getText():null);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				((AssignmentOperatorContext)_localctx).PLUSEQ = match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PLUSEQ!=null?((AssignmentOperatorContext)_localctx).PLUSEQ.getText():null);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				((AssignmentOperatorContext)_localctx).SUBEQ = match(SUBEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SUBEQ!=null?((AssignmentOperatorContext)_localctx).SUBEQ.getText():null);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				((AssignmentOperatorContext)_localctx).STAREQ = match(STAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).STAREQ!=null?((AssignmentOperatorContext)_localctx).STAREQ.getText():null);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				((AssignmentOperatorContext)_localctx).SLASHEQ = match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).SLASHEQ!=null?((AssignmentOperatorContext)_localctx).SLASHEQ.getText():null);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				((AssignmentOperatorContext)_localctx).AMPEQ = match(AMPEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).AMPEQ!=null?((AssignmentOperatorContext)_localctx).AMPEQ.getText():null);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(642);
				((AssignmentOperatorContext)_localctx).BAREQ = match(BAREQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).BAREQ!=null?((AssignmentOperatorContext)_localctx).BAREQ.getText():null);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(644);
				((AssignmentOperatorContext)_localctx).CARETEQ = match(CARETEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).CARETEQ!=null?((AssignmentOperatorContext)_localctx).CARETEQ.getText():null);
				}
				break;
			case TILDAEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(646);
				((AssignmentOperatorContext)_localctx).TILDAEQ = match(TILDAEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).TILDAEQ!=null?((AssignmentOperatorContext)_localctx).TILDAEQ.getText():null);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(648);
				((AssignmentOperatorContext)_localctx).PERCENTEQ = match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).PERCENTEQ!=null?((AssignmentOperatorContext)_localctx).PERCENTEQ.getText():null);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(650);
				((AssignmentOperatorContext)_localctx).LTLTEQ = match(LTLTEQ);
				((AssignmentOperatorContext)_localctx).ao =  (((AssignmentOperatorContext)_localctx).LTLTEQ!=null?((AssignmentOperatorContext)_localctx).LTLTEQ.getText():null);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(652);
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
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((ConditionalExpressionContext)_localctx).e1 = conditionalOrExpression();
			((ConditionalExpressionContext)_localctx).e =  ((ConditionalExpressionContext)_localctx).e1.e;
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(658);
				match(QUES);
				setState(659);
				((ConditionalExpressionContext)_localctx).e2 = expression();
				setState(660);
				match(COLON);
				setState(661);
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
		public List<TerminalNode> BARBAR() { return getTokens(CoreRebecaCompleteParser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(CoreRebecaCompleteParser.BARBAR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			((ConditionalOrExpressionContext)_localctx).e1 = conditionalAndExpression();
			((ConditionalOrExpressionContext)_localctx).e =  ((ConditionalOrExpressionContext)_localctx).e1.e;
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(668);
					((ConditionalOrExpressionContext)_localctx).BARBAR = match(BARBAR);
					setState(669);
					((ConditionalOrExpressionContext)_localctx).e2 = conditionalAndExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalOrExpressionContext)_localctx).BARBAR!=null?((ConditionalOrExpressionContext)_localctx).BARBAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public List<TerminalNode> AMPAMP() { return getTokens(CoreRebecaCompleteParser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(CoreRebecaCompleteParser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			((ConditionalAndExpressionContext)_localctx).e1 = inclusiveOrExpression();
			((ConditionalAndExpressionContext)_localctx).e =  ((ConditionalAndExpressionContext)_localctx).e1.e;
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(679);
					((ConditionalAndExpressionContext)_localctx).AMPAMP = match(AMPAMP);
					setState(680);
					((ConditionalAndExpressionContext)_localctx).e2 = inclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ConditionalAndExpressionContext)_localctx).AMPAMP!=null?((ConditionalAndExpressionContext)_localctx).AMPAMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ConditionalAndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ConditionalAndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		public List<TerminalNode> BAR() { return getTokens(CoreRebecaCompleteParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(CoreRebecaCompleteParser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			((InclusiveOrExpressionContext)_localctx).e1 = exclusiveOrExpression();
			((InclusiveOrExpressionContext)_localctx).e =  ((InclusiveOrExpressionContext)_localctx).e1.e;
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690);
					((InclusiveOrExpressionContext)_localctx).BAR = match(BAR);
					setState(691);
					((InclusiveOrExpressionContext)_localctx).e2 = exclusiveOrExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((InclusiveOrExpressionContext)_localctx).BAR!=null?((InclusiveOrExpressionContext)_localctx).BAR.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((InclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((InclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		public List<TerminalNode> CARET() { return getTokens(CoreRebecaCompleteParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CoreRebecaCompleteParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			((ExclusiveOrExpressionContext)_localctx).e1 = andExpression();
			((ExclusiveOrExpressionContext)_localctx).e =  ((ExclusiveOrExpressionContext)_localctx).e1.e;
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(701);
					((ExclusiveOrExpressionContext)_localctx).CARET = match(CARET);
					setState(702);
					((ExclusiveOrExpressionContext)_localctx).e2 = andExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((ExclusiveOrExpressionContext)_localctx).CARET!=null?((ExclusiveOrExpressionContext)_localctx).CARET.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((ExclusiveOrExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((ExclusiveOrExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public List<TerminalNode> AMP() { return getTokens(CoreRebecaCompleteParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(CoreRebecaCompleteParser.AMP, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			((AndExpressionContext)_localctx).e1 = equalityExpression();
			((AndExpressionContext)_localctx).e =  ((AndExpressionContext)_localctx).e1.e;
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					((AndExpressionContext)_localctx).AMP = match(AMP);
					setState(713);
					((AndExpressionContext)_localctx).e2 = equalityExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator((((AndExpressionContext)_localctx).AMP!=null?((AndExpressionContext)_localctx).AMP.getText():null)); e3.setLeft(_localctx.e); e3.setRight(((AndExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((AndExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		public TerminalNode EQEQ() { return getToken(CoreRebecaCompleteParser.EQEQ, 0); }
		public TerminalNode BANGEQ() { return getToken(CoreRebecaCompleteParser.BANGEQ, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			((EqualityExpressionContext)_localctx).e1 = instanceOfExpression();
			((EqualityExpressionContext)_localctx).e =  ((EqualityExpressionContext)_localctx).e1.e;
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				((EqualityExpressionContext)_localctx).e =  new BinaryExpression(); ((BinaryExpression)_localctx.e).setLeft(((EqualityExpressionContext)_localctx).e1.e); _localctx.e.setLineNumber(((EqualityExpressionContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((EqualityExpressionContext)_localctx).e1.e.getCharacter());
				setState(728);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQEQ:
					{
					setState(724);
					((EqualityExpressionContext)_localctx).EQEQ = match(EQEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).EQEQ!=null?((EqualityExpressionContext)_localctx).EQEQ.getText():null));
					}
					break;
				case BANGEQ:
					{
					setState(726);
					((EqualityExpressionContext)_localctx).BANGEQ = match(BANGEQ);
					((BinaryExpression)_localctx.e).setOperator((((EqualityExpressionContext)_localctx).BANGEQ!=null?((EqualityExpressionContext)_localctx).BANGEQ.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(730);
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
		public TerminalNode INSTANCEOF() { return getToken(CoreRebecaCompleteParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			((InstanceOfExpressionContext)_localctx).e1 = relationalExpression();
			((InstanceOfExpressionContext)_localctx).e =  ((InstanceOfExpressionContext)_localctx).e1.e;
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(737);
				match(INSTANCEOF);
				setState(738);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			((RelationalExpressionContext)_localctx).e1 = shiftExpression();
			((RelationalExpressionContext)_localctx).e =  ((RelationalExpressionContext)_localctx).e1.e;
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745);
					((RelationalExpressionContext)_localctx).ro = relationalOp();
					setState(746);
					((RelationalExpressionContext)_localctx).e2 = shiftExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((RelationalExpressionContext)_localctx).ro.ro); e3.setLeft(_localctx.e); e3.setRight(((RelationalExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber());e3.setCharacter(_localctx.e.getCharacter()); ((RelationalExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(753);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public String ro;
		public Token LT;
		public Token EQ;
		public Token GT;
		public TerminalNode LT() { return getToken(CoreRebecaCompleteParser.LT, 0); }
		public TerminalNode EQ() { return getToken(CoreRebecaCompleteParser.EQ, 0); }
		public TerminalNode GT() { return getToken(CoreRebecaCompleteParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relationalOp);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				((RelationalOpContext)_localctx).LT = match(LT);
				setState(755);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				((RelationalOpContext)_localctx).GT = match(GT);
				setState(758);
				((RelationalOpContext)_localctx).EQ = match(EQ);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).GT!=null?((RelationalOpContext)_localctx).GT.getText():null) + (((RelationalOpContext)_localctx).EQ!=null?((RelationalOpContext)_localctx).EQ.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				((RelationalOpContext)_localctx).LT = match(LT);
				((RelationalOpContext)_localctx).ro =  (((RelationalOpContext)_localctx).LT!=null?((RelationalOpContext)_localctx).LT.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(762);
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			((ShiftExpressionContext)_localctx).e1 = additiveExpression();
			((ShiftExpressionContext)_localctx).e =  ((ShiftExpressionContext)_localctx).e1.e;
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					((ShiftExpressionContext)_localctx).so = shiftOp();
					setState(769);
					((ShiftExpressionContext)_localctx).e2 = additiveExpression();
					BinaryExpression e3 = new BinaryExpression();
								e3.setOperator(((ShiftExpressionContext)_localctx).so.so); e3.setLeft(_localctx.e); e3.setRight(((ShiftExpressionContext)_localctx).e2.e);
								e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter()); ((ShiftExpressionContext)_localctx).e =  e3;
								
					}
					} 
				}
				setState(776);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public String so;
		public List<TerminalNode> LT() { return getTokens(CoreRebecaCompleteParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CoreRebecaCompleteParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CoreRebecaCompleteParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CoreRebecaCompleteParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_shiftOp);
		try {
			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(LT);
				setState(778);
				match(LT);
				((ShiftOpContext)_localctx).so =  "<<";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(GT);
				setState(781);
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
		public List<TerminalNode> PLUS() { return getTokens(CoreRebecaCompleteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CoreRebecaCompleteParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CoreRebecaCompleteParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CoreRebecaCompleteParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			((AdditiveExpressionContext)_localctx).e1 = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).e =  ((AdditiveExpressionContext)_localctx).e1.e;
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(792);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(788);
						((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
						e3.setOperator((((AdditiveExpressionContext)_localctx).PLUS!=null?((AdditiveExpressionContext)_localctx).PLUS.getText():null));
						}
						break;
					case SUB:
						{
						setState(790);
						((AdditiveExpressionContext)_localctx).SUB = match(SUB);
						e3.setOperator((((AdditiveExpressionContext)_localctx).SUB!=null?((AdditiveExpressionContext)_localctx).SUB.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(794);
					((AdditiveExpressionContext)_localctx).e2 = multiplicativeExpression();
					e3.setRight(((AdditiveExpressionContext)_localctx).e2.e); ((AdditiveExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public List<TerminalNode> STAR() { return getTokens(CoreRebecaCompleteParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CoreRebecaCompleteParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(CoreRebecaCompleteParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(CoreRebecaCompleteParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CoreRebecaCompleteParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CoreRebecaCompleteParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			((MultiplicativeExpressionContext)_localctx).e1 = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).e =  ((MultiplicativeExpressionContext)_localctx).e1.e;
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					BinaryExpression e3 = new BinaryExpression(); e3.setLeft(_localctx.e); e3.setLineNumber(_localctx.e.getLineNumber()); e3.setCharacter(_localctx.e.getCharacter());
					setState(811);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(805);
						((MultiplicativeExpressionContext)_localctx).STAR = match(STAR);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).STAR!=null?((MultiplicativeExpressionContext)_localctx).STAR.getText():null));
						}
						break;
					case SLASH:
						{
						setState(807);
						((MultiplicativeExpressionContext)_localctx).SLASH = match(SLASH);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).SLASH!=null?((MultiplicativeExpressionContext)_localctx).SLASH.getText():null));
						}
						break;
					case PERCENT:
						{
						setState(809);
						((MultiplicativeExpressionContext)_localctx).PERCENT = match(PERCENT);
						e3.setOperator((((MultiplicativeExpressionContext)_localctx).PERCENT!=null?((MultiplicativeExpressionContext)_localctx).PERCENT.getText():null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(813);
					((MultiplicativeExpressionContext)_localctx).e2 = unaryExpression();
					e3.setRight(((MultiplicativeExpressionContext)_localctx).e2.e); ((MultiplicativeExpressionContext)_localctx).e =  e3;
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		public TerminalNode PLUS() { return getToken(CoreRebecaCompleteParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoreRebecaCompleteParser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryExpression);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(PLUS);
				setState(822);
				((UnaryExpressionContext)_localctx).ep = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  ((UnaryExpressionContext)_localctx).ep.e;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				((UnaryExpressionContext)_localctx).SUB = match(SUB);
				setState(826);
				((UnaryExpressionContext)_localctx).es = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).SUB!=null?((UnaryExpressionContext)_localctx).SUB.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).es.e); ((UnaryExpression)_localctx.e).setLineNumber(((UnaryExpressionContext)_localctx).es.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).es.e.getCharacter());
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				((UnaryExpressionContext)_localctx).PLUSPLUS = match(PLUSPLUS);
				setState(830);
				((UnaryExpressionContext)_localctx).epp = unaryExpression();
				((UnaryExpressionContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionContext)_localctx).PLUSPLUS!=null?((UnaryExpressionContext)_localctx).PLUSPLUS.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionContext)_localctx).epp.e); _localctx.e.setLineNumber(((UnaryExpressionContext)_localctx).epp.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionContext)_localctx).epp.e.getCharacter());
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				((UnaryExpressionContext)_localctx).SUBSUB = match(SUBSUB);
				setState(834);
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
				setState(837);
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
		public TerminalNode TILDA() { return getToken(CoreRebecaCompleteParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(CoreRebecaCompleteParser.BANG, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CoreRebecaCompleteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CoreRebecaCompleteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CoreRebecaCompleteParser.RPAREN, i);
		}
		public TerminalNode QUES() { return getToken(CoreRebecaCompleteParser.QUES, 0); }
		public TerminalNode NEW() { return getToken(CoreRebecaCompleteParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(CoreRebecaCompleteParser.COLON, 0); }
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
		public List<TerminalNode> DOT() { return getTokens(CoreRebecaCompleteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CoreRebecaCompleteParser.DOT, i);
		}
		public TerminalNode PLUSPLUS() { return getToken(CoreRebecaCompleteParser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(CoreRebecaCompleteParser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			int _alt;
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				((UnaryExpressionNotPlusMinusContext)_localctx).TILDA = match(TILDA);
				setState(843);
				((UnaryExpressionNotPlusMinusContext)_localctx).e1 = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).e =  new UnaryExpression(); ((UnaryExpression)_localctx.e).setOperator((((UnaryExpressionNotPlusMinusContext)_localctx).TILDA!=null?((UnaryExpressionNotPlusMinusContext)_localctx).TILDA.getText():null)); ((UnaryExpression)_localctx.e).setExpression(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e); _localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).e1.e.getCharacter());
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				((UnaryExpressionNotPlusMinusContext)_localctx).BANG = match(BANG);
				setState(847);
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
				setState(889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(850);
					((UnaryExpressionNotPlusMinusContext)_localctx).ec = castExpression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ec.e;
					}
					break;
				case 2:
					{
					setState(853);
					match(LPAREN);
					setState(854);
					((UnaryExpressionNotPlusMinusContext)_localctx).ep = expression();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).ep.e;
					setState(856);
					match(RPAREN);
					}
					break;
				case 3:
					{
					setState(858);
					((UnaryExpressionNotPlusMinusContext)_localctx).p = primary();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).p.tp;
					}
					break;
				case 4:
					{
					setState(861);
					((UnaryExpressionNotPlusMinusContext)_localctx).l = literal();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  ((UnaryExpressionNotPlusMinusContext)_localctx).l.l;
					}
					break;
				case 5:
					{
					setState(864);
					((UnaryExpressionNotPlusMinusContext)_localctx).QUES = match(QUES);
					setState(865);
					match(LPAREN);
					setState(866);
					((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
					setState(867);
					match(RPAREN);
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new NonDetExpression(); ((NonDetExpression)_localctx.e).getChoices().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						    	_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getLine()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).QUES.getCharPositionInLine());
					}
					break;
				case 6:
					{
					setState(870);
					match(NEW);
					setState(871);
					((UnaryExpressionNotPlusMinusContext)_localctx).t = type();
					((UnaryExpressionNotPlusMinusContext)_localctx).e =  new RebecInstantiationPrimary();
									_localctx.e.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getLineNumber()); _localctx.e.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).t.t.getCharacter()); _localctx.e.setType(((UnaryExpressionNotPlusMinusContext)_localctx).t.t);
					setState(873);
					match(LPAREN);
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
						{
						setState(874);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getBindings().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(879);
					match(RPAREN);
					setState(880);
					match(COLON);
					setState(881);
					match(LPAREN);
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
						{
						setState(882);
						((UnaryExpressionNotPlusMinusContext)_localctx).el = expressionList();
						((RebecInstantiationPrimary)_localctx.e).getArguments().addAll(((UnaryExpressionNotPlusMinusContext)_localctx).el.el);
						}
					}

					setState(887);
					match(RPAREN);
					}
					break;
				}
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(891);
						((UnaryExpressionNotPlusMinusContext)_localctx).DOT = match(DOT);
						setState(892);
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
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(900);
					((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS = match(PLUSPLUS);
					PlusSubExpression pse = new PlusSubExpression(); pse.setValue(_localctx.e); pse.setOperator("++");((UnaryExpressionNotPlusMinusContext)_localctx).e = pse;
					        		pse.setLineNumber(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getLine()); pse.setCharacter(((UnaryExpressionNotPlusMinusContext)_localctx).PLUSPLUS.getCharPositionInLine());
					}
					break;
				case 2:
					{
					setState(902);
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
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
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
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LPAREN);
			setState(909);
			((CastExpressionContext)_localctx).t = type();
			setState(910);
			match(RPAREN);
			setState(911);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TermPrimary tp;
		public Token id1;
		public Token lp;
		public ExpressionListContext el;
		public ExpressionContext e2;
		public TerminalNode IDENTIFIER() { return getToken(CoreRebecaCompleteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(CoreRebecaCompleteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CoreRebecaCompleteParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CoreRebecaCompleteParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CoreRebecaCompleteParser.RBRACKET, i);
		}
		public TerminalNode LPAREN() { return getToken(CoreRebecaCompleteParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			((PrimaryContext)_localctx).id1 = match(IDENTIFIER);
			((PrimaryContext)_localctx).tp =  new TermPrimary(); _localctx.tp.setName((((PrimaryContext)_localctx).id1!=null?((PrimaryContext)_localctx).id1.getText():null));
								  _localctx.tp.setLineNumber(((PrimaryContext)_localctx).id1.getLine()); _localctx.tp.setCharacter(((PrimaryContext)_localctx).id1.getCharPositionInLine());
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(916);
				((PrimaryContext)_localctx).lp = match(LPAREN);
				ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
				    	 psp.setLineNumber(((PrimaryContext)_localctx).lp.getLine()); psp.setCharacter(((PrimaryContext)_localctx).lp.getCharPositionInLine());
				    	 _localctx.tp.setParentSuffixPrimary(psp);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << DOUBLELITERAL) | (1L << CHARLITERAL) | (1L << STRINGLITERAL) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << BANG) | (1L << TILDA) | (1L << QUES) | (1L << PLUSPLUS) | (1L << SUBSUB) | (1L << PLUS))) != 0) || _la==SUB || _la==IDENTIFIER) {
					{
					setState(918);
					((PrimaryContext)_localctx).el = expressionList();
					_localctx.tp.getParentSuffixPrimary().getArguments().addAll(((PrimaryContext)_localctx).el.el);
					}
				}

				setState(923);
				match(RPAREN);
				}
			}

			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(926);
				match(LBRACKET);
				setState(927);
				((PrimaryContext)_localctx).e2 = expression();
				setState(928);
				match(RBRACKET);
				_localctx.tp.getIndices().add(((PrimaryContext)_localctx).e2.e);
				}
				}
				setState(935);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> el;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoreRebecaCompleteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoreRebecaCompleteParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).el =  new LinkedList<Expression>();
			setState(937);
			((ExpressionListContext)_localctx).e = expression();
			_localctx.el.add(((ExpressionListContext)_localctx).e.e);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(939);
				match(COMMA);
				setState(940);
				((ExpressionListContext)_localctx).e = expression();
				_localctx.el.add(((ExpressionListContext)_localctx).e.e);
				}
				}
				setState(947);
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
		public TerminalNode INTLITERAL() { return getToken(CoreRebecaCompleteParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(CoreRebecaCompleteParser.FLOATLITERAL, 0); }
		public TerminalNode DOUBLELITERAL() { return getToken(CoreRebecaCompleteParser.DOUBLELITERAL, 0); }
		public TerminalNode CHARLITERAL() { return getToken(CoreRebecaCompleteParser.CHARLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(CoreRebecaCompleteParser.STRINGLITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CoreRebecaCompleteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoreRebecaCompleteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CoreRebecaCompleteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoreRebecaCompleteListener ) ((CoreRebecaCompleteListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				((LiteralContext)_localctx).INTLITERAL = match(INTLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).INTLITERAL!=null?((LiteralContext)_localctx).INTLITERAL.getText():null));
				    		_localctx.l.setType(TypesUtilities.INT_TYPE);
				    		_localctx.l.setLineNumber(((LiteralContext)_localctx).INTLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).INTLITERAL.getCharPositionInLine());
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				((LiteralContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).FLOATLITERAL!=null?((LiteralContext)_localctx).FLOATLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.FLOAT_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FLOATLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FLOATLITERAL.getCharPositionInLine());
				}
				break;
			case DOUBLELITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				((LiteralContext)_localctx).DOUBLELITERAL = match(DOUBLELITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).DOUBLELITERAL!=null?((LiteralContext)_localctx).DOUBLELITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.DOUBLE_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).DOUBLELITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).DOUBLELITERAL.getCharPositionInLine());
				}
				break;
			case CHARLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(954);
				((LiteralContext)_localctx).CHARLITERAL = match(CHARLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).CHARLITERAL!=null?((LiteralContext)_localctx).CHARLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.CHAR_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).CHARLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).CHARLITERAL.getCharPositionInLine());
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(956);
				((LiteralContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue((((LiteralContext)_localctx).STRINGLITERAL!=null?((LiteralContext)_localctx).STRINGLITERAL.getText():null));
				    	_localctx.l.setType(TypesUtilities.STRING_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).STRINGLITERAL.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).STRINGLITERAL.getCharPositionInLine());
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(958);
				((LiteralContext)_localctx).TRUE = match(TRUE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("true");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).TRUE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).TRUE.getCharPositionInLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(960);
				((LiteralContext)_localctx).FALSE = match(FALSE);
				((LiteralContext)_localctx).l =  new Literal();_localctx.l.setLiteralValue("false");
				    	_localctx.l.setType(TypesUtilities.BOOLEAN_TYPE);
				    	_localctx.l.setLineNumber(((LiteralContext)_localctx).FALSE.getLine());_localctx.l.setCharacter(((LiteralContext)_localctx).FALSE.getCharPositionInLine());
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(962);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Z\u03c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\5\2q\n\2\3\2\3\2\3\2\7\2v\n\2"+
		"\f\2\16\2y\13\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0086"+
		"\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0094"+
		"\n\5\r\5\16\5\u0095\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00b4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bc\n\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n\t\f\t\16\t\u00ca\13\t\3\n\3\n\3\n"+
		"\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ec\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f4\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00fe\n\16\f\16\16\16\u0101"+
		"\13\16\5\16\u0103\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u010b\n\17\f"+
		"\17\16\17\u010e\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0119\n\17\f\17\16\17\u011c\13\17\5\17\u011e\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u012b\n\17\f\17\16\17\u012e\13"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0137\n\20\f\20\16\20\u013a"+
		"\13\20\3\20\3\20\5\20\u013e\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0146"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u014e\n\20\f\20\16\20\u0151\13"+
		"\20\5\20\u0153\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0160\n\20\f\20\16\20\u0163\13\20\3\20\5\20\u0166\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u016e\n\20\f\20\16\20\u0171\13\20\3\20"+
		"\5\20\u0174\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u017f"+
		"\n\20\f\20\16\20\u0182\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u018f\n\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0197"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u019f\n\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01aa\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u01b5\n\26\f\26\16\26\u01b8\13\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01c4\n\30\f\30\16\30\u01c7\13"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01de\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ee\n\31"+
		"\3\31\3\31\3\31\3\31\5\31\u01f4\n\31\3\31\3\31\3\31\3\31\5\31\u01fa\n"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u020b\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u021b\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0223\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022d\n"+
		"\33\3\33\3\33\3\33\3\33\7\33\u0233\n\33\f\33\16\33\u0236\13\33\7\33\u0238"+
		"\n\33\f\33\16\33\u023b\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0248\n\35\3\35\5\35\u024b\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0252\n\36\3\36\3\36\3\36\5\36\u0257\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0261\n\37\f\37\16\37\u0264\13\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \6 \u026d\n \r \16 \u026e\3!\3!\3!\3!\3!\3!\5!\u0277"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0291\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u029b\n#\3$\3$\3$\3$\3$\3$\7$\u02a3\n$\f$\16$\u02a6\13$\3%\3%\3%\3%"+
		"\3%\3%\7%\u02ae\n%\f%\16%\u02b1\13%\3&\3&\3&\3&\3&\3&\7&\u02b9\n&\f&\16"+
		"&\u02bc\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02c4\n\'\f\'\16\'\u02c7\13\'"+
		"\3(\3(\3(\3(\3(\3(\7(\u02cf\n(\f(\16(\u02d2\13(\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u02db\n)\3)\3)\3)\5)\u02e0\n)\3*\3*\3*\3*\3*\3*\5*\u02e8\n*\3+\3+\3"+
		"+\3+\3+\3+\7+\u02f0\n+\f+\16+\u02f3\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u02ff\n,\3-\3-\3-\3-\3-\3-\7-\u0307\n-\f-\16-\u030a\13-\3.\3.\3.\3"+
		".\3.\3.\5.\u0312\n.\3/\3/\3/\3/\3/\3/\3/\5/\u031b\n/\3/\3/\3/\7/\u0320"+
		"\n/\f/\16/\u0323\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u032e\n\60\3\60\3\60\3\60\7\60\u0333\n\60\f\60\16\60\u0336\13\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u034b\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0370\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0378\n\62\3\62\3"+
		"\62\5\62\u037c\n\62\3\62\3\62\3\62\3\62\7\62\u0382\n\62\f\62\16\62\u0385"+
		"\13\62\3\62\3\62\3\62\3\62\5\62\u038b\n\62\5\62\u038d\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u039c\n\64"+
		"\3\64\5\64\u039f\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u03a6\n\64\f\64\16"+
		"\64\u03a9\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u03b2\n\65\f\65"+
		"\16\65\u03b5\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\5\66\u03c7\n\66\3\66\2\2\67\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhj\2\2\2\u040c\2l\3\2\2\2\4}\3\2\2\2\6\177\3\2\2\2\b\u0081\3\2\2\2\n"+
		"\u009a\3\2\2\2\f\u009c\3\2\2\2\16\u00ab\3\2\2\2\20\u00c0\3\2\2\2\22\u00cb"+
		"\3\2\2\2\24\u00d8\3\2\2\2\26\u00e4\3\2\2\2\30\u00f3\3\2\2\2\32\u00f5\3"+
		"\2\2\2\34\u0106\3\2\2\2\36\u0132\3\2\2\2 \u0186\3\2\2\2\"\u0190\3\2\2"+
		"\2$\u0193\3\2\2\2&\u019b\3\2\2\2(\u01a4\3\2\2\2*\u01ad\3\2\2\2,\u01b9"+
		"\3\2\2\2.\u01bd\3\2\2\2\60\u021a\3\2\2\2\62\u0222\3\2\2\2\64\u0224\3\2"+
		"\2\2\66\u023c\3\2\2\28\u023f\3\2\2\2:\u024c\3\2\2\2<\u0258\3\2\2\2>\u0267"+
		"\3\2\2\2@\u0270\3\2\2\2B\u0290\3\2\2\2D\u0292\3\2\2\2F\u029c\3\2\2\2H"+
		"\u02a7\3\2\2\2J\u02b2\3\2\2\2L\u02bd\3\2\2\2N\u02c8\3\2\2\2P\u02d3\3\2"+
		"\2\2R\u02e1\3\2\2\2T\u02e9\3\2\2\2V\u02fe\3\2\2\2X\u0300\3\2\2\2Z\u0311"+
		"\3\2\2\2\\\u0313\3\2\2\2^\u0324\3\2\2\2`\u034a\3\2\2\2b\u038c\3\2\2\2"+
		"d\u038e\3\2\2\2f\u0394\3\2\2\2h\u03aa\3\2\2\2j\u03c6\3\2\2\2lp\b\2\1\2"+
		"mn\5\4\3\2no\b\2\1\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2\2qw\3\2\2\2rs\5\6\4\2"+
		"st\b\2\1\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2"+
		"yw\3\2\2\2z{\5\b\5\2{|\b\2\1\2|\3\3\2\2\2}~\7\26\2\2~\5\3\2\2\2\177\u0080"+
		"\7\24\2\2\u0080\7\3\2\2\2\u0081\u0087\b\5\1\2\u0082\u0083\5\n\6\2\u0083"+
		"\u0084\b\5\1\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\5\20\t\2\u008b\u008c\b\5\1\2\u008c\u0093\3"+
		"\2\2\2\u008d\u008e\5\36\20\2\u008e\u008f\b\5\1\2\u008f\u0094\3\2\2\2\u0090"+
		"\u0091\5\34\17\2\u0091\u0092\b\5\1\2\u0092\u0094\3\2\2\2\u0093\u008d\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5\f\7\2\u0098\u0099\b\5"+
		"\1\2\u0099\t\3\2\2\2\u009a\u009b\7\32\2\2\u009b\13\3\2\2\2\u009c\u009d"+
		"\b\7\1\2\u009d\u009e\7&\2\2\u009e\u009f\b\7\1\2\u009f\u00a5\7/\2\2\u00a0"+
		"\u00a1\5\16\b\2\u00a1\u00a2\b\7\1\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa\b"+
		"\7\1\2\u00aa\r\3\2\2\2\u00ab\u00ac\b\b\1\2\u00ac\u00ad\5:\36\2\u00ad\u00ae"+
		"\7Z\2\2\u00ae\u00af\b\b\1\2\u00af\u00b3\7-\2\2\u00b0\u00b1\5h\65\2\u00b1"+
		"\u00b2\b\b\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6\u00b7\7:\2\2\u00b7\u00bb"+
		"\7-\2\2\u00b8\u00b9\5h\65\2\u00b9\u00ba\b\b\1\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7."+
		"\2\2\u00be\u00bf\7\63\2\2\u00bf\17\3\2\2\2\u00c0\u00c8\b\t\1\2\u00c1\u00c2"+
		"\7\36\2\2\u00c2\u00c3\5\22\n\2\u00c3\u00c4\b\t\1\2\u00c4\u00c5\7\63\2"+
		"\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00d1\b\n\1\2\u00cc\u00cd\58\35\2\u00cd\u00ce\b\n\1\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5:"+
		"\36\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\b\n\1\2\u00d7\23\3\2\2\2\u00d8"+
		"\u00d9\b\13\1\2\u00d9\u00da\5\26\f\2\u00da\u00e1\b\13\1\2\u00db\u00dc"+
		"\7\64\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\b\13\1\2\u00de\u00e0\3\2\2"+
		"\2\u00df\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\f\1\2\u00e5"+
		"\u00e6\7Z\2\2\u00e6\u00eb\b\f\1\2\u00e7\u00e8\7\66\2\2\u00e8\u00e9\5\30"+
		"\r\2\u00e9\u00ea\b\f\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\b\r"+
		"\1\2\u00ef\u00f4\3\2\2\2\u00f0\u00f1\5@!\2\u00f1\u00f2\b\r\1\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\31\3\2\2\2\u00f5"+
		"\u00f6\b\16\1\2\u00f6\u0102\7/\2\2\u00f7\u00f8\5\30\r\2\u00f8\u00ff\b"+
		"\16\1\2\u00f9\u00fa\7\64\2\2\u00fa\u00fb\5\30\r\2\u00fb\u00fc\b\16\1\2"+
		"\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u00f7\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\60"+
		"\2\2\u0105\33\3\2\2\2\u0106\u010c\b\17\1\2\u0107\u0108\58\35\2\u0108\u0109"+
		"\b\17\1\2\u0109\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010e\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0110\7!\2\2\u0110\u0111\7Z\2\2\u0111\u011d\b\17\1\2\u0112"+
		"\u0113\7#\2\2\u0113\u0114\7Z\2\2\u0114\u011a\b\17\1\2\u0115\u0116\7\64"+
		"\2\2\u0116\u0117\7Z\2\2\u0117\u0119\b\17\1\2\u0118\u0115\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u012c\7/\2\2\u0120\u0121\b\17\1\2\u0121\u0122\7%"+
		"\2\2\u0122\u0123\b\17\1\2\u0123\u0124\3\2\2\2\u0124\u0125\7Z\2\2\u0125"+
		"\u0126\b\17\1\2\u0126\u0127\5(\25\2\u0127\u0128\b\17\1\2\u0128\u0129\7"+
		"\63\2\2\u0129\u012b\3\2\2\2\u012a\u0120\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0130\7\60\2\2\u0130\u0131\b\17\1\2\u0131\35\3\2\2\2\u0132"+
		"\u0138\b\20\1\2\u0133\u0134\58\35\2\u0134\u0135\b\20\1\2\u0135\u0137\3"+
		"\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\""+
		"\2\2\u013c\u013e\b\20\1\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7 \2\2\u0140\u0141\7Z\2\2\u0141\u0145\b\20"+
		"\1\2\u0142\u0143\7#\2\2\u0143\u0144\7Z\2\2\u0144\u0146\b\20\1\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0152\3\2\2\2\u0147\u0148\7$"+
		"\2\2\u0148\u0149\7Z\2\2\u0149\u014f\b\20\1\2\u014a\u014b\7\64\2\2\u014b"+
		"\u014c\7Z\2\2\u014c\u014e\b\20\1\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\7-\2\2\u0155\u0156\7\3\2\2\u0156\u0157\b\20\1\2\u0157"+
		"\u0158\7.\2\2\u0158\u0165\7/\2\2\u0159\u015a\7(\2\2\u015a\u0161\7/\2\2"+
		"\u015b\u015c\5\22\n\2\u015c\u015d\b\20\1\2\u015d\u015e\7\63\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015b\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\7\60\2\2\u0165\u0159\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0173\3"+
		"\2\2\2\u0167\u0168\7\'\2\2\u0168\u016f\7/\2\2\u0169\u016a\5\22\n\2\u016a"+
		"\u016b\b\20\1\2\u016b\u016c\7\63\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3"+
		"\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7\60\2\2\u0173\u0167\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u0180\3\2\2\2\u0175\u0176\5\"\22\2\u0176"+
		"\u0177\b\20\1\2\u0177\u017f\3\2\2\2\u0178\u0179\5$\23\2\u0179\u017a\b"+
		"\20\1\2\u017a\u017f\3\2\2\2\u017b\u017c\5&\24\2\u017c\u017d\b\20\1\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017b\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\60\2\2\u0184\u0185\b"+
		"\20\1\2\u0185\37\3\2\2\2\u0186\u0187\7Z\2\2\u0187\u0188\b\21\1\2\u0188"+
		"\u0189\5(\25\2\u0189\u018e\b\21\1\2\u018a\u018b\5.\30\2\u018b\u018c\b"+
		"\21\1\2\u018c\u018f\3\2\2\2\u018d\u018f\7\63\2\2\u018e\u018a\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f!\3\2\2\2\u0190\u0191\b\22\1\2\u0191\u0192\5 \21\2"+
		"\u0192#\3\2\2\2\u0193\u0196\b\23\1\2\u0194\u0195\7\"\2\2\u0195\u0197\b"+
		"\23\1\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\7%\2\2\u0199\u019a\5 \21\2\u019a%\3\2\2\2\u019b\u019e\b\24\1\2"+
		"\u019c\u019d\7\"\2\2\u019d\u019f\b\24\1\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\5:\36\2\u01a1\u01a2\b\24\1\2"+
		"\u01a2\u01a3\5 \21\2\u01a3\'\3\2\2\2\u01a4\u01a5\b\25\1\2\u01a5\u01a9"+
		"\7-\2\2\u01a6\u01a7\5*\26\2\u01a7\u01a8\b\25\1\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7."+
		"\2\2\u01ac)\3\2\2\2\u01ad\u01ae\b\26\1\2\u01ae\u01af\5,\27\2\u01af\u01b6"+
		"\b\26\1\2\u01b0\u01b1\7\64\2\2\u01b1\u01b2\5,\27\2\u01b2\u01b3\b\26\1"+
		"\2\u01b3\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7+\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\5:\36\2\u01ba\u01bb\7Z\2\2\u01bb\u01bc\b\27\1\2\u01bc-\3\2\2\2"+
		"\u01bd\u01be\b\30\1\2\u01be\u01bf\7/\2\2\u01bf\u01c5\b\30\1\2\u01c0\u01c1"+
		"\5\60\31\2\u01c1\u01c2\b\30\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2"+
		"\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\60\2\2\u01c9\u01ca\b\30\1\2"+
		"\u01ca/\3\2\2\2\u01cb\u01cc\5\22\n\2\u01cc\u01cd\b\31\1\2\u01cd\u01ce"+
		"\7\63\2\2\u01ce\u021b\3\2\2\2\u01cf\u01d0\5.\30\2\u01d0\u01d1\b\31\1\2"+
		"\u01d1\u021b\3\2\2\2\u01d2\u01d3\7\23\2\2\u01d3\u01d4\b\31\1\2\u01d4\u01d5"+
		"\7-\2\2\u01d5\u01d6\5@!\2\u01d6\u01d7\7.\2\2\u01d7\u01d8\5\60\31\2\u01d8"+
		"\u01dd\b\31\1\2\u01d9\u01da\7\20\2\2\u01da\u01db\5\60\31\2\u01db\u01dc"+
		"\b\31\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01de\3\2\2\2"+
		"\u01de\u021b\3\2\2\2\u01df\u01e0\7\35\2\2\u01e0\u01e1\b\31\1\2\u01e1\u01e2"+
		"\7-\2\2\u01e2\u01e3\5@!\2\u01e3\u01e4\7.\2\2\u01e4\u01e5\5\60\31\2\u01e5"+
		"\u01e6\b\31\1\2\u01e6\u021b\3\2\2\2\u01e7\u01e8\7\21\2\2\u01e8\u01e9\b"+
		"\31\1\2\u01e9\u01ed\7-\2\2\u01ea\u01eb\5\62\32\2\u01eb\u01ec\b\31\1\2"+
		"\u01ec\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f3\7\63\2\2\u01f0\u01f1\5@!\2\u01f1\u01f2\b\31\1\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f9\7\63\2\2\u01f6\u01f7\5h\65\2\u01f7\u01f8\b\31\1\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fc\7.\2\2\u01fc\u01fd\5\60\31\2\u01fd\u01fe\b\31\1\2\u01fe"+
		"\u021b\3\2\2\2\u01ff\u0200\7\34\2\2\u0200\u0201\7-\2\2\u0201\u0202\5@"+
		"!\2\u0202\u0203\7.\2\2\u0203\u0204\7/\2\2\u0204\u0205\5\64\33\2\u0205"+
		"\u0206\7\60\2\2\u0206\u0207\b\31\1\2\u0207\u021b\3\2\2\2\u0208\u020a\7"+
		"\33\2\2\u0209\u020b\5@!\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\7\63\2\2\u020d\u021b\b\31\1\2\u020e\u020f\7"+
		"\13\2\2\u020f\u0210\7\63\2\2\u0210\u021b\b\31\1\2\u0211\u0212\7\16\2\2"+
		"\u0212\u0213\7\63\2\2\u0213\u021b\b\31\1\2\u0214\u0215\7\63\2\2\u0215"+
		"\u021b\b\31\1\2\u0216\u0217\5\66\34\2\u0217\u0218\b\31\1\2\u0218\u0219"+
		"\7\63\2\2\u0219\u021b\3\2\2\2\u021a\u01cb\3\2\2\2\u021a\u01cf\3\2\2\2"+
		"\u021a\u01d2\3\2\2\2\u021a\u01df\3\2\2\2\u021a\u01e7\3\2\2\2\u021a\u01ff"+
		"\3\2\2\2\u021a\u0208\3\2\2\2\u021a\u020e\3\2\2\2\u021a\u0211\3\2\2\2\u021a"+
		"\u0214\3\2\2\2\u021a\u0216\3\2\2\2\u021b\61\3\2\2\2\u021c\u021d\5\22\n"+
		"\2\u021d\u021e\b\32\1\2\u021e\u0223\3\2\2\2\u021f\u0220\5h\65\2\u0220"+
		"\u0221\b\32\1\2\u0221\u0223\3\2\2\2\u0222\u021c\3\2\2\2\u0222\u021f\3"+
		"\2\2\2\u0223\63\3\2\2\2\u0224\u0239\b\33\1\2\u0225\u022c\b\33\1\2\u0226"+
		"\u0227\7\f\2\2\u0227\u0228\5@!\2\u0228\u0229\b\33\1\2\u0229\u022d\3\2"+
		"\2\2\u022a\u022b\7\17\2\2\u022b\u022d\b\33\1\2\u022c\u0226\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0234\7:\2\2\u022f\u0230\5\60"+
		"\31\2\u0230\u0231\b\33\1\2\u0231\u0233\3\2\2\2\u0232\u022f\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0225\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\65\3\2\2\2\u023b\u0239\3\2\2"+
		"\2\u023c\u023d\5@!\2\u023d\u023e\b\34\1\2\u023e\67\3\2\2\2\u023f\u0240"+
		"\b\35\1\2\u0240\u0241\7R\2\2\u0241\u0242\7Z\2\2\u0242\u024a\b\35\1\2\u0243"+
		"\u0247\7-\2\2\u0244\u0245\5@!\2\u0245\u0246\b\35\1\2\u0246\u0248\3\2\2"+
		"\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b"+
		"\7.\2\2\u024a\u0243\3\2\2\2\u024a\u024b\3\2\2\2\u024b9\3\2\2\2\u024c\u024d"+
		"\7Z\2\2\u024d\u0251\b\36\1\2\u024e\u024f\5<\37\2\u024f\u0250\b\36\1\2"+
		"\u0250\u0252\3\2\2\2\u0251\u024e\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0256"+
		"\3\2\2\2\u0253\u0254\5> \2\u0254\u0255\b\36\1\2\u0255\u0257\3\2\2\2\u0256"+
		"\u0253\3\2\2\2\u0256\u0257\3\2\2\2\u0257;\3\2\2\2\u0258\u0259\7U\2\2\u0259"+
		"\u025a\b\37\1\2\u025a\u025b\5:\36\2\u025b\u0262\b\37\1\2\u025c\u025d\7"+
		"\64\2\2\u025d\u025e\5:\36\2\u025e\u025f\b\37\1\2\u025f\u0261\3\2\2\2\u0260"+
		"\u025c\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0266\7T\2\2\u0266"+
		"=\3\2\2\2\u0267\u026c\b \1\2\u0268\u0269\7\61\2\2\u0269\u026a\7\3\2\2"+
		"\u026a\u026b\7\62\2\2\u026b\u026d\b \1\2\u026c\u0268\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f?\3\2\2\2\u0270"+
		"\u0271\5D#\2\u0271\u0276\b!\1\2\u0272\u0273\5B\"\2\u0273\u0274\5@!\2\u0274"+
		"\u0275\b!\1\2\u0275\u0277\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277A\3\2\2\2\u0278\u0279\7\66\2\2\u0279\u0291\b\"\1\2\u027a\u027b"+
		"\7I\2\2\u027b\u0291\b\"\1\2\u027c\u027d\7J\2\2\u027d\u0291\b\"\1\2\u027e"+
		"\u027f\7K\2\2\u027f\u0291\b\"\1\2\u0280\u0281\7L\2\2\u0281\u0291\b\"\1"+
		"\2\u0282\u0283\7M\2\2\u0283\u0291\b\"\1\2\u0284\u0285\7N\2\2\u0285\u0291"+
		"\b\"\1\2\u0286\u0287\7O\2\2\u0287\u0291\b\"\1\2\u0288\u0289\7P\2\2\u0289"+
		"\u0291\b\"\1\2\u028a\u028b\7Q\2\2\u028b\u0291\b\"\1\2\u028c\u028d\7W\2"+
		"\2\u028d\u0291\b\"\1\2\u028e\u028f\7Y\2\2\u028f\u0291\b\"\1\2\u0290\u0278"+
		"\3\2\2\2\u0290\u027a\3\2\2\2\u0290\u027c\3\2\2\2\u0290\u027e\3\2\2\2\u0290"+
		"\u0280\3\2\2\2\u0290\u0282\3\2\2\2\u0290\u0284\3\2\2\2\u0290\u0286\3\2"+
		"\2\2\u0290\u0288\3\2\2\2\u0290\u028a\3\2\2\2\u0290\u028c\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291C\3\2\2\2\u0292\u0293\5F$\2\u0293\u029a\b#\1\2\u0294"+
		"\u0295\79\2\2\u0295\u0296\5@!\2\u0296\u0297\7:\2\2\u0297\u0298\5D#\2\u0298"+
		"\u0299\b#\1\2\u0299\u029b\3\2\2\2\u029a\u0294\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029bE\3\2\2\2\u029c\u029d\5H%\2\u029d\u02a4\b$\1\2\u029e\u029f\7"+
		"=\2\2\u029f\u02a0\5H%\2\u02a0\u02a1\b$\1\2\u02a1\u02a3\3\2\2\2\u02a2\u029e"+
		"\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"G\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\5J&\2\u02a8\u02af\b%\1\2\u02a9"+
		"\u02aa\7<\2\2\u02aa\u02ab\5J&\2\u02ab\u02ac\b%\1\2\u02ac\u02ae\3\2\2\2"+
		"\u02ad\u02a9\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0"+
		"\3\2\2\2\u02b0I\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\5L\'\2\u02b3\u02ba"+
		"\b&\1\2\u02b4\u02b5\7F\2\2\u02b5\u02b6\5L\'\2\u02b6\u02b7\b&\1\2\u02b7"+
		"\u02b9\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bbK\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be"+
		"\5N(\2\u02be\u02c5\b\'\1\2\u02bf\u02c0\7G\2\2\u02c0\u02c1\5N(\2\u02c1"+
		"\u02c2\b\'\1\2\u02c2\u02c4\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4\u02c7\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6M\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02c9\5P)\2\u02c9\u02d0\b(\1\2\u02ca\u02cb\7E\2\2\u02cb"+
		"\u02cc\5P)\2\u02cc\u02cd\b(\1\2\u02cd\u02cf\3\2\2\2\u02ce\u02ca\3\2\2"+
		"\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1O"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\5R*\2\u02d4\u02df\b)\1\2\u02d5"+
		"\u02da\b)\1\2\u02d6\u02d7\7;\2\2\u02d7\u02db\b)\1\2\u02d8\u02d9\7S\2\2"+
		"\u02d9\u02db\b)\1\2\u02da\u02d6\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02dd\5R*\2\u02dd\u02de\b)\1\2\u02de\u02e0\3\2\2\2\u02df"+
		"\u02d5\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0Q\3\2\2\2\u02e1\u02e2\5T+\2\u02e2"+
		"\u02e7\b*\1\2\u02e3\u02e4\7\37\2\2\u02e4\u02e5\5:\36\2\u02e5\u02e6\b*"+
		"\1\2\u02e6\u02e8\3\2\2\2\u02e7\u02e3\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"S\3\2\2\2\u02e9\u02ea\5X-\2\u02ea\u02f1\b+\1\2\u02eb\u02ec\5V,\2\u02ec"+
		"\u02ed\5X-\2\u02ed\u02ee\b+\1\2\u02ee\u02f0\3\2\2\2\u02ef\u02eb\3\2\2"+
		"\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2U"+
		"\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7U\2\2\u02f5\u02f6\7\66\2\2\u02f6"+
		"\u02ff\b,\1\2\u02f7\u02f8\7T\2\2\u02f8\u02f9\7\66\2\2\u02f9\u02ff\b,\1"+
		"\2\u02fa\u02fb\7U\2\2\u02fb\u02ff\b,\1\2\u02fc\u02fd\7T\2\2\u02fd\u02ff"+
		"\b,\1\2\u02fe\u02f4\3\2\2\2\u02fe\u02f7\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02ffW\3\2\2\2\u0300\u0301\5\\/\2\u0301\u0308\b-\1\2\u0302"+
		"\u0303\5Z.\2\u0303\u0304\5\\/\2\u0304\u0305\b-\1\2\u0305\u0307\3\2\2\2"+
		"\u0306\u0302\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309Y\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\7U\2\2\u030c\u030d"+
		"\7U\2\2\u030d\u0312\b.\1\2\u030e\u030f\7T\2\2\u030f\u0310\7T\2\2\u0310"+
		"\u0312\b.\1\2\u0311\u030b\3\2\2\2\u0311\u030e\3\2\2\2\u0312[\3\2\2\2\u0313"+
		"\u0314\5^\60\2\u0314\u0321\b/\1\2\u0315\u031a\b/\1\2\u0316\u0317\7A\2"+
		"\2\u0317\u031b\b/\1\2\u0318\u0319\7B\2\2\u0319\u031b\b/\1\2\u031a\u0316"+
		"\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\5^\60\2\u031d"+
		"\u031e\b/\1\2\u031e\u0320\3\2\2\2\u031f\u0315\3\2\2\2\u0320\u0323\3\2"+
		"\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322]\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0324\u0325\5`\61\2\u0325\u0334\b\60\1\2\u0326\u032d\b\60\1\2"+
		"\u0327\u0328\7C\2\2\u0328\u032e\b\60\1\2\u0329\u032a\7D\2\2\u032a\u032e"+
		"\b\60\1\2\u032b\u032c\7H\2\2\u032c\u032e\b\60\1\2\u032d\u0327\3\2\2\2"+
		"\u032d\u0329\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330"+
		"\5`\61\2\u0330\u0331\b\60\1\2\u0331\u0333\3\2\2\2\u0332\u0326\3\2\2\2"+
		"\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335_\3"+
		"\2\2\2\u0336\u0334\3\2\2\2\u0337\u0338\7A\2\2\u0338\u0339\5`\61\2\u0339"+
		"\u033a\b\61\1\2\u033a\u034b\3\2\2\2\u033b\u033c\7B\2\2\u033c\u033d\5`"+
		"\61\2\u033d\u033e\b\61\1\2\u033e\u034b\3\2\2\2\u033f\u0340\7>\2\2\u0340"+
		"\u0341\5`\61\2\u0341\u0342\b\61\1\2\u0342\u034b\3\2\2\2\u0343\u0344\7"+
		"?\2\2\u0344\u0345\5`\61\2\u0345\u0346\b\61\1\2\u0346\u034b\3\2\2\2\u0347"+
		"\u0348\5b\62\2\u0348\u0349\b\61\1\2\u0349\u034b\3\2\2\2\u034a\u0337\3"+
		"\2\2\2\u034a\u033b\3\2\2\2\u034a\u033f\3\2\2\2\u034a\u0343\3\2\2\2\u034a"+
		"\u0347\3\2\2\2\u034ba\3\2\2\2\u034c\u034d\78\2\2\u034d\u034e\5`\61\2\u034e"+
		"\u034f\b\62\1\2\u034f\u038d\3\2\2\2\u0350\u0351\7\67\2\2\u0351\u0352\5"+
		"`\61\2\u0352\u0353\b\62\1\2\u0353\u038d\3\2\2\2\u0354\u0355\5d\63\2\u0355"+
		"\u0356\b\62\1\2\u0356\u037c\3\2\2\2\u0357\u0358\7-\2\2\u0358\u0359\5@"+
		"!\2\u0359\u035a\b\62\1\2\u035a\u035b\7.\2\2\u035b\u037c\3\2\2\2\u035c"+
		"\u035d\5f\64\2\u035d\u035e\b\62\1\2\u035e\u037c\3\2\2\2\u035f\u0360\5"+
		"j\66\2\u0360\u0361\b\62\1\2\u0361\u037c\3\2\2\2\u0362\u0363\79\2\2\u0363"+
		"\u0364\7-\2\2\u0364\u0365\5h\65\2\u0365\u0366\7.\2\2\u0366\u0367\b\62"+
		"\1\2\u0367\u037c\3\2\2\2\u0368\u0369\7\25\2\2\u0369\u036a\5:\36\2\u036a"+
		"\u036b\b\62\1\2\u036b\u036f\7-\2\2\u036c\u036d\5h\65\2\u036d\u036e\b\62"+
		"\1\2\u036e\u0370\3\2\2\2\u036f\u036c\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\7.\2\2\u0372\u0373\7:\2\2\u0373\u0377\7-\2"+
		"\2\u0374\u0375\5h\65\2\u0375\u0376\b\62\1\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0374\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7."+
		"\2\2\u037a\u037c\3\2\2\2\u037b\u0354\3\2\2\2\u037b\u0357\3\2\2\2\u037b"+
		"\u035c\3\2\2\2\u037b\u035f\3\2\2\2\u037b\u0362\3\2\2\2\u037b\u0368\3\2"+
		"\2\2\u037c\u0383\3\2\2\2\u037d\u037e\7\65\2\2\u037e\u037f\5f\64\2\u037f"+
		"\u0380\b\62\1\2\u0380\u0382\3\2\2\2\u0381\u037d\3\2\2\2\u0382\u0385\3"+
		"\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u038a\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0386\u0387\7>\2\2\u0387\u038b\b\62\1\2\u0388\u0389\7?"+
		"\2\2\u0389\u038b\b\62\1\2\u038a\u0386\3\2\2\2\u038a\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u034c\3\2\2\2\u038c\u0350\3\2"+
		"\2\2\u038c\u037b\3\2\2\2\u038dc\3\2\2\2\u038e\u038f\7-\2\2\u038f\u0390"+
		"\5:\36\2\u0390\u0391\7.\2\2\u0391\u0392\5@!\2\u0392\u0393\b\63\1\2\u0393"+
		"e\3\2\2\2\u0394\u0395\7Z\2\2\u0395\u039e\b\64\1\2\u0396\u0397\7-\2\2\u0397"+
		"\u039b\b\64\1\2\u0398\u0399\5h\65\2\u0399\u039a\b\64\1\2\u039a\u039c\3"+
		"\2\2\2\u039b\u0398\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039f\7.\2\2\u039e\u0396\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a7\3\2"+
		"\2\2\u03a0\u03a1\7\61\2\2\u03a1\u03a2\5@!\2\u03a2\u03a3\7\62\2\2\u03a3"+
		"\u03a4\b\64\1\2\u03a4\u03a6\3\2\2\2\u03a5\u03a0\3\2\2\2\u03a6\u03a9\3"+
		"\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8g\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03aa\u03ab\b\65\1\2\u03ab\u03ac\5@!\2\u03ac\u03b3\b\65\1\2\u03ad"+
		"\u03ae\7\64\2\2\u03ae\u03af\5@!\2\u03af\u03b0\b\65\1\2\u03b0\u03b2\3\2"+
		"\2\2\u03b1\u03ad\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4i\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7\3\2\2"+
		"\u03b7\u03c7\b\66\1\2\u03b8\u03b9\7\4\2\2\u03b9\u03c7\b\66\1\2\u03ba\u03bb"+
		"\7\5\2\2\u03bb\u03c7\b\66\1\2\u03bc\u03bd\7\6\2\2\u03bd\u03c7\b\66\1\2"+
		"\u03be\u03bf\7\7\2\2\u03bf\u03c7\b\66\1\2\u03c0\u03c1\7*\2\2\u03c1\u03c7"+
		"\b\66\1\2\u03c2\u03c3\7+\2\2\u03c3\u03c7\b\66\1\2\u03c4\u03c5\7,\2\2\u03c5"+
		"\u03c7\b\66\1\2\u03c6\u03b6\3\2\2\2\u03c6\u03b8\3\2\2\2\u03c6\u03ba\3"+
		"\2\2\2\u03c6\u03bc\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c0\3\2\2\2\u03c6"+
		"\u03c2\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7k\3\2\2\2Upw\u0087\u0093\u0095"+
		"\u00a5\u00b3\u00bb\u00c8\u00d1\u00e1\u00eb\u00f3\u00ff\u0102\u010c\u011a"+
		"\u011d\u012c\u0138\u013d\u0145\u014f\u0152\u0161\u0165\u016f\u0173\u017e"+
		"\u0180\u018e\u0196\u019e\u01a9\u01b6\u01c5\u01dd\u01ed\u01f3\u01f9\u020a"+
		"\u021a\u0222\u022c\u0234\u0239\u0247\u024a\u0251\u0256\u0262\u026e\u0276"+
		"\u0290\u029a\u02a4\u02af\u02ba\u02c5\u02d0\u02da\u02df\u02e7\u02f1\u02fe"+
		"\u0308\u0311\u031a\u0321\u032d\u0334\u034a\u036f\u0377\u037b\u0383\u038a"+
		"\u038c\u039b\u039e\u03a7\u03b3\u03c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}