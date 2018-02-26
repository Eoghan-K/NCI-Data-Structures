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
public class Queue implements IQueue {
    
    List<Object> queue;
    
    public Queue(){
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(Object o) {
        queue.add(0, o);
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            return  queue.remove(queue.size() - 1);
        }
        return null;
    }

    @Override
    public Object front() {
        if (!isEmpty()) {
            return queue.get(queue.size() - 1);
        }
        return null;
    }

    @Override
    public Object rear() {
        if (!isEmpty()) {
            return queue.get(0);
        }
        return null;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
}
