/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshop1;

/**
 *
 * @author karthikreddy
 */
import java.util.ArrayList;

public class Workshop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> l= new ArrayList<>();
l.add("Apple");
l.add("Banana");
l.add("cherry");
System.out.println("Element at index 0: "+l.get(0));
System.out.println("element in the ArrayList: ");
for(String fruit:l){
System.out.println(fruit);}
l.remove("Banana");
System.out.println("Size of AraayList :"+l.size());
    }
}
