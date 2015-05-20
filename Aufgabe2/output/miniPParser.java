// $ANTLR 3.4 C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g 2015-05-20 14:40:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN", "BOOL", "COMMA", "COMMENT", "DECLS", "DEF", "DIGIT", "END", "FLOAT", "ID", "IDLIST", "INT", "LETTER", "MAIN", "PROGRAM", "PUNKT_OP", "RELOP", "SEMICOL", "SLIST", "STRICH_OP", "STRING", "TYPE", "WS", "'('", "')'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'print'", "'println'", "'read'", "'then'", "'while'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "ifStmt", "whileStmt", "ar_exp", "main", "statement", 
    "expression", "io_stmt", "cmp", "var_def", "ar_term", "thenStmt", "statements", 
    "doStmt", "product", "elseStmt", "declarations", "declaration", "numberconst"
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
    public MiniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public MiniPParser(TokenStream input, int port, RecognizerSharedState state) {
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

public MiniPParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g"; }


    public static class main_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:15:1: main : PROGRAM declarations BEGIN statements END -> ^( MAIN declarations statements ) ;
    public final MiniPParser.main_return main() throws RecognitionException {
        MiniPParser.main_return retval = new MiniPParser.main_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PROGRAM1=null;
        Token BEGIN3=null;
        Token END5=null;
        MiniPParser.declarations_return declarations2 =null;

        MiniPParser.statements_return statements4 =null;


        CommonTree PROGRAM1_tree=null;
        CommonTree BEGIN3_tree=null;
        CommonTree END5_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "main");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:15:6: ( PROGRAM declarations BEGIN statements END -> ^( MAIN declarations statements ) )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:15:8: PROGRAM declarations BEGIN statements END
            {
            dbg.location(15,8);
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_main48);  
            stream_PROGRAM.add(PROGRAM1);

            dbg.location(15,16);
            pushFollow(FOLLOW_declarations_in_main50);
            declarations2=declarations();

            state._fsp--;

            stream_declarations.add(declarations2.getTree());
            dbg.location(15,29);
            BEGIN3=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main52);  
            stream_BEGIN.add(BEGIN3);

            dbg.location(15,35);
            pushFollow(FOLLOW_statements_in_main54);
            statements4=statements();

            state._fsp--;

            stream_statements.add(statements4.getTree());
            dbg.location(15,46);
            END5=(Token)match(input,END,FOLLOW_END_in_main56);  
            stream_END.add(END5);


            // AST REWRITE
            // elements: declarations, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 15:50: -> ^( MAIN declarations statements )
            {
                dbg.location(15,53);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:15:53: ^( MAIN declarations statements )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(15,55);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MAIN, "MAIN")
                , root_1);

                dbg.location(15,60);
                adaptor.addChild(root_1, stream_declarations.nextTree());
                dbg.location(15,73);
                adaptor.addChild(root_1, stream_statements.nextTree());

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
        dbg.location(15, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "main");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "main"


    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarations"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:1: declarations : ( declaration )+ -> ^( DECLS ( declaration )+ ) ;
    public final MiniPParser.declarations_return declarations() throws RecognitionException {
        MiniPParser.declarations_return retval = new MiniPParser.declarations_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MiniPParser.declaration_return declaration6 =null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:13: ( ( declaration )+ -> ^( DECLS ( declaration )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:15: ( declaration )+
            {
            dbg.location(17,15);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:15: ( declaration )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:15: declaration
            	    {
            	    dbg.location(17,15);
            	    pushFollow(FOLLOW_declaration_in_declarations73);
            	    declaration6=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration6.getTree());

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
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:28: -> ^( DECLS ( declaration )+ )
            {
                dbg.location(17,31);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:17:31: ^( DECLS ( declaration )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(17,33);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECLS, "DECLS")
                , root_1);

                dbg.location(17,39);
                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    dbg.location(17,39);
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

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
        dbg.location(17, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarations"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:1: declaration : TYPE ID ( COMMA ID )* SEMICOL -> ( ^( TYPE ID ) )+ ;
    public final MiniPParser.declaration_return declaration() throws RecognitionException {
        MiniPParser.declaration_return retval = new MiniPParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TYPE7=null;
        Token ID8=null;
        Token COMMA9=null;
        Token ID10=null;
        Token SEMICOL11=null;

        CommonTree TYPE7_tree=null;
        CommonTree ID8_tree=null;
        CommonTree COMMA9_tree=null;
        CommonTree ID10_tree=null;
        CommonTree SEMICOL11_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SEMICOL=new RewriteRuleTokenStream(adaptor,"token SEMICOL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");

        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:12: ( TYPE ID ( COMMA ID )* SEMICOL -> ( ^( TYPE ID ) )+ )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:14: TYPE ID ( COMMA ID )* SEMICOL
            {
            dbg.location(19,14);
            TYPE7=(Token)match(input,TYPE,FOLLOW_TYPE_in_declaration90);  
            stream_TYPE.add(TYPE7);

            dbg.location(19,19);
            ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration92);  
            stream_ID.add(ID8);

            dbg.location(19,22);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:22: ( COMMA ID )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:23: COMMA ID
            	    {
            	    dbg.location(19,23);
            	    COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration95);  
            	    stream_COMMA.add(COMMA9);

            	    dbg.location(19,29);
            	    ID10=(Token)match(input,ID,FOLLOW_ID_in_declaration97);  
            	    stream_ID.add(ID10);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(19,34);
            SEMICOL11=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_declaration101);  
            stream_SEMICOL.add(SEMICOL11);


            // AST REWRITE
            // elements: TYPE, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 19:42: -> ( ^( TYPE ID ) )+
            {
                dbg.location(19,45);
                if ( !(stream_TYPE.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_TYPE.hasNext()||stream_ID.hasNext() ) {
                    dbg.location(19,45);
                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:19:45: ^( TYPE ID )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(19,47);
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    stream_TYPE.nextNode()
                    , root_1);

                    dbg.location(19,52);
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_ID.reset();

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
        dbg.location(19, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"


    public static class var_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_def"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:23:1: var_def : ID DEF expression -> ^( DEF ID expression ) ;
    public final MiniPParser.var_def_return var_def() throws RecognitionException {
        MiniPParser.var_def_return retval = new MiniPParser.var_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID12=null;
        Token DEF13=null;
        MiniPParser.expression_return expression14 =null;


        CommonTree ID12_tree=null;
        CommonTree DEF13_tree=null;
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "var_def");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:23:9: ( ID DEF expression -> ^( DEF ID expression ) )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:23:11: ID DEF expression
            {
            dbg.location(23,11);
            ID12=(Token)match(input,ID,FOLLOW_ID_in_var_def120);  
            stream_ID.add(ID12);

            dbg.location(23,14);
            DEF13=(Token)match(input,DEF,FOLLOW_DEF_in_var_def122);  
            stream_DEF.add(DEF13);

            dbg.location(23,18);
            pushFollow(FOLLOW_expression_in_var_def124);
            expression14=expression();

            state._fsp--;

            stream_expression.add(expression14.getTree());

            // AST REWRITE
            // elements: ID, DEF, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 23:29: -> ^( DEF ID expression )
            {
                dbg.location(23,32);
                // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:23:32: ^( DEF ID expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(23,34);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_DEF.nextNode()
                , root_1);

                dbg.location(23,38);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );
                dbg.location(23,41);
                adaptor.addChild(root_1, stream_expression.nextTree());

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
        dbg.location(24, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_def");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_def"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:26:1: expression : ( BOOL -> BOOL | STRING -> STRING | ar_exp -> ar_exp );
    public final MiniPParser.expression_return expression() throws RecognitionException {
        MiniPParser.expression_return retval = new MiniPParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOL15=null;
        Token STRING16=null;
        MiniPParser.ar_exp_return ar_exp17 =null;


        CommonTree BOOL15_tree=null;
        CommonTree STRING16_tree=null;
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_ar_exp=new RewriteRuleSubtreeStream(adaptor,"rule ar_exp");
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:26:11: ( BOOL -> BOOL | STRING -> STRING | ar_exp -> ar_exp )
            int alt3=3;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case BOOL:
                {
                alt3=1;
                }
                break;
            case STRING:
                {
                alt3=2;
                }
                break;
            case FLOAT:
            case ID:
            case INT:
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:26:13: BOOL
                    {
                    dbg.location(26,13);
                    BOOL15=(Token)match(input,BOOL,FOLLOW_BOOL_in_expression142);  
                    stream_BOOL.add(BOOL15);


                    // AST REWRITE
                    // elements: BOOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:18: -> BOOL
                    {
                        dbg.location(26,21);
                        adaptor.addChild(root_0, 
                        stream_BOOL.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:26:28: STRING
                    {
                    dbg.location(26,28);
                    STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_expression150);  
                    stream_STRING.add(STRING16);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:35: -> STRING
                    {
                        dbg.location(26,38);
                        adaptor.addChild(root_0, 
                        stream_STRING.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:26:47: ar_exp
                    {
                    dbg.location(26,47);
                    pushFollow(FOLLOW_ar_exp_in_expression158);
                    ar_exp17=ar_exp();

                    state._fsp--;

                    stream_ar_exp.add(ar_exp17.getTree());

                    // AST REWRITE
                    // elements: ar_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:54: -> ar_exp
                    {
                        dbg.location(26,57);
                        adaptor.addChild(root_0, stream_ar_exp.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

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
        dbg.location(26, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"


    public static class ifStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:1: ifStmt : 'if' ^ ( BOOL | cmp ) thenStmt elseStmt 'fi' !;
    public final MiniPParser.ifStmt_return ifStmt() throws RecognitionException {
        MiniPParser.ifStmt_return retval = new MiniPParser.ifStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal18=null;
        Token BOOL19=null;
        Token string_literal23=null;
        MiniPParser.cmp_return cmp20 =null;

        MiniPParser.thenStmt_return thenStmt21 =null;

        MiniPParser.elseStmt_return elseStmt22 =null;


        CommonTree string_literal18_tree=null;
        CommonTree BOOL19_tree=null;
        CommonTree string_literal23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:8: ( 'if' ^ ( BOOL | cmp ) thenStmt elseStmt 'fi' !)
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:10: 'if' ^ ( BOOL | cmp ) thenStmt elseStmt 'fi' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(30,14);
            string_literal18=(Token)match(input,32,FOLLOW_32_in_ifStmt182); 
            string_literal18_tree = 
            (CommonTree)adaptor.create(string_literal18)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal18_tree, root_0);

            dbg.location(30,16);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:16: ( BOOL | cmp )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==BOOL) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= FLOAT && LA4_0 <= ID)||LA4_0==INT||LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:17: BOOL
                    {
                    dbg.location(30,17);
                    BOOL19=(Token)match(input,BOOL,FOLLOW_BOOL_in_ifStmt186); 
                    BOOL19_tree = 
                    (CommonTree)adaptor.create(BOOL19)
                    ;
                    adaptor.addChild(root_0, BOOL19_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:30:24: cmp
                    {
                    dbg.location(30,24);
                    pushFollow(FOLLOW_cmp_in_ifStmt190);
                    cmp20=cmp();

                    state._fsp--;

                    adaptor.addChild(root_0, cmp20.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(30,30);
            pushFollow(FOLLOW_thenStmt_in_ifStmt194);
            thenStmt21=thenStmt();

            state._fsp--;

            adaptor.addChild(root_0, thenStmt21.getTree());
            dbg.location(30,39);
            pushFollow(FOLLOW_elseStmt_in_ifStmt196);
            elseStmt22=elseStmt();

            state._fsp--;

            adaptor.addChild(root_0, elseStmt22.getTree());
            dbg.location(30,52);
            string_literal23=(Token)match(input,31,FOLLOW_31_in_ifStmt198); 

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
        dbg.location(30, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifStmt"


    public static class thenStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "thenStmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:32:1: thenStmt : 'then' ^ statements ;
    public final MiniPParser.thenStmt_return thenStmt() throws RecognitionException {
        MiniPParser.thenStmt_return retval = new MiniPParser.thenStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal24=null;
        MiniPParser.statements_return statements25 =null;


        CommonTree string_literal24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "thenStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:32:9: ( 'then' ^ statements )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:32:11: 'then' ^ statements
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(32,17);
            string_literal24=(Token)match(input,37,FOLLOW_37_in_thenStmt206); 
            string_literal24_tree = 
            (CommonTree)adaptor.create(string_literal24)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal24_tree, root_0);

            dbg.location(32,19);
            pushFollow(FOLLOW_statements_in_thenStmt209);
            statements25=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements25.getTree());

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
        dbg.location(32, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "thenStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "thenStmt"


    public static class elseStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseStmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:34:1: elseStmt : ( 'else' ^ statements )? ;
    public final MiniPParser.elseStmt_return elseStmt() throws RecognitionException {
        MiniPParser.elseStmt_return retval = new MiniPParser.elseStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal26=null;
        MiniPParser.statements_return statements27 =null;


        CommonTree string_literal26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elseStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:34:9: ( ( 'else' ^ statements )? )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:34:11: ( 'else' ^ statements )?
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(34,11);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:34:11: ( 'else' ^ statements )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:34:12: 'else' ^ statements
                    {
                    dbg.location(34,18);
                    string_literal26=(Token)match(input,30,FOLLOW_30_in_elseStmt217); 
                    string_literal26_tree = 
                    (CommonTree)adaptor.create(string_literal26)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_0);

                    dbg.location(34,20);
                    pushFollow(FOLLOW_statements_in_elseStmt220);
                    statements27=statements();

                    state._fsp--;

                    adaptor.addChild(root_0, statements27.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(34, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elseStmt"


    public static class whileStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:1: whileStmt : 'while' ^ ( BOOL | cmp ) doStmt 'od' !;
    public final MiniPParser.whileStmt_return whileStmt() throws RecognitionException {
        MiniPParser.whileStmt_return retval = new MiniPParser.whileStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal28=null;
        Token BOOL29=null;
        Token string_literal32=null;
        MiniPParser.cmp_return cmp30 =null;

        MiniPParser.doStmt_return doStmt31 =null;


        CommonTree string_literal28_tree=null;
        CommonTree BOOL29_tree=null;
        CommonTree string_literal32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whileStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:10: ( 'while' ^ ( BOOL | cmp ) doStmt 'od' !)
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:12: 'while' ^ ( BOOL | cmp ) doStmt 'od' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(36,19);
            string_literal28=(Token)match(input,38,FOLLOW_38_in_whileStmt230); 
            string_literal28_tree = 
            (CommonTree)adaptor.create(string_literal28)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_0);

            dbg.location(36,21);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:21: ( BOOL | cmp )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==BOOL) ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= FLOAT && LA6_0 <= ID)||LA6_0==INT||LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:22: BOOL
                    {
                    dbg.location(36,22);
                    BOOL29=(Token)match(input,BOOL,FOLLOW_BOOL_in_whileStmt234); 
                    BOOL29_tree = 
                    (CommonTree)adaptor.create(BOOL29)
                    ;
                    adaptor.addChild(root_0, BOOL29_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:36:29: cmp
                    {
                    dbg.location(36,29);
                    pushFollow(FOLLOW_cmp_in_whileStmt238);
                    cmp30=cmp();

                    state._fsp--;

                    adaptor.addChild(root_0, cmp30.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(36,34);
            pushFollow(FOLLOW_doStmt_in_whileStmt241);
            doStmt31=doStmt();

            state._fsp--;

            adaptor.addChild(root_0, doStmt31.getTree());
            dbg.location(36,45);
            string_literal32=(Token)match(input,33,FOLLOW_33_in_whileStmt243); 

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
        dbg.location(36, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileStmt"


    public static class doStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doStmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:38:1: doStmt : 'do' ^ statements ;
    public final MiniPParser.doStmt_return doStmt() throws RecognitionException {
        MiniPParser.doStmt_return retval = new MiniPParser.doStmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal33=null;
        MiniPParser.statements_return statements34 =null;


        CommonTree string_literal33_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "doStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:38:7: ( 'do' ^ statements )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:38:9: 'do' ^ statements
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(38,13);
            string_literal33=(Token)match(input,29,FOLLOW_29_in_doStmt251); 
            string_literal33_tree = 
            (CommonTree)adaptor.create(string_literal33)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal33_tree, root_0);

            dbg.location(38,15);
            pushFollow(FOLLOW_statements_in_doStmt254);
            statements34=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements34.getTree());

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
        dbg.location(38, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "doStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "doStmt"


    public static class io_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "io_stmt"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:40:1: io_stmt : ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !;
    public final MiniPParser.io_stmt_return io_stmt() throws RecognitionException {
        MiniPParser.io_stmt_return retval = new MiniPParser.io_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        MiniPParser.expression_return expression37 =null;


        CommonTree set35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "io_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:40:8: ( ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !)
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:40:10: ( 'print' | 'println' | 'read' ) ^ '(' ! expression ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(40,40);
            set35=(Token)input.LT(1);

            set35=(Token)input.LT(1);

            if ( (input.LA(1) >= 34 && input.LA(1) <= 36) ) {
                input.consume();
                root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set35)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(40,45);
            char_literal36=(Token)match(input,27,FOLLOW_27_in_io_stmt274); 
            dbg.location(40,47);
            pushFollow(FOLLOW_expression_in_io_stmt277);
            expression37=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression37.getTree());
            dbg.location(40,61);
            char_literal38=(Token)match(input,28,FOLLOW_28_in_io_stmt279); 

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
        dbg.location(40, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "io_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "io_stmt"


    public static class ar_exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ar_exp"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:42:1: ar_exp : product ( STRICH_OP ^ product )* ;
    public final MiniPParser.ar_exp_return ar_exp() throws RecognitionException {
        MiniPParser.ar_exp_return retval = new MiniPParser.ar_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRICH_OP40=null;
        MiniPParser.product_return product39 =null;

        MiniPParser.product_return product41 =null;


        CommonTree STRICH_OP40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ar_exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:42:7: ( product ( STRICH_OP ^ product )* )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:42:9: product ( STRICH_OP ^ product )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(42,9);
            pushFollow(FOLLOW_product_in_ar_exp287);
            product39=product();

            state._fsp--;

            adaptor.addChild(root_0, product39.getTree());
            dbg.location(42,17);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:42:17: ( STRICH_OP ^ product )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==STRICH_OP) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:42:18: STRICH_OP ^ product
            	    {
            	    dbg.location(42,27);
            	    STRICH_OP40=(Token)match(input,STRICH_OP,FOLLOW_STRICH_OP_in_ar_exp290); 
            	    STRICH_OP40_tree = 
            	    (CommonTree)adaptor.create(STRICH_OP40)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(STRICH_OP40_tree, root_0);

            	    dbg.location(42,29);
            	    pushFollow(FOLLOW_product_in_ar_exp293);
            	    product41=product();

            	    state._fsp--;

            	    adaptor.addChild(root_0, product41.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


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
        dbg.location(42, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ar_exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ar_exp"


    public static class product_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "product"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:44:1: product : ar_term ( PUNKT_OP ^ ar_term )* ;
    public final MiniPParser.product_return product() throws RecognitionException {
        MiniPParser.product_return retval = new MiniPParser.product_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PUNKT_OP43=null;
        MiniPParser.ar_term_return ar_term42 =null;

        MiniPParser.ar_term_return ar_term44 =null;


        CommonTree PUNKT_OP43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "product");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:44:8: ( ar_term ( PUNKT_OP ^ ar_term )* )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:44:10: ar_term ( PUNKT_OP ^ ar_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(44,10);
            pushFollow(FOLLOW_ar_term_in_product303);
            ar_term42=ar_term();

            state._fsp--;

            adaptor.addChild(root_0, ar_term42.getTree());
            dbg.location(44,18);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:44:18: ( PUNKT_OP ^ ar_term )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==PUNKT_OP) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:44:19: PUNKT_OP ^ ar_term
            	    {
            	    dbg.location(44,27);
            	    PUNKT_OP43=(Token)match(input,PUNKT_OP,FOLLOW_PUNKT_OP_in_product306); 
            	    PUNKT_OP43_tree = 
            	    (CommonTree)adaptor.create(PUNKT_OP43)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PUNKT_OP43_tree, root_0);

            	    dbg.location(44,29);
            	    pushFollow(FOLLOW_ar_term_in_product309);
            	    ar_term44=ar_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ar_term44.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(44, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "product");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "product"


    public static class ar_term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ar_term"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:46:1: ar_term : ( ID | numberconst | '(' ! ar_exp ')' !);
    public final MiniPParser.ar_term_return ar_term() throws RecognitionException {
        MiniPParser.ar_term_return retval = new MiniPParser.ar_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID45=null;
        Token char_literal47=null;
        Token char_literal49=null;
        MiniPParser.numberconst_return numberconst46 =null;

        MiniPParser.ar_exp_return ar_exp48 =null;


        CommonTree ID45_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree char_literal49_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ar_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:46:8: ( ID | numberconst | '(' ! ar_exp ')' !)
            int alt9=3;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:46:10: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(46,10);
                    ID45=(Token)match(input,ID,FOLLOW_ID_in_ar_term318); 
                    ID45_tree = 
                    (CommonTree)adaptor.create(ID45)
                    ;
                    adaptor.addChild(root_0, ID45_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:46:15: numberconst
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(46,15);
                    pushFollow(FOLLOW_numberconst_in_ar_term322);
                    numberconst46=numberconst();

                    state._fsp--;

                    adaptor.addChild(root_0, numberconst46.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:46:29: '(' ! ar_exp ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(46,32);
                    char_literal47=(Token)match(input,27,FOLLOW_27_in_ar_term326); 
                    dbg.location(46,34);
                    pushFollow(FOLLOW_ar_exp_in_ar_term329);
                    ar_exp48=ar_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, ar_exp48.getTree());
                    dbg.location(46,44);
                    char_literal49=(Token)match(input,28,FOLLOW_28_in_ar_term331); 

                    }
                    break;

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
        dbg.location(46, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ar_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ar_term"


    public static class cmp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmp"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:48:1: cmp : ar_exp RELOP ^ ar_exp ;
    public final MiniPParser.cmp_return cmp() throws RecognitionException {
        MiniPParser.cmp_return retval = new MiniPParser.cmp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RELOP51=null;
        MiniPParser.ar_exp_return ar_exp50 =null;

        MiniPParser.ar_exp_return ar_exp52 =null;


        CommonTree RELOP51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cmp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:48:4: ( ar_exp RELOP ^ ar_exp )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:48:6: ar_exp RELOP ^ ar_exp
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(48,6);
            pushFollow(FOLLOW_ar_exp_in_cmp339);
            ar_exp50=ar_exp();

            state._fsp--;

            adaptor.addChild(root_0, ar_exp50.getTree());
            dbg.location(48,18);
            RELOP51=(Token)match(input,RELOP,FOLLOW_RELOP_in_cmp341); 
            RELOP51_tree = 
            (CommonTree)adaptor.create(RELOP51)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RELOP51_tree, root_0);

            dbg.location(48,20);
            pushFollow(FOLLOW_ar_exp_in_cmp344);
            ar_exp52=ar_exp();

            state._fsp--;

            adaptor.addChild(root_0, ar_exp52.getTree());

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
        dbg.location(48, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cmp"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:1: statement : ( ifStmt | whileStmt | io_stmt | var_def );
    public final MiniPParser.statement_return statement() throws RecognitionException {
        MiniPParser.statement_return retval = new MiniPParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MiniPParser.ifStmt_return ifStmt53 =null;

        MiniPParser.whileStmt_return whileStmt54 =null;

        MiniPParser.io_stmt_return io_stmt55 =null;

        MiniPParser.var_def_return var_def56 =null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:10: ( ifStmt | whileStmt | io_stmt | var_def )
            int alt10=4;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 34:
            case 35:
            case 36:
                {
                alt10=3;
                }
                break;
            case ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:12: ifStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,12);
                    pushFollow(FOLLOW_ifStmt_in_statement351);
                    ifStmt53=ifStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStmt53.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:20: whileStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,20);
                    pushFollow(FOLLOW_whileStmt_in_statement354);
                    whileStmt54=whileStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStmt54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:31: io_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,31);
                    pushFollow(FOLLOW_io_stmt_in_statement357);
                    io_stmt55=io_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, io_stmt55.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:50:40: var_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,40);
                    pushFollow(FOLLOW_var_def_in_statement360);
                    var_def56=var_def();

                    state._fsp--;

                    adaptor.addChild(root_0, var_def56.getTree());

                    }
                    break;

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
        dbg.location(50, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"


    public static class statements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:52:1: statements : ( statement ^ SEMICOL !)+ ;
    public final MiniPParser.statements_return statements() throws RecognitionException {
        MiniPParser.statements_return retval = new MiniPParser.statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMICOL58=null;
        MiniPParser.statement_return statement57 =null;


        CommonTree SEMICOL58_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:52:11: ( ( statement ^ SEMICOL !)+ )
            dbg.enterAlt(1);

            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:52:13: ( statement ^ SEMICOL !)+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(52,13);
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:52:13: ( statement ^ SEMICOL !)+
            int cnt11=0;
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==32||(LA11_0 >= 34 && LA11_0 <= 36)||LA11_0==38) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:52:14: statement ^ SEMICOL !
            	    {
            	    dbg.location(52,23);
            	    pushFollow(FOLLOW_statement_in_statements368);
            	    statement57=statement();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(statement57.getTree(), root_0);
            	    dbg.location(52,32);
            	    SEMICOL58=(Token)match(input,SEMICOL,FOLLOW_SEMICOL_in_statements371); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt11++;
            } while (true);
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(52, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statements"


    public static class numberconst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numberconst"
    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:54:1: numberconst : ( INT -> INT | FLOAT -> FLOAT );
    public final MiniPParser.numberconst_return numberconst() throws RecognitionException {
        MiniPParser.numberconst_return retval = new MiniPParser.numberconst_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT59=null;
        Token FLOAT60=null;

        CommonTree INT59_tree=null;
        CommonTree FLOAT60_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try { dbg.enterRule(getGrammarFileName(), "numberconst");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:54:12: ( INT -> INT | FLOAT -> FLOAT )
            int alt12=2;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==FLOAT) ) {
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

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:54:14: INT
                    {
                    dbg.location(54,14);
                    INT59=(Token)match(input,INT,FOLLOW_INT_in_numberconst381);  
                    stream_INT.add(INT59);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 54:18: -> INT
                    {
                        dbg.location(54,21);
                        adaptor.addChild(root_0, 
                        stream_INT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abh840\\Desktop\\Aufgabe2\\Aufgabe2\\MiniP.g:54:27: FLOAT
                    {
                    dbg.location(54,27);
                    FLOAT60=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numberconst389);  
                    stream_FLOAT.add(FLOAT60);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 54:33: -> FLOAT
                    {
                        dbg.location(54,36);
                        adaptor.addChild(root_0, 
                        stream_FLOAT.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

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
        dbg.location(54, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numberconst");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "numberconst"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_main48 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_declarations_in_main50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_main52 = new BitSet(new long[]{0x0000005D00002000L});
    public static final BitSet FOLLOW_statements_in_main54 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_main56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations73 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_TYPE_in_declaration90 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaration92 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_COMMA_in_declaration95 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaration97 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_SEMICOL_in_declaration101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var_def120 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DEF_in_var_def122 = new BitSet(new long[]{0x000000000900B020L});
    public static final BitSet FOLLOW_expression_in_var_def124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_expression142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ar_exp_in_expression158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStmt182 = new BitSet(new long[]{0x000000000800B020L});
    public static final BitSet FOLLOW_BOOL_in_ifStmt186 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_cmp_in_ifStmt190 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_thenStmt_in_ifStmt194 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_elseStmt_in_ifStmt196 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ifStmt198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_thenStmt206 = new BitSet(new long[]{0x0000005D00002000L});
    public static final BitSet FOLLOW_statements_in_thenStmt209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_elseStmt217 = new BitSet(new long[]{0x0000005D00002000L});
    public static final BitSet FOLLOW_statements_in_elseStmt220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_whileStmt230 = new BitSet(new long[]{0x000000000800B020L});
    public static final BitSet FOLLOW_BOOL_in_whileStmt234 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_cmp_in_whileStmt238 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_doStmt_in_whileStmt241 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whileStmt243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_doStmt251 = new BitSet(new long[]{0x0000005D00002000L});
    public static final BitSet FOLLOW_statements_in_doStmt254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_io_stmt261 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_io_stmt274 = new BitSet(new long[]{0x000000000900B020L});
    public static final BitSet FOLLOW_expression_in_io_stmt277 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_io_stmt279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_ar_exp287 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_STRICH_OP_in_ar_exp290 = new BitSet(new long[]{0x000000000800B000L});
    public static final BitSet FOLLOW_product_in_ar_exp293 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ar_term_in_product303 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_PUNKT_OP_in_product306 = new BitSet(new long[]{0x000000000800B000L});
    public static final BitSet FOLLOW_ar_term_in_product309 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_ar_term318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberconst_in_ar_term322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ar_term326 = new BitSet(new long[]{0x000000000800B000L});
    public static final BitSet FOLLOW_ar_exp_in_ar_term329 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ar_term331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ar_exp_in_cmp339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RELOP_in_cmp341 = new BitSet(new long[]{0x000000000800B000L});
    public static final BitSet FOLLOW_ar_exp_in_cmp344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_statement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_io_stmt_in_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_def_in_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements368 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_SEMICOL_in_statements371 = new BitSet(new long[]{0x0000005D00002002L});
    public static final BitSet FOLLOW_INT_in_numberconst381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_numberconst389 = new BitSet(new long[]{0x0000000000000002L});

}