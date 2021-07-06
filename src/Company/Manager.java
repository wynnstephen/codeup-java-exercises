package Company;

//extends keyword to create a subclass of the Employee abstract class
public class Manager extends Employee{
    // every child class must define the method

    public static void main(String[] args) {
        Manager Greg = new Manager();
        Greg.nameOfEmployee = "Greg";
        Greg.department = "Sales";
        System.out.println(Greg.nameOfEmployee + " works as manager" + " the: " + Greg.department);

        //we don't know what the implementation of this is yet
        Employee Bob;
        // logic goes here
        Bob = new Manager();
        Bob.nameOfEmployee = "Bob";
        Bob.department = "Marketing";
        System.out.println(Bob.nameOfEmployee + " works as a manager" + " the: " + Bob.department);
    }
}
