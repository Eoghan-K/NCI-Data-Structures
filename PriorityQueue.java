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
public class PriorityQueue implements IPriorityQueue {

    private List<PriorityObject> priorityQueue;

    public PriorityQueue() {
        priorityQueue = new ArrayList<>();
    }

    @Override
    public void enqueue(int newValue, Object o) {
        priorityQueue.add(newPosition(newValue), new PriorityObject(newValue, o));
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            return priorityQueue.remove(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public void printQueue() {
        for (PriorityObject priorityObject : priorityQueue) {
            System.out.println("Value: " + priorityObject.getValue() + " - Object: " + priorityObject.getValue());
        }
    }

    private int newPosition(int newValue) {
        for (PriorityObject priorityObject : priorityQueue) {
            if (newValue > priorityObject.getValue()) {
                return priorityQueue.indexOf(priorityObject);
            }
        }
        return priorityQueue.size();
    }
}
