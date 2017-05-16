// Generated from C:/Users/Kris/School/CompilersOperatingSystes/Taco/src\taco.g4 by ANTLR 4.6
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tacoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MATHOP=12, LOGOP=13, DECL_SIGH=14, ANDOR=15, NAME=16, 
		INT=17, BOOLEAN=18, SPACE=19, ENTER=20, RETURN=21, TAB=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "MATHOP", "LOGOP", "DECL_SIGH", "ANDOR", "NAME", "INT", 
		"BOOLEAN", "SPACE", "ENTER", "RETURN", "TAB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'show'", "'if'", "'('", "')'", "'do'", "'times'", 
		"'boolean'", "'int'", "'string'", null, null, "'<-'", null, null, null, 
		null, "' '", "'\n'", "'\r'", "'\t'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"MATHOP", "LOGOP", "DECL_SIGH", "ANDOR", "NAME", "INT", "BOOLEAN", "SPACE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16o\n\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20x\n\20\3\21\6\21{\n\21\r\21\16\21|\3\22"+
		"\6\22\u0080\n\22\r\22\16\22\u0081\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0092\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\6\2\'\',-//\61\61\4\2C\\c|\3\2"+
		"\62;\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t8\3\2\2\2\13;\3\2\2\2\r=\3\2\2"+
		"\2\17?\3\2\2\2\21B\3\2\2\2\23H\3\2\2\2\25P\3\2\2\2\27T\3\2\2\2\31[\3\2"+
		"\2\2\33n\3\2\2\2\35p\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#\177\3\2\2\2%\u0091"+
		"\3\2\2\2\'\u0093\3\2\2\2)\u0097\3\2\2\2+\u009b\3\2\2\2-\u009f\3\2\2\2"+
		"/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7u\2\2\64"+
		"\65\7j\2\2\65\66\7q\2\2\66\67\7y\2\2\67\b\3\2\2\289\7k\2\29:\7h\2\2:\n"+
		"\3\2\2\2;<\7*\2\2<\f\3\2\2\2=>\7+\2\2>\16\3\2\2\2?@\7f\2\2@A\7q\2\2A\20"+
		"\3\2\2\2BC\7v\2\2CD\7k\2\2DE\7o\2\2EF\7g\2\2FG\7u\2\2G\22\3\2\2\2HI\7"+
		"d\2\2IJ\7q\2\2JK\7q\2\2KL\7n\2\2LM\7g\2\2MN\7c\2\2NO\7p\2\2O\24\3\2\2"+
		"\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\26\3\2\2\2TU\7u\2\2UV\7v\2\2VW\7t\2\2W"+
		"X\7k\2\2XY\7p\2\2YZ\7i\2\2Z\30\3\2\2\2[\\\t\2\2\2\\\32\3\2\2\2]o\7>\2"+
		"\2^_\7>\2\2_o\7?\2\2`o\7?\2\2ab\7#\2\2bo\7?\2\2cd\7@\2\2do\7?\2\2eo\7"+
		"@\2\2fg\7q\2\2go\7t\2\2hi\7c\2\2ij\7p\2\2jo\7f\2\2kl\7p\2\2lm\7q\2\2m"+
		"o\7v\2\2n]\3\2\2\2n^\3\2\2\2n`\3\2\2\2na\3\2\2\2nc\3\2\2\2ne\3\2\2\2n"+
		"f\3\2\2\2nh\3\2\2\2nk\3\2\2\2o\34\3\2\2\2pq\7>\2\2qr\7/\2\2r\36\3\2\2"+
		"\2st\7(\2\2tx\7(\2\2uv\7~\2\2vx\7~\2\2ws\3\2\2\2wu\3\2\2\2x \3\2\2\2y"+
		"{\t\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~\u0080\t"+
		"\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082$\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7w\2\2\u0086\u0092\7g\2\2\u0087\u0088\7h\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u0092\7g\2\2\u008c\u008d\7o\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7{\2\2\u008f\u0090\7d\2\2\u0090\u0092"+
		"\7g\2\2\u0091\u0083\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u008c\3\2\2\2\u0092"+
		"&\3\2\2\2\u0093\u0094\7\"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\24\2\2"+
		"\u0096(\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b"+
		"\25\2\2\u009a*\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\26\2\2\u009e,\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\3\2\2"+
		"\2\u00a1\u00a2\b\27\2\2\u00a2.\3\2\2\2\b\2nw|\u0081\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}