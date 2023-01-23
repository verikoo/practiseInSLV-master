package enumsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Zoo {
    ZOO1(CountryName.ETHIOPIA, ZooEmployExample.Jobs.DIRECTOR),
    ZOO2(CountryName.GHANA, ZooEmployExample.Jobs.DIRECTOR),
    ZOO3(CountryName.LIBYA, ZooEmployExample.Jobs.DIRECTOR),
    ZOO4(CountryName.MADAGASCAR, ZooEmployExample.Jobs.DIRECTOR),
    ZOO5(CountryName.MOROCCO, ZooEmployExample.Jobs.DIRECTOR),
    ZOO6(CountryName.GHANA, ZooEmployExample.Jobs.DIRECTOR);


    private CountryName country;
    private ZooEmployExample.Jobs employ;

    Zoo(CountryName country, ZooEmployExample.Jobs employ){
        this.country=country;
        this.employ=employ;
    }

    public CountryName getCountry() {
        return country;
    }

    public ZooEmployExample.Jobs getEmploy() {
        return employ;
    }

    public void setCountry(CountryName country) {
        this.country = country;
    }

    public void setEmploy(ZooEmployExample.Jobs employ) {
        this.employ = employ;
    }

    public static void main(String[] args) {


        Zoo z1= Zoo.ZOO1;
        System.out.println("coyntry:"+ z1.getCountry());
        System.out.println("coyntryJob:"+ z1.getEmploy());


    }
}
