/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist.demo2;

/**
 *
 * @author karthikreddy
 */
import java.util.ArrayList;
public class ArrayListDemo2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Emp> al = new ArrayList<>();
      al.add(new Emp(111,"ratan"));
      al.add(new Emp(222,"anu"));
      al.add(new Emp(333,"Sravya"));
      for (Emp e : al){
          System.out.println(e.eid+ "****" +e.ename);
          
      }
      ArrayList<Student> al2 = new ArrayList<>();
      al2.add(new Student(111,"chiranjeevi"));
      al2.add(new Student(222,"balayaa"));
      al2.add(new Student(333,"nagarjuna"));
      al2.add(new Student(444,"venki"));
      for (Student s : al2){
          System.out.println(s.sid+ "****" +s.sname);
      }
    }
}






// TODO code application logic here
        
   

