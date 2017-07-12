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
public class RPNConverterTest {
    private String testExpression;
    private String expected;
    private int i;
    private int j;

    public RPNConverterTest(String testExpression, String expected, int i, int j) {
        this.testExpression = testExpression;
        this.expected = expected;
        this.i = i;
        this.j = j;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"13+i--", "13 2 +", 2, 0},
                {"3+5", "3 5 +", 0, 0},
                {"6+9*(3-4)", "6 9 3 4 - * +", 0, 0},
                {"5*(1*2*(3*(4*(5- --j+4)-3)-2)-1)", "5 1 2 3 4 5 1 - 4 + * 3 - * 2 - * * 1 - *", 0, 2},
                {"(71-(2*i--*(3*(2-2/2*2)-2)-10/2))*++i", "71 2 4 3 2 2 2 / 2 *- * 2 - * * 10 2 /- - 5 *", 4, 0},
                {"(-5+1/2*(2+5*2- --j))*1200", "0  5 - 1 2 / 2 5 2 * + 4 - *+ 1200 *", 0, 5}
        });
    }

    @Test
    public void convert() throws Exception {
        RPNConverter converter = new RPNConverter();
        String actual = converter.convert(testExpression, i, j);
        Assert.assertEquals(expected, actual);
    }
}