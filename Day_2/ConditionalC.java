package Graphs;
import java.util.Scanner;

public class ConditionalC{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("n1 is greatest: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("n2 is greatest: " + n2);
        } else {
            System.out.println("n3 is greatest: " + n3);
        }

        sc.close();
    }
}
