import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        ArrayDeque<String> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        sc.nextLine(); //skip first line

        while (sc.hasNextLine()) {
            deque.offerFirst(sc.nextLine());
        }

        while (deque.peekFirst() != null) {
            System.out.println(deque.pollFirst());
        }

    }
}