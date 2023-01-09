package linkedlistexample;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("dog");
        queue.add("cat");
        queue.add("mouse");

        // Access elements in the Queue
        String element1 = queue.peek(); // "dog"
        String element2 = queue.poll(); // "dog"
        String element3 = queue.peek(); // "cat"

        // Print the elements in the Queue
        for (String element : queue) {
            System.out.println(element);
        }
    }
}

