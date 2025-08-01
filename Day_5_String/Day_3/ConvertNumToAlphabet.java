import java.util.Scanner;
public class ConvertNumToAlphabet {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n = sc.nextInt();
    String result = "";
    while (n > 0) {
        n--;
        result = ((char)('a'+ (n % 26)) + result);
        n /=26;
    }
        System.out.println("corresponding alphabet is: " + result);
        sc.close();
    }
}