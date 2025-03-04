//  Task explain methods in this class
// This is thread safe. and implements map interface
// Allows threads to operate on different segments simultaneously, with out requiring a global block
// This contains data in Key,Value pair form

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> chm = new ConcurrentHashMap<>();
        // Adding elements to the map
        chm.put("Name","Raj");
        chm.put("Age","30");
        chm.put("City","Chicago");
        chm.put("Country","USA");
        chm.put("Country1","America");
        System.out.println(chm);
        // Accessing values in map using key by .get() method
        System.out.println("Value of City: "+chm.get("City"));
        // Adding new key value pair to map if there is already existed key it will not update.
        chm.putIfAbsent("Name","Yuvaraj");// name is not updated because that key already exist
        chm.putIfAbsent("Sex","Male");
        System.out.println(chm);
        // Removing key value pair from map
        chm.remove("Country1");
        // Removing key value pair from map if value is matched
        chm.remove("Age","29");
        System.out.println(chm);
        // Replacing value of key if key is already exist
        chm.replace("Age","21");
        // Replacing value of key if key is already exist and value is matched
        chm.replace("Name","Raj","Yuvaraj");
        System.out.println(chm);
        // checking if the map data containd specified key or value
        // method 1
        System.out.println(chm.containsValue("29"));
        System.out.println(chm.containsKey("Age"));
        // method 2
        boolean hasKey=chm.containsKey("Age");
        System.out.println(hasKey);
        boolean hasValue=chm.containsValue("30");
        System.out.println(hasValue);
        // checking size of map
        System.out.println(chm.size());
        int x = chm.size();
        System.out.println("Size of map:"+x);
        // checking if map is empty or not
        System.out.println(chm.isEmpty());
        // for loop uisng lambda Expression
        chm.forEach((k,v) -> System.out.println(k+"="+v));
        // computing the value
        chm.compute("Age", (key, value) -> value + 1);
        System.out.println("Updated map: " + chm);
        // for each loop
        for(String s : chm.keySet()){
            System.out.println(s+"="+chm.get(s));
        }

    }
    
}
