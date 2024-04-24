/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueuedemo;

/**
 *
 * @author karthikreddy
 */
 import java.util.*;
public class Priorityqueuedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PriorityQueue q = new PriorityQueue();
        System.out.println(q.peek());
        System.out.println(q.element());
        for (int i = 0; i <= 10; i++) {
            q.offer(i);
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
    
}
