/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo1;

/**
 *
 * @author karthikreddy
 */
import java.util.ArrayList;

public class ArrayListDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Emp el = new Emp(111,"ratan");
     Student sl = new Student(222,"hnjhkn");
     ArrayList al = new ArrayList();
     al.add(10);
     al.add('a');
     al.add(el);
     al.add(sl);
     System.out.println(al);
     System.out.println(al.toString()) ;     







// TODO code application logic here
    }
    
}
