package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableDisplayMessage implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(RunnableDisplayMessage.class);
    private String message;

    public RunnableDisplayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            LOGGER.info(message);
        }
    }
}
