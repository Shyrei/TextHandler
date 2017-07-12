package by.shyrei.texthandler.interpreter;

/**
 * Project TextHandler
 * Created on 06.07.2017.
 * author Shyrei Uladzimir
 */
public class NonterminalMathExpressionNumber extends AbstractMathExpression {

    private int number;
    public NonterminalMathExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(RPNContext context) {
        context.pushValue(number);
    }
}
