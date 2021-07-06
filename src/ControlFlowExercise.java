import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {

        // 1.
        int i = 5;
        while((i <= 15)){
            System.out.println(i + " ");
            i++;
        }
        // 2.
        int count = 0;
        do {
            count += 2;
            System.out.println(count);
        }while(count < 100);
    }

    int count = 100;
    do {
        count -= 5;
        System.out.println(count);
    }while(count > -10);
    int count = 2;
    do{
        count = (int) Math.pow((count), 2);
        System.out.println(count);
    }while(count < 65536);
}
