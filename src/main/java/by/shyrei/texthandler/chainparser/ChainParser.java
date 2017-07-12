package by.shyrei.texthandler.chainparser;

import by.shyrei.texthandler.entity.TextComposite;

/**
 * Project TextHandler
 * Created on 29.06.2017.
 * author Shyrei Uladzimir
 */
public interface ChainParser {
    TextComposite parse(String from, TextComposite to);
}
