/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

/**
 *
 * @author karthikreddy
 */
import java.util.PriorityQueue;
public class JavaApplication30 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue <Integer> heap=new PriorityQueue<>();
        heap.add(11);
        heap.add(22);
        heap.add(33);
        heap.add(44);
        heap.add(55);
        heap.add(66);
        heap.add(77);
        
        System.out.println(heap);
        System.out.println("size of heap"+heap.size());
        System.out.println("Max element is"+heap.peek());
        System.out.println("Deleted Element"+heap.poll());
        System.out.println("AFTER DELETION:"+heap);
        System.out.println(heap.poll());
        System.out.println(heap.peek());
        System.out.println(heap);
        
    }
        
    }
    

