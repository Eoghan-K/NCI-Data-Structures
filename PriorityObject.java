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
public class PriorityObject {
    private int value;
    private Object obj;

    public PriorityObject(int value, Object obj) {
        this.value = value;
        this.obj = obj;
    }

    public int getValue() {
        return value;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return obj.toString();
    }
    
    
}
