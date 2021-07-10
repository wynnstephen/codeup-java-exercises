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
//    public  static  int getINteger(int min, int max, Scanner scanner) {
//        int scanINput = scanner.nextInt();
//
//        if (scanInput < min || scanInput > max) {
//            System.out.println("error, num not an int or within range.");
//            System.out.println("enter a num 1 thru 10");
//            return getInteger(min, max, scanner);
//        }else {
//            return scanInput;
//        }
//    }
//}
