import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        sc.useDelimiter("\n");

        System.out.println("The value of pi is approximately " + pi);

        System.out.format("The value of pi is approximately %.2f.", pi);
    }
}
