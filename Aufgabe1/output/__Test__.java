import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        miniPLexer lex = new miniPLexer(new ANTLRFileStream("/Users/foxhound/Documents/HAW/ci/Praktikum/Aufgabe1/inputMiniP.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        miniPParser g = new miniPParser(tokens, 49100, null);
        try {
            g.miniP();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}