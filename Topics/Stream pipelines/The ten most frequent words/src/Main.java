import java.text.Normalizer;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
//        String ez = "uż niedużo. Myślę, że to był już ostatni Karburator.";
//        var s = stripAccents(ez);
//        System.out.println(s);


        new Scanner(System.in)
                .useDelimiter("\\s+")
                .tokens()
//                .map(String::toLowerCase)
//                .map(Main::stripAccents)
//                .map(str -> str.replaceAll("^\\p{Alnum}", ""))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    Comparator<Map.Entry<String, Long>> comp =
                            Comparator.comparingLong(Map.Entry::getValue);
                    var comp2 = comp.reversed().thenComparing(Map.Entry::getKey);

                    return comp2.compare(o1, o2);
                })
                .limit(100)
                .map(e -> String.format("%s: %s", e.getValue(), e.getKey().replaceAll("[,.!?-]", "")))
                .forEach(System.out::println);
    }

    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}