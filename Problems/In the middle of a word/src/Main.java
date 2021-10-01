import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        // write your code here
        final Pattern pat = Pattern.compile(".+" + part + ".+", Pattern.CASE_INSENSITIVE);

        boolean result = line.replaceAll("[\\p{Punct}]", "")
                .replaceAll("\\s+", "\n")
                .lines()
                .mapToInt(word -> pat.matcher(word).matches() ? 1 : 0)
                .reduce(Integer::sum)
                .orElse(0) > 0;

        System.out.println(result ? "YES" : "NO");

    }
}