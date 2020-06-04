// Generated from ModifiedCPP14Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModifiedCPP14GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Datatypes=1, Whitespace=2, Keywords=3, Identifiernondigit=4, OpenRoundBracket=5, 
		CloseRoundBracket=6, OpenCurlyBracket=7, CloseCurlyBracket=8, Newline=9, 
		Symbols=10, Semicolon=11, MultiLineMacro=12, Directive=13, BlockComment=14, 
		LineComment=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Datatypes", "Char", "Bool", "Double", "Float", "Int", "Long", "Whitespace", 
		"Keywords", "Identifiernondigit", "DIGIT", "NONDIGIT", "OpenRoundBracket", 
		"CloseRoundBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Newline", 
		"Symbols", "Semicolon", "MultiLineMacro", "Directive", "BlockComment", 
		"LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'('", "')'", "'{'", "'}'", null, null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Datatypes", "Whitespace", "Keywords", "Identifiernondigit", "OpenRoundBracket", 
		"CloseRoundBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Newline", 
		"Symbols", "Semicolon", "MultiLineMacro", "Directive", "BlockComment", 
		"LineComment"
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


	public ModifiedCPP14GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ModifiedCPP14Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t]\n\t\r\t\16\t^\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n"+
		"\3\n\3\n\3\13\3\13\5\13{\n\13\3\f\6\f~\n\f\r\f\16\f\177\3\f\3\f\3\r\6"+
		"\r\u0085\n\r\r\r\16\r\u0086\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u009b\n\22\3\22"+
		"\5\22\u009e\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\7\25\u00ac\n\25\f\25\16\25\u00af\13\25\3\25\3\25\3\26\3\26\7\26"+
		"\u00b5\n\26\f\26\16\26\u00b8\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00c0\n\27\f\27\16\27\u00c3\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00ce\n\30\f\30\16\30\u00d1\13\30\3\30\3\30\4\u00ad\u00c1"+
		"\2\31\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27\2\31\2\33\7\35\b"+
		"\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\3\2\b\4\2\13\13\"\"\3\2\62;\5\2C\\"+
		"aac|\7\2((,/<<?@\u0080\u0080\3\2\f\f\4\2\f\f\17\17\2\u00dd\2\3\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\67\3\2\2\2\5;\3\2\2\2\7@\3\2\2\2\tE\3\2"+
		"\2\2\13L\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21\\\3\2\2\2\23t\3\2\2\2\25z\3"+
		"\2\2\2\27}\3\2\2\2\31\u0084\3\2\2\2\33\u0088\3\2\2\2\35\u008c\3\2\2\2"+
		"\37\u0090\3\2\2\2!\u0094\3\2\2\2#\u009d\3\2\2\2%\u00a1\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a9\3\2\2\2+\u00b2\3\2\2\2-\u00bb\3\2\2\2/\u00c9\3\2\2\2\61"+
		"8\5\5\3\2\628\5\7\4\2\638\5\r\7\2\648\5\17\b\2\658\5\13\6\2\668\5\t\5"+
		"\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\289\3\2\2\29:\b\2\2\2:\4\3\2\2\2;<\7e\2\2<=\7j\2\2=>\7"+
		"c\2\2>?\7t\2\2?\6\3\2\2\2@A\7d\2\2AB\7q\2\2BC\7q\2\2CD\7n\2\2D\b\3\2\2"+
		"\2EF\7f\2\2FG\7q\2\2GH\7w\2\2HI\7d\2\2IJ\7n\2\2JK\7g\2\2K\n\3\2\2\2LM"+
		"\7h\2\2MN\7n\2\2NO\7q\2\2OP\7c\2\2PQ\7v\2\2Q\f\3\2\2\2RS\7k\2\2ST\7p\2"+
		"\2TU\7v\2\2U\16\3\2\2\2VW\7n\2\2WX\7q\2\2XY\7p\2\2YZ\7i\2\2Z\20\3\2\2"+
		"\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\t"+
		"\2\2a\22\3\2\2\2bc\7p\2\2cd\7g\2\2du\7y\2\2ef\7e\2\2fg\7n\2\2gh\7c\2\2"+
		"hi\7u\2\2iu\7u\2\2jk\7v\2\2kl\7j\2\2lm\7k\2\2mu\7u\2\2no\7t\2\2op\7g\2"+
		"\2pq\7v\2\2qr\7w\2\2rs\7t\2\2su\7p\2\2tb\3\2\2\2te\3\2\2\2tj\3\2\2\2t"+
		"n\3\2\2\2uv\3\2\2\2vw\b\n\2\2w\24\3\2\2\2x{\5\23\n\2y{\5\31\r\2zx\3\2"+
		"\2\2zy\3\2\2\2{\26\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\f\2\2\u0082\30"+
		"\3\2\2\2\u0083\u0085\t\4\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\32\3\2\2\2\u0088\u0089\7*\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008b\b\16\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7+\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\17\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7}\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\20\2\2\u0093 \3\2\2\2"+
		"\u0094\u0095\7\177\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\21\2\2\u0097"+
		"\"\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u009b\7\f\2\2\u009a\u0099\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009e\7\f\2\2\u009d\u0098"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\22\2\2"+
		"\u00a0$\3\2\2\2\u00a1\u00a2\t\5\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b"+
		"\23\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\24\2\2\u00a8(\3\2\2\2\u00a9\u00ad\7%\2\2\u00aa\u00ac\13\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\25\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b6\7%\2\2\u00b3\u00b5\n\6\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\26\2\2\u00ba,\3\2\2\2\u00bb\u00bc"+
		"\7\61\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\13\2\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5"+
		"\u00c6\7\61\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\27\2\2\u00c8.\3\2\2"+
		"\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cf\3\2\2\2\u00cc"+
		"\u00ce\n\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\b\30\2\2\u00d3\60\3\2\2\2\17\2\67^tz\177\u0086\u009a\u009d\u00ad"+
		"\u00b6\u00c1\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}