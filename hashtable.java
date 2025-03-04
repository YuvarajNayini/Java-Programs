// This is thread -safe.
// Synchronized implementation
// Do not allow null keys or values
// implements map
// compared to hash map map it is slowered
import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        // create hash table
        Map<String,Integer> ht = new Hashtable<>();
        ht.put("Apple",1);
        ht.put("Cherry",3);
        ht.put("Banana",2);
        ht.put("Date",4);
        ht.put("berry",5);
        System.out.println(ht);
        // Accessing Value using key
        System.out.println("Value of Date: "+ht.get("Date"));
        // Updating Value using key
        ht.put("Date", 10);
        System.out.println(ht);
        // Removing Value using key
        ht.remove("berry");
        System.out.println(ht);
        // Checking if key exists
        System.out.println("Does 'Date' exist in the hash table? "+ht.containsKey("Date"));
        // Checking if value exists
        System.out.println("Does '10' exist in the hash table? "+ht.containsValue(4));
        // Checking if key is empty
        System.out.println("Is the hash table empty? "+ht.isEmpty());
        // Getting size of hash table
        System.out.println("Size of hash table: "+ht.size());
        // Iterating over hash table
        for(Map.Entry<String,Integer> pair:ht.entrySet()){
            System.out.println(pair.getKey()+"="+pair.getValue());
        }

    }
    
}
