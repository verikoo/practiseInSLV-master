package abstactclass.zoo;

import interfasexamples.ZooEmployeeWork;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LandscapeGardener implements ZooEmployeeWork {
    private final static Logger LOGGER = LogManager.getLogger(LandscapeGardener.class);
    @Override
    public void jobPosition(){
        System.out.println("Landscape Gardener");
    }
    public void jobPrimaryDuties(){
        LOGGER.info("A landscape gardener takes care of the plants, flowers, and trees within the zoo landscape.");
    }
}
