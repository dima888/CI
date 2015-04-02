// $ANTLR 3.4 /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g 2015-03-30 17:18:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int ADDITION=4;
    public static final int ALLOCATE=5;
    public static final int CLAMP_CLOSE=6;
    public static final int CLAMP_OPEN=7;
    public static final int CommentHidden=8;
    public static final int Compare_operators=9;
    public static final int DIVISION=10;
    public static final int HiddenCondition=11;
    public static final int INSTRUCTION_END=12;
    public static final int INSTRUCTION_NEXT=13;
    public static final int Identifier=14;
    public static final int Integer_value=15;
    public static final int MULTIPLICATION=16;
    public static final int My_od=17;
    public static final int Real_vlaue=18;
    public static final int SUBTRACTION=19;
    public static final int String_value=20;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public miniPLexer() {} 
    public miniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public miniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:2:7: ( 'begin' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:2:9: 'begin'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:3:7: ( 'boolean' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:3:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:4:7: ( 'do' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:4:9: 'do'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:7: ( 'else' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:9: 'else'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:6:7: ( 'end' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:6:9: 'end'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:7:7: ( 'false' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:7:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:7: ( 'fi' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:9: 'fi'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:9:7: ( 'if' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:9:9: 'if'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:10:7: ( 'integer' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:10:9: 'integer'
            {
            match("integer"); 



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
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:7: ( 'println' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:9: 'println'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:12:7: ( 'program' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:12:9: 'program'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:13:7: ( 'read' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:13:9: 'read'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:14:7: ( 'real' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:14:9: 'real'
            {
            match("real"); 



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
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:15:7: ( 'string' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:15:9: 'string'
            {
            match("string"); 



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
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:16:7: ( 'then' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:16:9: 'then'
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:17:7: ( 'true' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:17:9: 'true'
            {
            match("true"); 



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
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:18:7: ( 'while' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:18:9: 'while'
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
    // $ANTLR end "T__37"

    // $ANTLR start "My_od"
    public final void mMy_od() throws RecognitionException {
        try {
            int _type = My_od;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:47:7: ( 'od' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:47:9: 'od'
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
    // $ANTLR end "My_od"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:48:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:48:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:48:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
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
            	    break loop1;
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
    // $ANTLR end "Identifier"

    // $ANTLR start "INSTRUCTION_NEXT"
    public final void mINSTRUCTION_NEXT() throws RecognitionException {
        try {
            int _type = INSTRUCTION_NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:49:17: ( ',' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:49:19: ','
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
    // $ANTLR end "INSTRUCTION_NEXT"

    // $ANTLR start "INSTRUCTION_END"
    public final void mINSTRUCTION_END() throws RecognitionException {
        try {
            int _type = INSTRUCTION_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:50:17: ( ';' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:50:19: ';'
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
    // $ANTLR end "INSTRUCTION_END"

    // $ANTLR start "Integer_value"
    public final void mInteger_value() throws RecognitionException {
        try {
            int _type = Integer_value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:15: ( ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) ) )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:17: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:17: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:18: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:24: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:24: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:26: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:58:37: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
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
                    	    break loop2;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "Integer_value"

    // $ANTLR start "String_value"
    public final void mString_value() throws RecognitionException {
        try {
            int _type = String_value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:59:14: ( '\\'' (~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:59:16: '\\'' (~ ( '\\\\' | '\\'' ) )* '\\''
            {
            match('\''); 

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:59:21: (~ ( '\\\\' | '\\'' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "String_value"

    // $ANTLR start "Real_vlaue"
    public final void mReal_vlaue() throws RecognitionException {
        try {
            int _type = Real_vlaue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:13: ( ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) ) '.' ( '0' .. '9' )+ )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:15: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) ) '.' ( '0' .. '9' )+
            {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:15: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:22: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:22: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:24: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:35: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
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


                    }
                    break;

            }


            match('.'); 

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:60:55: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Real_vlaue"

    // $ANTLR start "ALLOCATE"
    public final void mALLOCATE() throws RecognitionException {
        try {
            int _type = ALLOCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:65:12: ( ':=' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:65:14: ':='
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
    // $ANTLR end "ALLOCATE"

    // $ANTLR start "Compare_operators"
    public final void mCompare_operators() throws RecognitionException {
        try {
            int _type = Compare_operators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:2: ( '=' | '<>' | '<' | '>' | '<=' | '>=' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt8=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt8=2;
                    }
                    break;
                case '=':
                    {
                    alt8=5;
                    }
                    break;
                default:
                    alt8=3;
                }

                }
                break;
            case '>':
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3=='=') ) {
                    alt8=6;
                }
                else {
                    alt8=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:4: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:10: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 3 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:17: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:23: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 5 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:29: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 6 :
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:67:36: '>='
                    {
                    match(">="); 



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
    // $ANTLR end "Compare_operators"

    // $ANTLR start "ADDITION"
    public final void mADDITION() throws RecognitionException {
        try {
            int _type = ADDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:70:10: ( '+' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:70:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADDITION"

    // $ANTLR start "SUBTRACTION"
    public final void mSUBTRACTION() throws RecognitionException {
        try {
            int _type = SUBTRACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:71:14: ( '-' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:71:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBTRACTION"

    // $ANTLR start "MULTIPLICATION"
    public final void mMULTIPLICATION() throws RecognitionException {
        try {
            int _type = MULTIPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:72:16: ( '*' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:72:18: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLICATION"

    // $ANTLR start "DIVISION"
    public final void mDIVISION() throws RecognitionException {
        try {
            int _type = DIVISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:73:11: ( '/' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:73:13: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVISION"

    // $ANTLR start "CLAMP_OPEN"
    public final void mCLAMP_OPEN() throws RecognitionException {
        try {
            int _type = CLAMP_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:74:12: ( '(' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:74:14: '('
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
    // $ANTLR end "CLAMP_OPEN"

    // $ANTLR start "CLAMP_CLOSE"
    public final void mCLAMP_CLOSE() throws RecognitionException {
        try {
            int _type = CLAMP_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:75:13: ( ')' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:75:15: ')'
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
    // $ANTLR end "CLAMP_CLOSE"

    // $ANTLR start "CommentHidden"
    public final void mCommentHidden() throws RecognitionException {
        try {
            int _type = CommentHidden;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:77:21: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:77:26: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:77:31: ( options {greedy=false; } : . )*
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
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:77:59: .
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
    // $ANTLR end "CommentHidden"

    // $ANTLR start "HiddenCondition"
    public final void mHiddenCondition() throws RecognitionException {
        try {
            int _type = HiddenCondition;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:78:17: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:78:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:78:19: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
        // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | My_od | Identifier | INSTRUCTION_NEXT | INSTRUCTION_END | Integer_value | String_value | Real_vlaue | ALLOCATE | Compare_operators | ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION | CLAMP_OPEN | CLAMP_CLOSE | CommentHidden | HiddenCondition )
        int alt11=34;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:10: T__21
                {
                mT__21(); 


                }
                break;
            case 2 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:16: T__22
                {
                mT__22(); 


                }
                break;
            case 3 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:22: T__23
                {
                mT__23(); 


                }
                break;
            case 4 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:28: T__24
                {
                mT__24(); 


                }
                break;
            case 5 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:34: T__25
                {
                mT__25(); 


                }
                break;
            case 6 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:40: T__26
                {
                mT__26(); 


                }
                break;
            case 7 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:46: T__27
                {
                mT__27(); 


                }
                break;
            case 8 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:52: T__28
                {
                mT__28(); 


                }
                break;
            case 9 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:58: T__29
                {
                mT__29(); 


                }
                break;
            case 10 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:64: T__30
                {
                mT__30(); 


                }
                break;
            case 11 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:70: T__31
                {
                mT__31(); 


                }
                break;
            case 12 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:76: T__32
                {
                mT__32(); 


                }
                break;
            case 13 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:82: T__33
                {
                mT__33(); 


                }
                break;
            case 14 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:88: T__34
                {
                mT__34(); 


                }
                break;
            case 15 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:94: T__35
                {
                mT__35(); 


                }
                break;
            case 16 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:100: T__36
                {
                mT__36(); 


                }
                break;
            case 17 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:106: T__37
                {
                mT__37(); 


                }
                break;
            case 18 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:112: My_od
                {
                mMy_od(); 


                }
                break;
            case 19 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:118: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 20 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:129: INSTRUCTION_NEXT
                {
                mINSTRUCTION_NEXT(); 


                }
                break;
            case 21 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:146: INSTRUCTION_END
                {
                mINSTRUCTION_END(); 


                }
                break;
            case 22 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:162: Integer_value
                {
                mInteger_value(); 


                }
                break;
            case 23 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:176: String_value
                {
                mString_value(); 


                }
                break;
            case 24 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:189: Real_vlaue
                {
                mReal_vlaue(); 


                }
                break;
            case 25 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:200: ALLOCATE
                {
                mALLOCATE(); 


                }
                break;
            case 26 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:209: Compare_operators
                {
                mCompare_operators(); 


                }
                break;
            case 27 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:227: ADDITION
                {
                mADDITION(); 


                }
                break;
            case 28 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:236: SUBTRACTION
                {
                mSUBTRACTION(); 


                }
                break;
            case 29 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:248: MULTIPLICATION
                {
                mMULTIPLICATION(); 


                }
                break;
            case 30 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:263: DIVISION
                {
                mDIVISION(); 


                }
                break;
            case 31 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:272: CLAMP_OPEN
                {
                mCLAMP_OPEN(); 


                }
                break;
            case 32 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:283: CLAMP_CLOSE
                {
                mCLAMP_CLOSE(); 


                }
                break;
            case 33 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:295: CommentHidden
                {
                mCommentHidden(); 


                }
                break;
            case 34 :
                // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:1:309: HiddenCondition
                {
                mHiddenCondition(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\13\14\3\uffff\2\53\6\uffff\1\57\3\uffff\2\14\1\62\3\14"+
        "\1\66\1\67\7\14\1\100\2\uffff\1\53\2\uffff\2\14\1\uffff\1\14\1\104"+
        "\1\14\2\uffff\10\14\1\uffff\2\14\1\121\1\uffff\4\14\1\126\1\127"+
        "\1\14\1\131\1\132\1\14\1\134\1\14\1\uffff\1\136\3\14\2\uffff\1\14"+
        "\2\uffff\1\143\1\uffff\1\14\1\uffff\3\14\1\150\1\uffff\1\151\1\152"+
        "\1\153\1\154\5\uffff";
    static final String DFA11_eofS =
        "\155\uffff";
    static final String DFA11_minS =
        "\1\11\1\145\1\157\1\154\1\141\1\146\1\162\1\145\1\164\2\150\1\144"+
        "\3\uffff\2\56\6\uffff\1\52\3\uffff\1\147\1\157\1\60\1\163\1\144"+
        "\1\154\2\60\1\164\1\151\1\141\1\162\1\145\1\165\1\151\1\60\2\uffff"+
        "\1\56\2\uffff\1\151\1\154\1\uffff\1\145\1\60\1\163\2\uffff\1\145"+
        "\1\156\1\147\1\144\1\151\1\156\1\145\1\154\1\uffff\1\156\1\145\1"+
        "\60\1\uffff\1\145\1\147\1\164\1\162\2\60\1\156\2\60\1\145\1\60\1"+
        "\141\1\uffff\1\60\1\145\1\154\1\141\2\uffff\1\147\2\uffff\1\60\1"+
        "\uffff\1\156\1\uffff\1\162\1\156\1\155\1\60\1\uffff\4\60\5\uffff";
    static final String DFA11_maxS =
        "\1\172\2\157\1\156\1\151\1\156\1\162\1\145\1\164\1\162\1\150\1\144"+
        "\3\uffff\1\56\1\71\6\uffff\1\52\3\uffff\1\147\1\157\1\172\1\163"+
        "\1\144\1\154\2\172\1\164\1\157\1\141\1\162\1\145\1\165\1\151\1\172"+
        "\2\uffff\1\71\2\uffff\1\151\1\154\1\uffff\1\145\1\172\1\163\2\uffff"+
        "\1\145\1\156\1\147\1\154\1\151\1\156\1\145\1\154\1\uffff\1\156\1"+
        "\145\1\172\1\uffff\1\145\1\147\1\164\1\162\2\172\1\156\2\172\1\145"+
        "\1\172\1\141\1\uffff\1\172\1\145\1\154\1\141\2\uffff\1\147\2\uffff"+
        "\1\172\1\uffff\1\156\1\uffff\1\162\1\156\1\155\1\172\1\uffff\4\172"+
        "\5\uffff";
    static final String DFA11_acceptS =
        "\14\uffff\1\23\1\24\1\25\2\uffff\1\27\1\31\1\32\1\33\1\34\1\35\1"+
        "\uffff\1\37\1\40\1\42\20\uffff\1\26\1\30\1\uffff\1\41\1\36\2\uffff"+
        "\1\3\3\uffff\1\7\1\10\10\uffff\1\22\3\uffff\1\5\14\uffff\1\4\4\uffff"+
        "\1\14\1\15\1\uffff\1\17\1\20\1\uffff\1\1\1\uffff\1\6\4\uffff\1\21"+
        "\4\uffff\1\16\1\2\1\11\1\12\1\13";
    static final String DFA11_specialS =
        "\155\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\6\uffff\1\21\1\30\1\31\1\26"+
            "\1\24\1\15\1\25\1\uffff\1\27\1\17\11\20\1\22\1\16\3\23\2\uffff"+
            "\32\14\6\uffff\1\14\1\1\1\14\1\2\1\3\1\4\2\14\1\5\5\14\1\13"+
            "\1\6\1\14\1\7\1\10\1\11\2\14\1\12\3\14",
            "\1\33\11\uffff\1\34",
            "\1\35",
            "\1\36\1\uffff\1\37",
            "\1\40\7\uffff\1\41",
            "\1\42\7\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\11\uffff\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\54",
            "\1\54\1\uffff\12\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\70",
            "\1\71\5\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "\1\54\1\uffff\12\55",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\7\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\130",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\133",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\135",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | My_od | Identifier | INSTRUCTION_NEXT | INSTRUCTION_END | Integer_value | String_value | Real_vlaue | ALLOCATE | Compare_operators | ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION | CLAMP_OPEN | CLAMP_CLOSE | CommentHidden | HiddenCondition );";
        }
    }
 

}