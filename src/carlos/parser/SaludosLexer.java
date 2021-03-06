// Generated from Saludos.g4 by ANTLR 4.9.1
package carlos.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SaludosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CommentLine=1, CommentSection=2, CA=3, CC=4, PAR_A=5, PAR_C=6, COMILLA=7, 
		IG=8, POR=9, DIV=10, MAS=11, MENOS=12, MAYI=13, MENI=14, DI=15, MAY=16, 
		MEN=17, OR=18, AND=19, TIPO=20, TIPO_ENTERO=21, TIPO_FLOTANTE=22, PRINT=23, 
		SI=24, SINO=25, MIENTRAS=26, TRUE=27, FALSE=28, STRING=29, CLASE=30, AIDI=31, 
		INT=32, PYC=33, SALTO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CommentLine", "CommentSection", "CA", "CC", "PAR_A", "PAR_C", "COMILLA", 
			"IG", "POR", "DIV", "MAS", "MENOS", "MAYI", "MENI", "DI", "MAY", "MEN", 
			"OR", "AND", "TIPO", "TIPO_ENTERO", "TIPO_FLOTANTE", "PRINT", "SI", "SINO", 
			"MIENTRAS", "TRUE", "FALSE", "STRING", "ESC", "CLASE", "AIDI", "INT", 
			"PYC", "SALTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", "'''", "'='", "'*'", "'/'", 
			"'+'", "'-'", "'>='", "'<='", "'!='", "'>'", "'<'", "'O'", "'Y'", null, 
			"'entero'", "'flotante'", "'imprime'", "'SI'", "'SINO'", "'mientras'", 
			"'TRUE'", "'FALSE'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CommentLine", "CommentSection", "CA", "CC", "PAR_A", "PAR_C", 
			"COMILLA", "IG", "POR", "DIV", "MAS", "MENOS", "MAYI", "MENI", "DI", 
			"MAY", "MEN", "OR", "AND", "TIPO", "TIPO_ENTERO", "TIPO_FLOTANTE", "PRINT", 
			"SI", "SINO", "MIENTRAS", "TRUE", "FALSE", "STRING", "CLASE", "AIDI", 
			"INT", "PYC", "SALTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SaludosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Saludos.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\5\25\u0089\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00c2\n\36\f\36\16\36\u00c5\13"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \6 \u00ce\n \r \16 \u00cf\3!\6!\u00d3"+
		"\n!\r!\16!\u00d4\3\"\6\"\u00d8\n\"\r\"\16\"\u00d9\3\"\6\"\u00dd\n\"\r"+
		"\"\16\"\u00de\3\"\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4\3\"\3\"\6\"\u00e9\n"+
		"\"\r\"\16\"\u00ea\5\"\u00ed\n\"\3#\3#\3$\3$\3$\3$\4X\u00c3\2%\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2? A!C"+
		"\"E#G$\3\2\t\4\2\13\f\17\17\b\2$$^^ddppttvv\3\2C\\\3\2c|\4\2C\\c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5R\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13"+
		"e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27"+
		"q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37{\3\2\2\2!~\3\2\2\2#\u0080"+
		"\3\2\2\2%\u0082\3\2\2\2\'\u0084\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2"+
		"-\u0091\3\2\2\2/\u009a\3\2\2\2\61\u00a2\3\2\2\2\63\u00a5\3\2\2\2\65\u00aa"+
		"\3\2\2\2\67\u00b3\3\2\2\29\u00b8\3\2\2\2;\u00be\3\2\2\2=\u00c8\3\2\2\2"+
		"?\u00cb\3\2\2\2A\u00d2\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3"+
		"\2\2\2IM\7%\2\2JL\n\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OM\3\2\2\2PQ\b\2\2\2Q\4\3\2\2\2RS\7&\2\2ST\7&\2\2TX\7&\2\2UW\13"+
		"\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\"+
		"\7%\2\2\\]\7%\2\2]^\7%\2\2^_\3\2\2\2_`\b\3\2\2`\6\3\2\2\2ab\7]\2\2b\b"+
		"\3\2\2\2cd\7_\2\2d\n\3\2\2\2ef\7*\2\2f\f\3\2\2\2gh\7+\2\2h\16\3\2\2\2"+
		"ij\7)\2\2j\20\3\2\2\2kl\7?\2\2l\22\3\2\2\2mn\7,\2\2n\24\3\2\2\2op\7\61"+
		"\2\2p\26\3\2\2\2qr\7-\2\2r\30\3\2\2\2st\7/\2\2t\32\3\2\2\2uv\7@\2\2vw"+
		"\7?\2\2w\34\3\2\2\2xy\7>\2\2yz\7?\2\2z\36\3\2\2\2{|\7#\2\2|}\7?\2\2} "+
		"\3\2\2\2~\177\7@\2\2\177\"\3\2\2\2\u0080\u0081\7>\2\2\u0081$\3\2\2\2\u0082"+
		"\u0083\7Q\2\2\u0083&\3\2\2\2\u0084\u0085\7[\2\2\u0085(\3\2\2\2\u0086\u0089"+
		"\5+\26\2\u0087\u0089\5-\27\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"*\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090,\3\2\2\2\u0091"+
		"\u0092\7h\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094\u0095\7v\2\2"+
		"\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099"+
		"\7g\2\2\u0099.\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d"+
		"\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7o\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7K\2\2\u00a4"+
		"\62\3\2\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7P\2\2\u00a8"+
		"\u00a9\7Q\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2"+
		"\u00b0\u00b1\7c\2\2\u00b1\u00b2\7u\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7"+
		"V\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7\7G\2\2\u00b78"+
		"\3\2\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7N\2\2\u00bb"+
		"\u00bc\7U\2\2\u00bc\u00bd\7G\2\2\u00bd:\3\2\2\2\u00be\u00c3\7$\2\2\u00bf"+
		"\u00c2\5=\37\2\u00c0\u00c2\13\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7<\3\2\2\2\u00c8"+
		"\u00c9\7^\2\2\u00c9\u00ca\t\3\2\2\u00ca>\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc"+
		"\u00ce\t\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0@\3\2\2\2\u00d1\u00d3\t\6\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"B\3\2\2\2\u00d6\u00d8\t\7\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00ed\3\2\2\2\u00db\u00dd"+
		"\t\7\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\7\60\2\2\u00e1\u00e3\t"+
		"\7\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ed\3\2\2\2\u00e6\u00e8\7\60\2\2\u00e7\u00e9\t"+
		"\7\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00d7\3\2\2\2\u00ec\u00dc\3\2"+
		"\2\2\u00ec\u00e6\3\2\2\2\u00edD\3\2\2\2\u00ee\u00ef\7=\2\2\u00efF\3\2"+
		"\2\2\u00f0\u00f1\t\b\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b$\2\2\u00f3"+
		"H\3\2\2\2\17\2MX\u0088\u00c1\u00c3\u00cf\u00d4\u00d9\u00de\u00e4\u00ea"+
		"\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}