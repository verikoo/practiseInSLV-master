package streams;

public class Animal {
    private AnimalList animal;
    private AnimalType type;
    private FoodType food;
    private LivingType live;
    private int year;
    private String name;

    public Animal(AnimalList animal, AnimalType type, FoodType food, LivingType live, int year, String name) {
        this.animal = animal;
        this.type = type;
        this.food = food;
        this.live = live;
        this.year = year;
        this.name = name;
    }

    public AnimalList getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalList animal) {
        this.animal = animal;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public FoodType getFood() {
        return food;
    }

    public void setFood(FoodType food) {
        this.food = food;
    }

    public LivingType getLive() {
        return live;
    }

    public void setLive(LivingType live) {
        this.live = live;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal{" +
                "AnimalList=" + animal +
                ", AnimalType='" + type + '\'' +
                ", FoodType='" + food + '\'' +
                ", LivingType=" + live +
                ", year=" + year +
                ", name=" + name +
                '}';
    }
}
