import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class question1{
    public static void main(String args[]){
    Queue<Integer> q=new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    q.add(70);
    q.add(80);
    q.add(90);
    q.add(100);
    System.out.println(q);
    Stack <Integer> s= new Stack<Integer>();
    while(q.size()>0){
        s.push(q.poll());
    }
    while(s.size()>0){
        q.offer(s.pop());
    }
        System.out.println(q);
    
    }
}