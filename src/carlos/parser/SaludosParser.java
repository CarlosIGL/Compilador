// Generated from Saludos.g4 by ANTLR 4.9.1
package carlos.parser;
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
		CommentLine=1, CommentSection=2, CA=3, CC=4, PAR_A=5, PAR_C=6, COMILLA=7, 
		IG=8, POR=9, DIV=10, MAS=11, MENOS=12, MAYI=13, MENI=14, DI=15, MAY=16, 
		MEN=17, OR=18, AND=19, TIPO=20, TIPO_ENTERO=21, TIPO_FLOTANTE=22, PRINT=23, 
		SI=24, SINO=25, MIENTRAS=26, TRUE=27, FALSE=28, STRING=29, CLASE=30, AIDI=31, 
		INT=32, PYC=33, SALTO=34;
	public static final int
		RULE_imprimir = 0, RULE_bloque = 1, RULE_cor_abierto = 2, RULE_cor_cerrado = 3, 
		RULE_instrucciones = 4, RULE_impresion = 5, RULE_string = 6, RULE_declarar = 7, 
		RULE_asignacion = 8, RULE_ifelse = 9, RULE_condicion = 10, RULE_bloque_if = 11, 
		RULE_mientras = 12, RULE_operacion = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"imprimir", "bloque", "cor_abierto", "cor_cerrado", "instrucciones", 
			"impresion", "string", "declarar", "asignacion", "ifelse", "condicion", 
			"bloque_if", "mientras", "operacion", "expr"
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

	public static class ImprimirContext extends ParserRuleContext {
		public List<TerminalNode> COMILLA() { return getTokens(SaludosParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(SaludosParser.COMILLA, i);
		}
		public TerminalNode CLASE() { return getToken(SaludosParser.CLASE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(COMILLA);
			setState(31);
			match(CLASE);
			setState(32);
			match(COMILLA);
			setState(33);
			bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public Cor_abiertoContext cor_abierto() {
			return getRuleContext(Cor_abiertoContext.class,0);
		}
		public Cor_cerradoContext cor_cerrado() {
			return getRuleContext(Cor_cerradoContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			cor_abierto();
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(36);
					instrucciones();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			cor_cerrado();
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

	public static class Cor_abiertoContext extends ParserRuleContext {
		public TerminalNode CA() { return getToken(SaludosParser.CA, 0); }
		public Cor_abiertoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_abierto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCor_abierto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cor_abiertoContext cor_abierto() throws RecognitionException {
		Cor_abiertoContext _localctx = new Cor_abiertoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cor_abierto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(CA);
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

	public static class Cor_cerradoContext extends ParserRuleContext {
		public TerminalNode CC() { return getToken(SaludosParser.CC, 0); }
		public Cor_cerradoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_cerrado; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCor_cerrado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cor_cerradoContext cor_cerrado() throws RecognitionException {
		Cor_cerradoContext _localctx = new Cor_cerradoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cor_cerrado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CC);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucciones);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				impresion();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				declarar();
				}
				break;
			case AIDI:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				asignacion();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				ifelse();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				mientras();
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
		public TerminalNode PRINT() { return getToken(SaludosParser.PRINT, 0); }
		public TerminalNode PAR_A() { return getToken(SaludosParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(SaludosParser.PAR_C, 0); }
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PRINT);
			setState(56);
			match(PAR_A);
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(57);
				string();
				}
				break;
			case PAR_A:
			case TRUE:
			case FALSE:
			case AIDI:
			case INT:
				{
				setState(58);
				operacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(61);
			match(PAR_C);
			setState(62);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpresoContext extends StringContext {
		public TerminalNode STRING() { return getToken(SaludosParser.STRING, 0); }
		public ImpresoContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitImpreso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			_localctx = new ImpresoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(STRING);
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
	public static class Guardar2Context extends DeclararContext {
		public TerminalNode TIPO() { return getToken(SaludosParser.TIPO, 0); }
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public TerminalNode IG() { return getToken(SaludosParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public Guardar2Context(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitGuardar2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GuardarContext extends DeclararContext {
		public TerminalNode TIPO() { return getToken(SaludosParser.TIPO, 0); }
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public GuardarContext(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitGuardar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarar);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new GuardarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(66);
				match(TIPO);
				setState(67);
				match(AIDI);
				setState(68);
				match(PYC);
				}
				}
				break;
			case 2:
				_localctx = new Guardar2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(69);
				match(TIPO);
				setState(70);
				match(AIDI);
				setState(71);
				match(IG);
				setState(72);
				expr(0);
				setState(73);
				match(PYC);
				}
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignarContext extends AsignacionContext {
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public TerminalNode IG() { return getToken(SaludosParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(SaludosParser.PYC, 0); }
		public AsignarContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitAsignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			_localctx = new AsignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(AIDI);
			setState(78);
			match(IG);
			setState(79);
			expr(0);
			setState(80);
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

	public static class IfelseContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(SaludosParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(SaludosParser.SI, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> SINO() { return getTokens(SaludosParser.SINO); }
		public TerminalNode SINO(int i) {
			return getToken(SaludosParser.SINO, i);
		}
		public Bloque_ifContext bloque_if() {
			return getRuleContext(Bloque_ifContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifelse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(SI);
			setState(83);
			condicion();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(SINO);
					setState(85);
					match(SI);
					setState(86);
					condicion();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(92);
				match(SINO);
				setState(93);
				bloque_if();
				}
			}

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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PAR_A() { return getToken(SaludosParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(SaludosParser.PAR_C, 0); }
		public Bloque_ifContext bloque_if() {
			return getRuleContext(Bloque_ifContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PAR_A);
			setState(97);
			expr(0);
			setState(98);
			match(PAR_C);
			setState(99);
			bloque_if();
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

	public static class Bloque_ifContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitBloque_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_ifContext bloque_if() throws RecognitionException {
		Bloque_ifContext _localctx = new Bloque_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			bloque();
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(SaludosParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(MIENTRAS);
			setState(104);
			condicion();
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

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprmirResuContext extends OperacionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImprmirResuContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitImprmirResu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operacion);
		try {
			_localctx = new ImprmirResuContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(SaludosParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(SaludosParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(SaludosParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(SaludosParser.MENOS, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(SaludosParser.POR, 0); }
		public TerminalNode DIV() { return getToken(SaludosParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(SaludosParser.FALSE, 0); }
		public FalsoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAY() { return getToken(SaludosParser.MAY, 0); }
		public TerminalNode MEN() { return getToken(SaludosParser.MEN, 0); }
		public TerminalNode MAYI() { return getToken(SaludosParser.MAYI, 0); }
		public TerminalNode MENI() { return getToken(SaludosParser.MENI, 0); }
		public CondicionalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(SaludosParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode AIDI() { return getToken(SaludosParser.AIDI, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(SaludosParser.TRUE, 0); }
		public VerdaderoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Condicional2Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IG() { return getToken(SaludosParser.IG, 0); }
		public TerminalNode DI() { return getToken(SaludosParser.DI, 0); }
		public Condicional2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitCondicional2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(SaludosParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SaludosParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SaludosVisitor ) return ((SaludosVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				match(PAR_A);
				setState(110);
				expr(0);
				setState(111);
				match(PAR_C);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(INT);
				}
				break;
			case TRUE:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(FALSE);
				}
				break;
			case AIDI:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(AIDI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(120);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(123);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new CondicionalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(126);
						((CondicionalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYI) | (1L << MENI) | (1L << MAY) | (1L << MEN))) != 0)) ) {
							((CondicionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new Condicional2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(129);
						((Condicional2Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IG || _la==DI) ) {
							((Condicional2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(132);
						match(AND);
						setState(133);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(135);
						match(OR);
						setState(136);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\68\n\6\3\7\3\7\3\7\3\7\5\7>\n\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\13\3\13\5\13a\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20x\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008c\n\20\f\20"+
		"\16\20\u008f\13\20\3\20\3)\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\6\3\2\13\f\3\2\r\16\4\2\17\20\22\23\4\2\n\n\21\21\2\u0094\2 \3\2"+
		"\2\2\4%\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16B\3"+
		"\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24T\3\2\2\2\26b\3\2\2\2\30g\3\2\2\2\32"+
		"i\3\2\2\2\34l\3\2\2\2\36w\3\2\2\2 !\7\t\2\2!\"\7 \2\2\"#\7\t\2\2#$\5\4"+
		"\3\2$\3\3\2\2\2%)\5\6\4\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2)*\3\2\2\2)\'"+
		"\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\b\5\2-\5\3\2\2\2./\7\5\2\2/\7\3\2\2\2"+
		"\60\61\7\6\2\2\61\t\3\2\2\2\628\5\f\7\2\638\5\20\t\2\648\5\22\n\2\658"+
		"\5\24\13\2\668\5\32\16\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28\13\3\2\2\29:\7\31\2\2:=\7\7\2\2;>\5\16\b\2"+
		"<>\5\34\17\2=;\3\2\2\2=<\3\2\2\2>?\3\2\2\2?@\7\b\2\2@A\7#\2\2A\r\3\2\2"+
		"\2BC\7\37\2\2C\17\3\2\2\2DE\7\26\2\2EF\7!\2\2FN\7#\2\2GH\7\26\2\2HI\7"+
		"!\2\2IJ\7\n\2\2JK\5\36\20\2KL\7#\2\2LN\3\2\2\2MD\3\2\2\2MG\3\2\2\2N\21"+
		"\3\2\2\2OP\7!\2\2PQ\7\n\2\2QR\5\36\20\2RS\7#\2\2S\23\3\2\2\2TU\7\32\2"+
		"\2U[\5\26\f\2VW\7\33\2\2WX\7\32\2\2XZ\5\26\f\2YV\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2\2^_\7\33\2\2_a\5\30\r\2`^\3\2\2\2"+
		"`a\3\2\2\2a\25\3\2\2\2bc\7\7\2\2cd\5\36\20\2de\7\b\2\2ef\5\30\r\2f\27"+
		"\3\2\2\2gh\5\4\3\2h\31\3\2\2\2ij\7\34\2\2jk\5\26\f\2k\33\3\2\2\2lm\5\36"+
		"\20\2m\35\3\2\2\2no\b\20\1\2op\7\7\2\2pq\5\36\20\2qr\7\b\2\2rx\3\2\2\2"+
		"sx\7\"\2\2tx\7\35\2\2ux\7\36\2\2vx\7!\2\2wn\3\2\2\2ws\3\2\2\2wt\3\2\2"+
		"\2wu\3\2\2\2wv\3\2\2\2x\u008d\3\2\2\2yz\f\r\2\2z{\t\2\2\2{\u008c\5\36"+
		"\20\16|}\f\f\2\2}~\t\3\2\2~\u008c\5\36\20\r\177\u0080\f\13\2\2\u0080\u0081"+
		"\t\4\2\2\u0081\u008c\5\36\20\f\u0082\u0083\f\n\2\2\u0083\u0084\t\5\2\2"+
		"\u0084\u008c\5\36\20\13\u0085\u0086\f\t\2\2\u0086\u0087\7\25\2\2\u0087"+
		"\u008c\5\36\20\n\u0088\u0089\f\b\2\2\u0089\u008a\7\24\2\2\u008a\u008c"+
		"\5\36\20\t\u008by\3\2\2\2\u008b|\3\2\2\2\u008b\177\3\2\2\2\u008b\u0082"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\37\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\13)\67=M[`w\u008b\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}