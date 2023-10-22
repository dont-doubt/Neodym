package neodym;

import neodym.antlr.NeodymLexer;
import neodym.antlr.NeodymParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test1() {
        String code = Code.of(
            "uniform int2 hello                                       ",
            "uniform int4 value                                       ",
            "                                                         ",
            "main {                                                   ",
            "}                                                        ",
            "                                                         ",
            "void maifn(int i, j, k, float j) {                       ",
            "                                                         ",
            "}                                                        "
        );

        NeodymLexer lexer = new NeodymLexer(CharStreams.fromString(code));
        NeodymParser parser = new NeodymParser(new CommonTokenStream(lexer));
//        parser.addParseListener(new NeodymBaseListener());
        parser.addParseListener(new ParseTreeListener() {
            @Override
            public void visitTerminal(TerminalNode node) {
                System.out.println("[!! 1] " + node);
            }

            @Override
            public void visitErrorNode(ErrorNode error) {
                System.out.println("[!! 2] " + error);
            }

            @Override
            public void enterEveryRule(ParserRuleContext ctx) {
                System.out.println("[!! 3] " + ctx);
            }

            @Override
            public void exitEveryRule(ParserRuleContext ctx) {
                System.out.println("[!! 4] " + ctx);
            }
        });
        NeodymParser.ProgContext ctx = parser.prog();
        for (ParseTree child : ctx.children) {
            System.out.println(child.getClass() + " " + child);
        }
    }
}