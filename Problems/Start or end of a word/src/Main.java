import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        // write your code here
        Pattern beginnningPattern = Pattern.compile("^" + part, Pattern.CASE_INSENSITIVE);
        Pattern endPattern = Pattern.compile(part + "$", Pattern.CASE_INSENSITIVE);

        boolean result = line.replaceAll("\\p{Punct}", " ")
                .replaceAll("\\s+", "\n")
                .lines()
                .map(word ->
                        beginnningPattern.matcher(word).find() || endPattern.matcher(word).find()
                )
//                .peek(System.out::println)
                .reduce((a, b) -> a || b)
                .orElse(false);

        System.out.println(result ? "YES" : "NO");

    }
}