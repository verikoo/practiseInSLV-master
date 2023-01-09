package linkedlistexample;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("dog"); // this element will not be added to the set, since sets do not allow duplicates

        set.remove("dog");
        // Print the elements in the Set
        for (String element : set) {
            System.out.println(element);
        }
    }
}

