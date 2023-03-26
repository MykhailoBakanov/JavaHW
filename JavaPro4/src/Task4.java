import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        Map<String, Integer> clientsInfo = new HashMap<>();
        clientsInfo.put("Mikhailo", 52899835);
        clientsInfo.put("Andrei", 28935459);
        clientsInfo.put("Vasil", 345893354);
        clientsInfo.put("Maksim", 96756757);
        clientsInfo.put("Petro", 348572572);
        clientsInfo.put("Pawel", 238956528);

        System.out.println("Mikhailo`s phone number is : " + clientsInfo.get("Mikhailo"));
        System.out.println("Andrei`s phone number is : " + clientsInfo.get("Andrei"));
        System.out.println("Vasil`s phone number is : " + clientsInfo.get("Vasil"));
        System.out.println("Maksim`s phone number is : " + clientsInfo.get("Maksim"));
        System.out.println("Petro`s phone number is : " + clientsInfo.get("Petro"));
        System.out.println("Pawel`s phone number is : " + clientsInfo.get("Pawel"));


    }
}
