import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();

        long fact = 1;
        long n = 1;

        while (fact < m) {
            n++;
            fact *= n;
        }

        System.out.println(n);

    }
}