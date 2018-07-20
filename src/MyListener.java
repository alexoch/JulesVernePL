import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class MyListener extends JulesVerneBaseListener {

    private Map<String, Integer> variables;

    public MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(JulesVerneParser.AssignContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement

        // Get variable name
        String variableName = ctx.ID(0).getText();

        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.NUMBER().getText();

//        String valueString = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//                : ctx.string().getText();

        // Add variable to map
        if(ctx.ID().size() > 1) {
            variables.put(variableName, variables.get(value));
        }
        else {
            variables.put(variableName, Integer.parseInt(value));
        }
    }

    @Override
    public void exitAdd(JulesVerneParser.AddContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement

        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());

        variables.put(variableName, variables.get(variableName) + value);
    }

    @Override
    public void exitMinus(JulesVerneParser.MinusContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());

        variables.put(variableName, variables.get(variableName) - value);
    }

    @Override
    public void exitMultiply(JulesVerneParser.MultiplyContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());

        variables.put(variableName, variables.get(variableName) * value);
    }

    @Override
    public void exitDivide(JulesVerneParser.DivideContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());

        variables.put(variableName, variables.get(variableName) / value);
    }

    @Override
    public void exitMod(JulesVerneParser.ModContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.NUMBER().getText());

        variables.put(variableName, variables.get(variableName) % value);
    }

    @Override
    public void exitIncrement(JulesVerneParser.IncrementContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, ++value);
    }

    @Override
    public void exitDecrement(JulesVerneParser.DecrementContext ctx) {
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText()
                : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText())
                : Integer.parseInt(ctx.ID(1).getText());

        variables.put(variableName, --value);
    }

//    @Override
//    public void exitIf_stat(JulesVerneParser.If_statContext ctx) {
//        IfStatement ifStatement = new IfStatement();
//        ifStatement.visitIf_stat(ctx);
//    }

    @Override
    public void exitSmth(JulesVerneParser.SmthContext ctx) {
        if(ctx.expr(0) == ctx.expr(0)) {
            System.out.println("true!");
        }
        else {
            System.out.println("false!");
        }
    }

    @Override
    public void exitPrint(JulesVerneParser.PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement

        if(ctx.ID() == null) {
            if(ctx.NUMBER() != null) {
                String outputNum = ctx.NUMBER().getText();
                System.out.println(outputNum);
            }
            else {
                String outputStr = ctx.string().getText();
                System.out.println(outputStr);
            }
        } else {
            int outputNum = variables.get(ctx.ID().getText().toString());
            System.out.println(outputNum);
        }

//        if(ctx.ID() == null) {
//            String outputNum = ctx.NUMBER().getText();
//            System.out.println(outputNum);
//        } else if(ctx.string() != null) {
//            String outputStr = ctx.string().getText();
//            System.out.println(outputStr);
//        } else {
//            int outputNum = variables.get(ctx.ID().getText().toString());
//            System.out.println(outputNum);
//        }
//
//        if(ctx.string() != null) {
//            String outputStr = ctx.string().getText();
//            System.out.println(outputStr);
//        } else {
//            System.out.println("undefined");
//        }
    }

}