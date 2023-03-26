import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {


        String text = "They say that good books cannot become old. I can say the same about the books of a unique English writer of the 19th century, Charlotte Bronte. ";

        String[] myStrArr = text.split(" ");
        Set<String> mySetList = new HashSet<>(List.of(myStrArr));

        for (String str : myStrArr) {
            if (str.length()>5){
                System.out.println(str);
            }
        }

    }
}
