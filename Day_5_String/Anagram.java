import java.util.Scanner;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
        sc.close();
    }
}
