/* public class StringRotated {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
       

        if (isRotated(str1, str2)) {
            System.out.println("The string is rotated");
        } else {
            System.out.println("The string is not rotated");
        }
    }

    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String temp = str1 + str1;
        return temp.contains(str2);
    }
}
*/ 

import java.util.Scanner;

public class StringRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        if (isRotated(str1, str2)) {
            System.out.println("The string is rotated");
        } else {
            System.out.println("The string is not rotated");
        }

        sc.close();
    }

    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String temp = str1 + str1;
        return temp.contains(str2);
    }
}
