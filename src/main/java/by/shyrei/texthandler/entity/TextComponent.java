package by.shyrei.texthandler.entity;

import java.util.ArrayList;

/**
 * Project TextHandler
 * Created on 29.06.2017.
 * author Shyrei Uladzimir
 */
public interface TextComponent {
    void addComponent(TextComponent component);
    ArrayList<TextComponent> getComponents();
}
