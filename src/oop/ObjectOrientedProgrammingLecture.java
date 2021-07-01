package oop;

public class ObjectOrientedProgrammingLecture {

    public static void main(String[] args) {
        //tell me about a person

        Person person = new Person();
        person.setName("Stephen");
        System.out.println(person.getEntertainment("ride rollercoasters"));

        Person person1 = new Person();
        person1.setName("Tiffany");
        System.out.println(person1.getEntertainment("tubing"));
    }



}
