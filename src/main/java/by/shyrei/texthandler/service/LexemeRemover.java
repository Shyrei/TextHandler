package by.shyrei.texthandler.service;

import by.shyrei.texthandler.entity.TextComponent;
import by.shyrei.texthandler.entity.TextComposite;

import java.util.Iterator;

/**
 * Project TextHandler
 * Created on 04.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeRemover {
    public void remove(TextComposite textComposite, int lexemeLength, char firstSymbol) {
        for (TextComponent paragraphComponent: textComposite.getComponents()) {
            for (TextComponent sentenceComponent: paragraphComponent.getComponents()) {
                Iterator iterator = sentenceComponent.getComponents().iterator();
                while (iterator.hasNext()){
                    TextComponent lexemeComposite = (TextComponent) iterator.next();
                    if (lexemeComposite.toString().length() == lexemeLength && lexemeComposite.toString().trim().charAt(0) == firstSymbol) {
                        iterator.remove();
                    }
                }
            }
        }
    }
}
