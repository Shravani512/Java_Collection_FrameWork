
import java.util.*;
public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>(); // elements do not maintain order randon=mly will get elements
        // all operations in HashMap is (n) ans in treeMap it is O(logn)

        // Map<String,Integer> Tmp=new TreeMap<>(); // internally implements BST and elements will be sorted based on the key elements

        mp.put("one", 1);
        mp.put("four", 4);
        mp.put("three", 3);
        mp.put("two", 2);

        mp.putIfAbsent("five", 5);

        //traversing in hashmap

        for(Map.Entry<String,Integer>e:mp.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // if want only key
        for(String key: mp.keySet())
        {
            System.out.println(key);
        }
        //if only value
        for(Integer e: mp.values())
        {
            System.out.println(e);
        }

        //to check empty
        System.out.println(mp.isEmpty());//returns true or false
        mp.remove("one");
        mp.clear(); //to remove all entries
    }
}
