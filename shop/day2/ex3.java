import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.LinkedList;
public class example2{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                pq.offer(sc.nextInt());
                if(i<2){
                    System.out.println(-1);
                }
                else{
                    
                    int first=pq.poll();
                    int second=pq.poll();
                    int third=pq.poll();
                    int mul=first*second*third;
                    System.out.println(mul);
                    pq.offer(first);
                    pq.offer(second);
                    pq.offer(third);
                }
            }
            
    }
}