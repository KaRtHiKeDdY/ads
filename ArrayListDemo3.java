/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo3;

/**
 *
 * @author karthikreddy
 */
import java.util.ArrayList;
public class ArrayListDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<>();
         al.add(new Emp(111,"ratan"));
         al.add(new Emp(222,"anu"));
          ArrayList<Emp> a2 = new ArrayList<>();
          a2.addAll(al);
          a2.add(new Emp(333,"nagarjuna"));
          a2.add(new Emp(444,"venki"));
          a2.removeAll(al);
          for(Emp e : a2){
              System.out.println(e.eid+ "****" +e.ename);
          }







// TODO code application logic here
    }
    
}
