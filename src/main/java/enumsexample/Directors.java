package enumsexample;

public enum Directors {
    ETHIOPIA("Steven Spielberg"),
    KENYA("Charles Kenia"),
    MOROCCO("Martin Scorsese"),
    MADAGASCAR("Martin Madagascar"),
    GHANA("Emilia Ghana"),
    LIBYA("Christopher Nolan");

    private String director;

    Directors(String director){
        this.director=director;
    }

    public String getDirector(){
        return String.valueOf(director);
    }
}
