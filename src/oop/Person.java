package oop;

public class Person {


    //Class Members


    //Field
    //Private means only members of this class
    private String name;
    private int age;
    private String height;
    private String nationality;
    private String purpose;
    private static final boolean hasSkin = true;

    //Constructor
    public Person(String name, int age,
                  String height, String nationality){
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public Person(){

    }

    //Properties


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static boolean isHasSkin() {
        return hasSkin;
    }

    public String getEntertainment(String entertainment){
        return this.name + " is going to go " + entertainment;
        // Stephen is going to go ride a rollercoaster
    }

    public String getPurpose(){
        return purpose;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }
}
