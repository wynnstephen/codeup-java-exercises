package Company;

// create an abstract class using the 'abstract' keyword
// abstract classes cannot be instantiated (to create an instance (an object) of that class)
// create a subclass from the abstract and then instantiate the subclass
abstract class Employee {
    // define properties
    private String salary;
    public String nameOfEmployee;
    public String department;

//    public abstract String doWork();

    // if you don't define method in abstract class, you ust mark it
    // abstract
    // public abstract String doWork();

    public String doWork() {
        return "I am working";

    }
}
