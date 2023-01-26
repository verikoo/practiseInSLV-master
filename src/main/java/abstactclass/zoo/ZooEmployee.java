package abstactclass.zoo;

public class ZooEmployee {
    private int id;
    private String name ;
    private String surName;
    private int age;
    private int experience;
    private String livingAddress;
    private String nationality;
    private String education;
    //-------------------------------------------
    public ZooEmployee(){
        this.id=0;
        this.name=null;
        this.surName= null;
        this.age= 0;
        this.experience=0;
        this.livingAddress= null;
        this.nationality=null;
        this.education=null;
    }


    public ZooEmployee(int id, String name, String surName, int age, int experience, String livingAddress, String nationality, String education){
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.age=age;
        this.experience=experience;
        this.livingAddress=livingAddress;
        this.nationality=nationality;
        this.education=education;
    }
    //-------------------------------------------
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getLivingAddress() {
        return livingAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEducation() {
        return education;
    }
    //-------------------------------------------
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLivingAddress(String livingAddress) {
        this.livingAddress = livingAddress;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void demoEmployee(){
        System.out.println("Employee Name: "+this.getName());
        System.out.println("Employee Surname: "+this.getSurName());
        System.out.println("Employee Nationality: "+ this.getNationality());
        System.out.println("Employee Age: " + this.getAge());
    }

}
