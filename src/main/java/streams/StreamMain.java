package streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    private final static Logger LOGGER = LogManager.getLogger(StreamMain.class);
    public static void main(String[] args) {
        List<Animal> animal = getAnimals();

        List<Animal> mammal = animal.stream()
                .filter(p-> p.getType().equals(AnimalType.MAMMAL))
                .sorted(Comparator.comparing(Animal::getYear))
                .collect(Collectors.toList());
        mammal.forEach(LOGGER::info);
        LOGGER.info(mammal);

        List<AnimalType> animalList = animal.stream()
                .map(Animal::getType)
                .distinct()
                .toList();
        animalList.forEach(LOGGER::info);

        List<String> animalName = animal.stream()
                .map(Animal::getName)
                .distinct()
                .toList();
        animalName.forEach(LOGGER::info);


        animal.stream()
                .max(Comparator.comparing(Animal::getYear))
                .ifPresent(LOGGER::info);

        animal.stream()
                .min(Comparator.comparing(Animal::getYear))
                .ifPresent(LOGGER::info);


    }

    public static List<Animal> getAnimals(){
        return List.of(
                new Animal(AnimalList.LION, AnimalType.MAMMAL, FoodType.CARNIVORE, LivingType.TERRESTRIAL, 3, "Ari"),
                new Animal(AnimalList.BEAR, AnimalType.MAMMAL, FoodType.OMNIVORE, LivingType.TERRESTRIAL, 10, "Drago"),
                new Animal(AnimalList.PENGUIN, AnimalType.MAMMAL, FoodType.PISCIVORE, LivingType.AQUATIC, 20, "Pingo"),
                new Animal(AnimalList.CROCODILE, AnimalType.MAMMAL, FoodType.CARNIVORE, LivingType.AQUATIC, 40, "Croco"),
                new Animal(AnimalList.EAGLE, AnimalType.BIRD, FoodType.CARNIVORE, LivingType.AERIAL, 30, "Coco")
                );
    }
}
