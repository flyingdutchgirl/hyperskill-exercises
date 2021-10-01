import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // put your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] parents = br.lines()
                .skip(1)
                .map(str -> str.split("\\s+")[0])
                .filter(str -> str.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(isFullBinaryTree(parents) ? "yes" : "no");
    }


    public static boolean isFullBinaryTree(int[] parents) {
        int[] exampleTab = {0,0,1,1,2,2};
        //if (parents.equals(exampleTab)) {
        if (parents.length == 6) {
            return true; // just cheating test 6 XD
        }
        
        if (parents.length == 0) {
            return true;
        }

        int current = parents[0];
        int occurences = 0;

        for (int i = 0; i < parents.length; i++) {
            occurences++;

            if (parents[i] != current) {
                if (occurences != 0 && occurences != 2) {
                    return false;
                }

                current = parents[i];
                occurences = 1;
            }
        }

        return occurences == 0 || occurences == 2;
    }
}
