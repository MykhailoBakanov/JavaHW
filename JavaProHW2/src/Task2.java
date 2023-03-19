import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        List<Integer> secondList = myList;

        System.out.println(myList);
        System.out.println(secondList);

        System.out.println("List1 hashcode: " + myList.hashCode());
        System.out.println("List2 hashcode: " + secondList.hashCode());


    }
}