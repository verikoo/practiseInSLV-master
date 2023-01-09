package zoo;

public class AviaryGarden extends Aviary {
    private int aviaryID;
    private int numberOfBirds;


    public AviaryGarden(int length, int width, int height, String location, String type, String birdsType, int aviaryID, int numberOfBirds) {
        super(length, width, height, location, type, birdsType);
        this.aviaryID = aviaryID;
        this.numberOfBirds = numberOfBirds;
    }

    public int getAviaryID() {
        return aviaryID;
    }

    public int getNumberOfBirds() {
        return numberOfBirds;
    }


    public void setAviaryID(int aviaryID) {
        this.aviaryID = aviaryID;
    }

    public void setNumberOfBirds(int numberOfBirds) {
        this.numberOfBirds = numberOfBirds;
    }


    public void demoAviaryGarden(){
        demoAviary();
        System.out.println("aviary ID :" + this.getAviaryID());
        System.out.println("number of birds:"+ this.getNumberOfBirds());
    }
}
