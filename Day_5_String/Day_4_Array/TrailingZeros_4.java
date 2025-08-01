import java.util.Scanner;

public class TrailingZeros_4 {
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int result = countTrailingZeros(number);
        System.out.println("Trailing zeros in " + number + "! = " + result);
    }
}
