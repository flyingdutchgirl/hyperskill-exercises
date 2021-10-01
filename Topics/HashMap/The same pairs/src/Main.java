import java.util.*;


class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        int initialSize = map1.size();
        map1.entrySet().removeAll(map2.entrySet());
        int result = initialSize - map1.size();

        System.out.println(result);
    }
}