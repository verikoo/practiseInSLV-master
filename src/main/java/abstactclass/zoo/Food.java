package abstactclass.zoo;

public abstract class Food {
    private String foodType;
    private String distribution;
    private Boolean packaging;
    private String technology;
    private String color;
    private String texture;

    public Food(){
        this.foodType=null;
        this.distribution=null;
        this.packaging=true;
        this.technology=null;
        this.color=null;
        this.texture=null;
    }

    public Food(String foodType, String distribution, Boolean packaging, String technology, String color, String texture) {
        this.foodType = foodType;
        this.distribution = distribution;
        this.packaging = packaging;
        this.technology = technology;
        this.color = color;
        this.texture = texture;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getDistribution() {
        return distribution;
    }

    public Boolean getPackaging() {
        return packaging;
    }

    public String getTechnology() {
        return technology;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public void setPackaging(Boolean packaging) {
        this.packaging = packaging;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }


    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void demoFood(){
        System.out.println("food type :" + this.getFoodType());
        System.out.println("distribution:"+ this.getDistribution());
        System.out.println("packaging:"+ this.getPackaging());
        System.out.println("technology:"+ this.getTechnology());
        System.out.println("color: "+ this.getColor());
        System.out.println("texture: "+ this.getTexture());
    }
}


