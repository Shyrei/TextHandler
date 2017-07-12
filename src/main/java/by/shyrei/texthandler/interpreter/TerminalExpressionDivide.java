package by.shyrei.texthandler.interpreter;

/**
 * Project TextHandler
 * Created on 06.07.2017.
 * author Shyrei Uladzimir
 */
public class TerminalExpressionDivide extends AbstractMathExpression{
    @Override
    public void interpret(RPNContext context) {
        int first = context.popValue();
        context.pushValue(context.popValue() / first);
    }
}
