/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main1;

/**
 *
 * @author karthikreddy
 */
//<editor-fold defaultstate="collapsed" desc="comment">
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> myDoubleLinkedList = new MyDoubleLinkedList<>();

        myDoubleLinkedList.addFirst(1);
        myDoubleLinkedList.addLast(2);
        myDoubleLinkedList.addLast(3);
        myDoubleLinkedList.addFirst(0);

        myDoubleLinkedList.printForward();
        myDoubleLinkedList.printBackward();
        



// TODO code application logic here
    }
}

 