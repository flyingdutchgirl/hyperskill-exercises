import java.util.*;


class MapFunctions {

    public static void removeLongNames(Map<String, String> map) {
        // write your code here

        // creating List before iterating is necessary to avoid problems with concurrent modifications
        for (String s : new ArrayList<>(map.keySet())) {
            map.computeIfPresent(s, (k, v) -> k.length() > 7 || v.length() > 7 ? null : v);
        }

    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(" ");
            map.put(pair[0], pair[1]);
        }

        MapFunctions.removeLongNames(map);

        System.out.println(map.size());
    }
}