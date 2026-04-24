
import java.util.Scanner;

public class printTableOfTwo {

    public static void main(String[] args) {

        // input from user.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
        sc.close();
    }
}
