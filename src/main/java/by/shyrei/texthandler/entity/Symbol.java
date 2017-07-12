package by.shyrei.texthandler.entity;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Project TextHandler
 * Created on 29.06.2017.
 * author Shyrei Uladzimir
 */
public class Symbol implements TextComponent {

    private char symbol;

    public Symbol(String symbol) {
        this.symbol = symbol.charAt(0);
    }

    @Override
    public void addComponent(TextComponent component) {
    }

    @Override
    public ArrayList<TextComponent> getComponents() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symbol)) return false;
        Symbol symbol1 = (Symbol) o;
        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
