/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main1;

/**
 *
 * @author karthikreddy
 * @param <T>
 */
import java.util.LinkedList;
public class MyDoubleLinkedList<T> {
    private final LinkedList<T> list;

    public MyDoubleLinkedList() {
        this.list = new LinkedList<>();
    }

    public void addFirst(T element) {
        list.addFirst(element);
    }

    public void addLast(T element) {
        list.addLast(element);
    }

    public void removeFirst() {
        if (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    public void removeLast() {
        if (!list.isEmpty()) {
            list.removeLast();
        }
    }

    public void printForward() {
        System.out.print("Forward: ");
        for (var element : list) {
            System.out.print(element + " -> ");
        }
        System.out.println("null");
    }

    public void printBackward() {
        System.out.print("Backward: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    
    }
    
}
