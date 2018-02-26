/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author x16774931
 */
public interface IPriorityQueue {
    void enqueue(int newValue, Object o);
    Object dequeue();
    boolean isEmpty();
    int size();
    void printQueue();
}
