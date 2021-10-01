import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(areBracketsBalanced(sc.nextLine()));
    }

    public static boolean areBracketsBalanced(String str) {
        Map<Character, Character> brackets =
                Map.of(')', '(', ']', '[', '}', '{' );
        Set<Character> openingBrackets = new HashSet<>(brackets.values());
                //Set.of('(', '{', '[');
        Set<Character> closingBrackets = brackets.keySet();
                //Set.of(')', '}', ']');
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch: str.toCharArray()) {
            if (openingBrackets.contains(ch)) {
                stack.offerLast(ch);
                break;
            }

            if (closingBrackets.contains(ch)) {
                if (brackets.get(ch) != stack.pollLast()) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

}