package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableThreadExample implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(RunnableThreadExample.class);
    private Thread t;
    private String threadName;

    RunnableThreadExample(String name) {
        threadName = name;
        LOGGER.info("creating:" + threadName);
    }

    @Override
    public void run() {
        LOGGER.info("running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                LOGGER.info("Thread: " + threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            LOGGER.error("Thread " + threadName + " interrupted");
        }
        LOGGER.info("Thread" + threadName + "existing.");

    }

    public void start() {
        LOGGER.info("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

