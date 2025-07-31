import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int first = Integer.MIN_VALUE;  
        int second = Integer.MIN_VALUE; 

        for (int i = 0; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements might be equal).");
        } else {
            System.out.println("Second largest element is: " + second);
        }

        sc.close();
    }
}
