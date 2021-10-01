import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                arr[k + i][k] = i;
                arr[k][k + i] = i;
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }

    }
}
