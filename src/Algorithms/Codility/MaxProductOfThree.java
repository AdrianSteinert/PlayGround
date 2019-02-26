package Algorithms.Codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int N = A.length;
        int minValue = 0;
        int maxValue = 1;

        if (N == 1){
            return A[minValue];
        }
        if (N == 2){
            maxValue = A[minValue]*A[minValue+1];
            return maxValue;
        }

        for (int i = N-3; i < N; i++) {
            maxValue *= A[i];
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println("Should return 60 : "+solution(new int[]{-3, 1, 2, -2, 5, 6}));
        System.out.println("Should return 18 : "+solution(new int[]{1, 6, 3, 1}));
        System.out.println("Should return 9900 : "+solution(new int[]{100, 99}));
        System.out.println("Should return -3 : "+solution(new int[]{-3}));
    }
}
