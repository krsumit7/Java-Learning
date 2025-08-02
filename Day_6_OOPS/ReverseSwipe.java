
import java.util.*;
public class ReverseSwipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int original = scanner.nextInt();
        int reversed = reverseNumber(original);
        int result = original + reversed;
        System.out.println(original + " + " + reversed + " = " + result);
    }
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}

