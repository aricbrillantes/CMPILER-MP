// Generated from c:\Users\raf\Desktop\PASCALet_parser and lexer\PASCALet.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PASCALetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CONST=7, DIV=8, DO=9, 
		DOWNTO=10, ELSE=11, END=12, FILE=13, FOR=14, FUNCTION=15, GOTO=16, IF=17, 
		IN=18, INTEGER=19, LABEL=20, MOD=21, NIL=22, NOT=23, OF=24, OR=25, PROCEDURE=26, 
		PROGRAM=27, REAL=28, REPEAT=29, SET=30, THEN=31, TO=32, TYPE=33, UNTIL=34, 
		VAR=35, WHILE=36, WITH=37, PLUS=38, MINUS=39, STAR=40, SLASH=41, ASSIGN=42, 
		COMMA=43, SEMI=44, COLON=45, EQUAL=46, NOT_EQUAL=47, LT=48, LE=49, GE=50, 
		GT=51, LPAREN=52, RPAREN=53, LBRACK=54, LBRACK2=55, RBRACK=56, RBRACK2=57, 
		POINTER=58, AT=59, DOT=60, DOTDOT=61, LCURLY=62, RCURLY=63, UNIT=64, INTERFACE=65, 
		STRING=66, TRUE=67, FALSE=68, WS=69, COMMENT_1=70, COMMENT_2=71, IDENT=72, 
		STRING_LITERAL=73, NUM_INT=74, NUM_REAL=75;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", "ARRAY", 
		"BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", 
		"END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INTEGER", "LABEL", 
		"MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "REPEAT", 
		"SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", 
		"MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", 
		"NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", 
		"RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", 
		"UNIT", "INTERFACE", "STRING", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", 
		"IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "EXPONENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", 
		"'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", 
		"'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", 
		"DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", 
		"IN", "INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", 
		"PROGRAM", "REAL", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", 
		"WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
		"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
		"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", 
		"DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "STRING", "TRUE", "FALSE", 
		"WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", 
		"NUM_REAL"
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


	public PASCALetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PASCALet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u026f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G"+
		"\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q"+
		"\3Q\3R\3R\3R\3S\3S\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3["+
		"\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3"+
		"]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3a\3a\3a\3a\7a\u0228"+
		"\na\fa\16a\u022b\13a\3a\3a\3a\3a\3a\3b\3b\7b\u0234\nb\fb\16b\u0237\13"+
		"b\3b\3b\3b\3b\3c\3c\7c\u023f\nc\fc\16c\u0242\13c\3d\3d\3d\3d\7d\u0248"+
		"\nd\fd\16d\u024b\13d\3d\3d\3e\6e\u0250\ne\re\16e\u0251\3f\6f\u0255\nf"+
		"\rf\16f\u0256\3f\3f\6f\u025b\nf\rf\16f\u025c\3f\5f\u0260\nf\5f\u0262\n"+
		"f\3f\5f\u0265\nf\3g\3g\5g\u0269\ng\3g\6g\u026c\ng\rg\16g\u026d\4\u0229"+
		"\u0235\2h\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\b"+
		"C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g"+
		"\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089"+
		",\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b"+
		"\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad"+
		">\u00af?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1"+
		"H\u00c3I\u00c5J\u00c7K\u00c9L\u00cbM\u00cd\2\3\2!\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\""+
		"\4\2C\\c|\6\2\62;C\\aac|\3\2))\4\2--//\2\u0260\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\3\u00cf\3\2\2\2\5\u00d1\3\2\2\2\7\u00d3\3\2\2\2\t\u00d5\3\2\2\2\13"+
		"\u00d7\3\2\2\2\r\u00d9\3\2\2\2\17\u00db\3\2\2\2\21\u00dd\3\2\2\2\23\u00df"+
		"\3\2\2\2\25\u00e1\3\2\2\2\27\u00e3\3\2\2\2\31\u00e5\3\2\2\2\33\u00e7\3"+
		"\2\2\2\35\u00e9\3\2\2\2\37\u00eb\3\2\2\2!\u00ed\3\2\2\2#\u00ef\3\2\2\2"+
		"%\u00f1\3\2\2\2\'\u00f3\3\2\2\2)\u00f5\3\2\2\2+\u00f7\3\2\2\2-\u00f9\3"+
		"\2\2\2/\u00fb\3\2\2\2\61\u00fd\3\2\2\2\63\u00ff\3\2\2\2\65\u0101\3\2\2"+
		"\2\67\u0103\3\2\2\29\u0107\3\2\2\2;\u010d\3\2\2\2=\u0113\3\2\2\2?\u011b"+
		"\3\2\2\2A\u0120\3\2\2\2C\u0125\3\2\2\2E\u012b\3\2\2\2G\u012f\3\2\2\2I"+
		"\u0132\3\2\2\2K\u0139\3\2\2\2M\u013e\3\2\2\2O\u0142\3\2\2\2Q\u0147\3\2"+
		"\2\2S\u014b\3\2\2\2U\u0154\3\2\2\2W\u0159\3\2\2\2Y\u015c\3\2\2\2[\u015f"+
		"\3\2\2\2]\u0167\3\2\2\2_\u016d\3\2\2\2a\u0171\3\2\2\2c\u0175\3\2\2\2e"+
		"\u0179\3\2\2\2g\u017c\3\2\2\2i\u017f\3\2\2\2k\u0189\3\2\2\2m\u0191\3\2"+
		"\2\2o\u0196\3\2\2\2q\u019d\3\2\2\2s\u01a1\3\2\2\2u\u01a6\3\2\2\2w\u01a9"+
		"\3\2\2\2y\u01ae\3\2\2\2{\u01b4\3\2\2\2}\u01b8\3\2\2\2\177\u01be\3\2\2"+
		"\2\u0081\u01c3\3\2\2\2\u0083\u01c5\3\2\2\2\u0085\u01c7\3\2\2\2\u0087\u01c9"+
		"\3\2\2\2\u0089\u01cb\3\2\2\2\u008b\u01ce\3\2\2\2\u008d\u01d0\3\2\2\2\u008f"+
		"\u01d2\3\2\2\2\u0091\u01d4\3\2\2\2\u0093\u01d6\3\2\2\2\u0095\u01d9\3\2"+
		"\2\2\u0097\u01db\3\2\2\2\u0099\u01de\3\2\2\2\u009b\u01e1\3\2\2\2\u009d"+
		"\u01e3\3\2\2\2\u009f\u01e5\3\2\2\2\u00a1\u01e7\3\2\2\2\u00a3\u01e9\3\2"+
		"\2\2\u00a5\u01ec\3\2\2\2\u00a7\u01ee\3\2\2\2\u00a9\u01f1\3\2\2\2\u00ab"+
		"\u01f3\3\2\2\2\u00ad\u01f5\3\2\2\2\u00af\u01f7\3\2\2\2\u00b1\u01fa\3\2"+
		"\2\2\u00b3\u01fc\3\2\2\2\u00b5\u01fe\3\2\2\2\u00b7\u0203\3\2\2\2\u00b9"+
		"\u020d\3\2\2\2\u00bb\u0214\3\2\2\2\u00bd\u0219\3\2\2\2\u00bf\u021f\3\2"+
		"\2\2\u00c1\u0223\3\2\2\2\u00c3\u0231\3\2\2\2\u00c5\u023c\3\2\2\2\u00c7"+
		"\u0243\3\2\2\2\u00c9\u024f\3\2\2\2\u00cb\u0254\3\2\2\2\u00cd\u0266\3\2"+
		"\2\2\u00cf\u00d0\t\2\2\2\u00d0\4\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2\6\3"+
		"\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6\n"+
		"\3\2\2\2\u00d7\u00d8\t\6\2\2\u00d8\f\3\2\2\2\u00d9\u00da\t\7\2\2\u00da"+
		"\16\3\2\2\2\u00db\u00dc\t\b\2\2\u00dc\20\3\2\2\2\u00dd\u00de\t\t\2\2\u00de"+
		"\22\3\2\2\2\u00df\u00e0\t\n\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\t\13\2\2"+
		"\u00e2\26\3\2\2\2\u00e3\u00e4\t\f\2\2\u00e4\30\3\2\2\2\u00e5\u00e6\t\r"+
		"\2\2\u00e6\32\3\2\2\2\u00e7\u00e8\t\16\2\2\u00e8\34\3\2\2\2\u00e9\u00ea"+
		"\t\17\2\2\u00ea\36\3\2\2\2\u00eb\u00ec\t\20\2\2\u00ec \3\2\2\2\u00ed\u00ee"+
		"\t\21\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\t\22\2\2\u00f0$\3\2\2\2\u00f1\u00f2"+
		"\t\23\2\2\u00f2&\3\2\2\2\u00f3\u00f4\t\24\2\2\u00f4(\3\2\2\2\u00f5\u00f6"+
		"\t\25\2\2\u00f6*\3\2\2\2\u00f7\u00f8\t\26\2\2\u00f8,\3\2\2\2\u00f9\u00fa"+
		"\t\27\2\2\u00fa.\3\2\2\2\u00fb\u00fc\t\30\2\2\u00fc\60\3\2\2\2\u00fd\u00fe"+
		"\t\31\2\2\u00fe\62\3\2\2\2\u00ff\u0100\t\32\2\2\u0100\64\3\2\2\2\u0101"+
		"\u0102\t\33\2\2\u0102\66\3\2\2\2\u0103\u0104\5\3\2\2\u0104\u0105\5\35"+
		"\17\2\u0105\u0106\5\t\5\2\u01068\3\2\2\2\u0107\u0108\5\3\2\2\u0108\u0109"+
		"\5%\23\2\u0109\u010a\5%\23\2\u010a\u010b\5\3\2\2\u010b\u010c\5\63\32\2"+
		"\u010c:\3\2\2\2\u010d\u010e\5\5\3\2\u010e\u010f\5\13\6\2\u010f\u0110\5"+
		"\17\b\2\u0110\u0111\5\23\n\2\u0111\u0112\5\35\17\2\u0112<\3\2\2\2\u0113"+
		"\u0114\5\5\3\2\u0114\u0115\5\37\20\2\u0115\u0116\5\37\20\2\u0116\u0117"+
		"\5\31\r\2\u0117\u0118\5\13\6\2\u0118\u0119\5\3\2\2\u0119\u011a\5\35\17"+
		"\2\u011a>\3\2\2\2\u011b\u011c\5\7\4\2\u011c\u011d\5\3\2\2\u011d\u011e"+
		"\5\'\24\2\u011e\u011f\5\13\6\2\u011f@\3\2\2\2\u0120\u0121\5\7\4\2\u0121"+
		"\u0122\5\21\t\2\u0122\u0123\5\3\2\2\u0123\u0124\5%\23\2\u0124B\3\2\2\2"+
		"\u0125\u0126\5\7\4\2\u0126\u0127\5\37\20\2\u0127\u0128\5\35\17\2\u0128"+
		"\u0129\5\'\24\2\u0129\u012a\5)\25\2\u012aD\3\2\2\2\u012b\u012c\5\t\5\2"+
		"\u012c\u012d\5\23\n\2\u012d\u012e\5-\27\2\u012eF\3\2\2\2\u012f\u0130\5"+
		"\t\5\2\u0130\u0131\5\37\20\2\u0131H\3\2\2\2\u0132\u0133\5\t\5\2\u0133"+
		"\u0134\5\37\20\2\u0134\u0135\5/\30\2\u0135\u0136\5\35\17\2\u0136\u0137"+
		"\5)\25\2\u0137\u0138\5\37\20\2\u0138J\3\2\2\2\u0139\u013a\5\13\6\2\u013a"+
		"\u013b\5\31\r\2\u013b\u013c\5\'\24\2\u013c\u013d\5\13\6\2\u013dL\3\2\2"+
		"\2\u013e\u013f\5\13\6\2\u013f\u0140\5\35\17\2\u0140\u0141\5\t\5\2\u0141"+
		"N\3\2\2\2\u0142\u0143\5\r\7\2\u0143\u0144\5\23\n\2\u0144\u0145\5\31\r"+
		"\2\u0145\u0146\5\13\6\2\u0146P\3\2\2\2\u0147\u0148\5\r\7\2\u0148\u0149"+
		"\5\37\20\2\u0149\u014a\5%\23\2\u014aR\3\2\2\2\u014b\u014c\5\r\7\2\u014c"+
		"\u014d\5+\26\2\u014d\u014e\5\35\17\2\u014e\u014f\5\7\4\2\u014f\u0150\5"+
		")\25\2\u0150\u0151\5\23\n\2\u0151\u0152\5\37\20\2\u0152\u0153\5\35\17"+
		"\2\u0153T\3\2\2\2\u0154\u0155\5\17\b\2\u0155\u0156\5\37\20\2\u0156\u0157"+
		"\5)\25\2\u0157\u0158\5\37\20\2\u0158V\3\2\2\2\u0159\u015a\5\23\n\2\u015a"+
		"\u015b\5\r\7\2\u015bX\3\2\2\2\u015c\u015d\5\23\n\2\u015d\u015e\5\35\17"+
		"\2\u015eZ\3\2\2\2\u015f\u0160\5\23\n\2\u0160\u0161\5\35\17\2\u0161\u0162"+
		"\5)\25\2\u0162\u0163\5\13\6\2\u0163\u0164\5\17\b\2\u0164\u0165\5\13\6"+
		"\2\u0165\u0166\5%\23\2\u0166\\\3\2\2\2\u0167\u0168\5\31\r\2\u0168\u0169"+
		"\5\3\2\2\u0169\u016a\5\5\3\2\u016a\u016b\5\13\6\2\u016b\u016c\5\31\r\2"+
		"\u016c^\3\2\2\2\u016d\u016e\5\33\16\2\u016e\u016f\5\37\20\2\u016f\u0170"+
		"\5\t\5\2\u0170`\3\2\2\2\u0171\u0172\5\35\17\2\u0172\u0173\5\23\n\2\u0173"+
		"\u0174\5\31\r\2\u0174b\3\2\2\2\u0175\u0176\5\35\17\2\u0176\u0177\5\37"+
		"\20\2\u0177\u0178\5)\25\2\u0178d\3\2\2\2\u0179\u017a\5\37\20\2\u017a\u017b"+
		"\5\r\7\2\u017bf\3\2\2\2\u017c\u017d\5\37\20\2\u017d\u017e\5%\23\2\u017e"+
		"h\3\2\2\2\u017f\u0180\5!\21\2\u0180\u0181\5%\23\2\u0181\u0182\5\37\20"+
		"\2\u0182\u0183\5\7\4\2\u0183\u0184\5\13\6\2\u0184\u0185\5\t\5\2\u0185"+
		"\u0186\5+\26\2\u0186\u0187\5%\23\2\u0187\u0188\5\13\6\2\u0188j\3\2\2\2"+
		"\u0189\u018a\5!\21\2\u018a\u018b\5%\23\2\u018b\u018c\5\37\20\2\u018c\u018d"+
		"\5\17\b\2\u018d\u018e\5%\23\2\u018e\u018f\5\3\2\2\u018f\u0190\5\33\16"+
		"\2\u0190l\3\2\2\2\u0191\u0192\5%\23\2\u0192\u0193\5\13\6\2\u0193\u0194"+
		"\5\3\2\2\u0194\u0195\5\31\r\2\u0195n\3\2\2\2\u0196\u0197\5%\23\2\u0197"+
		"\u0198\5\13\6\2\u0198\u0199\5!\21\2\u0199\u019a\5\13\6\2\u019a\u019b\5"+
		"\3\2\2\u019b\u019c\5)\25\2\u019cp\3\2\2\2\u019d\u019e\5\'\24\2\u019e\u019f"+
		"\5\13\6\2\u019f\u01a0\5)\25\2\u01a0r\3\2\2\2\u01a1\u01a2\5)\25\2\u01a2"+
		"\u01a3\5\21\t\2\u01a3\u01a4\5\13\6\2\u01a4\u01a5\5\35\17\2\u01a5t\3\2"+
		"\2\2\u01a6\u01a7\5)\25\2\u01a7\u01a8\5\37\20\2\u01a8v\3\2\2\2\u01a9\u01aa"+
		"\5)\25\2\u01aa\u01ab\5\63\32\2\u01ab\u01ac\5!\21\2\u01ac\u01ad\5\13\6"+
		"\2\u01adx\3\2\2\2\u01ae\u01af\5+\26\2\u01af\u01b0\5\35\17\2\u01b0\u01b1"+
		"\5)\25\2\u01b1\u01b2\5\23\n\2\u01b2\u01b3\5\31\r\2\u01b3z\3\2\2\2\u01b4"+
		"\u01b5\5-\27\2\u01b5\u01b6\5\3\2\2\u01b6\u01b7\5%\23\2\u01b7|\3\2\2\2"+
		"\u01b8\u01b9\5/\30\2\u01b9\u01ba\5\21\t\2\u01ba\u01bb\5\23\n\2\u01bb\u01bc"+
		"\5\31\r\2\u01bc\u01bd\5\13\6\2\u01bd~\3\2\2\2\u01be\u01bf\5/\30\2\u01bf"+
		"\u01c0\5\23\n\2\u01c0\u01c1\5)\25\2\u01c1\u01c2\5\21\t\2\u01c2\u0080\3"+
		"\2\2\2\u01c3\u01c4\7-\2\2\u01c4\u0082\3\2\2\2\u01c5\u01c6\7/\2\2\u01c6"+
		"\u0084\3\2\2\2\u01c7\u01c8\7,\2\2\u01c8\u0086\3\2\2\2\u01c9\u01ca\7\61"+
		"\2\2\u01ca\u0088\3\2\2\2\u01cb\u01cc\7<\2\2\u01cc\u01cd\7?\2\2\u01cd\u008a"+
		"\3\2\2\2\u01ce\u01cf\7.\2\2\u01cf\u008c\3\2\2\2\u01d0\u01d1\7=\2\2\u01d1"+
		"\u008e\3\2\2\2\u01d2\u01d3\7<\2\2\u01d3\u0090\3\2\2\2\u01d4\u01d5\7?\2"+
		"\2\u01d5\u0092\3\2\2\2\u01d6\u01d7\7>\2\2\u01d7\u01d8\7@\2\2\u01d8\u0094"+
		"\3\2\2\2\u01d9\u01da\7>\2\2\u01da\u0096\3\2\2\2\u01db\u01dc\7>\2\2\u01dc"+
		"\u01dd\7?\2\2\u01dd\u0098\3\2\2\2\u01de\u01df\7@\2\2\u01df\u01e0\7?\2"+
		"\2\u01e0\u009a\3\2\2\2\u01e1\u01e2\7@\2\2\u01e2\u009c\3\2\2\2\u01e3\u01e4"+
		"\7*\2\2\u01e4\u009e\3\2\2\2\u01e5\u01e6\7+\2\2\u01e6\u00a0\3\2\2\2\u01e7"+
		"\u01e8\7]\2\2\u01e8\u00a2\3\2\2\2\u01e9\u01ea\7*\2\2\u01ea\u01eb\7\60"+
		"\2\2\u01eb\u00a4\3\2\2\2\u01ec\u01ed\7_\2\2\u01ed\u00a6\3\2\2\2\u01ee"+
		"\u01ef\7\60\2\2\u01ef\u01f0\7+\2\2\u01f0\u00a8\3\2\2\2\u01f1\u01f2\7`"+
		"\2\2\u01f2\u00aa\3\2\2\2\u01f3\u01f4\7B\2\2\u01f4\u00ac\3\2\2\2\u01f5"+
		"\u01f6\7\60\2\2\u01f6\u00ae\3\2\2\2\u01f7\u01f8\7\60\2\2\u01f8\u01f9\7"+
		"\60\2\2\u01f9\u00b0\3\2\2\2\u01fa\u01fb\7}\2\2\u01fb\u00b2\3\2\2\2\u01fc"+
		"\u01fd\7\177\2\2\u01fd\u00b4\3\2\2\2\u01fe\u01ff\5+\26\2\u01ff\u0200\5"+
		"\35\17\2\u0200\u0201\5\23\n\2\u0201\u0202\5)\25\2\u0202\u00b6\3\2\2\2"+
		"\u0203\u0204\5\23\n\2\u0204\u0205\5\35\17\2\u0205\u0206\5)\25\2\u0206"+
		"\u0207\5\13\6\2\u0207\u0208\5%\23\2\u0208\u0209\5\r\7\2\u0209\u020a\5"+
		"\3\2\2\u020a\u020b\5\7\4\2\u020b\u020c\5\13\6\2\u020c\u00b8\3\2\2\2\u020d"+
		"\u020e\5\'\24\2\u020e\u020f\5)\25\2\u020f\u0210\5%\23\2\u0210\u0211\5"+
		"\23\n\2\u0211\u0212\5\35\17\2\u0212\u0213\5\17\b\2\u0213\u00ba\3\2\2\2"+
		"\u0214\u0215\5)\25\2\u0215\u0216\5%\23\2\u0216\u0217\5+\26\2\u0217\u0218"+
		"\5\13\6\2\u0218\u00bc\3\2\2\2\u0219\u021a\5\r\7\2\u021a\u021b\5\3\2\2"+
		"\u021b\u021c\5\31\r\2\u021c\u021d\5\'\24\2\u021d\u021e\5\13\6\2\u021e"+
		"\u00be\3\2\2\2\u021f\u0220\t\34\2\2\u0220\u0221\3\2\2\2\u0221\u0222\b"+
		"`\2\2\u0222\u00c0\3\2\2\2\u0223\u0224\7*\2\2\u0224\u0225\7,\2\2\u0225"+
		"\u0229\3\2\2\2\u0226\u0228\13\2\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3"+
		"\2\2\2\u0229\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\7,\2\2\u022d\u022e\7+\2\2\u022e\u022f\3\2\2"+
		"\2\u022f\u0230\ba\2\2\u0230\u00c2\3\2\2\2\u0231\u0235\7}\2\2\u0232\u0234"+
		"\13\2\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0236\3\2\2\2"+
		"\u0235\u0233\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239"+
		"\7\177\2\2\u0239\u023a\3\2\2\2\u023a\u023b\bb\2\2\u023b\u00c4\3\2\2\2"+
		"\u023c\u0240\t\35\2\2\u023d\u023f\t\36\2\2\u023e\u023d\3\2\2\2\u023f\u0242"+
		"\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u00c6\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0249\7)\2\2\u0244\u0245\7)\2\2\u0245\u0248\7)\2"+
		"\2\u0246\u0248\n\37\2\2\u0247\u0244\3\2\2\2\u0247\u0246\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7)\2\2\u024d\u00c8\3\2\2\2\u024e"+
		"\u0250\4\62;\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u00ca\3\2\2\2\u0253\u0255\4\62;\2\u0254"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0264\3\2\2\2\u0258\u025a\7\60\2\2\u0259\u025b\4\62;\2\u025a"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025f\3\2\2\2\u025e\u0260\5\u00cdg\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0258\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0265\3\2\2\2\u0263\u0265\5\u00cdg\2\u0264\u0261\3\2\2\2\u0264"+
		"\u0263\3\2\2\2\u0265\u00cc\3\2\2\2\u0266\u0268\7g\2\2\u0267\u0269\t \2"+
		"\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c"+
		"\4\62;\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u00ce\3\2\2\2\20\2\u0229\u0235\u0240\u0247\u0249"+
		"\u0251\u0256\u025c\u025f\u0261\u0264\u0268\u026d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}