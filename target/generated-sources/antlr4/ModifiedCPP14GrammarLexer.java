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
		Identifier=1, Comma=2, Whitespace=3, Newline=4, Hashtag=5, Includedirective=6, 
		Datatypes=7, Char=8, Bool=9, Double=10, Float=11, Int=12, Long=13, Braces=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Identifier", "Comma", "Identifiernondigit", "NONDIGIT", "DIGIT", "Whitespace", 
		"Newline", "Hashtag", "Includedirective", "Datatypes", "Char", "Bool", 
		"Double", "Float", "Int", "Long", "Braces"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\4\3\4\3\5\6\5\63\n"+
		"\5\r\5\16\5\64\3\6\6\68\n\6\r\6\16\69\3\7\6\7=\n\7\r\7\16\7>\3\7\3\7\3"+
		"\b\3\b\5\bE\n\b\3\b\5\bH\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13`\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31"+
		"\13\33\f\35\r\37\16!\17#\20\3\2\6\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\5\2"+
		"*+}}\177\177\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3*\3\2\2\2\5"+
		"-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\13\67\3\2\2\2\r<\3\2\2\2\17G\3\2\2\2"+
		"\21K\3\2\2\2\23O\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31h\3\2\2\2\33o\3\2\2"+
		"\2\35x\3\2\2\2\37\u0080\3\2\2\2!\u0086\3\2\2\2#\u008d\3\2\2\2%)\5\25\13"+
		"\2&)\5\7\4\2\')\5\13\6\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3"+
		"\2\2\2*+\3\2\2\2+\4\3\2\2\2,*\3\2\2\2-.\7.\2\2.\6\3\2\2\2/\60\5\t\5\2"+
		"\60\b\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\n\3\2\2\2\668\t\3\2\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:\f\3\2\2\2;=\t\4\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?"+
		"\3\2\2\2?@\3\2\2\2@A\b\7\2\2A\16\3\2\2\2BD\7\17\2\2CE\7\f\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EH\3\2\2\2FH\7\f\2\2GB\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\b\b\2"+
		"\2J\20\3\2\2\2KL\7%\2\2LM\3\2\2\2MN\b\t\2\2N\22\3\2\2\2OP\7k\2\2PQ\7p"+
		"\2\2QR\7e\2\2RS\7n\2\2ST\7w\2\2TU\7f\2\2UV\7g\2\2VW\3\2\2\2WX\b\n\2\2"+
		"X\24\3\2\2\2Y`\5\27\f\2Z`\5\31\r\2[`\5\37\20\2\\`\5!\21\2]`\5\35\17\2"+
		"^`\5\33\16\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2"+
		"\2\2`\26\3\2\2\2ab\7e\2\2bc\7j\2\2cd\7c\2\2de\7t\2\2ef\3\2\2\2fg\b\f\2"+
		"\2g\30\3\2\2\2hi\7d\2\2ij\7q\2\2jk\7q\2\2kl\7n\2\2lm\3\2\2\2mn\b\r\2\2"+
		"n\32\3\2\2\2op\7f\2\2pq\7q\2\2qr\7w\2\2rs\7d\2\2st\7n\2\2tu\7g\2\2uv\3"+
		"\2\2\2vw\b\16\2\2w\34\3\2\2\2xy\7h\2\2yz\7n\2\2z{\7q\2\2{|\7c\2\2|}\7"+
		"v\2\2}~\3\2\2\2~\177\b\17\2\2\177\36\3\2\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\20"+
		"\2\2\u0085 \3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7i\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\21\2\2\u008c"+
		"\"\3\2\2\2\u008d\u008e\t\5\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\22\2"+
		"\2\u0090$\3\2\2\2\13\2(*\649>DG_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}