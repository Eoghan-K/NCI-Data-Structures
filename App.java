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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        IStack stack = new Stack();
//        
//        stack.push(1);
//        stack.push("test");
//        
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        stack.push(456);
//        System.out.println(stack.peek());



//        IQueue queue = new Queue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        
//        System.out.println(queue.front());
//        System.out.println(queue.rear());
//        System.out.println(queue.dequeue());


        IPriorityQueue priorityQueue = new PriorityQueue();
        
        priorityQueue.enqueue(5, "1");
        priorityQueue.enqueue(4, "3");
        priorityQueue.enqueue(10, "5");
        priorityQueue.enqueue(6, "4");
        priorityQueue.enqueue(3, "2");
        
//        priorityQueue.printQueue();
        
        System.out.println(((PriorityObject)priorityQueue.dequeue()).getObj());
    }
    
}
