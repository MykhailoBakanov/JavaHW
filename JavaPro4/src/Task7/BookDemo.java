package Task7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {
        Set<Book> mySet=new TreeSet<>();
        mySet.add(new Book(200,"William Shakespeare","A Fairy Song"));
        mySet.add(new Book(100,"Thomas Wyatt","They Flee From Me"));
        mySet.add(new Book(400,"Agatha Christie"," And Then There Were None"));
        mySet.add(new Book(300,"Joanne Rowling","Harry Potter"));

        System.out.println(mySet);

    }
}
