import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> collectionsNumbers = new ArrayList<>();

        long sizeCollection = 10000000;

        for (int i = 0; i < sizeCollection; i++) {
            collectionsNumbers.add(i);
        }
        System.out.println(collectionsNumbers.size());

        ForEachLoop(collectionsNumbers);
        ClassicFor(collectionsNumbers);
        ClassicForWithList(collectionsNumbers);
        ClassicForWithListAtEnd(collectionsNumbers);
        ClassicIterator(collectionsNumbers);
        ClassicListIterator(collectionsNumbers);
    }

    public static void ForEachLoop(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;

        for (Integer num : collectionsNumbers) {
            TMP = num;
        }

        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("For-each loop result = " + resultTime + "ms.");
    }

    public static void ClassicFor(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;
        for (int i = 0; i < collectionsNumbers.size(); i++) {
            TMP = collectionsNumbers.get(i);
        }

        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("Classic For result = " + resultTime + "ms.");
    }


    public static void ClassicForWithList(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;
        long listSize = collectionsNumbers.size();

        for (int i = 0; i < listSize; i++) {
            TMP = collectionsNumbers.get(i);
        }

        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("Classic For With List In Variable result = " + resultTime + "ms.");
    }

    public static void ClassicForWithListAtEnd(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;
        long listSize = collectionsNumbers.size();

        for (long i = listSize - 1; i >= 0; i--) {
            TMP = collectionsNumbers.get((int) i);
        }

        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("Classic For With List In Variable And Start From The End result = " + resultTime + "ms.");
    }

    public static void ClassicIterator(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;
        Iterator<Integer> collectionsIterator = collectionsNumbers.listIterator();

        while (collectionsIterator.hasNext()) {
            TMP = collectionsIterator.next();
        }
        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("Classic Iterator result  = " + resultTime + "ms.");
    }

    public static void ClassicListIterator(List<Integer> collectionsNumbers) {

        long timeStart = System.currentTimeMillis();
        long TMP;
        ListIterator<Integer> collectionsListIterator = collectionsNumbers.listIterator();

        while (collectionsListIterator.hasNext()) {
            TMP = collectionsListIterator.next();
        }
        long timeFinish = System.currentTimeMillis();
        long resultTime = timeFinish - timeStart;
        System.out.println("Classic List Iterator result  = " + resultTime + "ms.");


    }
}
