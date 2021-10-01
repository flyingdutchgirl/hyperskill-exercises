import java.util.*;
import java.util.stream.IntStream;

class Stuff {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        int[] parents = input.replaceAll("\\s+", "\n")
                .lines()
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(treeHeight(parents));
    }

    public static int treeHeight(int[] parents) {
        int max = 0;

        for (int i = 0; i < parents.length; i++) {
            int h = 1;
            int n = i;

            while (parents[n] != -1) {
                n = parents[n];
                h++;
            }

            if (h > max) {
                max = h;
            }
        }

        return max;
    }

}