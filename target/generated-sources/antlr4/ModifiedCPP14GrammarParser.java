// Generated from ModifiedCPP14Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModifiedCPP14GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Datatypes=1, Whitespace=2, Keywords=3, Identifiernondigit=4, DIGIT=5, 
		OpenRoundBracket=6, CloseRoundBracket=7, OpenCurlyBracket=8, CloseCurlyBracket=9, 
		Newline=10, Symbols=11, Array=12, Semicolon=13, MultiLineMacro=14, Directive=15, 
		BlockComment=16, LineComment=17;
	public static final int
		RULE_simpleProgram = 0, RULE_identifierdigit = 1;
	public static final String[] ruleNames = {
		"simpleProgram", "identifierdigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'('", "')'", "'{'", "'}'", null, 
		null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Datatypes", "Whitespace", "Keywords", "Identifiernondigit", "DIGIT", 
		"OpenRoundBracket", "CloseRoundBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
		"Newline", "Symbols", "Array", "Semicolon", "MultiLineMacro", "Directive", 
		"BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "ModifiedCPP14Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModifiedCPP14GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SimpleProgramContext extends ParserRuleContext {
		public SimpleProgramContext simpleProgram() {
			return getRuleContext(SimpleProgramContext.class,0);
		}
		public List<TerminalNode> Identifiernondigit() { return getTokens(ModifiedCPP14GrammarParser.Identifiernondigit); }
		public TerminalNode Identifiernondigit(int i) {
			return getToken(ModifiedCPP14GrammarParser.Identifiernondigit, i);
		}
		public TerminalNode EOF() { return getToken(ModifiedCPP14GrammarParser.EOF, 0); }
		public SimpleProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).enterSimpleProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).exitSimpleProgram(this);
		}
	}

	public final SimpleProgramContext simpleProgram() throws RecognitionException {
		SimpleProgramContext _localctx = new SimpleProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleProgram);
		try {
			int _alt;
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifiernondigit:
				enterOuterAlt(_localctx, 1);
				{
				setState(5); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(4);
						match(Identifiernondigit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(7); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(9);
				simpleProgram();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(EOF);
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

	public static class IdentifierdigitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ModifiedCPP14GrammarParser.DIGIT, 0); }
		public IdentifierdigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierdigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).enterIdentifierdigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).exitIdentifierdigit(this);
		}
	}

	public final IdentifierdigitContext identifierdigit() throws RecognitionException {
		IdentifierdigitContext _localctx = new IdentifierdigitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifierdigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\22\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\5\2\16\n\2\3\3\3\3\3\3\2\2\4\2\4"+
		"\2\2\2\21\2\r\3\2\2\2\4\17\3\2\2\2\6\b\7\6\2\2\7\6\3\2\2\2\b\t\3\2\2\2"+
		"\t\7\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\16\5\2\2\2\f\16\7\2\2\3\r\7\3"+
		"\2\2\2\r\f\3\2\2\2\16\3\3\2\2\2\17\20\7\7\2\2\20\5\3\2\2\2\4\t\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}