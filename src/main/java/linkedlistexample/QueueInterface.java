package linkedlistexample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class QueueInterface {
    private final static Logger LOGGER = LogManager.getLogger(LinkedListForAnimals.class);
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("animal1");
        queue.add("animal2");
        queue.add("animal3");

        LOGGER.info("head:"+ queue.element());
        LOGGER.info("head:"+queue.peek());
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            LOGGER.info(itr.next());
        }
        queue.remove();
        queue.poll();
        LOGGER.info("after removing 2 elem:");
        Iterator<String>itr2=queue.iterator();
        while(itr2.hasNext()){
            LOGGER.info(itr2.next());
        }
    }


}
