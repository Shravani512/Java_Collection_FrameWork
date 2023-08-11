import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        Integer[] arr={10,2,5,4,1,30};

        Arrays.sort(arr); // to sort array
        int index=Arrays.binarySearch(arr,4); // returns index of 4
        System.out.println("index of 4 is:"+index);
        Arrays.fill(arr,12); //entire array will be filled with value 12

        Integer[] arr2={10,2,5,4,1,30};
        System.out.println(Arrays.equals(arr, arr2)); //returns true or false

        // toString -- returns string representation

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
