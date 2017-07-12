package by.shyrei.texthandler.interpreter;

/**
 * Project TextHandler
 * Created on 06.07.2017.
 * author Shyrei Uladzimir
 */
public class TerminalExpressionPlus extends AbstractMathExpression {
    @Override
    public void interpret(RPNContext context) {
        context.pushValue(context.popValue() + context.popValue());
    }
}
