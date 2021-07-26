//import java.util.Scanner;
//
//public class MethodExercises {
//    public static void main(String[] args) {
//        // 1.
//        System.out.println(integerAddition(5, 5));
//        System.out.println(integerSubtraction(5, 5));
//        System.out.println(integerMultiplacation(5, 5));
//        System.out.println(integerDivison(5, 5));
//        System.out.println(integerModulus(10, 0));
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter an int between 1 to 10.");
//    }
//
//    public static int integerAddition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    private static int integerSubtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    private static int integerMultiplacation(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    private static int integerDivison(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    private static int integerModulus(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    // 2.
//        public static int getInteger(int min, int max){
//
//        Scanner scanner = new Scanner(System.in);
//
//        int n1 = scanner.nextInt();
//
//        if(n1 < min){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            getInteger(1, 10);
//        } else if(n1 > max){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            getInteger(1, 10);
//        } else {
//            System.out.println(n1 + " is a valid number!");
//        }
//        return n1;
//    }
//
////    3.
//    public static void Factorial(int min, int max){
//
//        while (true) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int input = scanner.nextInt();
//
//        if(input < min){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            Factorial(1, 10);
//        } else if(input > max){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            Factorial(1, 10);
//        } else {
//
//            long fact = 1;
//
//            for (int i = 1; i <= input; i++) {
//                fact = fact * i;
//                System.out.println(i + "! = " + fact);
//            }
//
//                System.out.print("Would you like to continue? (y/n): ");
//
//                String prompt = scanner.next().toLowerCase();
//
//                if (prompt.equals("y")) {
//                    System.out.print("Enter a number between 1 and 10: ");
//                    continue;
//                } else if (prompt.equals("n")) {
//                    break;
//                }
//
//            }
//            break;
//        }
//    }
//
//
////
//    public static int roll(int diceSides){
//
//        Random rand = new Random();
//        int sides = rand.nextInt(diceSides);
//        sides = sides + 1;
//
//        return sides;
//    }
//
//
//}