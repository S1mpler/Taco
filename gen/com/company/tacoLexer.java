// Generated from C:/Users/Kris/School/CompilersOperatingSystes/Taco/src\taco.g4 by ANTLR 4.6
package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tacoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, MATHOP=14, LOGOP=15, DECL_SIGH=16, 
		NAME=17, INT=18, TEXT=19, SPACE=20, ENTER=21, RETURN=22, TAB=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "MATHOP", "LOGOP", "DECL_SIGH", "NAME", 
		"INT", "TEXT", "SPACE", "ENTER", "RETURN", "TAB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if'", "'else'", "'show'", "'('", "')'", "'do'", 
		"'times'", "';'", "'boolean'", "'int'", "'string'", null, null, "'<-'", 
		null, null, null, "' '", "'\n'", "'\r'", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "MATHOP", "LOGOP", "DECL_SIGH", "NAME", "INT", "TEXT", "SPACE", 
		"ENTER", "RETURN", "TAB"
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


	public tacoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "taco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20x\n\20\3\21\3\21\3\21\3\22\6\22~\n\22\r"+
		"\22\16\22\177\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\24\6\24\u0088\n"+
		"\24\r\24\16\24\u0089\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\6\6\2\'\'*-//\61\61\4\2C\\c|\3\2\62;\5\2\62;C\\c|\u00a5\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
		"\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t8\3\2\2\2\13=\3\2\2\2\rB\3\2\2\2\17"+
		"D\3\2\2\2\21F\3\2\2\2\23I\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31Y\3\2\2\2"+
		"\33]\3\2\2\2\35d\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#}\3\2\2\2%\u0082\3\2\2"+
		"\2\'\u0087\3\2\2\2)\u008b\3\2\2\2+\u008f\3\2\2\2-\u0093\3\2\2\2/\u0097"+
		"\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64\7\177\2\2\64\6\3\2\2\2\65\66"+
		"\7k\2\2\66\67\7h\2\2\67\b\3\2\2\289\7g\2\29:\7n\2\2:;\7u\2\2;<\7g\2\2"+
		"<\n\3\2\2\2=>\7u\2\2>?\7j\2\2?@\7q\2\2@A\7y\2\2A\f\3\2\2\2BC\7*\2\2C\16"+
		"\3\2\2\2DE\7+\2\2E\20\3\2\2\2FG\7f\2\2GH\7q\2\2H\22\3\2\2\2IJ\7v\2\2J"+
		"K\7k\2\2KL\7o\2\2LM\7g\2\2MN\7u\2\2N\24\3\2\2\2OP\7=\2\2P\26\3\2\2\2Q"+
		"R\7d\2\2RS\7q\2\2ST\7q\2\2TU\7n\2\2UV\7g\2\2VW\7c\2\2WX\7p\2\2X\30\3\2"+
		"\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\32\3\2\2\2]^\7u\2\2^_\7v\2\2_`\7t\2"+
		"\2`a\7k\2\2ab\7p\2\2bc\7i\2\2c\34\3\2\2\2de\t\2\2\2e\36\3\2\2\2fx\7>\2"+
		"\2gh\7>\2\2hx\7?\2\2ix\7?\2\2jk\7#\2\2kx\7?\2\2lm\7@\2\2mx\7?\2\2nx\7"+
		"@\2\2op\7q\2\2px\7t\2\2qr\7c\2\2rs\7p\2\2sx\7f\2\2tu\7p\2\2uv\7q\2\2v"+
		"x\7v\2\2wf\3\2\2\2wg\3\2\2\2wi\3\2\2\2wj\3\2\2\2wl\3\2\2\2wn\3\2\2\2w"+
		"o\3\2\2\2wq\3\2\2\2wt\3\2\2\2x \3\2\2\2yz\7>\2\2z{\7/\2\2{\"\3\2\2\2|"+
		"~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"$\3\2\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085&\3\2\2\2\u0086\u0088\t"+
		"\5\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a(\3\2\2\2\u008b\u008c\7\"\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008e\b\25\2\2\u008e*\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\b\26\2\2\u0092,\3\2\2\2\u0093\u0094\7\17\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\b\27\2\2\u0096.\3\2\2\2\u0097\u0098\7\13\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\b\30\2\2\u009a\60\3\2\2\2\7\2w\177"+
		"\u0084\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}