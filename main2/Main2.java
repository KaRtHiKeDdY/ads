/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

/**
 *
 * @author karthikreddy
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek after pop: " + myStack.peek());
        




// TODO code application logic here
    }
    
}
