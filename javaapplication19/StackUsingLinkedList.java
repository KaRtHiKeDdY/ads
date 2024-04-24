/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 *
 */
import java.util.LinkedList;
public class StackUsingLinkedList {
    
    private final LinkedList<Integer> stack;

    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    // Push element onto the stack
    public void push(int element) {
        stack.addLast(element);
        System.out.println("Pushed element: " + element);
    }

    // Pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating an empty stack
        }

        int poppedElement = stack.removeLast();
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    
    }}
