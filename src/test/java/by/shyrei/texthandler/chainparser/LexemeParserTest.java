package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project TextHandler
 * Created on 03.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeParserTest {
    private TextComposite composite = new TextComposite(ComponentType.LEXEME);
    private LexemeParser parser = new LexemeParser();

    @Test
    public void parse() throws Exception {
        String TEST = "Privet-moi drug, kak dela - y tebya? i y menia;";
        parser.parse(TEST, composite);
        Assert.assertEquals(TEST, composite.toString());
    }
}