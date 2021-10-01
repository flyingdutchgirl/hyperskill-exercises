import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int len = sb.length();


        if (len < 1) {
            // does nothing
        } else if (len % 2 == 0) {
            sb.deleteCharAt(len / 2);
            sb.deleteCharAt((len / 2) - 1);
        } else {
            sb.deleteCharAt(len / 2);
        }

        System.out.println(sb.toString());

    }
}