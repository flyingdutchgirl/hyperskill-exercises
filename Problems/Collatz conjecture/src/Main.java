import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> result = collatzConjecture(n);

        for (int ii: result) {
            System.out.print(ii + " ");
        }

    }


    public static List<Integer> collatzConjecture(int n) {
        List<Integer> list =
                Stream.iterate(n,
                x -> x != 1,
                x -> x % 2 == 0 ? x / 2 : x * 3 + 1)
                .collect(Collectors.toList());

        list.add(1);

        return list;
    }

}