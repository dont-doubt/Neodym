package neodym;

import neodym.antlr.NeodymBaseListener;
import neodym.antlr.NeodymParser.ProgContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NeodymVisitor extends NeodymBaseListener {
    @Override
    public void enterProg(ProgContext ctx) {
        System.out.println(ctx);
    }

    @Override
    public void exitProg(ProgContext ctx) {
        System.out.println(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        System.out.println(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println(node);
    }
}
