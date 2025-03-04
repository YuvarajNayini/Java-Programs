// Stack
/*
A Stack is a subclass of Vector that implements a last-in, first-out (LIFO) stack of objects.
Includes methods like push(), pop(), and peek().
It is mostly outdated, and Deque implementations like ArrayDeque are now preferred.
 */
import java.util.*;

public class StactExample {
    public static void main(String[] args) {
        Stack<String> S = new Stack<>();
        S.push("Apple");
        S.push("Banana");
        S.push("Cherry");
        System.out.println(S);
        // peeking / finding the top element/ last inserted element
        System.out.println("Top element: " + S.peek());
        // removing the top element
        System.out.println("Popped Element: "+ S.pop());
        System.out.println(S);
    }
}
