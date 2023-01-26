// Generated from java-escape by ANTLR 4.11.1
package edu.westminstercollege.cmpt355.hw2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PigLatinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOWELSTART=1, PAIRWORD=2, CONSONANTWORD=3, SMALLWORD=4, COMMENT=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VOWELSTART", "PAIRWORD", "CONSONANTWORD", "SMALLWORD", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOWELSTART", "PAIRWORD", "CONSONANTWORD", "SMALLWORD", "COMMENT"
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


	public PigLatinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PigLatinLexer.g4"; }

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
		"\u0004\u0000\u0005}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0000\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b"+
		"\u0000\f\u0000\u0015\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t"+
		"\u0001\u0001\u0001\u0004\u0001$\b\u0001\u000b\u0001\f\u0001%\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001,\b\u0001\u000b\u0001"+
		"\f\u0001-\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00013\b\u0001\u000b"+
		"\u0001\f\u00014\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001:\b\u0001"+
		"\u000b\u0001\f\u0001;\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001B\b\u0001\u000b\u0001\f\u0001C\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001J\b\u0001\u000b\u0001\f\u0001K\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001R\b\u0001\u000b\u0001"+
		"\f\u0001S\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"Z\b\u0001\u000b\u0001\f\u0001[\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001b\b\u0001\u000b\u0001\f\u0001c\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001j\b\u0001\u000b\u0001\f\u0001k\u0003"+
		"\u0001n\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002s\b\u0002"+
		"\u000b\u0002\f\u0002t\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"z\b\u0003\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u0001\u0000\t\n\u0000AAEEIIOOU"+
		"Uaaeeiioouu\u0002\u0000AZaz\u0001\u0000AZ\u0003\u0000\'\'AZaz\u0003\u0000"+
		"ccstww\u0001\u0000az\u0005\u0000bdfgppttww\u0004\u0000bcfgppss\u0005\u0000"+
		"bdfhjnptvz\u0095\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000"+
		"\u0000\u0000\u0003m\u0001\u0000\u0000\u0000\u0005o\u0001\u0000\u0000\u0000"+
		"\u0007y\u0001\u0000\u0000\u0000\t{\u0001\u0000\u0000\u0000\u000b\r\u0007"+
		"\u0000\u0000\u0000\f\u000e\u0007\u0001\u0000\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0019\u0001\u0000\u0000\u0000"+
		"\u0011\u0013\u0007\u0002\u0000\u0000\u0012\u0014\u0007\u0003\u0000\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0007\u0001\u0000\u0000"+
		"\u0018\u000b\u0001\u0000\u0000\u0000\u0018\u0011\u0001\u0000\u0000\u0000"+
		"\u0019\u0002\u0001\u0000\u0000\u0000\u001a\u001b\u0007\u0004\u0000\u0000"+
		"\u001b\u001f\u0005h\u0000\u0000\u001c\u001e\u0007\u0003\u0000\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0007\u0001\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&n\u0001\u0000\u0000\u0000\'(\u0005q\u0000"+
		"\u0000()\u0005u\u0000\u0000)+\u0001\u0000\u0000\u0000*,\u0007\u0005\u0000"+
		"\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.n\u0001\u0000\u0000\u0000/0\u0007"+
		"\u0006\u0000\u000002\u0005r\u0000\u000013\u0007\u0005\u0000\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005n\u0001\u0000\u0000\u000067\u0007\u0007\u0000"+
		"\u000079\u0005l\u0000\u00008:\u0007\u0005\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<n\u0001\u0000\u0000\u0000=>\u0005s\u0000\u0000>?\u0005c\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@B\u0007\u0005\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000Dn\u0001\u0000\u0000\u0000EF\u0005s\u0000\u0000FG\u0005"+
		"m\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0007\u0005\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000Ln\u0001\u0000\u0000\u0000MN\u0005s\u0000\u0000"+
		"NO\u0005n\u0000\u0000OQ\u0001\u0000\u0000\u0000PR\u0007\u0005\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000Tn\u0001\u0000\u0000\u0000UV\u0005s\u0000"+
		"\u0000VW\u0005p\u0000\u0000WY\u0001\u0000\u0000\u0000XZ\u0007\u0005\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\n\u0001\u0000\u0000\u0000]^\u0005"+
		"s\u0000\u0000^_\u0005t\u0000\u0000_a\u0001\u0000\u0000\u0000`b\u0007\u0005"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dn\u0001\u0000\u0000\u0000"+
		"ef\u0005s\u0000\u0000fg\u0005w\u0000\u0000gi\u0001\u0000\u0000\u0000h"+
		"j\u0007\u0005\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000m\u001a\u0001\u0000\u0000\u0000m\'\u0001\u0000\u0000\u0000"+
		"m/\u0001\u0000\u0000\u0000m6\u0001\u0000\u0000\u0000m=\u0001\u0000\u0000"+
		"\u0000mE\u0001\u0000\u0000\u0000mM\u0001\u0000\u0000\u0000mU\u0001\u0000"+
		"\u0000\u0000m]\u0001\u0000\u0000\u0000me\u0001\u0000\u0000\u0000n\u0004"+
		"\u0001\u0000\u0000\u0000op\u0007\b\u0000\u0000pr\u0007\u0005\u0000\u0000"+
		"qs\u0007\u0005\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0006\u0001"+
		"\u0000\u0000\u0000vz\u0007\u0001\u0000\u0000wx\u0007\u0001\u0000\u0000"+
		"xz\u0007\u0005\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z\b\u0001\u0000\u0000\u0000{|\t\u0000\u0000\u0000|\n\u0001\u0000"+
		"\u0000\u0000\u0012\u0000\u000f\u0015\u0018\u001f%-4;CKS[ckmty\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}