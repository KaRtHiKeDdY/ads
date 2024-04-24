/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

/**
 *
 * 
 * @param <T>
 */
public class StackUsingArray<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public StackUsingArray() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Push element onto the stack
    public void push(T element) {
        ensureCapacity();
        array[size++] = element;
        System.out.println("Pushed element: " + element);
    }

    // Pop element from the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // Return null or handle as needed for an empty stack
        }

        @SuppressWarnings("unchecked")
        T poppedElement = (T) array[--size];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Ensure capacity of the array
    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }}
    
}
