/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * 
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> doublyLinkedList = new LinkedList<>();

        // Add elements to the doubly linked list
        addElement(doublyLinkedList, "Apple");
        addElement(doublyLinkedList, "Banana");
        addElement(doublyLinkedList, "Cherry");

        // Display the doubly linked list
        displayList(doublyLinkedList);
    }

    // Method to add an element to the doubly linked list
    private static void addElement(LinkedList<String> list, String element) {
        list.add(element);
        System.out.println("Added element: " + element);
    }

    // Method to display the doubly linked list
    private static void displayList(LinkedList<String> list) {
        System.out.println("Doubly Linked List:");

        // Use ListIterator to traverse the list in both directions
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
    }
}
    
    

