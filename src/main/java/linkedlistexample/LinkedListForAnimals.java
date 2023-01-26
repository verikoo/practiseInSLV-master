package linkedlistexample;
import java.util.LinkedList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class LinkedListForAnimals {
    private final static Logger LOGGER = LogManager.getLogger(LinkedListForAnimals.class);

    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        LOGGER.info("LinkedList: " + animals);

        animals.add(1, "Horse");
        LOGGER.info("Updated LinkedList: " + animals);
        String str = animals.get(1);
        LOGGER.info("Element with index 1 is: " + str);
        animals.set(1, "Elephant");
        LOGGER.info("Animals"+ animals);

    }
}
