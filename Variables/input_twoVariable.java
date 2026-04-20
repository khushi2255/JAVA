
import java.util.Scanner;

public class input_twoVariable {

    public static void main(String[] args) {

        // input 2 variables and print their sum.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);
        sc.close();

    }

}
