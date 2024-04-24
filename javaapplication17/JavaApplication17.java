/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

/**
 *
 * \
 */

public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.add("First");
        doublyLinkedList.add("Second");
        doublyLinkedList.add("Third");

        System.out.println("Elements of the doubly linked list:");
        for (int i = 0; i < doublyLinkedList.size(); i++) {
            System.out.println(doublyLinkedList.get(i));
        }

        doublyLinkedList.remove(1);

        System.out.println("\nAfter removing an element:");
        for (int i = 0; i < doublyLinkedList.size(); i++) {
            System.out.println(doublyLinkedList.get(i));
        }
    }
    
}
