/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * 
 */
import java.util.Arrays;
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] unsortedArray = {5, 2, 8, 1, 9, 4};
        System.out.println("Original Array: " + Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));

        // Searching for an element in a sorted array
        int key = 8;
        int index = Arrays.binarySearch(unsortedArray, key);
        System.out.println("Index of " + key + " in the sorted array: " + index);

        // Filling an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copying an array
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Copying a range of an array
        int[] partialCopiedArray = Arrays.copyOfRange(originalArray, 1, 3);
        System.out.println("Partial Copied Array: " + Arrays.toString(partialCopiedArray));

        // Execute this in an Apache environment
        // TODO code application logic here
    }
    
}
