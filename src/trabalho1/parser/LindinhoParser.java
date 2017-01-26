// Generated from /home/akari/Projects/Lindinho/Compilador-Lindinho/src/main/antlr/Lindinho.g4 by ANTLR 4.2.2
package trabalho1.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LindinhoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		NUMERO=33, WS=34, COMMENT=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'seminima'", "'fim_musica'", "'semifusa'", "'semicolcheia'", 
		"'{'", "'}'", "'fecha'", "'b'", "'semibreve'", "'colcheia'", "'ritornelo'", 
		"'do'", "'('", "'sol'", "'*'", "'menor'", "'pausa'", "'bq'", "'.'", "'re'", 
		"'abre'", "'si'", "'la'", "'mi'", "'fa'", "'x'", "'minima'", "'maior'", 
		"'#'", "')'", "'musica'", "'fusa'", "NUMERO", "WS", "COMMENT"
	};
	public static final int
		RULE_musica = 0, RULE_informacoes = 1, RULE_formula = 2, RULE_clave = 3, 
		RULE_corpo = 4, RULE_geral_compasso = 5, RULE_compasso = 6, RULE_nota_figura = 7, 
		RULE_acidente_opcional = 8, RULE_termo_nota = 9, RULE_figura_ritmica = 10, 
		RULE_escala = 11, RULE_sustenido_bmol_opcional = 12, RULE_nota_oitava = 13, 
		RULE_nota = 14, RULE_pontuacao_opcional = 15;
	public static final String[] ruleNames = {
		"musica", "informacoes", "formula", "clave", "corpo", "geral_compasso", 
		"compasso", "nota_figura", "acidente_opcional", "termo_nota", "figura_ritmica", 
		"escala", "sustenido_bmol_opcional", "nota_oitava", "nota", "pontuacao_opcional"
	};

	@Override
	public String getGrammarFileName() { return "Lindinho.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LindinhoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MusicaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public InformacoesContext informacoes() {
			return getRuleContext(InformacoesContext.class,0);
		}
		public MusicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterMusica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitMusica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitMusica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MusicaContext musica() throws RecognitionException {
		MusicaContext _localctx = new MusicaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_musica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(31);
			setState(33); informacoes();
			setState(34); corpo();
			setState(35); match(2);
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

	public static class InformacoesContext extends ParserRuleContext {
		public EscalaContext escala() {
			return getRuleContext(EscalaContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ClaveContext clave() {
			return getRuleContext(ClaveContext.class,0);
		}
		public InformacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterInformacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitInformacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitInformacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformacoesContext informacoes() throws RecognitionException {
		InformacoesContext _localctx = new InformacoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_informacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); clave();
			setState(38); escala();
			setState(39); formula();
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

	public static class FormulaContext extends ParserRuleContext {
		public Token base;
		public Token base2;
		public List<TerminalNode> NUMERO() { return getTokens(LindinhoParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LindinhoParser.NUMERO, i);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); ((FormulaContext)_localctx).base = match(NUMERO);
			setState(42); match(26);
			setState(43); ((FormulaContext)_localctx).base2 = match(NUMERO);
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

	public static class ClaveContext extends ParserRuleContext {
		public ClaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterClave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitClave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitClave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaveContext clave() throws RecognitionException {
		ClaveContext _localctx = new ClaveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==14 || _la==25) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CorpoContext extends ParserRuleContext {
		public Geral_compassoContext geral_compasso(int i) {
			return getRuleContext(Geral_compassoContext.class,i);
		}
		public List<Geral_compassoContext> geral_compasso() {
			return getRuleContexts(Geral_compassoContext.class);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); geral_compasso();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 || _la==21 );
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

	public static class Geral_compassoContext extends ParserRuleContext {
		public Geral_compassoContext geral_compasso(int i) {
			return getRuleContext(Geral_compassoContext.class,i);
		}
		public List<Geral_compassoContext> geral_compasso() {
			return getRuleContexts(Geral_compassoContext.class);
		}
		public CompassoContext compasso() {
			return getRuleContext(CompassoContext.class,0);
		}
		public Geral_compassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geral_compasso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterGeral_compasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitGeral_compasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitGeral_compasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Geral_compassoContext geral_compasso() throws RecognitionException {
		Geral_compassoContext _localctx = new Geral_compassoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_geral_compasso);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(21);
				setState(53); match(11);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54); geral_compasso();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==5 || _la==21 );
				setState(59); match(7);
				setState(60); match(11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(5);
				setState(63); compasso();
				setState(64); match(6);
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

	public static class CompassoContext extends ParserRuleContext {
		public List<Nota_figuraContext> nota_figura() {
			return getRuleContexts(Nota_figuraContext.class);
		}
		public Nota_figuraContext nota_figura(int i) {
			return getRuleContext(Nota_figuraContext.class,i);
		}
		public CompassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compasso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterCompasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitCompasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitCompasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompassoContext compasso() throws RecognitionException {
		CompassoContext _localctx = new CompassoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compasso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); nota_figura();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==13 );
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

	public static class Nota_figuraContext extends ParserRuleContext {
		public Token repeticao;
		public Termo_notaContext termo_nota() {
			return getRuleContext(Termo_notaContext.class,0);
		}
		public Pontuacao_opcionalContext pontuacao_opcional() {
			return getRuleContext(Pontuacao_opcionalContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LindinhoParser.NUMERO, 0); }
		public Acidente_opcionalContext acidente_opcional() {
			return getRuleContext(Acidente_opcionalContext.class,0);
		}
		public Figura_ritmicaContext figura_ritmica() {
			return getRuleContext(Figura_ritmicaContext.class,0);
		}
		public Nota_figuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota_figura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterNota_figura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitNota_figura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitNota_figura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nota_figuraContext nota_figura() throws RecognitionException {
		Nota_figuraContext _localctx = new Nota_figuraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nota_figura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(13);
			setState(74); acidente_opcional();
			setState(75); termo_nota();
			setState(76); figura_ritmica();
			setState(77); pontuacao_opcional();
			setState(78); match(30);
			setState(81);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(79); ((Nota_figuraContext)_localctx).repeticao = match(15);
				setState(80); match(NUMERO);
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

	public static class Acidente_opcionalContext extends ParserRuleContext {
		public Sustenido_bmol_opcionalContext sustenido_bmol_opcional() {
			return getRuleContext(Sustenido_bmol_opcionalContext.class,0);
		}
		public Acidente_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acidente_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterAcidente_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitAcidente_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitAcidente_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acidente_opcionalContext acidente_opcional() throws RecognitionException {
		Acidente_opcionalContext _localctx = new Acidente_opcionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_acidente_opcional);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); sustenido_bmol_opcional();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); match(18);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Termo_notaContext extends ParserRuleContext {
		public Nota_oitavaContext nota_oitava(int i) {
			return getRuleContext(Nota_oitavaContext.class,i);
		}
		public List<Nota_oitavaContext> nota_oitava() {
			return getRuleContexts(Nota_oitavaContext.class);
		}
		public Termo_notaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_nota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterTermo_nota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitTermo_nota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitTermo_nota(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_notaContext termo_nota() throws RecognitionException {
		Termo_notaContext _localctx = new Termo_notaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termo_nota);
		int _la;
		try {
			setState(94);
			switch (_input.LA(1)) {
			case 12:
			case 14:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88); nota_oitava();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 14) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25))) != 0) );
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(17);
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

	public static class Figura_ritmicaContext extends ParserRuleContext {
		public Figura_ritmicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figura_ritmica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterFigura_ritmica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitFigura_ritmica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitFigura_ritmica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Figura_ritmicaContext figura_ritmica() throws RecognitionException {
		Figura_ritmicaContext _localctx = new Figura_ritmicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_figura_ritmica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 4) | (1L << 9) | (1L << 10) | (1L << 27) | (1L << 32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EscalaContext extends ParserRuleContext {
		public Sustenido_bmol_opcionalContext sustenido_bmol_opcional() {
			return getRuleContext(Sustenido_bmol_opcionalContext.class,0);
		}
		public NotaContext nota() {
			return getRuleContext(NotaContext.class,0);
		}
		public EscalaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escala; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterEscala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitEscala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitEscala(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscalaContext escala() throws RecognitionException {
		EscalaContext _localctx = new EscalaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escala);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); nota();
			setState(99); sustenido_bmol_opcional();
			setState(101);
			_la = _input.LA(1);
			if (_la==16 || _la==28) {
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==16 || _la==28) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Sustenido_bmol_opcionalContext extends ParserRuleContext {
		public Sustenido_bmol_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sustenido_bmol_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterSustenido_bmol_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitSustenido_bmol_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitSustenido_bmol_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sustenido_bmol_opcionalContext sustenido_bmol_opcional() throws RecognitionException {
		Sustenido_bmol_opcionalContext _localctx = new Sustenido_bmol_opcionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sustenido_bmol_opcional);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case 29:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(29);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(8);
				}
				break;
			case 12:
			case 14:
			case 16:
			case 17:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
			case 28:
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Nota_oitavaContext extends ParserRuleContext {
		public Token oitava;
		public TerminalNode NUMERO() { return getToken(LindinhoParser.NUMERO, 0); }
		public NotaContext nota() {
			return getRuleContext(NotaContext.class,0);
		}
		public Nota_oitavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota_oitava; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterNota_oitava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitNota_oitava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitNota_oitava(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nota_oitavaContext nota_oitava() throws RecognitionException {
		Nota_oitavaContext _localctx = new Nota_oitavaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nota_oitava);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); nota();
			setState(109); ((Nota_oitavaContext)_localctx).oitava = match(NUMERO);
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

	public static class NotaContext extends ParserRuleContext {
		public NotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterNota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitNota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitNota(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotaContext nota() throws RecognitionException {
		NotaContext _localctx = new NotaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nota);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 14) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Pontuacao_opcionalContext extends ParserRuleContext {
		public Pontuacao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pontuacao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).enterPontuacao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LindinhoListener ) ((LindinhoListener)listener).exitPontuacao_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LindinhoVisitor ) return ((LindinhoVisitor<? extends T>)visitor).visitPontuacao_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pontuacao_opcionalContext pontuacao_opcional() throws RecognitionException {
		Pontuacao_opcionalContext _localctx = new Pontuacao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pontuacao_opcional);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(19);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6\63\n\6\r\6\16\6\64"+
		"\3\7\3\7\3\7\6\7:\n\7\r\7\16\7;\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7E\n\7\3"+
		"\b\6\bH\n\b\r\b\16\bI\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n\3\n"+
		"\3\n\5\nY\n\n\3\13\6\13\\\n\13\r\13\16\13]\3\13\5\13a\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\5\rh\n\r\3\16\3\16\3\16\5\16m\n\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\5\21v\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\6\4\2\20\20\33\33\7\2\3\3\5\6\13\f\35\35\"\"\4\2\22\22\36\36\6\2\16"+
		"\16\20\20\26\26\30\33t\2\"\3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\b/\3\2\2\2\n"+
		"\62\3\2\2\2\fD\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22X\3\2\2\2\24`\3\2\2\2"+
		"\26b\3\2\2\2\30d\3\2\2\2\32l\3\2\2\2\34n\3\2\2\2\36q\3\2\2\2 u\3\2\2\2"+
		"\"#\7!\2\2#$\5\4\3\2$%\5\n\6\2%&\7\4\2\2&\3\3\2\2\2\'(\5\b\5\2()\5\30"+
		"\r\2)*\5\6\4\2*\5\3\2\2\2+,\7#\2\2,-\7\34\2\2-.\7#\2\2.\7\3\2\2\2/\60"+
		"\t\2\2\2\60\t\3\2\2\2\61\63\5\f\7\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\67\7\27\2\2\679\7\r\2\28:\5\f"+
		"\7\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\t\2\2>?\7\r"+
		"\2\2?E\3\2\2\2@A\7\7\2\2AB\5\16\b\2BC\7\b\2\2CE\3\2\2\2D\66\3\2\2\2D@"+
		"\3\2\2\2E\r\3\2\2\2FH\5\20\t\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"J\17\3\2\2\2KL\7\17\2\2LM\5\22\n\2MN\5\24\13\2NO\5\26\f\2OP\5 \21\2PS"+
		"\7 \2\2QR\7\21\2\2RT\7#\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2UY\5\32\16"+
		"\2VY\7\24\2\2WY\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\23\3\2\2\2Z\\\5"+
		"\34\17\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_a\7\23\2\2"+
		"`[\3\2\2\2`_\3\2\2\2a\25\3\2\2\2bc\t\3\2\2c\27\3\2\2\2de\5\36\20\2eg\5"+
		"\32\16\2fh\t\4\2\2gf\3\2\2\2gh\3\2\2\2h\31\3\2\2\2im\7\37\2\2jm\7\n\2"+
		"\2km\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\33\3\2\2\2no\5\36\20\2op\7"+
		"#\2\2p\35\3\2\2\2qr\t\5\2\2r\37\3\2\2\2sv\7\25\2\2tv\3\2\2\2us\3\2\2\2"+
		"ut\3\2\2\2v!\3\2\2\2\r\64;DISX]`glu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}