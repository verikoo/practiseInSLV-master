package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuessANumber extends Thread{
    private static final Logger LOGGER = LogManager.getLogger(GuessANumber.class);
    private int number;
    public GuessANumber(int number){
        this.number=number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;
        do{
            guess = (int) (Math.random()*100+1);
            LOGGER.info(this.getName()+" guesses " + guess);
            counter++;
        }while(guess != number);
        LOGGER.info("** Wow!"+ this.getName()+ " in "+ counter+" guesses.**");

    }
}
