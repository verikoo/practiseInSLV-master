package abstactclass.zoo;

import interfasexamples.AnimalEat;
import interfasexamples.AnimalSleep;
import interfasexamples.AnimalSound;

public class Cat extends Animals implements AnimalSleep, AnimalSound, AnimalEat {
    private String color;
    private boolean sterilization;


    public Cat(String familyClassification, int lifeCircle, int age, String phylum, String species, String color, String name, String color1, boolean sterilization) {
        super(familyClassification, lifeCircle, age, phylum, species, color, name);
        this.color = color;
        this.sterilization = sterilization;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setSterilization(boolean sterilization) {
        this.sterilization = sterilization;
    }

    @Override
    public String getColor() {
        return color;
    }

    public boolean isSterilization() {
        return sterilization;
    }

    public void demoCat(){
        demoAnimalsExample();
        System.out.println("color :" + this.getColor());
        System.out.println("CharacterType:"+ this.isSterilization());
    }

    public void animalSound(){
        System.out.println("Cat make sound: Meow");
    }

    public void animalSleep(){
        System.out.println("Cat sleeps 12-16 hour");
    }

    public void animalEat(){System.out.println("Cat eat fish "); }

}
