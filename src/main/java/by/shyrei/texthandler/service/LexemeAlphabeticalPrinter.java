package by.shyrei.texthandler.service;

import by.shyrei.texthandler.entity.*;
import by.shyrei.texthandler.entity.TextComponent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Project TextHandler
 * Created on 04.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeAlphabeticalPrinter {

    private final static Logger logger = LogManager.getLogger(LexemeAlphabeticalPrinter.class);

    public void lexemeAlphabeticalPrinter(TextComposite textComposite) {
        TreeMap<Character, ArrayList<String>> lexems = addSymbols();
        for (TextComponent paragraphComponent : textComposite.getComponents()) {
            for (TextComponent sentenceComponent : paragraphComponent.getComponents()) {
                for (TextComponent lexemeComponent : sentenceComponent.getComponents()) {
                    String lexem = lexemeComponent.toString().trim();
                    char firstSymbol = lexem.toLowerCase().charAt(0);
                    if (Character.isLetter(firstSymbol)) {
                        lexems.get(firstSymbol).add(lexem);
                    }
                }
            }
        }
        for (Map.Entry<Character, ArrayList<String>> entry : lexems.entrySet()) {
            entry.getValue().sort(Comparator.naturalOrder());
            if (!entry.getValue().isEmpty()) {
                logger.log(Level.INFO, entry.getKey() + " " + entry.getValue());
            }
        }
    }

    private TreeMap<Character, ArrayList<String>> addSymbols() {
        TreeMap<Character, ArrayList<String>> lexems = new TreeMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            lexems.put(c, new ArrayList<>());
        }
        return lexems;
    }
}
