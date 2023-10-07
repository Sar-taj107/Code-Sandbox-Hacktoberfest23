// Java program to add elements
// to a Queue
 
import java.util.*;
public class AddElement {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
 
        pq.add("Welcome");
        pq.add("Hi");
        pq.add("Welcome");
 
        System.out.println(pq);
    }
}
