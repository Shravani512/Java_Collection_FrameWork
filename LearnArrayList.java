

// import java.util.List;
import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

class LearnArrayList{
    public static void main(String args[])
    {
        List<Integer>  List=new ArrayList(5);

        //we know that linkedlist also implements list so if we create instance of listnode reference with list then all this below function will work for linkedlIst also
        // as below:
        // List<Integer> lst=new LinkedList<>();
    
        List.add(10);// to add element
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        System.out.println(List);
        List.add(5, 60);
        System.out.println(List);

        List<Integer> newList=new ArrayList();
        newList.add(150);
        newList.add(250);
        newList.add(350);

        List.addAll(newList); // to add entire list in exsisting list
        System.out.println(List);
        System.out.println(List.get(2));//to get 2nd index value
        List.remove(3);//remove 3rd index element
        List.remove(Integer.valueOf(20));// remove element with value 20
        System.out.println(List);

        // List.clear(); // remove all elements
        System.out.println(List);

        // List.set(5,100); // change 2nd index with value 100
        System.out.println(List);
        System.out.println(List.contains(100)); //returns true or false if element is present or absent

        //Traversing methods
        //for loop
        for(int i=0;i<List.size();i++)
        {
            System.out.println("element:"+List.get(i));
        }
        //for each loop
        for(Integer element:List)
        {
            System.out.println("element:"+List);
        }
        //iterator
        // Iterator<Integer>it=List.iterator();
        Iterator<Integer> it=List.iterator();
        while(it.hasNext())
        {
            System.out.println("iterator:"+it.next());
        }
    }
}