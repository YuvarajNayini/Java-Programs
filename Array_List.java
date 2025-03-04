//  List implementation classes are:
// ArrayList
// LinkedList
//  Vector 
//  Stack(extends vector)
//  Queue(extends vector)

/*ArrayList:

It is a resizable array implementation of the List interface.
Provides fast random access to elements.
Slow when inserting or removing elements in the middle of the list (due to shifting).
Can dynamically resize itself as needed.
Best used when you need fast access and occasional additions/removals at the end. */
import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        List<String> AL = new ArrayList<>(); // polymorphysm concepts applied here List to ArrayList
        /*List<String> declares a variable named list that can hold a reference to any object that implements the "List' interface and stores 'String' objects.
        'new ArrayList<>()' creates a new instance of an 'ArrayList' that will store 'String' objects.
        The list is now a reference to an 'ArrayList' that will hold 'String' elements. */
        AL.add("Apple");
        AL.add("Banana");
        AL.add("Carrot");
        AL.add("Date");
        System.out.println(AL);
        System.out.println("Accesing 2nd item : "+ AL.get(1));// accessing items using indexation
        // itersting through all items we use for loop or enhanced for loop
        for(String s:AL){
            System.out.println(s);
        }
    }
}
