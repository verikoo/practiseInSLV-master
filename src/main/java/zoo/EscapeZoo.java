package zoo;

import interfasexamples.ZooEmployeeWork;

public class EscapeZoo extends Zoo {
    private String directorOfZoo;
    private String curatorOfZoo;

    public EscapeZoo(String name, String fullAddress, int area, int animalsQuantity, int maxNumberOfAviaries, int numberOfFilledAviaries, String directorOfZoo, String curatorOfZoo) {
        super(name, fullAddress, area, animalsQuantity, maxNumberOfAviaries, numberOfFilledAviaries);
        this.directorOfZoo = directorOfZoo;
        this.curatorOfZoo = curatorOfZoo;
    }

    public String getDirectorOfZoo() {
        return directorOfZoo;
    }

    public void setDirectorOfZoo(String directorOfZoo) {
        this.directorOfZoo = directorOfZoo;
    }

    public String getCuratorOfZoo() {
        return curatorOfZoo;
    }

    public void setCuratorOfZoo(String curatorOfZoo) {
        this.curatorOfZoo = curatorOfZoo;
    }

    public void demoEscapeZoo(){
        demoZoo();
        System.out.println("color :" + this.getDirectorOfZoo());
        System.out.println("CharacterType:"+ this.getCuratorOfZoo());
    }

}
