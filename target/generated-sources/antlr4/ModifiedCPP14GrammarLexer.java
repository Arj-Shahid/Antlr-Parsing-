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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00e6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t]\n\t\r\t\16\t^\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0087"+
		"\n\n\3\n\3\n\3\13\3\13\5\13\u008d\n\13\3\f\6\f\u0090\n\f\r\f\16\f\u0091"+
		"\3\f\3\f\3\r\6\r\u0097\n\r\r\r\16\r\u0098\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00ad"+
		"\n\22\3\22\5\22\u00b0\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\7\25\u00be\n\25\f\25\16\25\u00c1\13\25\3\25\3\25\3\26"+
		"\3\26\7\26\u00c7\n\26\f\26\16\26\u00ca\13\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\7\27\u00d2\n\27\f\27\16\27\u00d5\13\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\7\30\u00e0\n\30\f\30\16\30\u00e3\13\30\3\30\3\30"+
		"\4\u00bf\u00d3\2\31\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27\2"+
		"\31\2\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\3\2\b\4\2\13\13\"\""+
		"\3\2\62;\5\2C\\aac|\7\2((,/<<?@\u0080\u0080\3\2\f\f\4\2\f\f\17\17\2\u00f4"+
		"\2\3\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\67\3\2\2\2\5;\3\2\2\2\7@\3"+
		"\2\2\2\tE\3\2\2\2\13L\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21\\\3\2\2\2\23\u0086"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u008f\3\2\2\2\31\u0096\3\2\2\2\33\u009a\3"+
		"\2\2\2\35\u009e\3\2\2\2\37\u00a2\3\2\2\2!\u00a6\3\2\2\2#\u00af\3\2\2\2"+
		"%\u00b3\3\2\2\2\'\u00b7\3\2\2\2)\u00bb\3\2\2\2+\u00c4\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00db\3\2\2\2\618\5\5\3\2\628\5\7\4\2\638\5\r\7\2\648\5\17\b\2"+
		"\658\5\13\6\2\668\5\t\5\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67"+
		"\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\b\2\2\2:\4\3\2\2\2"+
		";<\7e\2\2<=\7j\2\2=>\7c\2\2>?\7t\2\2?\6\3\2\2\2@A\7d\2\2AB\7q\2\2BC\7"+
		"q\2\2CD\7n\2\2D\b\3\2\2\2EF\7f\2\2FG\7q\2\2GH\7w\2\2HI\7d\2\2IJ\7n\2\2"+
		"JK\7g\2\2K\n\3\2\2\2LM\7h\2\2MN\7n\2\2NO\7q\2\2OP\7c\2\2PQ\7v\2\2Q\f\3"+
		"\2\2\2RS\7k\2\2ST\7p\2\2TU\7v\2\2U\16\3\2\2\2VW\7n\2\2WX\7q\2\2XY\7p\2"+
		"\2YZ\7i\2\2Z\20\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\b\t\2\2a\22\3\2\2\2bc\7p\2\2cd\7g\2\2d\u0087\7y\2\2"+
		"ef\7e\2\2fg\7n\2\2gh\7c\2\2hi\7u\2\2i\u0087\7u\2\2jk\7v\2\2kl\7j\2\2l"+
		"m\7k\2\2m\u0087\7u\2\2no\7t\2\2op\7g\2\2pq\7v\2\2qr\7w\2\2rs\7t\2\2s\u0087"+
		"\7p\2\2tu\7k\2\2u\u0087\7h\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2y\u0087\7g\2"+
		"\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\u0087\7g\2\2\177\u0080\7h\2\2"+
		"\u0080\u0081\7q\2\2\u0081\u0087\7t\2\2\u0082\u0083\7e\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086b\3\2\2\2\u0086e\3"+
		"\2\2\2\u0086j\3\2\2\2\u0086n\3\2\2\2\u0086t\3\2\2\2\u0086v\3\2\2\2\u0086"+
		"z\3\2\2\2\u0086\177\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\n\2\2\u0089\24\3\2\2\2\u008a\u008d\5\23\n\2\u008b\u008d\5\31"+
		"\r\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\26\3\2\2\2\u008e\u0090"+
		"\t\3\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\f\2\2\u0094\30\3\2\2"+
		"\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\32\3\2\2\2\u009a\u009b\7*\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\b\16\2\2\u009d\34\3\2\2\2\u009e\u009f\7+\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\17\2\2\u00a1\36\3\2\2\2\u00a2\u00a3"+
		"\7}\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\20\2\2\u00a5 \3\2\2\2\u00a6"+
		"\u00a7\7\177\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\21\2\2\u00a9\"\3\2"+
		"\2\2\u00aa\u00ac\7\17\2\2\u00ab\u00ad\7\f\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\7\f\2\2\u00af\u00aa\3\2"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\22\2\2\u00b2"+
		"$\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\23\2\2"+
		"\u00b6&\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\24"+
		"\2\2\u00ba(\3\2\2\2\u00bb\u00bf\7%\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\25\2\2\u00c3*\3\2\2\2"+
		"\u00c4\u00c8\7%\2\2\u00c5\u00c7\n\6\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\b\26\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7\61\2"+
		"\2\u00ce\u00cf\7,\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\13\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7\61"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\27\2\2\u00da.\3\2\2\2\u00db\u00dc"+
		"\7\61\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0\n\7\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\30\2\2"+
		"\u00e5\60\3\2\2\2\17\2\67^\u0086\u008c\u0091\u0098\u00ac\u00af\u00bf\u00c8"+
		"\u00d3\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}