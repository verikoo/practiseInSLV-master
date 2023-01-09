package enumsexample;

public enum AnimalSounds {
    DOG("bark"),
    CAT("meow"),
    COW("moo"),
    HORSE("neigh");

    private  final String animalSounds;

    AnimalSounds(String animalSounds){
        this.animalSounds=animalSounds;
    }
    public String getAnimalSound(){
        return String.valueOf(animalSounds);
    }

}
