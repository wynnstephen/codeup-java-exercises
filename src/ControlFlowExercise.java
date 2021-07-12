import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {

        // 1.
//        int i = 5;
//        while ((i <= 15)) {
//            System.out.println(i + " ");
//            i++;
//        }
        // 2.
//        int count = -100;
//        do {
//            count -= 5;
//            System.out.println(count);
//        } while (count >= -5);
//    }
//        long count = 100;
//        do {
//            count -= 5;
//            System.out.println(count);
//        }while (count >= -5);
//        }
//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("i: %d\n", i);
//        }
//        for (int i = 2; i <= 100; i++) {
//            System.out.printf("i: %d\n", i);
//        }
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.printf("i: %d\n", i);
//        }
//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.printf("i: %d\n", i);
//        }
        //2. FIZZBUZZ
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else {
//                System.out.printf("i: %d\n", i);
//            }
//            }

        // 3. Table of Powers
            Scanner scanner = new Scanner(System.in);
//            while(true) {
//                System.out.println("What number would you like to go up to?");
//                int input = scanner.nextInt();
//
//                System.out.println("Here is your table!\n");
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------  | ------");
//                for (int i = 1; i <= input; i++) {
//                    int squared = i * i;
//                    int cubed = i * i * i;
//                    System.out.println(i + "      | " + squared + "\t\t | " + cubed);
//                }
//                System.out.println("Would you like to continue? (yes/no)");
//                String answer = scanner.next().toLowerCase();
//                if (answer.equals("yes")){
//                }else {
//                    break;
//                }
//            }

            // 4.
            while(true) {
                System.out.println("Please enter the percentage grade you got.");
                // use byte.
                byte grade = scanner.nextByte();
                if (grade >= 100) {
                    System.out.println("A");
                } else if (grade >= 88) {
                    System.out.println("A");
                } else if (grade >= 87) {
                    System.out.println("B");
                } else if (grade >= 80) {
                    System.out.println("B");
                } else if (grade >= 79) {
                    System.out.println("C");
                } else if (grade >= 67) {
                    System.out.println("C");
                }else if ( grade >= 66){
                    System.out.println("D");
                } else if (grade >= 60) {
                    System.out.println("D");
                }else if ( grade >= 59){
                    System.out.println("F");
                }else if (grade >= 0){
                    System.out.println("F");
                }
                System.out.println("would you like to continue? (yes/no)");
                String prompt = scanner.next().toLowerCase();
                if (prompt.equals("yes")){
                    continue;
                }else {
                    break;
                }
            }
        }
    }