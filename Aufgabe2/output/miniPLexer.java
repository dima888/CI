// $ANTLR 3.4 C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g 2015-05-20 14:40:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BEGIN=4;
    public static final int BOOL=5;
    public static final int COMMA=6;
    public static final int COMMENT=7;
    public static final int DECLS=8;
    public static final int DEF=9;
    public static final int DIGIT=10;
    public static final int END=11;
    public static final int FLOAT=12;
    public static final int ID=13;
    public static final int IDLIST=14;
    public static final int INT=15;
    public static final int LETTER=16;
    public static final int MAIN=17;
    public static final int PROGRAM=18;
    public static final int PUNKT_OP=19;
    public static final int RELOP=20;
    public static final int SEMICOL=21;
    public static final int SLIST=22;
    public static final int STRICH_OP=23;
    public static final int STRING=24;
    public static final int TYPE=25;
    public static final int WS=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniPLexer() {} 
    public MiniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:2:7: ( '(' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:3:7: ( ')' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:4:7: ( 'do' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:4:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:5:7: ( 'else' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:5:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:6:7: ( 'fi' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:6:9: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:7:7: ( 'if' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:7:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:8:7: ( 'od' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:8:9: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:9:7: ( 'print' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:9:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:10:7: ( 'println' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:10:9: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:11:7: ( 'read' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:11:9: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:12:7: ( 'then' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:12:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:13:7: ( 'while' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:13:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:28:6: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:28:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:28:17: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:56:4: ( ':=' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:56:6: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "PUNKT_OP"
    public final void mPUNKT_OP() throws RecognitionException {
        try {
            int _type = PUNKT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:58:9: ( ( '*' | '/' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUNKT_OP"

    // $ANTLR start "STRICH_OP"
    public final void mSTRICH_OP() throws RecognitionException {
        try {
            int _type = STRICH_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:60:10: ( ( '+' | '-' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRICH_OP"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:6: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:8: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:8: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt2=2;
                    }
                    break;
                case '=':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    alt2=3;
                }

                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=5;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:15: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:22: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:28: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:62:41: '>='
                    {
                    match(">="); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:64:8: ( 'program' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:64:10: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:66:6: ( 'begin' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:66:8: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:68:4: ( 'end' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:68:6: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:5: ( ( 'integer' | 'string' | 'real' | 'boolean' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:7: ( 'integer' | 'string' | 'real' | 'boolean' )
            {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:7: ( 'integer' | 'string' | 'real' | 'boolean' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt3=1;
                }
                break;
            case 's':
                {
                alt3=2;
                }
                break;
            case 'r':
                {
                alt3=3;
                }
                break;
            case 'b':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:8: 'integer'
                    {
                    match("integer"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:20: 'string'
                    {
                    match("string"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:31: 'real'
                    {
                    match("real"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:70:40: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "SEMICOL"
    public final void mSEMICOL() throws RecognitionException {
        try {
            int _type = SEMICOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:72:8: ( ';' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:72:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:74:6: ( ',' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:74:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:76:6: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:76:8: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:76:8: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match('.'); 

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:76:24: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:78:4: ( ( '0' .. '9' )+ )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:78:6: ( '0' .. '9' )+
            {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:78:6: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:80:7: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '0' .. '9' )* '\"' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:80:9: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '0' .. '9' )* '\"'
            {
            match('\"'); 

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:80:13: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==' '||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:82:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' ) | '_' )* )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:82:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:82:27: ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' ) | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:84:8: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:84:10: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:84:15: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:84:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:86:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:86:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:90:6: ( ( '0' .. '9' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:93:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | BOOL | DEF | PUNKT_OP | STRICH_OP | RELOP | PROGRAM | BEGIN | END | TYPE | SEMICOL | COMMA | FLOAT | INT | STRING | ID | COMMENT | WS )
        int alt10=29;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:58: T__35
                {
                mT__35(); 


                }
                break;
            case 10 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:64: T__36
                {
                mT__36(); 


                }
                break;
            case 11 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:70: T__37
                {
                mT__37(); 


                }
                break;
            case 12 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:76: T__38
                {
                mT__38(); 


                }
                break;
            case 13 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:82: BOOL
                {
                mBOOL(); 


                }
                break;
            case 14 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:87: DEF
                {
                mDEF(); 


                }
                break;
            case 15 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:91: PUNKT_OP
                {
                mPUNKT_OP(); 


                }
                break;
            case 16 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:100: STRICH_OP
                {
                mSTRICH_OP(); 


                }
                break;
            case 17 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:110: RELOP
                {
                mRELOP(); 


                }
                break;
            case 18 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:116: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 19 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:124: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 20 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:130: END
                {
                mEND(); 


                }
                break;
            case 21 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:134: TYPE
                {
                mTYPE(); 


                }
                break;
            case 22 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:139: SEMICOL
                {
                mSEMICOL(); 


                }
                break;
            case 23 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:147: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 24 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:153: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 25 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:159: INT
                {
                mINT(); 


                }
                break;
            case 26 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:163: STRING
                {
                mSTRING(); 


                }
                break;
            case 27 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:170: ID
                {
                mID(); 


                }
                break;
            case 28 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:173: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 29 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:1:181: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\3\uffff\11\26\1\uffff\1\27\2\uffff\2\26\2\uffff\1\53\4\uffff\1"+
        "\54\2\26\1\57\1\26\1\61\1\26\1\63\5\26\1\uffff\3\26\3\uffff\1\26"+
        "\1\76\1\uffff\1\26\1\uffff\1\26\1\uffff\11\26\1\113\1\uffff\4\26"+
        "\1\120\1\121\1\122\1\123\4\26\1\uffff\1\123\1\26\1\132\1\26\4\uffff"+
        "\1\134\1\135\4\26\1\uffff\1\26\2\uffff\1\26\2\121\1\144\1\145\1"+
        "\121\2\uffff";
    static final String DFA10_eofS =
        "\146\uffff";
    static final String DFA10_minS =
        "\1\11\2\uffff\1\157\1\154\1\141\1\146\1\144\1\162\1\145\2\150\1"+
        "\uffff\1\52\2\uffff\1\145\1\164\2\uffff\1\56\4\uffff\1\60\1\163"+
        "\1\144\1\60\1\154\1\60\1\164\1\60\1\151\1\141\1\145\1\165\1\151"+
        "\1\uffff\1\147\1\157\1\162\3\uffff\1\145\1\60\1\uffff\1\163\1\uffff"+
        "\1\145\1\uffff\1\156\1\147\1\144\1\156\1\145\1\154\1\151\1\154\1"+
        "\151\1\60\1\uffff\1\145\1\147\1\164\1\162\4\60\1\145\1\156\1\145"+
        "\1\156\1\uffff\1\60\1\145\1\60\1\141\4\uffff\2\60\1\141\1\147\1"+
        "\162\1\156\1\uffff\1\155\2\uffff\1\156\5\60\2\uffff";
    static final String DFA10_maxS =
        "\1\172\2\uffff\1\157\1\156\1\151\1\156\1\144\1\162\1\145\1\162\1"+
        "\150\1\uffff\1\52\2\uffff\1\157\1\164\2\uffff\1\71\4\uffff\1\172"+
        "\1\163\1\144\1\172\1\154\1\172\1\164\1\172\1\157\1\141\1\145\1\165"+
        "\1\151\1\uffff\1\147\1\157\1\162\3\uffff\1\145\1\172\1\uffff\1\163"+
        "\1\uffff\1\145\1\uffff\1\156\1\147\1\154\1\156\1\145\1\154\1\151"+
        "\1\154\1\151\1\172\1\uffff\1\145\1\147\1\164\1\162\4\172\1\145\1"+
        "\156\1\145\1\156\1\uffff\1\172\1\145\1\172\1\141\4\uffff\2\172\1"+
        "\141\1\147\1\162\1\156\1\uffff\1\155\2\uffff\1\156\5\172\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\11\uffff\1\16\1\uffff\1\20\1\21\2\uffff\1\26\1"+
        "\27\1\uffff\1\32\1\33\1\17\1\35\15\uffff\1\34\3\uffff\1\30\1\31"+
        "\1\3\2\uffff\1\5\1\uffff\1\6\1\uffff\1\7\12\uffff\1\24\14\uffff"+
        "\1\4\4\uffff\1\12\1\25\1\13\1\15\6\uffff\1\10\1\uffff\1\14\1\23"+
        "\6\uffff\1\11\1\22";
    static final String DFA10_specialS =
        "\146\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\25\5\uffff\1\1\1"+
            "\2\1\27\1\16\1\23\1\16\1\uffff\1\15\12\24\1\14\1\22\3\17\2\uffff"+
            "\32\26\6\uffff\1\26\1\20\1\26\1\3\1\4\1\5\2\26\1\6\5\26\1\7"+
            "\1\10\1\26\1\11\1\21\1\12\2\26\1\13\3\26",
            "",
            "",
            "\1\31",
            "\1\32\1\uffff\1\33",
            "\1\35\7\uffff\1\34",
            "\1\36\7\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\11\uffff\1\44",
            "\1\45",
            "",
            "\1\46",
            "",
            "",
            "\1\47\11\uffff\1\50",
            "\1\51",
            "",
            "",
            "\1\52\1\uffff\12\24",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\55",
            "\1\56",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\60",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\62",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\64\5\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103\7\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\130",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\13\26\1\131\16\26",
            "\1\133",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "",
            "",
            "\1\143",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | BOOL | DEF | PUNKT_OP | STRICH_OP | RELOP | PROGRAM | BEGIN | END | TYPE | SEMICOL | COMMA | FLOAT | INT | STRING | ID | COMMENT | WS );";
        }
    }
 

}