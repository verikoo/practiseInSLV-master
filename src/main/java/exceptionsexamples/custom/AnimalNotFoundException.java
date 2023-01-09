package exceptionsexamples.custom;

public class AnimalNotFoundException extends Exception{
    public AnimalNotFoundException(String message){
        super(message);
    }
}
