package zoo;

import interfasexamples.ZooEmployeeWork;

public class ZooKeeper implements ZooEmployeeWork {
    @Override
    public void jobPosition(){
        System.out.println("ZooKeeper");
    }
    public void jobPrimaryDuties(){
        System.out.println("A zookeeper, also called an animal keeper or aquarist, is the primary caretaker of the animals in a zoo, often specializing in a particular species or section, such as reptiles, mammals, or fish");
    }
}
