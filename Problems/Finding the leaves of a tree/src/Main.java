import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        HashSet<Integer> parents = new HashSet<>();
        HashSet<Integer> children = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] splitted = line.split("\\s+");
            parents.add(Integer.parseInt(splitted[0]));
            children.add(Integer.parseInt(splitted[1]));
        }

        children.removeAll(parents); //leaves
        System.out.println(children.size());
        children.stream()
                .sorted()
                .forEach(i -> System.out.print(i + " "));

    }
}