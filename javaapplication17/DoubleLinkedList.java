/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author karthikreddy
 */
import java.util.LinkedList;
public class DoubleLinkedList<E> {
    private final LinkedList <Node<E>> list;

    // Constructor
    public DoubleLinkedList() {
        list = new LinkedList<>();
    }

    // Method to add an element to the end of the list
    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        list.add(newNode);
        if (list.size() > 1) {
            Node<E> prevNode = list.get(list.size() - 2);
            prevNode.next = newNode;
            newNode.prev = prevNode;
        }
    }

    // Method to remove an element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            list.remove(0);
        } else {
            Node<E> nodeToRemove = list.get(index);
            Node<E> prevNode = nodeToRemove.prev;
            Node<E> nextNode = nodeToRemove.next;
            if (prevNode != null) {
                prevNode.next = nextNode;
            }
            if (nextNode != null) {
                nextNode.prev = prevNode;
            }
            list.remove(index);
        }
    }

    // Method to get the size of the list
    public int size() {
        return list.size();
    }

    // Method to get the element at a specific index
    public E get(int index) {
        return list.get(index).data;
    }   
}

