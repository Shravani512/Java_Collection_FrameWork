import java.text.Annotation;
import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animal=new Stack<>();

        animal.push("Lion");
        animal.push("Tiger");
        animal.push("elephant");
        animal.push("giffaf");
        animal.push("Dog");

        System.out.println("Animals:"+animal);
        System.out.println(animal.peek());
        animal.pop();

        System.out.println(animal.peek());
    }
    
}
