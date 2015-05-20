// $ANTLR 3.4 C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g 2015-05-20 12:52:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class dslParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "HiddenCondition", "ID", "OP", "RAETSEL", "WORT", "ZUW"
    };

    public static final int EOF=-1;
    public static final int HiddenCondition=4;
    public static final int ID=5;
    public static final int OP=6;
    public static final int RAETSEL=7;
    public static final int WORT=8;
    public static final int ZUW=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "wort", "statement"
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
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public dslParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return dslParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g"; }


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:17:1: statement : w1= wort op1= OP w2= wort zw= ZUW w3= wort op4= OP op5= OP op6= OP w4= wort op2= OP w5= wort zw= ZUW w6= wort zw= ZUW zw= ZUW zw= ZUW w7= wort op3= OP w8= wort zw= ZUW w9= wort -> ^( RAETSEL ^( $zw ^( $op1 $w1 $w2) $w3) ^( $zw ^( $op2 $w4 $w5) $w6) ^( $zw ^( $op3 $w7 $w8) $w9) ^( $zw ^( $op4 $w1 $w4) $w7) ^( $zw ^( $op5 $w2 $w5) $w8) ^( $zw ^( $op6 $w3 $w6) $w9) ) ;
    public final dslParser.statement_return statement() throws RecognitionException {
        dslParser.statement_return retval = new dslParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token op1=null;
        Token zw=null;
        Token op4=null;
        Token op5=null;
        Token op6=null;
        Token op2=null;
        Token op3=null;
        dslParser.wort_return w1 =null;

        dslParser.wort_return w2 =null;

        dslParser.wort_return w3 =null;

        dslParser.wort_return w4 =null;

        dslParser.wort_return w5 =null;

        dslParser.wort_return w6 =null;

        dslParser.wort_return w7 =null;

        dslParser.wort_return w8 =null;

        dslParser.wort_return w9 =null;


        CommonTree op1_tree=null;
        CommonTree zw_tree=null;
        CommonTree op4_tree=null;
        CommonTree op5_tree=null;
        CommonTree op6_tree=null;
        CommonTree op2_tree=null;
        CommonTree op3_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_ZUW=new RewriteRuleTokenStream(adaptor,"token ZUW");
        RewriteRuleSubtreeStream stream_wort=new RewriteRuleSubtreeStream(adaptor,"rule wort");
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:18:2: (w1= wort op1= OP w2= wort zw= ZUW w3= wort op4= OP op5= OP op6= OP w4= wort op2= OP w5= wort zw= ZUW w6= wort zw= ZUW zw= ZUW zw= ZUW w7= wort op3= OP w8= wort zw= ZUW w9= wort -> ^( RAETSEL ^( $zw ^( $op1 $w1 $w2) $w3) ^( $zw ^( $op2 $w4 $w5) $w6) ^( $zw ^( $op3 $w7 $w8) $w9) ^( $zw ^( $op4 $w1 $w4) $w7) ^( $zw ^( $op5 $w2 $w5) $w8) ^( $zw ^( $op6 $w3 $w6) $w9) ) )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:18:4: w1= wort op1= OP w2= wort zw= ZUW w3= wort op4= OP op5= OP op6= OP w4= wort op2= OP w5= wort zw= ZUW w6= wort zw= ZUW zw= ZUW zw= ZUW w7= wort op3= OP w8= wort zw= ZUW w9= wort
            {
            dbg.location(18,6);
            pushFollow(FOLLOW_wort_in_statement48);
            w1=wort();

            state._fsp--;

            stream_wort.add(w1.getTree());
            dbg.location(18,16);
            op1=(Token)match(input,OP,FOLLOW_OP_in_statement53);  
            stream_OP.add(op1);

            dbg.location(18,24);
            pushFollow(FOLLOW_wort_in_statement59);
            w2=wort();

            state._fsp--;

            stream_wort.add(w2.getTree());
            dbg.location(18,33);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement64);  
            stream_ZUW.add(zw);

            dbg.location(18,42);
            pushFollow(FOLLOW_wort_in_statement70);
            w3=wort();

            state._fsp--;

            stream_wort.add(w3.getTree());
            dbg.location(20,8);
            op4=(Token)match(input,OP,FOLLOW_OP_in_statement82);  
            stream_OP.add(op4);

            dbg.location(20,17);
            op5=(Token)match(input,OP,FOLLOW_OP_in_statement88);  
            stream_OP.add(op5);

            dbg.location(20,26);
            op6=(Token)match(input,OP,FOLLOW_OP_in_statement94);  
            stream_OP.add(op6);

            dbg.location(22,5);
            pushFollow(FOLLOW_wort_in_statement110);
            w4=wort();

            state._fsp--;

            stream_wort.add(w4.getTree());
            dbg.location(22,15);
            op2=(Token)match(input,OP,FOLLOW_OP_in_statement115);  
            stream_OP.add(op2);

            dbg.location(22,23);
            pushFollow(FOLLOW_wort_in_statement121);
            w5=wort();

            state._fsp--;

            stream_wort.add(w5.getTree());
            dbg.location(22,32);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement126);  
            stream_ZUW.add(zw);

            dbg.location(22,41);
            pushFollow(FOLLOW_wort_in_statement132);
            w6=wort();

            state._fsp--;

            stream_wort.add(w6.getTree());
            dbg.location(24,7);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement145);  
            stream_ZUW.add(zw);

            dbg.location(24,16);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement151);  
            stream_ZUW.add(zw);

            dbg.location(24,25);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement157);  
            stream_ZUW.add(zw);

            dbg.location(26,5);
            pushFollow(FOLLOW_wort_in_statement172);
            w7=wort();

            state._fsp--;

            stream_wort.add(w7.getTree());
            dbg.location(26,15);
            op3=(Token)match(input,OP,FOLLOW_OP_in_statement177);  
            stream_OP.add(op3);

            dbg.location(26,23);
            pushFollow(FOLLOW_wort_in_statement183);
            w8=wort();

            state._fsp--;

            stream_wort.add(w8.getTree());
            dbg.location(26,32);
            zw=(Token)match(input,ZUW,FOLLOW_ZUW_in_statement188);  
            stream_ZUW.add(zw);

            dbg.location(26,41);
            pushFollow(FOLLOW_wort_in_statement194);
            w9=wort();

            state._fsp--;

            stream_wort.add(w9.getTree());

            // AST REWRITE
            // elements: w4, op5, zw, w3, w5, w8, w8, w1, w3, op4, w4, zw, zw, zw, w2, w7, w5, op2, w1, zw, w2, w6, op6, w9, w6, op3, w9, w7, zw, op1
            // token labels: op2, op1, op4, op3, op6, op5, zw
            // rule labels: w7, w8, w9, w1, w2, w3, w4, w5, retval, w6
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_op2=new RewriteRuleTokenStream(adaptor,"token op2",op2);
            RewriteRuleTokenStream stream_op1=new RewriteRuleTokenStream(adaptor,"token op1",op1);
            RewriteRuleTokenStream stream_op4=new RewriteRuleTokenStream(adaptor,"token op4",op4);
            RewriteRuleTokenStream stream_op3=new RewriteRuleTokenStream(adaptor,"token op3",op3);
            RewriteRuleTokenStream stream_op6=new RewriteRuleTokenStream(adaptor,"token op6",op6);
            RewriteRuleTokenStream stream_op5=new RewriteRuleTokenStream(adaptor,"token op5",op5);
            RewriteRuleTokenStream stream_zw=new RewriteRuleTokenStream(adaptor,"token zw",zw);
            RewriteRuleSubtreeStream stream_w7=new RewriteRuleSubtreeStream(adaptor,"rule w7",w7!=null?w7.tree:null);
            RewriteRuleSubtreeStream stream_w8=new RewriteRuleSubtreeStream(adaptor,"rule w8",w8!=null?w8.tree:null);
            RewriteRuleSubtreeStream stream_w9=new RewriteRuleSubtreeStream(adaptor,"rule w9",w9!=null?w9.tree:null);
            RewriteRuleSubtreeStream stream_w1=new RewriteRuleSubtreeStream(adaptor,"rule w1",w1!=null?w1.tree:null);
            RewriteRuleSubtreeStream stream_w2=new RewriteRuleSubtreeStream(adaptor,"rule w2",w2!=null?w2.tree:null);
            RewriteRuleSubtreeStream stream_w3=new RewriteRuleSubtreeStream(adaptor,"rule w3",w3!=null?w3.tree:null);
            RewriteRuleSubtreeStream stream_w4=new RewriteRuleSubtreeStream(adaptor,"rule w4",w4!=null?w4.tree:null);
            RewriteRuleSubtreeStream stream_w5=new RewriteRuleSubtreeStream(adaptor,"rule w5",w5!=null?w5.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_w6=new RewriteRuleSubtreeStream(adaptor,"rule w6",w6!=null?w6.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:3: -> ^( RAETSEL ^( $zw ^( $op1 $w1 $w2) $w3) ^( $zw ^( $op2 $w4 $w5) $w6) ^( $zw ^( $op3 $w7 $w8) $w9) ^( $zw ^( $op4 $w1 $w4) $w7) ^( $zw ^( $op5 $w2 $w5) $w8) ^( $zw ^( $op6 $w3 $w6) $w9) )
            {
                dbg.location(28,6);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:28:6: ^( RAETSEL ^( $zw ^( $op1 $w1 $w2) $w3) ^( $zw ^( $op2 $w4 $w5) $w6) ^( $zw ^( $op3 $w7 $w8) $w9) ^( $zw ^( $op4 $w1 $w4) $w7) ^( $zw ^( $op5 $w2 $w5) $w8) ^( $zw ^( $op6 $w3 $w6) $w9) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(28,8);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RAETSEL, "RAETSEL")
                , root_1);

                dbg.location(28,17);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:28:17: ^( $zw ^( $op1 $w1 $w2) $w3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(28,20);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(28,23);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:28:23: ^( $op1 $w1 $w2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(28,26);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_3);

                dbg.location(28,31);
                adaptor.addChild(root_3, stream_w1.nextTree());
                dbg.location(28,35);
                adaptor.addChild(root_3, stream_w2.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(28,40);
                adaptor.addChild(root_2, stream_w3.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(29,5);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:29:5: ^( $zw ^( $op2 $w4 $w5) $w6)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(29,8);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(29,11);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:29:11: ^( $op2 $w4 $w5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(29,14);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op2.nextNode(), root_3);

                dbg.location(29,19);
                adaptor.addChild(root_3, stream_w4.nextTree());
                dbg.location(29,23);
                adaptor.addChild(root_3, stream_w5.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(29,28);
                adaptor.addChild(root_2, stream_w6.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(30,5);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:30:5: ^( $zw ^( $op3 $w7 $w8) $w9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(30,8);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(30,11);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:30:11: ^( $op3 $w7 $w8)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(30,14);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_3);

                dbg.location(30,19);
                adaptor.addChild(root_3, stream_w7.nextTree());
                dbg.location(30,23);
                adaptor.addChild(root_3, stream_w8.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(30,28);
                adaptor.addChild(root_2, stream_w9.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(31,5);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:31:5: ^( $zw ^( $op4 $w1 $w4) $w7)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(31,8);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(31,11);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:31:11: ^( $op4 $w1 $w4)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(31,14);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op4.nextNode(), root_3);

                dbg.location(31,19);
                adaptor.addChild(root_3, stream_w1.nextTree());
                dbg.location(31,23);
                adaptor.addChild(root_3, stream_w4.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(31,28);
                adaptor.addChild(root_2, stream_w7.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(32,5);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:32:5: ^( $zw ^( $op5 $w2 $w5) $w8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(32,8);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(32,11);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:32:11: ^( $op5 $w2 $w5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(32,14);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op5.nextNode(), root_3);

                dbg.location(32,19);
                adaptor.addChild(root_3, stream_w2.nextTree());
                dbg.location(32,23);
                adaptor.addChild(root_3, stream_w5.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(32,28);
                adaptor.addChild(root_2, stream_w8.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(33,5);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:33:5: ^( $zw ^( $op6 $w3 $w6) $w9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(33,8);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_zw.nextNode(), root_2);

                dbg.location(33,11);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:33:11: ^( $op6 $w3 $w6)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(33,14);
                root_3 = (CommonTree)adaptor.becomeRoot(stream_op6.nextNode(), root_3);

                dbg.location(33,19);
                adaptor.addChild(root_3, stream_w3.nextTree());
                dbg.location(33,23);
                adaptor.addChild(root_3, stream_w6.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(33,28);
                adaptor.addChild(root_2, stream_w9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"


    public static class wort_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wort"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:36:1: wort : ( ID )+ -> ^( WORT ( ID )+ ) ;
    public final dslParser.wort_return wort() throws RecognitionException {
        dslParser.wort_return retval = new dslParser.wort_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID1=null;

        CommonTree ID1_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "wort");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:37:2: ( ( ID )+ -> ^( WORT ( ID )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:37:4: ( ID )+
            {
            dbg.location(37,4);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:37:4: ( ID )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:37:4: ID
            	    {
            	    dbg.location(37,4);
            	    ID1=(Token)match(input,ID,FOLLOW_ID_in_wort359);  
            	    stream_ID.add(ID1);


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


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:9: -> ^( WORT ( ID )+ )
            {
                dbg.location(37,12);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\dsl.g:37:12: ^( WORT ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(37,14);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WORT, "WORT")
                , root_1);

                dbg.location(37,19);
                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    dbg.location(37,19);
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(38, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wort");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wort"

    // Delegated rules


 

    public static final BitSet FOLLOW_wort_in_statement48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement53 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement59 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement70 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement82 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement88 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement132 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement145 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement151 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_statement177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ZUW_in_statement188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_wort_in_statement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_wort359 = new BitSet(new long[]{0x0000000000000022L});

}