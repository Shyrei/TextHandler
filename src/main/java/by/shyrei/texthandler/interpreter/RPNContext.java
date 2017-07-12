package by.shyrei.texthandler.interpreter;

import java.util.ArrayDeque;

/**
 * Project TextHandler
 * Created on 06.07.2017.
 * author Shyrei Uladzimir
 */
public class RPNContext {
    private ArrayDeque<Integer> contextValues = new ArrayDeque<>();

    public Integer popValue(){
        return contextValues.pop();
    }

    public void pushValue(Integer value){
        contextValues.push(value);
    }


}
