/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

/**
 *
 * @author karthikreddy
 */
import java.util.LinkedList;
    public class MyStack<T> {
    private final LinkedList<T> stack;

    public MyStack() {
        this.stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    
}
    }