import java.util.Scanner;

public class Jul07WarmUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Uppercase
        String isUp = "";
        System.out.print("Please give a string: HElLo ThEre");
        String x = in.next();
        int z = x.length();
        for(int y = 0; y < z; y++){
            if(Character.isUpperCase(x.charAt(y))){
                char w = x.charAt(y);
                isUp = isUp + w + " ";
            }
        }
        System.out.println("The uppercase characters are " + isUp);
        //Uppercase
    }
}
