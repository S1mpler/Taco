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
		NAME=17, INT=18, BOOLEAN=19, TEXT=20, SPACE=21, ENTER=22, RETURN=23, TAB=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "MATHOP", "LOGOP", "DECL_SIGH", "NAME", 
		"INT", "BOOLEAN", "TEXT", "SPACE", "ENTER", "RETURN", "TAB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if'", "'else'", "'show'", "'('", "')'", "'do'", 
		"'times'", "';'", "'boolean'", "'int'", "'string'", null, null, "'<-'", 
		null, null, null, null, "' '", "'\n'", "'\r'", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "MATHOP", "LOGOP", "DECL_SIGH", "NAME", "INT", "BOOLEAN", 
		"TEXT", "SPACE", "ENTER", "RETURN", "TAB"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20z\n\20\3\21\3\21\3\21\3\22\6\22"+
		"\u0080\n\22\r\22\16\22\u0081\3\23\6\23\u0085\n\23\r\23\16\23\u0086\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0097\n\24\3\25\6\25\u009a\n\25\r\25\16\25\u009b\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\2\2\32\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\6\2\'\'*-//\61\61\4\2"+
		"C\\c|\3\2\62;\5\2\62;C\\c|\u00b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2"+
		"\2\7\67\3\2\2\2\t:\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2"+
		"\2\2\23K\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31[\3\2\2\2\33_\3\2\2\2\35f\3"+
		"\2\2\2\37y\3\2\2\2!{\3\2\2\2#\177\3\2\2\2%\u0084\3\2\2\2\'\u0096\3\2\2"+
		"\2)\u0099\3\2\2\2+\u009d\3\2\2\2-\u00a1\3\2\2\2/\u00a5\3\2\2\2\61\u00a9"+
		"\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\177\2\2\66\6\3\2\2\2\678\7"+
		"k\2\289\7h\2\29\b\3\2\2\2:;\7g\2\2;<\7n\2\2<=\7u\2\2=>\7g\2\2>\n\3\2\2"+
		"\2?@\7u\2\2@A\7j\2\2AB\7q\2\2BC\7y\2\2C\f\3\2\2\2DE\7*\2\2E\16\3\2\2\2"+
		"FG\7+\2\2G\20\3\2\2\2HI\7f\2\2IJ\7q\2\2J\22\3\2\2\2KL\7v\2\2LM\7k\2\2"+
		"MN\7o\2\2NO\7g\2\2OP\7u\2\2P\24\3\2\2\2QR\7=\2\2R\26\3\2\2\2ST\7d\2\2"+
		"TU\7q\2\2UV\7q\2\2VW\7n\2\2WX\7g\2\2XY\7c\2\2YZ\7p\2\2Z\30\3\2\2\2[\\"+
		"\7k\2\2\\]\7p\2\2]^\7v\2\2^\32\3\2\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2bc\7"+
		"k\2\2cd\7p\2\2de\7i\2\2e\34\3\2\2\2fg\t\2\2\2g\36\3\2\2\2hz\7>\2\2ij\7"+
		">\2\2jz\7?\2\2kz\7?\2\2lm\7#\2\2mz\7?\2\2no\7@\2\2oz\7?\2\2pz\7@\2\2q"+
		"r\7q\2\2rz\7t\2\2st\7c\2\2tu\7p\2\2uz\7f\2\2vw\7p\2\2wx\7q\2\2xz\7v\2"+
		"\2yh\3\2\2\2yi\3\2\2\2yk\3\2\2\2yl\3\2\2\2yn\3\2\2\2yp\3\2\2\2yq\3\2\2"+
		"\2ys\3\2\2\2yv\3\2\2\2z \3\2\2\2{|\7>\2\2|}\7/\2\2}\"\3\2\2\2~\u0080\t"+
		"\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082$\3\2\2\2\u0083\u0085\t\4\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087&\3\2\2\2"+
		"\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b\u0097"+
		"\7g\2\2\u008c\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0097\7g\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2\2"+
		"\u0093\u0094\7{\2\2\u0094\u0095\7d\2\2\u0095\u0097\7g\2\2\u0096\u0088"+
		"\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u0091\3\2\2\2\u0097(\3\2\2\2\u0098"+
		"\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c*\3\2\2\2\u009d\u009e\7\"\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\b\26\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7\f\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\b\27\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7\17\2"+
		"\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\30\2\2\u00a8\60\3\2\2\2\u00a9\u00aa"+
		"\7\13\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\31\2\2\u00ac\62\3\2\2\2\b"+
		"\2y\u0081\u0086\u0096\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}