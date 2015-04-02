// $ANTLR 3.4 /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g 2015-03-30 15:11:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class dslParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Allocate", "Char", "HiddenCondition", "Operator"
    };

    public static final int EOF=-1;
    public static final int Allocate=4;
    public static final int Char=5;
    public static final int HiddenCondition=6;
    public static final int Operator=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "blockSeries", "programm", "operationSeries", "expression", 
    "allocationSeries"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public dslParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public dslParser(TokenStream input, int port, RecognizerSharedState state) {
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

public dslParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return dslParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g"; }



    // $ANTLR start "programm"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:3:1: programm : expression operationSeries expression allocationSeries expression ;
    public final void programm() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "programm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:4:2: ( expression operationSeries expression allocationSeries expression )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:4:4: expression operationSeries expression allocationSeries expression
            {
            dbg.location(4,4);
            pushFollow(FOLLOW_expression_in_programm12);
            expression();

            state._fsp--;

            dbg.location(4,15);
            pushFollow(FOLLOW_operationSeries_in_programm14);
            operationSeries();

            state._fsp--;

            dbg.location(4,31);
            pushFollow(FOLLOW_expression_in_programm16);
            expression();

            state._fsp--;

            dbg.location(4,42);
            pushFollow(FOLLOW_allocationSeries_in_programm18);
            allocationSeries();

            state._fsp--;

            dbg.location(4,59);
            pushFollow(FOLLOW_expression_in_programm20);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(4, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "programm");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "programm"



    // $ANTLR start "expression"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:6:1: expression : blockSeries Operator blockSeries Allocate blockSeries ;
    public final void expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:7:2: ( blockSeries Operator blockSeries Allocate blockSeries )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:7:4: blockSeries Operator blockSeries Allocate blockSeries
            {
            dbg.location(7,4);
            pushFollow(FOLLOW_blockSeries_in_expression31);
            blockSeries();

            state._fsp--;

            dbg.location(7,16);
            match(input,Operator,FOLLOW_Operator_in_expression33); 
            dbg.location(7,25);
            pushFollow(FOLLOW_blockSeries_in_expression35);
            blockSeries();

            state._fsp--;

            dbg.location(7,37);
            match(input,Allocate,FOLLOW_Allocate_in_expression37); 
            dbg.location(7,46);
            pushFollow(FOLLOW_blockSeries_in_expression39);
            blockSeries();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(7, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "operationSeries"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:9:1: operationSeries : Operator Operator Operator ;
    public final void operationSeries() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operationSeries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:10:2: ( Operator Operator Operator )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:10:5: Operator Operator Operator
            {
            dbg.location(10,5);
            match(input,Operator,FOLLOW_Operator_in_operationSeries51); 
            dbg.location(10,14);
            match(input,Operator,FOLLOW_Operator_in_operationSeries53); 
            dbg.location(10,23);
            match(input,Operator,FOLLOW_Operator_in_operationSeries55); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(10, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operationSeries");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operationSeries"



    // $ANTLR start "allocationSeries"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:12:1: allocationSeries : Allocate Allocate Allocate ;
    public final void allocationSeries() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "allocationSeries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:13:2: ( Allocate Allocate Allocate )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:13:4: Allocate Allocate Allocate
            {
            dbg.location(13,4);
            match(input,Allocate,FOLLOW_Allocate_in_allocationSeries66); 
            dbg.location(13,13);
            match(input,Allocate,FOLLOW_Allocate_in_allocationSeries68); 
            dbg.location(13,22);
            match(input,Allocate,FOLLOW_Allocate_in_allocationSeries70); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "allocationSeries");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "allocationSeries"



    // $ANTLR start "blockSeries"
    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:15:1: blockSeries : ( Char )+ ;
    public final void blockSeries() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "blockSeries");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:16:2: ( ( Char )+ )
            dbg.enterAlt(1);

            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:16:4: ( Char )+
            {
            dbg.location(16,4);
            // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:16:4: ( Char )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==Char) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/dsl.g:16:4: Char
            	    {
            	    dbg.location(16,4);
            	    match(input,Char,FOLLOW_Char_in_blockSeries81); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockSeries");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "blockSeries"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_programm12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_operationSeries_in_programm14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_programm16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_allocationSeries_in_programm18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_expression_in_programm20 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockSeries_in_expression31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Operator_in_expression33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_blockSeries_in_expression35 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Allocate_in_expression37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_blockSeries_in_expression39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Operator_in_operationSeries51 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Operator_in_operationSeries53 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Operator_in_operationSeries55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Allocate_in_allocationSeries66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Allocate_in_allocationSeries68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Allocate_in_allocationSeries70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Char_in_blockSeries81 = new BitSet(new long[]{0x0000000000000022L});

}