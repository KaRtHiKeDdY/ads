/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionlnarray;

/**
 *
 * @author karthikreddy
 */ 
import java.util.Arrays;
import java.util.Scanner;
public class InsertionlnArray {



    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array ={1,2,3,4,5};
        int size = array.length; 
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("\n Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.println("enter the position(0-indexed) to insert the element: ");
        int position = sc.nextInt();
        if(position <0|| position >size){
        System.out.println("Invalid position!");
        return;
        }
        int[] newArray = new int[size+1];
        System.arraycopy(array, 0, newArray, 0, position);
        newArray[position]=element;
        System.arraycopy(array, position, newArray, position + 1, size - position);
        System.out.println( "\n Array after insertion:");
        System.out.println(Arrays.toString(newArray));
        
            
            }
        }
 