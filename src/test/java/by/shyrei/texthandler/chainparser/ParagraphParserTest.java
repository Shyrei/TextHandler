package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Project TextHandler
 * Created on 03.07.2017.
 * author Shyrei Uladzimir
 */
public class ParagraphParserTest {
    private TextComposite composite = new TextComposite(ComponentType.PARAGRAPH);
    private ParagraphParser parser = new ParagraphParser();

    @Test
    public void parse() throws Exception {
        String TEST = "Hello big world. Hello big world. Hello big world.";
        parser.parse(TEST, composite);
        assertEquals(TEST, composite.toString());
    }
}