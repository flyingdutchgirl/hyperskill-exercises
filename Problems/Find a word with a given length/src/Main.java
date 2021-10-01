import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // write your code here
        String regex = String.format(".*\\b\\p{Alpha}{%d}\\b.*", size);
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(line).matches() ? "YES" : "NO");

    }
}