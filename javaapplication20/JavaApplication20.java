/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 *
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         StackUsingArray<Integer> stackUsingArray = new StackUsingArray<>();
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();

        
        StackUsingArrayList<String> stackUsingArrayList = new StackUsingArrayList<>();
        stackUsingArrayList.push("One");
        stackUsingArrayList.push("Two");
        stackUsingArrayList.push("Three");
        stackUsingArrayList.pop();
        stackUsingArrayList.pop();
        stackUsingArrayList.pop();
        stackUsingArrayList.pop(); 
    }
    
}
