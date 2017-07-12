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
public class SentenceParserTest {
    private TextComposite composite = new TextComposite(ComponentType.SENTENCE);
    private SentenceParser parser = new SentenceParser();

    @Test
    public void parse() throws Exception {
        String TEST = "Privet-moi drug, kak dela y tebya? i y menia;";
        parser.parse(TEST, composite);
        assertEquals(TEST, composite.toString());
    }
}