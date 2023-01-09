package zoo;

public abstract class Zoo {
    private String name;
    private String fullAddress;
    private int area;
    private int animalsQuantity;
    private int maxNumberOfAviaries;
    private int numberOfFilledAviaries;
    //------------------------------------------
    public Zoo(){
        this.name=null;
        this.fullAddress=null;
        this.area=0;
        this.animalsQuantity=0;
        this.maxNumberOfAviaries=0;
        this.numberOfFilledAviaries=0;
    }

    public Zoo(String name, String fullAddress, int area, int animalsQuantity, int maxNumberOfAviaries,int numberOfFilledAviaries){
        this.name=name;
        this.fullAddress=fullAddress;
        this.area=area;
        this.animalsQuantity=animalsQuantity;
        this.maxNumberOfAviaries=maxNumberOfAviaries;
        this.numberOfFilledAviaries=numberOfFilledAviaries;
    }
    //------------------------------------------
    public String getName() {
        return name;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public int getArea() {
        return area;
    }

    public int getAnimalsQuantity() {
        return animalsQuantity;
    }

    public int getMaxNumberOfAviaries() {
        return maxNumberOfAviaries;
    }

    public int getNumberOfFilledAviaries() {
        return numberOfFilledAviaries;
    }
//    -----------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setAnimalsQuantity(int animalsQuantity) {
        this.animalsQuantity = animalsQuantity;
    }

    public void setMaxNumberOfAviaries(int maxNumberOfAviaries) {
        this.maxNumberOfAviaries = maxNumberOfAviaries;
    }


    public void setNumberOfFilledAviaries(int numberOfFilledAviaries) {
        this.numberOfFilledAviaries = numberOfFilledAviaries;
    }

    public int freeAviariesQuantity(){
        return  this.getMaxNumberOfAviaries() - this.getNumberOfFilledAviaries();
    }

    public void demoZoo(){
        System.out.println("Zoo name: " + this.getName());
        System.out.println("Zoo full address: " + this.getFullAddress());
        System.out.println("Zoo Area: " + this.getArea());
        System.out.println("Zoo Animals Quantity is: " + this.getAnimalsQuantity());
        System.out.println("Zoo get max numbers of aviary: "+ this.getMaxNumberOfAviaries());
        System.out.println("Zoo number of filled aviary: "+ this.getNumberOfFilledAviaries());
    }

}
