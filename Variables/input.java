import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // sc.next() :- it will print only one token  while sc.nextLine() print entire sentence.
        // nextInt()
        // nextFloat()

        System.out.println(name);

        sc.close(); // good practice

    }
}
