package zoo;

import interfasexamples.ZooEmployeeWork;

public class VolunteerCoordinator implements ZooEmployeeWork {
    @Override
    public void jobPosition(){
        System.out.println("Volunteer Coordinator");
    }
    public void jobPrimaryDuties(){
        System.out.println("A volunteer coordinator manages and supervises the facility's volunteers throughout all departments");
    }
}
