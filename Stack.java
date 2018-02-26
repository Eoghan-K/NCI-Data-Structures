/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x16774931
 */
public class Stack implements IStack{
    
    private List<Object> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(Object o) {
        stack.add(o);
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
