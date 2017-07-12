package by.shyrei.texthandler.interpreter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Project TextHandler
 * Created on 06.07.2017.
 * author Shyrei Uladzimir
 */
@RunWith(Parameterized.class)
public class RPNCalculatorTest {
    private String testExpression;
    private String expected;

    public RPNCalculatorTest(String testExpression, String expected) {
        this.testExpression = testExpression;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"13 2 +", "15"},
                {"3 5 +", "8"},
                {"6 9 3 4 - * +", "-3"},
                {"5 1 2 3 4 5 1 - 4 + * 3 - * 2 - * * 1 - *", "845"},
                {"71 2 4 3 2 2 2 / 2 *- * 2 - * * 10 2 /- - 4 *", "76"},
                {"0  5 - 2 2 / 2 5 2 * + 4 - *+ 1200 *", "9600"}
        });
    }

    @Test
    public void calculate() throws Exception {
        RPNCalculator calculator = new RPNCalculator(testExpression);
        String actual = calculator.calculate().toString();
        Assert.assertEquals(expected, actual);
    }
}