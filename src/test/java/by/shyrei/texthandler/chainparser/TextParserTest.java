package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project TextHandler
 * Created on 03.07.2017.
 * author Shyrei Uladzimir
 */
public class TextParserTest {
    private TextComposite composite = new TextComposite(ComponentType.TEXT);
    private TextParser parser = new TextParser();

    @Test
    public void parse() throws Exception {
        String EXPECTED = "\t" + "It has survived not only five centuries, but also the leap into 13+ i-- electronic\n" +
                "typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. It was popularised in\n" +
                "the 5*(1*2*(3*(4*(5- --j + 4)-3)-2)-1) with the release of Letraset sheets containing Lorem\n" +
                "Ipsum passages, and more recently with desktop publishing software like Aldus\n" +
                "PageMaker including versions of Lorem Ipsum.";
        String ACTUAL = "\t" + "It has survived not only five centuries, but also the leap into17 electronic\n" +
                "typesetting, remaining8 essentially-3 unchanged. It was popularised in\n" +
                "the485 with the release of Letraset sheets containing Lorem\n" +
                "Ipsum passages, and more recently with desktop publishing software like Aldus\n" +
                "PageMaker including versions of Lorem Ipsum.";
        parser.parse(EXPECTED, composite);
        assertEquals(ACTUAL, composite.toString());
    }
}
