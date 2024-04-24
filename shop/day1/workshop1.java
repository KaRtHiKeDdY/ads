import java.util.ArrayList;
public class ArrayListExample{
public static void main(String[] args){
ArrayList<String> l= new ArrayList<>();
l.add("Apple");
l.add("Banana");
l.add("cherry");
l.add("78");
l.add("78.90");
System.out.println("Element at index 0: "+l.get(0));
System.out.println("element in the ArrayList: ");
for(String fruit:l){
System.out.println(fruit);}
l.remove("Banana");
System.out.println("Size of ArrayList: "+l.size());
System.out.println("Size of ArrayList: "+l.remove("cherry"));
}
}