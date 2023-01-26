package abstactclass.zoo;

import interfasexamples.ZooFoodCalories;

public class FeedingMeat extends Food implements ZooFoodCalories {
    private int priceKg;
    private int kg;

    public FeedingMeat(String foodType, String distribution, Boolean packaging, String technology, String color, String texture, int priceKg, int kg) {
        super(foodType, distribution, packaging, technology, color, texture);
        this.priceKg = priceKg;
        this.kg = kg;
    }

    public int getPriceKg() {
        return priceKg;
    }

    public void setPriceKg(int priceKg) {
        this.priceKg = priceKg;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public void SumPrice(int kg, int price){
        this.kg=kg;
        this.priceKg=price;
    }



    public void demoMeat(){
        demoFood();
        System.out.println("Price of kg meat: "+ this.getPriceKg());
        System.out.println("Kg of Meat: "+ this.getKg());
    }

    public void calculateCalories(){
        System.out.println("Feding meet Pork :Calories – 10% – Protein 15%");
    }
}
