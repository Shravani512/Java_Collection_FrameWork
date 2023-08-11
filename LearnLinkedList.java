import java.util.*;

public class LearnLinkedList {
   public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //offer(),add()
        //peek(),element()
        //poll(),remove()

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);
        System.out.println("top:"+queue.peek());
        queue.poll();
        System.out.println(queue);
   }

}
