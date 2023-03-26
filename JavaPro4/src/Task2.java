import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        String text1 = "Thank you for your letter! I will answer your questions about my family with pleasure. Today is Sunday, so we are all together. ";
        System.out.println("Unique words in the text1 : " + numWords(text1));

        String text2 = "Mother Brother Father Mother Brother Mother ";
        System.out.println("Unique words in the text2 : " + numWords(text2));


    }

    public static int numWords (String text){
        String[] myTextArr = text.trim().split(" ");
        Set<String> myTextSet = new HashSet<>();
        Collections.addAll(myTextSet, myTextArr);
        return myTextSet.size();
    }
}
