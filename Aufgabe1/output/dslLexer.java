// $ANTLR 3.4 /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g 2015-03-30 15:11:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class dslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Allocate=4;
    public static final int Char=5;
    public static final int HiddenCondition=6;
    public static final int Operator=7;

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
    public String getGrammarFileName() { return "/Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g"; }

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:18:6: ( ( 'A' .. 'Z' ) )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
    // $ANTLR end "Char"

    // $ANTLR start "Operator"
    public final void mOperator() throws RecognitionException {
        try {
            int _type = Operator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:19:9: ( ( '+' | '-' ) )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:
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
    // $ANTLR end "Operator"

    // $ANTLR start "Allocate"
    public final void mAllocate() throws RecognitionException {
        try {
            int _type = Allocate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:20:9: ( '=' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:20:11: '='
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
    // $ANTLR end "Allocate"

    // $ANTLR start "HiddenCondition"
    public final void mHiddenCondition() throws RecognitionException {
        try {
            int _type = HiddenCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:21:17: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:21:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:21:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:
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
        // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:1:8: ( Char | Operator | Allocate | HiddenCondition )
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
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:1:10: Char
                {
                mChar(); 


                }
                break;
            case 2 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:1:15: Operator
                {
                mOperator(); 


                }
                break;
            case 3 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:1:24: Allocate
                {
                mAllocate(); 


                }
                break;
            case 4 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:1:33: HiddenCondition
                {
                mHiddenCondition(); 


                }
                break;

        }

    }


 

}