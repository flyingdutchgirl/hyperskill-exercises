import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "([+-]?([1-9][0-9]*|0))" + //integer part
                "([.,]0|([.,][0-9]*[1-9])?)";   //decimal part

        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}