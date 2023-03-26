package Task6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> myList = new ArrayList<>();

        myList.add(new Person("Mikhailo", 22));
        myList.add(new Person("Vlad", 12));
        myList.add(new Person("Leonid", 32));
        myList.add(new Person("Valera", 55));

        myList.sort(null);
        System.out.println(myList);

    }

}
