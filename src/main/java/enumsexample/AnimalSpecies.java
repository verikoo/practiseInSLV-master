package enumsexample;

public enum AnimalSpecies {
    LION("African Lion"),
    TIGER("Bengal Tiger"),
    MONKEY("Chacma Baboon"),
    PENGUIN("Emperor Penguin"),
    SNAKE("Green Anaconda");

    private String species;

    AnimalSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }
}
