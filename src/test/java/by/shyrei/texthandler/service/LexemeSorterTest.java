package by.shyrei.texthandler.service;

import by.shyrei.texthandler.chainparser.TextParser;
import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;
import org.junit.Test;

/**
 * Project TextHandler
 * Created on 08.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeSorterTest {

    private LexemeSorter sorter = new LexemeSorter();
    private TextParser textParser = new TextParser();
    private TextComposite textComposite = new TextComposite(ComponentType.TEXT);
    @Test
    public void sorter() throws Exception {
        String TEST = "\tIt has has survived not only five centuries, but also the leap into 13+ i-- electronic\n" +
                "typesetting, remaining 3+5 essentially 6+9*(3-4) unchanged. It was popularised in the\n" +
                "5*(1*2*(3*(4*(5- --j + 4)-3)-2)-1) with the release of Letraset sheets containing Lorem\n" +
                "Ipsum passages, and more recently with desktop publishing software like Aldus\n" +
                "PageMaker including versions of a Lorem Ipsum a.\n";
        textParser.parse(TEST, textComposite);
        sorter.sorter(textComposite, 'a');
    }
}