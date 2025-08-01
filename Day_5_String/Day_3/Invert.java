/*public class Invert {
    public static void main(String[] args) {
        int rows = 4;
        int stars = 7;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
import java.util.Scanner;
public class Invert {
    public static void main(String[] args) {
        int rows = 4;
        int stars = 7;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}