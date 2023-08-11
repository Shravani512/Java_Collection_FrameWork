
import java.util.*;
public class priorityQueue {
   public static void main(String[] args) {
     // now as PriorityQueue also implements queue so we can create instance of PriorityQueue and all this methods will work for PriorityQueue also
        // as below:
        // but the arranment of the elements will be by priority of min or max element
        //default min priority
        Queue<Integer> pq=new PriorityQueue<>();

        //for max priority
        // Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);
        pq.offer(5);
        pq.offer(2);

        System.out.println("elements:"+pq);
        pq.poll();
        System.out.println(pq);
        // System.out.println(pq.peek());
        pq.poll(); 
        System.out.println(pq.peek());
   }
}
