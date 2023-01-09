package enumsexample;

public enum ZooFood {
    MEAT("Meat"),
    VEGETABLES("Vegetables"),
    FRUIT("Fruit"),
    FISH("Fish");

    private String name;

    ZooFood(String name) {
        this.name = name;
    }

    public String getZooFood() {
        return name;
    }
}
