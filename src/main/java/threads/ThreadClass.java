package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadClass {
    private static final Logger LOGGER = LogManager.getLogger(ThreadClass.class);
    public static void main(String[] args) {
        Runnable hello = new RunnableDisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        LOGGER.info("starting hello thread");
        thread1.start();

        Runnable goodBye = new RunnableDisplayMessage("GoodBye");
        Thread thread2 = new Thread(goodBye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        LOGGER.info("Starting Good bye thread...");
        thread2.start();

        LOGGER.info("starting thread 3...");
        Thread thread3 = new GuessANumber(27);
        thread3.start();
        try {
            thread3.join();
        }catch (InterruptedException e){
            LOGGER.error("Thread interrupted");
        }

        LOGGER.info("Starting Thread 4");
        Thread thread4 = new GuessANumber(75);
        thread4.start();
        LOGGER.info("main() is ending...");
    }
}
