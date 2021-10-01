import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s+");

        try {
            var params = scanner.tokens()
                    .limit(3)
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);

            if (params.length == 3) {
                System.out.println(sleepTime(params[0], params[1], params[2]));
            } else {
                System.out.println("ERROR! Wrong number of parameters!" +
                        "Expected: 3, Given: " + params.length);
            }
        } catch (NumberFormatException exc) {
            System.out.println("ERROR! One of the args is not an int number!");
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }


    }


    /**
     * Checks if the given time of sleep matches the given range.
     *
     * @param a - minimal time of sleep in hours
     * @param b - maximal time of sleep in hours
     * @param h - real time of sleep in hours
     * @return "Deficency" if the sleep time is too short,
     * "Excess" if too long or "Normal" if is right.
     * @throws IllegalArgumentException if a < 0 || b < 0 || h < 0 || a > b
     */
    public static String sleepTime(int a, int b, int h) {
        if (a < 0 || b < 0 || h < 0) {
            throw new IllegalArgumentException(
                    String.format("No arg can be negative! Args: a = %d, b = %d, h = %d",
                            a, b, h)
            );
        }

        if (a > b) {
            throw new IllegalArgumentException(
                    String.format("Arg a cannot be greater than b! Args: a = %d, b = %d, h = %d",
                            a, b, h)
            );
        }

        if (h < a) {
            return "Deficiency";
        } else if (h > b) {
            return "Excess";
        } else {
            return "Normal";
        }
    }
}