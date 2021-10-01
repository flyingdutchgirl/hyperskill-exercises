import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Matcher passwordMatcher = Pattern.compile("password", Pattern.CASE_INSENSITIVE).matcher(text);
        Pattern pat = Pattern.compile("[\\s:]*\\p{Alnum}+");

        int counter = 0;

        while (passwordMatcher.find()) {
            Matcher mat = pat.matcher(text.substring(passwordMatcher.end()));
            if (mat.find()) {
                String password = mat.group().replaceAll("[\\s:]+", "");
                System.out.println(password);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("No passwords found.");
        }


    }
}