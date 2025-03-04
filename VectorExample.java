// Vector
/*
It is similar to ArrayList but synchronized, making it thread-safe.
Slower compared to ArrayList due to synchronization overhead.
Generally not recommended for new code unless thread safety is required.
 */
import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        List<String> V= new Vector<>();
        V.add("Apple");
        V.add("Banana");
        V.add("Cherry");
        // Adding items using indexation
        V.add(1,"Papaya");
        System.out.println(V);
        // Accessing using Indexation .get(index number)
        System.out.println("2nd Item : " + V.get(2));
        // Iterating using for loop
        for(String s : V){
            System.out.println(s);
        }
    }
    
}
