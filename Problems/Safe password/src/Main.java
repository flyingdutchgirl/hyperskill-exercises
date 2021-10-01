import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String s = new Scanner(System.in).nextLine();
        boolean res = s.matches("^.*[0-9].*$")
                && s.matches("^.*[a-z].*$")
                && s.matches("^.*[A-Z].*$")
                && s.length() >= 12;

        System.out.println(res ? "YES" : "NO");
    }
}