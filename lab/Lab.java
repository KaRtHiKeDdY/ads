/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this licensesss
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;

/**
 *
 * @author karthikreddy
 */

public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        System.out.println("Original List:");
        list.traverse();

        list.deleteByKey(6);

        System.out.println("List after deleting key:");
        list.traverse();
        





// TODO code application logic here
    }
    
}
