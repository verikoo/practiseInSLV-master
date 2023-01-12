package zoo;

import exceptionsexamples.custom.AnimalExceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Animals {
    private final static Logger LOGGER = LogManager.getLogger(Animals.class);
    private  String familyClassification; //class
    private int lifeCircle;
    private int age;
    private String phylum; // like surname
    private String species; //saxeoba
    private String color;
    private String name ;


    public Animals(String familyClassification, int lifeCircle, int age, String phylum, String species, String color,String name){
        this.familyClassification= familyClassification;
        this.lifeCircle=lifeCircle;
        this.age=age;
        this.phylum=phylum;
        this.species=species;
        this.color=color;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Animal name: " + name + "Animal age: " + age;
    }

    //get--------------------------------------

    public String getFamilyClassification() {
        return familyClassification;
    }

    public int getLifeCircle() {
        return lifeCircle;
    }

    public int getAge() {
        return age;
    }

    public String getPhylum() {
        return phylum;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    //set------------------------------------
    public void setFamilyClassification(String familyClassification) {
        this.familyClassification = familyClassification;
    }
    public void setLifeCircle(int lifeCircle) {
        this.lifeCircle = lifeCircle;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animals(String name, int age) throws
            AnimalExceptions{
        if(age < 0){
            throw new AnimalExceptions("Age cannot be negative");
        }
        this.name = name;
        this.age=age;
    }
    public void demoAnimalsExample(){
        LOGGER.info("Name :" + this.getName());
        LOGGER.info("Maximum life span:"+ this.getLifeCircle());
        LOGGER.info("Age:"+ this.getAge());
        LOGGER.info("Color:"+ this.getColor());
        LOGGER.info("Phylum: "+ this.getPhylum());
        LOGGER.info("Class: "+ this.getFamilyClassification());
    }
}
