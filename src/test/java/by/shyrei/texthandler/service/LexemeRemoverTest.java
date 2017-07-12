package by.shyrei.texthandler.service;

import by.shyrei.texthandler.chainparser.ChainParser;
import by.shyrei.texthandler.chainparser.TextParser;
import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Project TextHandler
 * Created on 04.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeRemoverTest {
    private TextComposite textComposite = new TextComposite(ComponentType.TEXT);
    private ChainParser parser = new TextParser();
    private LexemeRemover remover = new LexemeRemover();

    @Test
    public void remove() throws Exception {
        String actualText = "\t" + "It is a god text for test. It is a small text. It is a testText.";
        String expectedText = "\t" + "It a god text for test. It a small text. It a testText.";
        parser.parse(actualText, textComposite);
        remover.remove(textComposite, 3, 'i');
        Assert.assertEquals(expectedText, textComposite.toString());
    }
}