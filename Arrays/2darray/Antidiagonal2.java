import java.util.Scanner;

public class Antidiagonal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                int x = sc.nextInt();
                if (i + j == r - 1) {
                    System.out.print(x + " ");
                }
            }
        }
        sc.close();
    }
}
