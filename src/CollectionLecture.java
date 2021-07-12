import java.util.ArrayList;

public class CollectionLecture {
    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>();
        //Add first element
        stringArr.add("Stephen");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Add second element
        stringArr.add("Raul");
        System.out.printf("Current Array list size : %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(System.identityHashCode(stringArr));

        //Remove second element
//        stringArr.remove(1);
//        System.out.println(System.identityHashCode(stringArr));
        ArrayList<String> stringArrCopy = stringArr;

        System.out.println("Array list copy : ");
        System.out.println(stringArrCopy);
        System.out.println("copied list hashcode: ");
        System.out.println(System.identityHashCode(stringArr));
    }
}
