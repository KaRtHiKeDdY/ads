/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 *
 */
import java.util.ArrayList;

public class StackUsingArrayList<T> {
    private final ArrayList<T> arrayList;

    public StackUsingArrayList() {
        arrayList = new ArrayList<>();
    }

    // Push element onto the stack
    public void push(T element) {
        arrayList.add(element);
        System.out.println("Pushed element: " + element);
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // Return null or handle as needed for an empty stack
        }

        T poppedElement = arrayList.remove(arrayList.size() - 1);
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
    
}
