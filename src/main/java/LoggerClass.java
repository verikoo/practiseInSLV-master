import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerClass {

    private final static Logger LOGGER = LogManager.getLogger(LoggerClass.class);


    public static void main(String[] args){
        System.out.println("info");

        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");
    }
}
