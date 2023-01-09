package zoo;

public abstract class Aviary {
    private int length;
    private int width;
    private int height;
    private String location;
    private String type;
    private String birdsType;

//    constructor
    public Aviary(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.location= null;
        this.type= null;
        this.birdsType=null;
    }

    public Aviary(int length, int width, int height, String location, String type, String birdsType) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.location = location;
        this.type = type;
        this.birdsType = birdsType;
    }

    //    getters
public int getLength() {
    return length;
}

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getBirdsType() {
        return birdsType;
    }

//    setters

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLocation(String location) {
        location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirdsType(String birdsType) {
        this.birdsType = birdsType;
    }

    public void demoAviary(){
        System.out.println("Length: "+this.getLength());
        System.out.println("Width: "+this.getWidth());
        System.out.println("Height: "+this.getHeight());
        System.out.println("For Birds: "+this.getBirdsType());
        System.out.println("Aviary Type: "+this.getType());
    }


}
