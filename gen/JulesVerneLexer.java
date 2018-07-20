// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JulesVerneLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IF=19, ELSE=20, OBRACE=21, CBRACE=22, TRUE=23, FALSE=24, COMMENT=25, 
		LINE_COMMENT=26, ID=27, CYRILLIC=28, FLOAT=29, NUMBER=30, Space=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "IF", "ELSE", "OBRACE", "CBRACE", "TRUE", "FALSE", "COMMENT", 
		"LINE_COMMENT", "ID", "CYRILLIC", "FLOAT", "NUMBER", "Space", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'let'", "'='", "'print'", "'+'", "'to'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'\"'", "'\n'", "'func'", "'('", 
		"')'", "'is'", "'if'", "'else'", "'{'", "'}'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "IF", "ELSE", "OBRACE", "CBRACE", 
		"TRUE", "FALSE", "COMMENT", "LINE_COMMENT", "ID", "CYRILLIC", "FLOAT", 
		"NUMBER", "Space", "WS"
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


	public JulesVerneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JulesVerne.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u009c\n\32\f\32"+
		"\16\32\u009f\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00aa"+
		"\n\33\f\33\16\33\u00ad\13\33\3\33\3\33\3\34\6\34\u00b2\n\34\r\34\16\34"+
		"\u00b3\3\35\3\35\3\36\6\36\u00b9\n\36\r\36\16\36\u00ba\3\36\3\36\7\36"+
		"\u00bf\n\36\f\36\16\36\u00c2\13\36\3\36\3\36\6\36\u00c6\n\36\r\36\16\36"+
		"\u00c7\5\36\u00ca\n\36\3\37\6\37\u00cd\n\37\r\37\16\37\u00ce\3 \3 \3 "+
		"\3 \3!\6!\u00d6\n!\r!\16!\u00d7\3!\3!\3\u009d\2\"\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\4\2\f\f"+
		"\17\17\4\2C\\c|\3\2\62;\5\2\13\f\16\17\"\"\5\2\13\f\17\17\"\"\2\u00e3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5Q\3\2\2\2\7U\3\2\2"+
		"\2\tW\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2\2"+
		"\2\25h\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37t\3\2"+
		"\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0083\3\2\2\2+\u0088"+
		"\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u0091\3\2\2\2\63\u0097\3\2\2"+
		"\2\65\u00a5\3\2\2\2\67\u00b1\3\2\2\29\u00b5\3\2\2\2;\u00c9\3\2\2\2=\u00cc"+
		"\3\2\2\2?\u00d0\3\2\2\2A\u00d5\3\2\2\2CD\7h\2\2DE\7w\2\2EF\7p\2\2FG\7"+
		"e\2\2GH\7\"\2\2HI\7o\2\2IJ\7c\2\2JK\7k\2\2KL\7p\2\2LM\7*\2\2MN\7+\2\2"+
		"NO\7\"\2\2OP\7}\2\2P\4\3\2\2\2QR\7n\2\2RS\7g\2\2ST\7v\2\2T\6\3\2\2\2U"+
		"V\7?\2\2V\b\3\2\2\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\n"+
		"\3\2\2\2]^\7-\2\2^\f\3\2\2\2_`\7v\2\2`a\7q\2\2a\16\3\2\2\2bc\7/\2\2c\20"+
		"\3\2\2\2de\7,\2\2e\22\3\2\2\2fg\7\61\2\2g\24\3\2\2\2hi\7\'\2\2i\26\3\2"+
		"\2\2jk\7-\2\2kl\7-\2\2l\30\3\2\2\2mn\7/\2\2no\7/\2\2o\32\3\2\2\2pq\7$"+
		"\2\2q\34\3\2\2\2rs\7\f\2\2s\36\3\2\2\2tu\7h\2\2uv\7w\2\2vw\7p\2\2wx\7"+
		"e\2\2x \3\2\2\2yz\7*\2\2z\"\3\2\2\2{|\7+\2\2|$\3\2\2\2}~\7k\2\2~\177\7"+
		"u\2\2\177&\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082(\3\2\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7g\2\2\u0087*\3\2\2\2\u0088\u0089\7}\2\2\u0089,\3\2\2\2\u008a\u008b\7"+
		"\177\2\2\u008b.\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7w\2\2\u008f\u0090\7g\2\2\u0090\60\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096"+
		"\62\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7,\2\2\u0099\u009d\3\2\2"+
		"\2\u009a\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\32\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7\61"+
		"\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\33\2\2\u00af\66\3\2\2\2\u00b0\u00b2"+
		"\t\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b48\3\2\2\2\u00b5\u00b6\4\u0402\u0501\2\u00b6:\3\2\2"+
		"\2\u00b7\u00b9\t\4\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\7\60\2\2"+
		"\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00ca\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c5\7\60\2\2\u00c4\u00c6\t\4\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00b8\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca<\3\2\2\2\u00cb\u00cd\t\4\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf>\3\2\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\b \2\2\u00d3@\3\2\2\2\u00d4\u00d6\t\6\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\b!\3\2\u00daB\3\2\2\2\f\2\u009d\u00ab\u00b3\u00ba\u00c0"+
		"\u00c7\u00c9\u00ce\u00d7\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}