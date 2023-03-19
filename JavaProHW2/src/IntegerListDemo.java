import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> collectionNumbers = new ArrayList<>();

        collectionNumbers.add(2);
        collectionNumbers.add(3);
        collectionNumbers.add(4);
        collectionNumbers.add(5);
        collectionNumbers.add(6);
        collectionNumbers.add(7);

        System.out.println(collectionNumbers.size());

        System.out.println("========================================");

        collectionNumbers.add(0, 1);
        collectionNumbers.add(8);
        System.out.println(collectionNumbers.size());

        System.out.println("========================================");

        collectionNumbers.remove(1);
        collectionNumbers.remove((Integer) 4);
        System.out.println(collectionNumbers.size());

        System.out.println("========================================");

        System.out.println("List is empty ? " + collectionNumbers.isEmpty());

        System.out.println("========================================");

        for (Integer numbers : collectionNumbers)
            System.out.print(numbers + " ");
    }
}
