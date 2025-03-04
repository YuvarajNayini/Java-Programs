//It is a Red-Black tree-based implementation of the Map interface.
/*
Maintains keys in sorted order (natural order or by a custom comparator).
Provides logarithmic time complexity for most operations.
put(), get(), remove(): O(log n) due to the tree structure.
 */
import java.util.*;
public class Treemap {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String,Integer> tm = new TreeMap<>();
        tm.put("Apple",1);
        tm.put("Date",4);
        tm.put("Banana",2);
        tm.put("Cherry",3);
        System.out.println(tm); // In ouput we get sorted data 
        // Iterating over the TreeMap
        for(Map.Entry<String,Integer> pair:tm.entrySet()){
            System.out.println(pair.getKey()+"="+pair.getValue());
        }

    }
    
}
