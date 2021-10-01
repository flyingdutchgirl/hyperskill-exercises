import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Matcher matcher = Pattern.compile("program", Pattern.CASE_INSENSITIVE).matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            String found = text.substring(start).split("[\\s\\p{Punct}]+", 2)[0];
            System.out.printf("%d %s\n", start, found);
        }

    }
}