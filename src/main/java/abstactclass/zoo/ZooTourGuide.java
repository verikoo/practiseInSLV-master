package abstactclass.zoo;

import interfasexamples.ZooEmployeeWork;

public class ZooTourGuide implements ZooEmployeeWork {
    @Override
    public void jobPosition(){
        System.out.println("Zoo Tour Guide");
    }
    public void jobPrimaryDuties(){
        System.out.println("A zoo tour guide works directly with the public to provide educational tours of the zoo grounds and exhibits");
    }
}
