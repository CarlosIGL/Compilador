// Generated from C:/Users/ACER/Desktop/Carpetas/Escuela/Lenguajes y automatas II/Compilador/gramatica\Saludos.g4 by ANTLR 4.9.1
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
		TIPO_ENTERO=1, PRINT=2, COMILLA=3, STRING=4, AIDI=5, CA=6, CC=7, PYC=8, 
		SALTO=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO_ENTERO", "PRINT", "COMILLA", "STRING", "ESC", "AIDI", "CA", "CC", 
			"PYC", "SALTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entero'", "'imprime'", "'''", null, null, "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO_ENTERO", "PRINT", "COMILLA", "STRING", "AIDI", "CA", "CC", 
			"PYC", "SALTO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13D\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\5\3\5\3\6\3\6\3\6\3\7\6\7\67"+
		"\n\7\r\7\16\78\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3-\2\f\3\3"+
		"\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\3\2\5\b\2$$^^ddppttvv\4\2C"+
		"\\c|\5\2\13\f\17\17\"\"\2E\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3"+
		"\27\3\2\2\2\5\36\3\2\2\2\7&\3\2\2\2\t(\3\2\2\2\13\62\3\2\2\2\r\66\3\2"+
		"\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27\30\7g\2\2\30\31"+
		"\7p\2\2\31\32\7v\2\2\32\33\7g\2\2\33\34\7t\2\2\34\35\7q\2\2\35\4\3\2\2"+
		"\2\36\37\7k\2\2\37 \7o\2\2 !\7r\2\2!\"\7t\2\2\"#\7k\2\2#$\7o\2\2$%\7g"+
		"\2\2%\6\3\2\2\2&\'\7)\2\2\'\b\3\2\2\2(-\7$\2\2),\5\13\6\2*,\13\2\2\2+"+
		")\3\2\2\2+*\3\2\2\2,/\3\2\2\2-.\3\2\2\2-+\3\2\2\2.\60\3\2\2\2/-\3\2\2"+
		"\2\60\61\7$\2\2\61\n\3\2\2\2\62\63\7^\2\2\63\64\t\2\2\2\64\f\3\2\2\2\65"+
		"\67\t\3\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\16\3\2\2"+
		"\2:;\7]\2\2;\20\3\2\2\2<=\7_\2\2=\22\3\2\2\2>?\7=\2\2?\24\3\2\2\2@A\t"+
		"\4\2\2AB\3\2\2\2BC\b\13\2\2C\26\3\2\2\2\6\2+-8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}