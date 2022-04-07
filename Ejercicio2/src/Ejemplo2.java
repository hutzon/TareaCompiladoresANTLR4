// Generated from .\Ejemplo2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Ejemplo2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALABRA_RESERVADA=1, AMP=2, BLANCO=3, PARENTESIS=4, LLAVES=5, SEPARADOR=6, 
		OP_REL=7, OP_ASIGN=8, OP_ARIT=9, NUMERO=10, IDENT=11, CADENA=12, COMENTARIO1=13, 
		COMENTARIO2=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALABRA_RESERVADA", "AMP", "BLANCO", "PARENTESIS", "LLAVES", "SEPARADOR", 
			"OP_REL", "OP_ASIGN", "OP_ARIT", "LETRA", "DIGITO", "NUMERO", "IDENT", 
			"CADENA", "COMENTARIO1", "COMENTARIO2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&'", null, null, null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALABRA_RESERVADA", "AMP", "BLANCO", "PARENTESIS", "LLAVES", "SEPARADOR", 
			"OP_REL", "OP_ASIGN", "OP_ARIT", "NUMERO", "IDENT", "CADENA", "COMENTARIO1", 
			"COMENTARIO2"
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


	public Ejemplo2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ejemplo2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2\3\3\3\3\3\4\6\4F\n\4"+
		"\r\4\16\4G\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bY\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rd\n\r\r\r\16\re\3\16"+
		"\3\16\5\16j\n\16\3\16\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16\3\17\3\17"+
		"\7\17v\n\17\f\17\16\17y\13\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0081"+
		"\n\20\f\20\16\20\u0084\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u008c"+
		"\n\21\f\21\16\21\u008f\13\21\3\21\3\21\3\21\3\21\3\21\5w\u0082\u008d\2"+
		"\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16"+
		"\37\17!\20\3\2\t\5\2\13\f\17\17\"\"\4\2}}\177\177\4\2..==\4\2>>@@\5\2"+
		",-//\61\61\4\2C\\c|\3\2\f\f\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\3@\3\2\2\2\5B\3\2\2\2\7E\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2"+
		"\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31c\3\2"+
		"\2\2\33i\3\2\2\2\35s\3\2\2\2\37|\3\2\2\2!\u0087\3\2\2\2#$\7k\2\2$%\7p"+
		"\2\2%A\7v\2\2&\'\7x\2\2\'(\7q\2\2()\7k\2\2)A\7f\2\2*+\7y\2\2+,\7j\2\2"+
		",-\7k\2\2-.\7n\2\2.A\7g\2\2/\60\7k\2\2\60A\7h\2\2\61\62\7u\2\2\62\63\7"+
		"e\2\2\63\64\7c\2\2\64\65\7p\2\2\65A\7h\2\2\66\67\7r\2\2\678\7t\2\289\7"+
		"k\2\29:\7p\2\2:;\7v\2\2;A\7h\2\2<=\7o\2\2=>\7c\2\2>?\7k\2\2?A\7p\2\2@"+
		"#\3\2\2\2@&\3\2\2\2@*\3\2\2\2@/\3\2\2\2@\61\3\2\2\2@\66\3\2\2\2@<\3\2"+
		"\2\2A\4\3\2\2\2BC\7(\2\2C\6\3\2\2\2DF\t\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\4\2\2J\b\3\2\2\2KL\4*+\2L\n\3\2\2\2MN\t"+
		"\3\2\2N\f\3\2\2\2OP\t\4\2\2P\16\3\2\2\2QR\7?\2\2RY\7?\2\2SY\t\5\2\2TU"+
		"\7>\2\2UY\7?\2\2VW\7@\2\2WY\7?\2\2XQ\3\2\2\2XS\3\2\2\2XT\3\2\2\2XV\3\2"+
		"\2\2Y\20\3\2\2\2Z[\7?\2\2[\22\3\2\2\2\\]\t\6\2\2]\24\3\2\2\2^_\t\7\2\2"+
		"_\26\3\2\2\2`a\4\62;\2a\30\3\2\2\2bd\5\27\f\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f\32\3\2\2\2gj\5\25\13\2hj\7a\2\2ig\3\2\2\2ih\3\2\2\2"+
		"jp\3\2\2\2ko\5\25\13\2lo\5\27\f\2mo\7a\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2"+
		"\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\34\3\2\2\2rp\3\2\2\2sw\7$\2\2tv\n\b"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7$"+
		"\2\2{\36\3\2\2\2|}\7\61\2\2}~\7\61\2\2~\u0082\3\2\2\2\177\u0081\13\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\f\2\2\u0086"+
		" \3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7,\2\2\u0089\u008d\3\2\2\2"+
		"\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7,\2\2\u0091\u0092\7\61\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\21"+
		"\2\2\u0094\"\3\2\2\2\r\2@GXeinpw\u0082\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}