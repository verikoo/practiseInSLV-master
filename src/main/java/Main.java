import enumsexample.AnimalSounds;
import enumsexample.AnimalSpecies;
import enumsexample.ZooFood;
import exceptionsexamples.custom.AnimalExceptions;
import interfasexamples.*;
import zoo.*;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws AnimalExceptions{
        ZooEmployee newEmployee = new ZooEmployee(1, "john", "doe", 24, 7, "africa", "england", "MBA");
        newEmployee.demoEmployee();
        LOGGER.info("newEmployee hashcode iss: " + newEmployee.hashCode());
        LOGGER.info("-------Zoo Escape example------") ;
        EscapeZoo newEscapeZoo = new EscapeZoo("Escape Zoo","New Delhi, Delhi, India", 12345, 4500, 34500, 4500, "Mr Punjab Rao Deshmukh","Yeshoda Bai R");
        newEscapeZoo.demoEscapeZoo();
        LOGGER.info("\nZoo job positions");
        ZooEmployeeWork[] employerJob = {new ZooKeeper(), new LandscapeGardener(), new ZooTourGuide(), new VolunteerCoordinator()};
        employerJob[0]= new ZooKeeper();
        employerJob[1]= new LandscapeGardener();
        employerJob[2]= new ZooTourGuide();
        employerJob[3]= new VolunteerCoordinator();
        for(int i = 0; i < employerJob.length; i++){
            LOGGER.info("Job Title :"  + i);

            employerJob[i].jobPosition();
            employerJob[i].jobPrimaryDuties();

        }
        //    enums example 1
        AnimalSounds ex1 = AnimalSounds.DOG;
        LOGGER.error("Dog Sound "+ex1.getAnimalSound());
        System.out.println("Dog Sound "+ex1.getAnimalSound());
        //              enums example 2
        AnimalSpecies ex2 =AnimalSpecies.LION;
        System.out.println("Lion Specie:"+ex2.getSpecies());
//        enums example 3
        ZooFood ex3 = ZooFood.FISH;
        System.out.println("ZooFood"+ex3.getZooFood());

        LOGGER.error("-------Animals examples------") ;
        LOGGER.error("Monkey");
        Monkey Mila = new Monkey("Mammal", 20, 4, "Chordata", "sooty", "brown", "Mila", 7, "love playing with people");
        Mila.demoMonkey();
        Mila.animalSound();
        Mila.animalSleep();
        Mila.animalEat();

        Mila.animalSleep();
        LOGGER.info("Mila hashcode is: " + Mila.hashCode());

        LOGGER.info("cat");
        Cat Lulu = new Cat("Felidae", 14, 2, "Chordate", "Siamese", "Point coloration", "Lulu", "Chocolate", true );
        Lulu.demoCat();
        Lulu.animalSound();
        Lulu.animalSleep();
        Lulu.animalEat();
        LOGGER.info("Lulu hashcode is: " + Lulu.hashCode());



        AviaryGarden yellowBirds = new AviaryGarden(105, 105, 80, "garden", "outside", "Baly Mina", 15, 21);
        yellowBirds.setHeight(109);
        yellowBirds.demoAviaryGarden();
        LOGGER.info("yellow birds aviary hashcode is: " + yellowBirds.hashCode());


        LOGGER.info("feeding meat");

        FeedingMeat newMeat = new FeedingMeat("meat", "LLC ZOO FOOD", true, "specialized","red", "soft",140, 34);
        newMeat.SumPrice(34,140);
        newMeat.calculateCalories();


        System.out.println("info");

        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        LOGGER.info("LinkedList: " + animals);
//------------------------AnimalExceptions-----------------
        try{
            validateAge();
        }catch(AnimalExceptions e){
            LOGGER.error("cannot be less than 0");

        }



    }
    public static void validateAge() throws AnimalExceptions {
        Scanner scanner = new Scanner(System.in);
        int age; double weight ;
        System.out.println("Insert age of animal");
        LOGGER.info("age = "); age=scanner.nextInt();
        System.out.println("Insert weight  of animal");
        LOGGER.info("weight = "); weight=scanner.nextDouble();
        if(age>0&&weight>0) {
            LOGGER.info("age is:"+age+"weight is"+weight);
        } else throw new AnimalExceptions("age or weight cannot be less than 0");

    }






}