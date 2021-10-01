import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < b) {
            int temp = c;
            c = b;
            b = temp;
        }

        boolean result = b <= a && a <= c;

        System.out.println(result);


    }
}