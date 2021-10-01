import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> stringList = new ArrayList<>(List.of(array));
        ListIterator<String> listIterator = stringList.listIterator();

        while (listIterator.hasNext()) {
            String str = listIterator.next();
            if (str.startsWith("J")) {
                listIterator.set(str.substring(1));
            } else {
                listIterator.remove();
            }
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}