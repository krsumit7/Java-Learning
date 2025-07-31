import java.util.Scanner;

public class OddEvenPnN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive number");
            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else if (n < 0) {
            System.out.println("Negative number");
            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else {
            System.out.println("Zero (Even number)");
        }

        sc.close(); // ✅ Now correctly inside the main method
    }
}
