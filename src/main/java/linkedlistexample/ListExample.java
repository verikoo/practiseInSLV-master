package linkedlistexample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
    private final static Logger LOGGER = LogManager.getLogger(ListExample.class);
    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();

        // Add elements to the List
        list.add("cat");
        list.add("Horse");
        list.add("mouse");
        list.add("dog");
        list.add("Elephant");

        // Access elements in the List
        String element1 = list.get(0); // "dog"
        String element2 = list.get(1); // "cat"
        String element3 = list.get(2); // "mouse"

        // Print the elements in the List
        for (String element : list) {
            System.out.println(element);
            LOGGER.info(element);
        }
    }
}

