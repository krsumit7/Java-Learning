import java.util.*;

public class RightRotations {
    public static int findMatchCount(int N, int K, int[] A) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int newIndex = (i + K) % N;
            if (A[i] == newIndex) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int input1 = 6;
        int input2 = 3;
        int[] input3 = {1, 4, 6, 1, 4, 6};
        int result = findMatchCount(input1, input2, input3);
        System.out.println("Output: " + result);
    }
}
