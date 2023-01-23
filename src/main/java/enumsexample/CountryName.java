package enumsexample;


public enum CountryName {
    ETHIOPIA(Directors.ETHIOPIA.getDirector()),
    KENYA(Directors.KENYA.getDirector()),
    MOROCCO(Directors.MOROCCO.getDirector()),
    LIBYA(Directors.LIBYA.getDirector()),
    MADAGASCAR(Directors.MADAGASCAR.getDirector()),
    GHANA(Directors.GHANA.getDirector());



    private String countryName;

    CountryName(String countryName){
        this.countryName=countryName;
    }
    public String getCountryName(){
        return String.valueOf(countryName);
    }
}
