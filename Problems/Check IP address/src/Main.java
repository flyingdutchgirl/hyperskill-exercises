import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(isIpValid(sc.nextLine()) ? "YES" : "NO");
    }

    public static boolean isIpValid(String ip) {
        String blockRegex = "(1?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
        String regex = blockRegex + "\\." + blockRegex + "\\." + blockRegex + "\\." + blockRegex;

        return ip == null ? false : ip.matches(regex);
    }

}