package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.ComponentType;
import by.shyrei.texthandler.entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project TextHandler
 * Created on 03.07.2017.
 * author Shyrei Uladzimir
 */
public class TextParser implements ChainParser {
    private final String TEXT_TO_PARAGRAPH = "(\\n{2})?(\\t)(.+\\n)*.+";
    private ChainParser parser = new ParagraphParser();

    @Override
    public TextComposite parse(String text, TextComposite textComposite) {
        Pattern pattern = Pattern.compile(TEXT_TO_PARAGRAPH);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String paragraph = matcher.group();
            TextComposite paragraphComposite = new TextComposite(ComponentType.PARAGRAPH);
            parser.parse(paragraph, paragraphComposite);
            textComposite.addComponent(paragraphComposite);
        }
        return textComposite;
    }
}
