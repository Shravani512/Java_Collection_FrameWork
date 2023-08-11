import java.util.*;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(); //O(n) for searchin
        Set<Integer> lset=new LinkedHashSet<>(); //here order wll be maintain
        Set<Integer> tset=new TreeSet<>(); //Implements bST internally so the elements will be in sorted form O(logn)
                                            // for searching element as it is in sorted form

        //no repeated elements taken
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(90);
        set.add(70);

        // order is not maintain
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        System.out.println(set.contains(20)); // returns true or false
        System.out.println(set.isEmpty());//returns trueor false;
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
