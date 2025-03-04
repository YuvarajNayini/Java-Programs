// Set do not have K,V pair
// it has only keys
// HashSet
/*
 This implements set interface
 It do not allowe duplicates
 It has no gaurentee for order of elements
 It uses hash  table function to store elements
 It store only one NULL element because it is considered special
 It do not have indexation for elements, so we cant access it using index
 It is not thread safe, to make it thread safe we need to use collections.synchronizedSet() or concurrentHashMap
 Some methods are:
 .add(),.remove(),.contains(),.size(),isEmpty(),.clear(),.iterator()
 */
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> s = new HashSet<>();
        // Add elements
        s.add("Apple");
        s.add("Banana");
        s.add("Cherry");
        s.add("Apple");
        s.add("Elderberry");
        System.out.println("Elements in this set : "+s);// Apple is not added 1 time because it is duplicate
        // Checking if an element is present in the set
        System.out.println("Is Cherry Present in set---> "+s.contains("Cherry"));
        System.out.println("Is Mango Present in set---> "+s.contains("Mango"));
        // Remove an element from the set
        s.remove("Banana");
        System.out.println(s);
        // Check if the set is empty
        System.out.println("Is this set empty--->"+s.isEmpty());
        // Get the size of the set
        System.out.println("size of the set--->"+s.size());
        // Iteration over the set usind iterator() method
        Iterator<String> it = s.iterator();//created an Iterator<String> object called i by calling set.iterator().
        System.out.println("Iterating over set uisng iterator() method");
         while(it.hasNext()){ // used a while loop with the it.hasNext() method to check if there are more elements to iterate over.
            System.out.println(it.next());//it.next() retrieves the next element from the set.
        }
        // Iterating using for-each loop
        System.out.println("Iterating over set using for-each loop");
        for(String set:s){
            System.out.println(set);
        }
        HashSet<Integer> number = new HashSet<>();
        number.add(4);
        number.add(5);
        number.add(7);
        // showing numbers from 1-10 in set
        for(int i=1;i<=10;i++){
            if(number.contains(i)){
                System.out.println(i+" is present in set");
            }
            else{
                System.out.println(i+" is not present in set");
            }
            }
        }


    }
    
