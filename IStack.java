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
public interface IStack {
    void push(Object o);
    Object pop();
    Object peek();
    boolean isEmpty();
}
