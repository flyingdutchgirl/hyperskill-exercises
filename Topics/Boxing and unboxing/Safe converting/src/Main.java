import java.util.Scanner;

public class Main {


    public static int convert(Long val) {
        // write your code here
        final int DEFAULT_INT_VAL = 0;

        if (val == null) {
            return DEFAULT_INT_VAL;
        }

        if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}