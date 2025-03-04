//LinkedList
/*
It is a doubly linked list implementation of the List interface.
Provides faster insertions and deletions at both ends (head and tail) compared to ArrayList.
Slow access time for random access as it needs to traverse the list.
Good when frequent additions and removals are needed.
 */
import java.util.*;
public class Linked_LIst {
    public static void main(String[] args) {
        List<String> LL=new LinkedList<>();
        LL.add("Apple");
        LL.add("Banana");
        LL.add("Carrot");
        LL.add("Date");
        // Adding using Indexation
        LL.add(1,"Appricot");
        System.out.println(LL);
        System.out.println("Accesing 2nd item : "+ LL.get(1));// accessing items using indexation
        // Iterating Using loops
        for(String L:LL){
            System.out.println(L);
        }

    }
}
