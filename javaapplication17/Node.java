/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 *
 * @param <E>
 
 */
public class Node<E> {
    E data;
    Node<E> prev;
    Node<E> next;

    // Constructor
    public Node(E data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
