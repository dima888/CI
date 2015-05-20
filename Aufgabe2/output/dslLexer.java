// $ANTLR 3.4 C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g 2015-05-20 12:52:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class dslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int HiddenCondition=4;
    public static final int ID=5;
    public static final int OP=6;
    public static final int RAETSEL=7;
    public static final int WORT=8;
    public static final int ZUW=9;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public dslLexer() {} 
    public dslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public dslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:42:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:43:4: ( ( '+' | '-' ) )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:
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
    // $ANTLR end "OP"

    // $ANTLR start "ZUW"
    public final void mZUW() throws RecognitionException {
        try {
            int _type = ZUW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:44:5: ( '=' )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:44:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZUW"

    // $ANTLR start "HiddenCondition"
    public final void mHiddenCondition() throws RecognitionException {
        try {
            int _type = HiddenCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:46:17: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:46:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:46:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HiddenCondition"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:1:8: ( ID | OP | ZUW | HiddenCondition )
        int alt2=4;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt2=1;
            }
            break;
        case '+':
        case '-':
            {
            alt2=2;
            }
            break;
        case '=':
            {
            alt2=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:1:13: OP
                {
                mOP(); 


                }
                break;
            case 3 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:1:16: ZUW
                {
                mZUW(); 


                }
                break;
            case 4 :
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:1:20: HiddenCondition
                {
                mHiddenCondition(); 


                }
                break;

        }

    }


 

}