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
		Identifier=1, Comma=2, Whitespace=3, Newline=4, Hashtag=5, Includedirective=6, 
		Datatypes=7, Char=8, Bool=9, Double=10, Float=11, Int=12, Long=13, Braces=14;
	public static final int
		RULE_identifierNames = 0;
	public static final String[] ruleNames = {
		"identifierNames"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", null, null, "'#'", "'include'", null, "'char'", "'bool'", 
		"'double'", "'float'", "'int'", "'long'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Identifier", "Comma", "Whitespace", "Newline", "Hashtag", "Includedirective", 
		"Datatypes", "Char", "Bool", "Double", "Float", "Int", "Long", "Braces"
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
	public static class IdentifierNamesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ModifiedCPP14GrammarParser.Identifier, 0); }
		public IdentifierNamesContext identifierNames() {
			return getRuleContext(IdentifierNamesContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ModifiedCPP14GrammarParser.Comma, 0); }
		public IdentifierNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).enterIdentifierNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModifiedCPP14GrammarListener ) ((ModifiedCPP14GrammarListener)listener).exitIdentifierNames(this);
		}
	}

	public final IdentifierNamesContext identifierNames() throws RecognitionException {
		return identifierNames(0);
	}

	private IdentifierNamesContext identifierNames(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierNamesContext _localctx = new IdentifierNamesContext(_ctx, _parentState);
		IdentifierNamesContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_identifierNames, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(10);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierNamesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierNames);
					setState(5);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(6);
					match(Comma);
					setState(7);
					match(Identifier);
					}
					} 
				}
				setState(12);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return identifierNames_sempred((IdentifierNamesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean identifierNames_sempred(IdentifierNamesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\20\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\2\3\2\3\2\2\2\2\17"+
		"\2\4\3\2\2\2\4\5\b\2\1\2\5\6\7\3\2\2\6\f\3\2\2\2\7\b\f\3\2\2\b\t\7\4\2"+
		"\2\t\13\7\3\2\2\n\7\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\3"+
		"\3\2\2\2\16\f\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}