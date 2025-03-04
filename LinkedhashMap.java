//It is similar to HashMap but maintains the insertion order of keys.
/*
It maintains a linked list of the entries in the map, allowing for predictable iteration order.
Offers a small overhead due to the additional data structure for maintaining order.
Same as HashMap for basic operations, but slightly slower due to maintaining order.
 */
import java.util.*;
public class LinkedhashMap{
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String,Integer> Lhm = new LinkedHashMap<>();
        Lhm.put("Apple",1);
        Lhm.put("Banana",2);
        Lhm.put("Date",4);
        Lhm.put("Cherry",3);
        System.out.println(Lhm);// In out put we get as we inserted, Insertion order is maintained
        // Iterating over the map
        for(Map.Entry<String,Integer> pair:Lhm.entrySet()){
            System.out.println(pair.getKey()+"="+pair.getValue());
        }
    }
    
}
