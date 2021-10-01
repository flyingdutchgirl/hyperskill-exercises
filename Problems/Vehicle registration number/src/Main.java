import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        /* write your code here */

        String letterRegex = "[ABEKMHOPCTYX]";
        String numberRegex = "\\d";
        String regex = letterRegex + numberRegex + "{3}" + letterRegex + "{2}";

        System.out.println(regNum.matches(regex));
    }
}