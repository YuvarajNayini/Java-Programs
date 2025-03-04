// Stores key-value pairs and allows mapping of unique keys to values.
//It cannot contain duplicate keys and each key maps to exactly one value
/*  Map Implementation Classes:
 * HashMap
 * LinkedHashMap
 * TreeMap
 * Hashtable
 * ConcurrentHashMap
*/
// HASHMAP
/*
It is a hash table-based implementation of the Map interface.
Stores keys and values as key-value pairs.
Offers constant-time performance for basic operations (add, remove, contains) if the hash function distributes keys properly.
Does not maintain any order of keys.
not synchronized 

 */
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        // HashMap
        Map<String,Integer> Hm = new HashMap<>();//<String,Integer> used this because stores in key,value and that is datatype
        Hm.put("Apple",1);
        Hm.put("Banana",2);
        Hm.put("Cherry",3);
        System.out.println(Hm);
        // Accessing a value by its key
        System.out.println("Value of Key 'Apple': " + Hm.get("Apple"));
        //Iterating using for loop
        for (Map.Entry<String,Integer> pair : Hm.entrySet()){
            System.out.println(pair.getKey() + "=" + pair.getValue());
        // Iterating over keys using loop
        for( String i : Hm.keySet()){
            System.out.println(i);
        }
        // Iterating over values using loop
        for(Integer i : Hm.values()){
            System.out.println(i);
        }
        }
    }
}
