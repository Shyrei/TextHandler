package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.Symbol;
import by.shyrei.texthandler.entity.TextComposite;

import java.util.Arrays;
import java.util.List;

/**
 * Project TextHandler
 * Created on 29.06.2017.
 * author Shyrei Uladzimir
 */
public class LexemeParser implements ChainParser {
    private final String LEXEME_TO_SYMBOL = "";
    @Override
    public TextComposite parse(String lexemeString, TextComposite lexemeComposite) {
        List<String> symbolList = Arrays.asList(lexemeString.split(LEXEME_TO_SYMBOL));
        symbolList.forEach((symbolString) -> {
            Symbol symbolComponent = new Symbol(symbolString);
            lexemeComposite.addComponent(symbolComponent);
        });
        return lexemeComposite;
    }
}
