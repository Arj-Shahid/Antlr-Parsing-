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
		Datatypes=1, Whitespace=2, Keywords=3, Identifiernondigit=4, DIGIT=5, 
		OpenRoundBracket=6, CloseRoundBracket=7, OpenCurlyBracket=8, CloseCurlyBracket=9, 
		Newline=10, Symbols=11, Array=12, Semicolon=13, MultiLineMacro=14, Directive=15, 
		BlockComment=16, LineComment=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Datatypes", "Char", "Bool", "Double", "Float", "Int", "Long", "Unsigned", 
		"Signed", "String", "Whitespace", "Keywords", "Identifiernondigit", "DIGIT", 
		"NONDIGIT", "AlphaNum", "OpenRoundBracket", "CloseRoundBracket", "OpenCurlyBracket", 
		"CloseCurlyBracket", "Newline", "Symbols", "Array", "Semicolon", "MultiLineMacro", 
		"Directive", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0191\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2D\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0080\n\f\r\f\16\f"+
		"\u0081\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n"+
		"\r\3\r\3\r\3\16\3\16\5\16\u00dd\n\16\3\17\6\17\u00e0\n\17\r\17\16\17\u00e1"+
		"\3\17\3\17\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea\13\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\5\26\u0100\n\26\3\26\5\26\u0103\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0154\n\27\3\27\3\27\3\30\3\30\7\30"+
		"\u015a\n\30\f\30\16\30\u015d\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\7\32\u0169\n\32\f\32\16\32\u016c\13\32\3\32\3\32\3\33"+
		"\3\33\7\33\u0172\n\33\f\33\16\33\u0175\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u017d\n\34\f\34\16\34\u0180\13\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\7\35\u018b\n\35\f\35\16\35\u018e\13\35\3\35\3\35"+
		"\5\u015b\u016a\u017e\2\36\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2"+
		"\27\4\31\5\33\6\35\7\37\2!\2#\b%\t\'\n)\13+\f-\r/\16\61\17\63\20\65\21"+
		"\67\229\23\3\2\13\4\2\13\13\"\"\3\2\62;\5\2\62;C\\c|\13\2##\'(,-//\61"+
		"\61??``~~\u0080\u0080\4\2>>@@\4\2<<AA\4\2$$))\3\2\f\f\4\2\f\f\17\17\2"+
		"\u01cd\2\3\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\3C\3\2\2\2\5G\3\2\2\2\7L\3\2\2\2\tQ\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2"+
		"\17b\3\2\2\2\21g\3\2\2\2\23p\3\2\2\2\25w\3\2\2\2\27\177\3\2\2\2\31\u00d6"+
		"\3\2\2\2\33\u00dc\3\2\2\2\35\u00df\3\2\2\2\37\u00e8\3\2\2\2!\u00eb\3\2"+
		"\2\2#\u00ed\3\2\2\2%\u00f1\3\2\2\2\'\u00f5\3\2\2\2)\u00f9\3\2\2\2+\u0102"+
		"\3\2\2\2-\u0153\3\2\2\2/\u0157\3\2\2\2\61\u0162\3\2\2\2\63\u0166\3\2\2"+
		"\2\65\u016f\3\2\2\2\67\u0178\3\2\2\29\u0186\3\2\2\2;D\5\5\3\2<D\5\7\4"+
		"\2=D\5\r\7\2>D\5\17\b\2?D\5\13\6\2@D\5\t\5\2AD\5\21\t\2BD\5\25\13\2C;"+
		"\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2C"+
		"B\3\2\2\2DE\3\2\2\2EF\b\2\2\2F\4\3\2\2\2GH\7e\2\2HI\7j\2\2IJ\7c\2\2JK"+
		"\7t\2\2K\6\3\2\2\2LM\7d\2\2MN\7q\2\2NO\7q\2\2OP\7n\2\2P\b\3\2\2\2QR\7"+
		"f\2\2RS\7q\2\2ST\7w\2\2TU\7d\2\2UV\7n\2\2VW\7g\2\2W\n\3\2\2\2XY\7h\2\2"+
		"YZ\7n\2\2Z[\7q\2\2[\\\7c\2\2\\]\7v\2\2]\f\3\2\2\2^_\7k\2\2_`\7p\2\2`a"+
		"\7v\2\2a\16\3\2\2\2bc\7n\2\2cd\7q\2\2de\7p\2\2ef\7i\2\2f\20\3\2\2\2gh"+
		"\7w\2\2hi\7p\2\2ij\7u\2\2jk\7k\2\2kl\7i\2\2lm\7p\2\2mn\7g\2\2no\7f\2\2"+
		"o\22\3\2\2\2pq\7u\2\2qr\7k\2\2rs\7i\2\2st\7p\2\2tu\7g\2\2uv\7f\2\2v\24"+
		"\3\2\2\2wx\7u\2\2xy\7v\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7i\2\2}\26\3\2"+
		"\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\f\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7p\2\2\u0086\u0087\7g\2\2\u0087\u00d7\7y\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7n\2\2\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2"+
		"\u008c\u00d7\7u\2\2\u008d\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u00d7\7u\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u00d7\7p\2\2"+
		"\u0097\u0098\7k\2\2\u0098\u00d7\7h\2\2\u0099\u009a\7g\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7u\2\2\u009c\u00d7\7g\2\2\u009d\u009e\7y\2\2\u009e"+
		"\u009f\7j\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00d7\7g\2\2"+
		"\u00a2\u00a3\7h\2\2\u00a3\u00a4\7q\2\2\u00a4\u00d7\7t\2\2\u00a5\u00a6"+
		"\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7u\2\2\u00a8\u00d7\7g\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2"+
		"\u00ad\u00d7\7i\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7e\2\2\u00b6\u00d7\7g\2\2\u00b7\u00b8\7u\2\2"+
		"\u00b8\u00b9\7v\2\2\u00b9\u00d7\7f\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00d7\7e\2\2\u00c0\u00c1\7P\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3\7N\2\2"+
		"\u00c3\u00d7\7N\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7w\2\2\u00c7\u00d7\7g\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00d7\7g\2\2\u00cd\u00ce\7e\2\2"+
		"\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d7"+
		"\7v\2\2\u00d2\u00d3\7x\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d7\7f\2\2\u00d6\u0085\3\2\2\2\u00d6\u0088\3\2\2\2\u00d6\u008d\3\2"+
		"\2\2\u00d6\u0091\3\2\2\2\u00d6\u0097\3\2\2\2\u00d6\u0099\3\2\2\2\u00d6"+
		"\u009d\3\2\2\2\u00d6\u00a2\3\2\2\2\u00d6\u00a5\3\2\2\2\u00d6\u00a9\3\2"+
		"\2\2\u00d6\u00ae\3\2\2\2\u00d6\u00b7\3\2\2\2\u00d6\u00ba\3\2\2\2\u00d6"+
		"\u00c0\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00c8\3\2\2\2\u00d6\u00cd\3\2"+
		"\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\r\2\2\u00d9"+
		"\32\3\2\2\2\u00da\u00dd\5\37\20\2\u00db\u00dd\5\31\r\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd\34\3\2\2\2\u00de\u00e0\t\3\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\b\17\2\2\u00e4\36\3\2\2\2\u00e5\u00e7\5!\21"+
		"\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9 \3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\t\4\2\2\u00ec"+
		"\"\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\22\2\2"+
		"\u00f0$\3\2\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\23"+
		"\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\b\24\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7\177\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\25\2\2\u00fc*\3\2\2\2\u00fd\u00ff\7\17\2\2\u00fe\u0100\7\f\2"+
		"\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0103"+
		"\7\f\2\2\u0102\u00fd\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\b\26\2\2\u0105,\3\2\2\2\u0106\u0154\t\5\2\2\u0107\u0108\7p\2\2"+
		"\u0108\u0109\7q\2\2\u0109\u0154\7v\2\2\u010a\u0154\t\6\2\2\u010b\u010c"+
		"\7?\2\2\u010c\u0154\7?\2\2\u010d\u010e\7#\2\2\u010e\u0154\7?\2\2\u010f"+
		"\u0110\7>\2\2\u0110\u0154\7?\2\2\u0111\u0112\7@\2\2\u0112\u0154\7?\2\2"+
		"\u0113\u0114\7(\2\2\u0114\u0154\7(\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0154\7f\2\2\u0118\u0119\7~\2\2\u0119\u0154\7~\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u0154\7t\2\2\u011c\u011d\7-\2\2\u011d\u0154\7-\2\2"+
		"\u011e\u011f\7/\2\2\u011f\u0154\7/\2\2\u0120\u0154\7.\2\2\u0121\u0122"+
		"\7/\2\2\u0122\u0123\7@\2\2\u0123\u0154\7,\2\2\u0124\u0125\7/\2\2\u0125"+
		"\u0154\7@\2\2\u0126\u0127\7*\2\2\u0127\u0154\7+\2\2\u0128\u0129\7]\2\2"+
		"\u0129\u0154\7_\2\2\u012a\u012b\7-\2\2\u012b\u0154\7?\2\2\u012c\u012d"+
		"\7/\2\2\u012d\u0154\7?\2\2\u012e\u012f\7,\2\2\u012f\u0154\7?\2\2\u0130"+
		"\u0131\7\61\2\2\u0131\u0154\7?\2\2\u0132\u0133\7\'\2\2\u0133\u0154\7?"+
		"\2\2\u0134\u0135\7`\2\2\u0135\u0154\7?\2\2\u0136\u0137\7(\2\2\u0137\u0154"+
		"\7?\2\2\u0138\u0139\7~\2\2\u0139\u0154\7?\2\2\u013a\u013b\7>\2\2\u013b"+
		"\u0154\7>\2\2\u013c\u013d\7@\2\2\u013d\u0154\7@\2\2\u013e\u013f\7>\2\2"+
		"\u013f\u0140\7>\2\2\u0140\u0154\7?\2\2\u0141\u0142\7@\2\2\u0142\u0143"+
		"\7@\2\2\u0143\u0154\7?\2\2\u0144\u0154\t\7\2\2\u0145\u0146\7<\2\2\u0146"+
		"\u0154\7<\2\2\u0147\u0154\7\60\2\2\u0148\u0149\7\60\2\2\u0149\u0154\7"+
		",\2\2\u014a\u014b\7\60\2\2\u014b\u014c\7\60\2\2\u014c\u0154\7\60\2\2\u014d"+
		"\u014e\7/\2\2\u014e\u014f\7@\2\2\u014f\u0154\7,\2\2\u0150\u0151\7/\2\2"+
		"\u0151\u0154\7@\2\2\u0152\u0154\t\b\2\2\u0153\u0106\3\2\2\2\u0153\u0107"+
		"\3\2\2\2\u0153\u010a\3\2\2\2\u0153\u010b\3\2\2\2\u0153\u010d\3\2\2\2\u0153"+
		"\u010f\3\2\2\2\u0153\u0111\3\2\2\2\u0153\u0113\3\2\2\2\u0153\u0115\3\2"+
		"\2\2\u0153\u0118\3\2\2\2\u0153\u011a\3\2\2\2\u0153\u011c\3\2\2\2\u0153"+
		"\u011e\3\2\2\2\u0153\u0120\3\2\2\2\u0153\u0121\3\2\2\2\u0153\u0124\3\2"+
		"\2\2\u0153\u0126\3\2\2\2\u0153\u0128\3\2\2\2\u0153\u012a\3\2\2\2\u0153"+
		"\u012c\3\2\2\2\u0153\u012e\3\2\2\2\u0153\u0130\3\2\2\2\u0153\u0132\3\2"+
		"\2\2\u0153\u0134\3\2\2\2\u0153\u0136\3\2\2\2\u0153\u0138\3\2\2\2\u0153"+
		"\u013a\3\2\2\2\u0153\u013c\3\2\2\2\u0153\u013e\3\2\2\2\u0153\u0141\3\2"+
		"\2\2\u0153\u0144\3\2\2\2\u0153\u0145\3\2\2\2\u0153\u0147\3\2\2\2\u0153"+
		"\u0148\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0150\3\2"+
		"\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\27\2\2\u0156"+
		".\3\2\2\2\u0157\u015b\7]\2\2\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015d\3\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7_\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\b\30\2\2\u0161\60\3\2\2\2\u0162\u0163\7=\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0165\b\31\2\2\u0165\62\3\2\2\2\u0166\u016a\7%\2\2\u0167\u0169"+
		"\13\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u016b\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e"+
		"\b\32\2\2\u016e\64\3\2\2\2\u016f\u0173\7%\2\2\u0170\u0172\n\t\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\b\33\2\2\u0177"+
		"\66\3\2\2\2\u0178\u0179\7\61\2\2\u0179\u017a\7,\2\2\u017a\u017e\3\2\2"+
		"\2\u017b\u017d\13\2\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0182\7,\2\2\u0182\u0183\7\61\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\b\34\2\2\u01858\3\2\2\2\u0186\u0187\7\61\2\2\u0187\u0188\7\61\2"+
		"\2\u0188\u018c\3\2\2\2\u0189\u018b\n\n\2\2\u018a\u0189\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\b\35\2\2\u0190:\3\2\2\2\21\2C\u0081\u00d6\u00dc"+
		"\u00e1\u00e8\u00ff\u0102\u0153\u015b\u016a\u0173\u017e\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}