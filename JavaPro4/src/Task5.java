import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();
        list1.add("Mother");
        list1.add("Brother");
        list1.add("Father");

        List<String> list2 = new LinkedList<>();
        list2.add("Brother");
        list2.add("Father");
        list2.add("Family");

        List<String> resList = comparisonLists(list1,list2);
        System.out.println("New List with common elements : " + resList);
    }


    public static List<String> comparisonLists(List<String> myList1, List<String> myList2) {

        List<String> resList = new LinkedList<>();

        for (String s : myList1) {
            if (myList2.contains(s)) {
                resList.add(s);
            }
        }
        return resList;
    }
}

