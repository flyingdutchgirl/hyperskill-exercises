import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        int offset = sc.nextInt();

        LocalDate start = LocalDate.parse(date);
        LocalDate current = start;

        while (current.getYear() == start.getYear()) {
            System.out.println(current.toString());
            current = current.plusDays(offset);
        }

    }
}