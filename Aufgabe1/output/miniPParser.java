// $ANTLR 3.4 /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g 2015-03-30 17:18:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDITION", "ALLOCATE", "CLAMP_CLOSE", "CLAMP_OPEN", "CommentHidden", "Compare_operators", "DIVISION", "HiddenCondition", "INSTRUCTION_END", "INSTRUCTION_NEXT", "Identifier", "Integer_value", "MULTIPLICATION", "My_od", "Real_vlaue", "SUBTRACTION", "String_value", "'begin'", "'boolean'", "'do'", "'else'", "'end'", "'false'", "'fi'", "'if'", "'integer'", "'println'", "'program'", "'read'", "'real'", "'string'", "'then'", "'true'", "'while'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "if_statement", "deklarationen", "then_statement", "miniP", 
    "while_statement", "else_statement", "my_do", "anweisungen", "dataType", 
    "print_statement", "compare", "arithmetic_operators", "valueAllocate", 
    "read_statement"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public miniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public miniPParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public miniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return miniPParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g"; }



    // $ANTLR start "miniP"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:3:1: miniP : 'program' ( deklarationen )* 'begin' ( anweisungen )* 'end' ;
    public final void miniP() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "miniP");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:3:8: ( 'program' ( deklarationen )* 'begin' ( anweisungen )* 'end' )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:2: 'program' ( deklarationen )* 'begin' ( anweisungen )* 'end'
            {
            dbg.location(5,2);
            match(input,31,FOLLOW_31_in_miniP14); 
            dbg.location(5,12);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:12: ( deklarationen )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==29||(LA1_0 >= 33 && LA1_0 <= 34)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:13: deklarationen
            	    {
            	    dbg.location(5,13);
            	    pushFollow(FOLLOW_deklarationen_in_miniP17);
            	    deklarationen();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(5,29);
            match(input,21,FOLLOW_21_in_miniP21); 
            dbg.location(5,37);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:37: ( anweisungen )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==28||LA2_0==30||LA2_0==32||LA2_0==37) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:5:38: anweisungen
            	    {
            	    dbg.location(5,38);
            	    pushFollow(FOLLOW_anweisungen_in_miniP24);
            	    anweisungen();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(5,52);
            match(input,25,FOLLOW_25_in_miniP28); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(5, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "miniP");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "miniP"



    // $ANTLR start "deklarationen"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:7:1: deklarationen : dataType Identifier ( INSTRUCTION_NEXT Identifier )* INSTRUCTION_END ;
    public final void deklarationen() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "deklarationen");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:2: ( dataType Identifier ( INSTRUCTION_NEXT Identifier )* INSTRUCTION_END )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:4: dataType Identifier ( INSTRUCTION_NEXT Identifier )* INSTRUCTION_END
            {
            dbg.location(8,4);
            pushFollow(FOLLOW_dataType_in_deklarationen38);
            dataType();

            state._fsp--;

            dbg.location(8,13);
            match(input,Identifier,FOLLOW_Identifier_in_deklarationen40); 
            dbg.location(8,24);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:24: ( INSTRUCTION_NEXT Identifier )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==INSTRUCTION_NEXT) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:8:25: INSTRUCTION_NEXT Identifier
            	    {
            	    dbg.location(8,25);
            	    match(input,INSTRUCTION_NEXT,FOLLOW_INSTRUCTION_NEXT_in_deklarationen43); 
            	    dbg.location(8,42);
            	    match(input,Identifier,FOLLOW_Identifier_in_deklarationen45); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(8,55);
            match(input,INSTRUCTION_END,FOLLOW_INSTRUCTION_END_in_deklarationen49); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deklarationen");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "deklarationen"



    // $ANTLR start "anweisungen"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:10:1: anweisungen : ( ( ( ( Identifier valueAllocate ) | read_statement | print_statement ) INSTRUCTION_END ) | if_statement | while_statement );
    public final void anweisungen() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "anweisungen");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:2: ( ( ( ( Identifier valueAllocate ) | read_statement | print_statement ) INSTRUCTION_END ) | if_statement | while_statement )
            int alt5=3;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case Identifier:
            case 30:
            case 32:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:4: ( ( ( Identifier valueAllocate ) | read_statement | print_statement ) INSTRUCTION_END )
                    {
                    dbg.location(11,4);
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:4: ( ( ( Identifier valueAllocate ) | read_statement | print_statement ) INSTRUCTION_END )
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:6: ( ( Identifier valueAllocate ) | read_statement | print_statement ) INSTRUCTION_END
                    {
                    dbg.location(11,6);
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:6: ( ( Identifier valueAllocate ) | read_statement | print_statement )
                    int alt4=3;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                    switch ( input.LA(1) ) {
                    case Identifier:
                        {
                        alt4=1;
                        }
                        break;
                    case 32:
                        {
                        alt4=2;
                        }
                        break;
                    case 30:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:7: ( Identifier valueAllocate )
                            {
                            dbg.location(11,7);
                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:7: ( Identifier valueAllocate )
                            dbg.enterAlt(1);

                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:8: Identifier valueAllocate
                            {
                            dbg.location(11,8);
                            match(input,Identifier,FOLLOW_Identifier_in_anweisungen62); 
                            dbg.location(11,19);
                            pushFollow(FOLLOW_valueAllocate_in_anweisungen64);
                            valueAllocate();

                            state._fsp--;


                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:36: read_statement
                            {
                            dbg.location(11,36);
                            pushFollow(FOLLOW_read_statement_in_anweisungen69);
                            read_statement();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:53: print_statement
                            {
                            dbg.location(11,53);
                            pushFollow(FOLLOW_print_statement_in_anweisungen73);
                            print_statement();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(11,71);
                    match(input,INSTRUCTION_END,FOLLOW_INSTRUCTION_END_in_anweisungen77); 

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:90: if_statement
                    {
                    dbg.location(11,90);
                    pushFollow(FOLLOW_if_statement_in_anweisungen81);
                    if_statement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:11:105: while_statement
                    {
                    dbg.location(11,105);
                    pushFollow(FOLLOW_while_statement_in_anweisungen85);
                    while_statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 119);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisungen");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "anweisungen"



    // $ANTLR start "dataType"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:13:1: dataType : ( 'integer' | 'real' | 'string' | 'boolean' ) ;
    public final void dataType() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dataType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:14:2: ( ( 'integer' | 'real' | 'string' | 'boolean' ) )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
            {
            dbg.location(14,2);
            if ( input.LA(1)==22||input.LA(1)==29||(input.LA(1) >= 33 && input.LA(1) <= 34) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dataType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dataType"



    // $ANTLR start "arithmetic_operators"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:16:1: arithmetic_operators : ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION | CLAMP_OPEN | CLAMP_CLOSE );
    public final void arithmetic_operators() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arithmetic_operators");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:17:2: ( ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION | CLAMP_OPEN | CLAMP_CLOSE )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:
            {
            dbg.location(17,2);
            if ( input.LA(1)==ADDITION||(input.LA(1) >= CLAMP_CLOSE && input.LA(1) <= CLAMP_OPEN)||input.LA(1)==DIVISION||input.LA(1)==MULTIPLICATION||input.LA(1)==SUBTRACTION ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 80);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithmetic_operators");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arithmetic_operators"



    // $ANTLR start "valueAllocate"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:21:1: valueAllocate : ALLOCATE ( ( arithmetic_operators )? | String_value | Integer_value | ( 'true' | 'false' ) | Real_vlaue | Compare_operators ) ;
    public final void valueAllocate() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "valueAllocate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:2: ( ALLOCATE ( ( arithmetic_operators )? | String_value | Integer_value | ( 'true' | 'false' ) | Real_vlaue | Compare_operators ) )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:5: ALLOCATE ( ( arithmetic_operators )? | String_value | Integer_value | ( 'true' | 'false' ) | Real_vlaue | Compare_operators )
            {
            dbg.location(22,5);
            match(input,ALLOCATE,FOLLOW_ALLOCATE_in_valueAllocate149); 
            dbg.location(22,14);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:14: ( ( arithmetic_operators )? | String_value | Integer_value | ( 'true' | 'false' ) | Real_vlaue | Compare_operators )
            int alt7=6;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
            case ADDITION:
            case CLAMP_CLOSE:
            case CLAMP_OPEN:
            case DIVISION:
            case INSTRUCTION_END:
            case MULTIPLICATION:
            case SUBTRACTION:
                {
                alt7=1;
                }
                break;
            case String_value:
                {
                alt7=2;
                }
                break;
            case Integer_value:
                {
                alt7=3;
                }
                break;
            case 26:
            case 36:
                {
                alt7=4;
                }
                break;
            case Real_vlaue:
                {
                alt7=5;
                }
                break;
            case Compare_operators:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:16: ( arithmetic_operators )?
                    {
                    dbg.location(22,16);
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:16: ( arithmetic_operators )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ADDITION||(LA6_0 >= CLAMP_CLOSE && LA6_0 <= CLAMP_OPEN)||LA6_0==DIVISION||LA6_0==MULTIPLICATION||LA6_0==SUBTRACTION) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:17: arithmetic_operators
                            {
                            dbg.location(22,17);
                            pushFollow(FOLLOW_arithmetic_operators_in_valueAllocate154);
                            arithmetic_operators();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:42: String_value
                    {
                    dbg.location(22,42);
                    match(input,String_value,FOLLOW_String_value_in_valueAllocate160); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:57: Integer_value
                    {
                    dbg.location(22,57);
                    match(input,Integer_value,FOLLOW_Integer_value_in_valueAllocate164); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:73: ( 'true' | 'false' )
                    {
                    dbg.location(22,73);
                    if ( input.LA(1)==26||input.LA(1)==36 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:94: Real_vlaue
                    {
                    dbg.location(22,94);
                    match(input,Real_vlaue,FOLLOW_Real_vlaue_in_valueAllocate178); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:22:108: Compare_operators
                    {
                    dbg.location(22,108);
                    match(input,Compare_operators,FOLLOW_Compare_operators_in_valueAllocate183); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(22, 126);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "valueAllocate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "valueAllocate"



    // $ANTLR start "if_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:25:1: if_statement : 'if' compare then_statement ( else_statement )? 'fi' ;
    public final void if_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "if_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:26:2: ( 'if' compare then_statement ( else_statement )? 'fi' )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:26:4: 'if' compare then_statement ( else_statement )? 'fi'
            {
            dbg.location(26,4);
            match(input,28,FOLLOW_28_in_if_statement200); 
            dbg.location(26,9);
            pushFollow(FOLLOW_compare_in_if_statement202);
            compare();

            state._fsp--;

            dbg.location(26,17);
            pushFollow(FOLLOW_then_statement_in_if_statement204);
            then_statement();

            state._fsp--;

            dbg.location(26,32);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:26:32: ( else_statement )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:26:33: else_statement
                    {
                    dbg.location(26,33);
                    pushFollow(FOLLOW_else_statement_in_if_statement207);
                    else_statement();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(26,50);
            match(input,27,FOLLOW_27_in_if_statement211); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(26, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_statement"



    // $ANTLR start "then_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:1: then_statement : 'then' ( deklarationen | anweisungen )* ;
    public final void then_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "then_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:17: ( 'then' ( deklarationen | anweisungen )* )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:19: 'then' ( deklarationen | anweisungen )*
            {
            dbg.location(28,19);
            match(input,35,FOLLOW_35_in_then_statement221); 
            dbg.location(28,26);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:26: ( deklarationen | anweisungen )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=3;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==22||LA9_0==29||(LA9_0 >= 33 && LA9_0 <= 34)) ) {
                    alt9=1;
                }
                else if ( (LA9_0==Identifier||LA9_0==28||LA9_0==30||LA9_0==32||LA9_0==37) ) {
                    alt9=2;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:28: deklarationen
            	    {
            	    dbg.location(28,28);
            	    pushFollow(FOLLOW_deklarationen_in_then_statement225);
            	    deklarationen();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:28:44: anweisungen
            	    {
            	    dbg.location(28,44);
            	    pushFollow(FOLLOW_anweisungen_in_then_statement229);
            	    anweisungen();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "then_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "then_statement"



    // $ANTLR start "else_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:1: else_statement : 'else' ( deklarationen | anweisungen )* ;
    public final void else_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:16: ( 'else' ( deklarationen | anweisungen )* )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:18: 'else' ( deklarationen | anweisungen )*
            {
            dbg.location(30,18);
            match(input,24,FOLLOW_24_in_else_statement241); 
            dbg.location(30,25);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:25: ( deklarationen | anweisungen )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=3;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==22||LA10_0==29||(LA10_0 >= 33 && LA10_0 <= 34)) ) {
                    alt10=1;
                }
                else if ( (LA10_0==Identifier||LA10_0==28||LA10_0==30||LA10_0==32||LA10_0==37) ) {
                    alt10=2;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:27: deklarationen
            	    {
            	    dbg.location(30,27);
            	    pushFollow(FOLLOW_deklarationen_in_else_statement245);
            	    deklarationen();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:30:43: anweisungen
            	    {
            	    dbg.location(30,43);
            	    pushFollow(FOLLOW_anweisungen_in_else_statement249);
            	    anweisungen();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "else_statement"



    // $ANTLR start "while_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:32:1: while_statement : 'while' compare my_do My_od ;
    public final void while_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "while_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:33:2: ( 'while' compare my_do My_od )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:33:4: 'while' compare my_do My_od
            {
            dbg.location(33,4);
            match(input,37,FOLLOW_37_in_while_statement262); 
            dbg.location(33,12);
            pushFollow(FOLLOW_compare_in_while_statement264);
            compare();

            state._fsp--;

            dbg.location(33,20);
            pushFollow(FOLLOW_my_do_in_while_statement266);
            my_do();

            state._fsp--;

            dbg.location(33,26);
            match(input,My_od,FOLLOW_My_od_in_while_statement268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "while_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "while_statement"



    // $ANTLR start "my_do"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:1: my_do : 'do' ( deklarationen | anweisungen )* ;
    public final void my_do() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "my_do");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:7: ( 'do' ( deklarationen | anweisungen )* )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:9: 'do' ( deklarationen | anweisungen )*
            {
            dbg.location(35,9);
            match(input,23,FOLLOW_23_in_my_do277); 
            dbg.location(35,14);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:14: ( deklarationen | anweisungen )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=3;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||LA11_0==29||(LA11_0 >= 33 && LA11_0 <= 34)) ) {
                    alt11=1;
                }
                else if ( (LA11_0==Identifier||LA11_0==28||LA11_0==30||LA11_0==32||LA11_0==37) ) {
                    alt11=2;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:16: deklarationen
            	    {
            	    dbg.location(35,16);
            	    pushFollow(FOLLOW_deklarationen_in_my_do281);
            	    deklarationen();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:35:32: anweisungen
            	    {
            	    dbg.location(35,32);
            	    pushFollow(FOLLOW_anweisungen_in_my_do285);
            	    anweisungen();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(35, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "my_do");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "my_do"



    // $ANTLR start "read_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:37:1: read_statement : 'read' CLAMP_OPEN Identifier CLAMP_CLOSE ;
    public final void read_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:38:2: ( 'read' CLAMP_OPEN Identifier CLAMP_CLOSE )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:38:4: 'read' CLAMP_OPEN Identifier CLAMP_CLOSE
            {
            dbg.location(38,4);
            match(input,32,FOLLOW_32_in_read_statement298); 
            dbg.location(38,11);
            match(input,CLAMP_OPEN,FOLLOW_CLAMP_OPEN_in_read_statement300); 
            dbg.location(38,22);
            match(input,Identifier,FOLLOW_Identifier_in_read_statement302); 
            dbg.location(38,33);
            match(input,CLAMP_CLOSE,FOLLOW_CLAMP_CLOSE_in_read_statement304); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(38, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read_statement"



    // $ANTLR start "print_statement"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:40:1: print_statement : 'println' CLAMP_OPEN ( Identifier | String_value ) CLAMP_CLOSE ;
    public final void print_statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "print_statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:41:2: ( 'println' CLAMP_OPEN ( Identifier | String_value ) CLAMP_CLOSE )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:41:4: 'println' CLAMP_OPEN ( Identifier | String_value ) CLAMP_CLOSE
            {
            dbg.location(41,4);
            match(input,30,FOLLOW_30_in_print_statement314); 
            dbg.location(41,14);
            match(input,CLAMP_OPEN,FOLLOW_CLAMP_OPEN_in_print_statement316); 
            dbg.location(41,25);
            if ( input.LA(1)==Identifier||input.LA(1)==String_value ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(41,54);
            match(input,CLAMP_CLOSE,FOLLOW_CLAMP_CLOSE_in_print_statement327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(41, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print_statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "print_statement"



    // $ANTLR start "compare"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:44:1: compare : ( ( Integer_value Compare_operators Integer_value ) | ( Identifier Compare_operators Identifier ) );
    public final void compare() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "compare");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:44:9: ( ( Integer_value Compare_operators Integer_value ) | ( Identifier Compare_operators Identifier ) )
            int alt12=2;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==Integer_value) ) {
                alt12=1;
            }
            else if ( (LA12_0==Identifier) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:2: ( Integer_value Compare_operators Integer_value )
                    {
                    dbg.location(45,2);
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:2: ( Integer_value Compare_operators Integer_value )
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:3: Integer_value Compare_operators Integer_value
                    {
                    dbg.location(45,3);
                    match(input,Integer_value,FOLLOW_Integer_value_in_compare340); 
                    dbg.location(45,17);
                    match(input,Compare_operators,FOLLOW_Compare_operators_in_compare342); 
                    dbg.location(45,35);
                    match(input,Integer_value,FOLLOW_Integer_value_in_compare344); 

                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:52: ( Identifier Compare_operators Identifier )
                    {
                    dbg.location(45,52);
                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:52: ( Identifier Compare_operators Identifier )
                    dbg.enterAlt(1);

                    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/miniP.g:45:53: Identifier Compare_operators Identifier
                    {
                    dbg.location(45,53);
                    match(input,Identifier,FOLLOW_Identifier_in_compare350); 
                    dbg.location(45,64);
                    match(input,Compare_operators,FOLLOW_Compare_operators_in_compare352); 
                    dbg.location(45,82);
                    match(input,Identifier,FOLLOW_Identifier_in_compare354); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(45, 92);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compare");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "compare"

    // Delegated rules


 

    public static final BitSet FOLLOW_31_in_miniP14 = new BitSet(new long[]{0x0000000620600000L});
    public static final BitSet FOLLOW_deklarationen_in_miniP17 = new BitSet(new long[]{0x0000000620600000L});
    public static final BitSet FOLLOW_21_in_miniP21 = new BitSet(new long[]{0x0000002152004000L});
    public static final BitSet FOLLOW_anweisungen_in_miniP24 = new BitSet(new long[]{0x0000002152004000L});
    public static final BitSet FOLLOW_25_in_miniP28 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_deklarationen38 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_deklarationen40 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_INSTRUCTION_NEXT_in_deklarationen43 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_deklarationen45 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_INSTRUCTION_END_in_deklarationen49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_anweisungen62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_valueAllocate_in_anweisungen64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_read_statement_in_anweisungen69 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_print_statement_in_anweisungen73 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INSTRUCTION_END_in_anweisungen77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_anweisungen81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_anweisungen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALLOCATE_in_valueAllocate149 = new BitSet(new long[]{0x00000010041D86D2L});
    public static final BitSet FOLLOW_arithmetic_operators_in_valueAllocate154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_value_in_valueAllocate160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_value_in_valueAllocate164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueAllocate168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_vlaue_in_valueAllocate178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Compare_operators_in_valueAllocate183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_statement200 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_compare_in_if_statement202 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_then_statement_in_if_statement204 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_else_statement_in_if_statement207 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_if_statement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_then_statement221 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_deklarationen_in_then_statement225 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_anweisungen_in_then_statement229 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_24_in_else_statement241 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_deklarationen_in_else_statement245 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_anweisungen_in_else_statement249 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_37_in_while_statement262 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_compare_in_while_statement264 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_my_do_in_while_statement266 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_My_od_in_while_statement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_my_do277 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_deklarationen_in_my_do281 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_anweisungen_in_my_do285 = new BitSet(new long[]{0x0000002770404002L});
    public static final BitSet FOLLOW_32_in_read_statement298 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLAMP_OPEN_in_read_statement300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_read_statement302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLAMP_CLOSE_in_read_statement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_print_statement314 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CLAMP_OPEN_in_print_statement316 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_set_in_print_statement318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CLAMP_CLOSE_in_print_statement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_value_in_compare340 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Compare_operators_in_compare342 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Integer_value_in_compare344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_compare350 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Compare_operators_in_compare352 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_compare354 = new BitSet(new long[]{0x0000000000000002L});

}