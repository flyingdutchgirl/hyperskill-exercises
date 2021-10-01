import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        // write your code here
        Matcher matcher = Pattern.compile("\\b\\d{10,}\\b").matcher(stringWithNumbers);

        while (matcher.find()) {
            System.out.println(matcher.group() + ":" + matcher.group().length());
        }

    }
}