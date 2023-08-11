

import java.util.*;
class LearnArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        dq.offer(5);
        dq.offer(70);
        dq.offerFirst(0);
        dq.offerLast(1000);
        

        System.out.println(dq);
        // System.out.println(dq.peek());
        // System.out.println(dq.poll());
        System.out.println("peek");
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println("poll");
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
    }
}