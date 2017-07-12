package by.shyrei.texthandler.reader;

import org.junit.Assert;
import org.junit.Test;

/**
 * Project TextHandler
 * Created on 29.06.2017.
 * author Shyrei Uladzimir
 */
public class TextReaderTest {
    private static final String PATH = "files/text.txt";
    private TextReader reader = new TextReader();

    @Test
    public void readText() throws Exception {
        String test = reader.readText(PATH);
        Assert.assertTrue(!test.isEmpty());
    }
}