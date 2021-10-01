import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        LocalDateTime a = LocalDateTime.parse(sc.nextLine());
        LocalDateTime b = LocalDateTime.parse(sc.nextLine());

        if (a.isAfter(b)) {
            var temp = a;
            a = b;
            b = temp;
        }

        if (a.isEqual(b)) {
            System.out.println(0);
            return;
        }

        final LocalDateTime start = a;
        final LocalDateTime end = b;

        long result = sc.useDelimiter("\n")
                .tokens()
                .skip(1)
                .map(LocalDateTime::parse)
                .filter(t -> (t.isEqual(start) || t.isAfter(start)) && t.isBefore(end))
                .count();

        System.out.println(result);

    }
}