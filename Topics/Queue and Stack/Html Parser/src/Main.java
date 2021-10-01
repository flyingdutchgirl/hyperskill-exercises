import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        // put your code here
    }
}

class HtmlParser {
    String input;
    LinkedList<String> list;
    Deque<String> deque;

    public HtmlParser(String input) {
        this.input = input;
        this.list = new LinkedList<>();
        this.deque = this.list;
    }

    List<String> start() {

    }

    void search(String string) {
        char[] chars = string.toCharArray();
        StringBuilder startTag = new StringBuilder("");
        boolean isInTag = false;

        int i = 0;

        while (i < chars.length) {
            char ch = chars[i];

            if (ch == '<') {
                isInTag = true;
            }

            if (isInTag) {
                startTag.append(ch);
            }

            i++;

            if (ch == '>') {
                isInTag = false;
                break;
            }
        }

        if (startTag.length() == 0) {
            deque.offerFirst(string);
            return;
        }

        Matcher matcher = Pattern
                .compile("</" + startTag.deleteCharAt(0).toString())
                .matcher(string);

        int end = -1;

        while (matcher.find() && end <= i) {
            end = matcher.start();
        }

        search(string.substring(i, end));
    }

}