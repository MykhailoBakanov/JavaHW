import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        myList.add("Mother");
        myList.add("Brother");
        myList.add("Father");
        myList.add("Mother");
        myList.add("Brother");
        myList.add("Father");
        myList.add("Family");
        myList.add("Parents");

        System.out.println("My list : " + myList);


        List<String> newList = newList(myList);
        System.out.println("Cleaned list :" + newList);

    }

    public static List<String> newList (List<String> myList){
        List<String> cleanList = new LinkedList<>();

        for (String str : myList) {
            if (!cleanList.contains(str)) {
                cleanList.add(str);
            }
        }
        return cleanList;
    }


}