package zoo;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import interfasexamples.AnimalAction;

public class Monkey extends Animals implements AnimalAction  {
    private final static Logger LOGGER = LogManager.getLogger(Monkey.class);
    private int weight;
    private String characterType; // love or not visitors

    public Monkey(String familyClassification, int lifeCircle, int age, String phylum, String species, String color, String name, int weight, String characterType)  {
        super(familyClassification, lifeCircle, age, phylum, species, color, name);
        this.weight = weight;
        this.characterType = characterType;
    }

    public int getWeight() {
        return weight;
    }

    public String getCharacterType() {
        return characterType;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }


    public void demoMonkey(){
        demoAnimalsExample();
        LOGGER.info("Weight :" + this.getWeight());
        LOGGER.info("CharacterType:"+ this.getCharacterType());
    }

    @Override
    public void animalSound(){
        LOGGER.info("Monkey make sound: Chatter && whoop");
    }

    public void animalSleep(){
        LOGGER.info("Monkey sleeps 12 hour");
    }

}
