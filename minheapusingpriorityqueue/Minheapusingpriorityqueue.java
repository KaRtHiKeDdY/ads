/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minheapusingpriorityqueue;

/**
 *
 * @author karthikreddy
 */
import java.util.PriorityQueue;
public class Minheapusingpriorityqueue {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(11);
        heap.add(2);
        heap.add(10);
        heap.add(7);
        heap.add(3);
        heap.add(8);
        System.out.println(heap);
        System.out.println("size of heap : " + heap.size());
        System.out.println("min in heap : " + heap.peek());
        System.out.println("Deleted Element: " + heap.poll());
        System.out.println("after deletion");
        System.out.println(heap);
        System.out.println("size of heap : " + heap.size());
        System.out.println("Deleted Element: " + heap.poll());
        System.out.println(heap);
        System.out.println("min in heap : " + heap.peek());
    }
    
}
