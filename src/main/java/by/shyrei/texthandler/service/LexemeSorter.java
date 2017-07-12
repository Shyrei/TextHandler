package by.shyrei.texthandler.service;

import by.shyrei.texthandler.entity.TextComponent;
import by.shyrei.texthandler.entity.TextComposite;
import org.apache.commons.lang3.StringUtils;
import java.util.*;
import java.util.stream.Collectors;




/**
 * Project TextHandler
 * Created on 08.07.2017.
 * author Shyrei Uladzimir
 */
public class LexemeSorter {

    public void sorter(TextComposite textComposite, char symbol){
        ArrayList<String> lexems = new ArrayList<>();
        for (TextComponent paragraphComponent : textComposite.getComponents()) {
            for (TextComponent sentenceComponent : paragraphComponent.getComponents()) {
                for (TextComponent lexemeComponent : sentenceComponent.getComponents()) {
                    lexems.add(lexemeComponent.toString().trim());
                }
            }
        }
        List<String> sorted = lexems.stream().sorted(Comparator.comparingInt((String word) -> StringUtils.countMatches(word, symbol)).reversed().thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
