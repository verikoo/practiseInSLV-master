package enumsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ZooEmployExample {
    private static final Logger LOGGER = LogManager.getLogger(ZooEmployExample.class);

    public enum Jobs {
        VETERINARIAN,
        CURATOR,
        KEEPER,
        REGISTRAR,
        DIRECTOR,
    }
    Jobs jName;
    public ZooEmployExample(Jobs jName) {
        this.jName = jName;
    }

    public void jobsDetail() {
        switch (jName) {
            case VETERINARIAN:
                LOGGER.info("VETERINARIAN: Responsible for the healthcare program for the animal collection and the maintenance of health records.");
                break;

            case CURATOR:
                LOGGER.info("CURATOR: Manages some or all of an institution's animal collection. For instance, there may be a curator of mammals, or a curator of rainforest species. ");
                break;


            case KEEPER:
                LOGGER.info("KEEPER: Provides daily care to the institution's animals, including diet preparation, cleaning, general exhibit maintenance, and recordkeeping.");
                break;

            case REGISTRAR:
                LOGGER.info("REGISTRAR: Maintains computer records on the animal collection and applies for permits and licenses to hold or transport animals.");
                break;

            case DIRECTOR:
                LOGGER.info("Executes policies as directed by the governing authority. Responsible for the institution's operation and plans for future development.");
                break;

            default:
                LOGGER.info("DEFAULT: Assists the director and assumes charge in the director's absence. ");
                break;
        }
    }

    public static void main(String[] args) {
        ZooEmployExample veterinarian = new ZooEmployExample(Jobs.VETERINARIAN);
        veterinarian.jobsDetail();

        ZooEmployExample curator = new ZooEmployExample(Jobs.CURATOR);
        curator.jobsDetail();

        ZooEmployExample keeper = new ZooEmployExample(Jobs.KEEPER);
        keeper.jobsDetail();

        ZooEmployExample registrar = new ZooEmployExample(Jobs.REGISTRAR);
        registrar.jobsDetail();

        ZooEmployExample director = new ZooEmployExample(Jobs.DIRECTOR);
        director.jobsDetail();
    }

}
