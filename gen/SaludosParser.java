// Generated from C:/Users/ACER/Desktop/Carpetas/Escuela/Lenguajes y automatas II/Compilador/gramatica\Saludos.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SaludosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO_ENTERO=1, PRINT=2, COMILLA=3, STRING=4, AIDI=5, CA=6, CC=7, PYC=8, 
		SALTO=9;
	public static final int
		RULE_superimprimir = 0, RULE_imprimir = 1, RULE_instrucciones = 2, RULE_impresion = 3, 
		RULE_declarar = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"superimprimir", "imprimir", "instrucciones", "impresion", "declarar"
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

	@Override
	public String getGrammarFileName() { return "Saludos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SaludosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SuperimprimirContext extends ParserRuleContext {
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public SuperimprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superimprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).enterSuperimprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).exitSuperimprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitSuperimprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperimprimirContext superimprimir() throws RecognitionException {
		SuperimprimirContext _localctx = new SuperimprimirContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_superimprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				imprimir();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMILLA );
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

	public static class ImprimirContext extends ParserRuleContext {
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	 
		public ImprimirContext() { }
		public void copyFrom(ImprimirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompilaContext extends ImprimirContext {
		public List<TerminalNode> COMILLA() { return getTokens(SaludosParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(SaludosParser.COMILLA, i);
		}
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public TerminalNode CA() { return getToken(SaludosParser.CA, 0); }
		public TerminalNode CC() { return getToken(SaludosParser.CC, 0); }
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public CompilaContext(ImprimirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).enterCompila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).exitCompila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCompila(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imprimir);
		try {
			int _alt;
			_localctx = new CompilaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(COMILLA);
			setState(16);
			match(AIDI);
			setState(17);
			match(COMILLA);
			setState(18);
			match(CA);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(19);
					instrucciones();
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(25);
			match(CC);
			setState(26);
			match(PYC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				impresion();
				}
				break;
			case TIPO_ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				declarar();
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

	public static class ImpresionContext extends ParserRuleContext {
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	 
		public ImpresionContext() { }
		public void copyFrom(ImpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimeContext extends ImpresionContext {
		public TerminalNode PRINT() { return getToken(SaludosParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(SaludosParser.STRING, 0); }
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public ImprimeContext(ImpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).exitImprime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitImprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_impresion);
		try {
			_localctx = new ImprimeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PRINT);
			setState(33);
			match(STRING);
			setState(34);
			match(PYC);
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

	public static class DeclararContext extends ParserRuleContext {
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
	 
		public DeclararContext() { }
		public void copyFrom(DeclararContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends DeclararContext {
		public TerminalNode TIPO_ENTERO() { return getToken(SaludosParser.TIPO_ENTERO, 0); }
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public VariableContext(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SaludosListener ) ((SaludosListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarar);
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TIPO_ENTERO);
			setState(37);
			match(AIDI);
			setState(38);
			match(PYC);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\4\3\4\5\4!\n\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\30\2\7\2\4\6\b\n\2\2\2(\2\r\3\2\2\2\4\21"+
		"\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\5\2\2\22\23"+
		"\7\7\2\2\23\24\7\5\2\2\24\30\7\b\2\2\25\27\5\6\4\2\26\25\3\2\2\2\27\32"+
		"\3\2\2\2\30\31\3\2\2\2\30\26\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34"+
		"\7\t\2\2\34\35\7\n\2\2\35\5\3\2\2\2\36!\5\b\5\2\37!\5\n\6\2 \36\3\2\2"+
		"\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\4\2\2#$\7\6\2\2$%\7\n\2\2%\t\3\2\2\2&\'"+
		"\7\3\2\2\'(\7\7\2\2()\7\n\2\2)\13\3\2\2\2\5\17\30 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}