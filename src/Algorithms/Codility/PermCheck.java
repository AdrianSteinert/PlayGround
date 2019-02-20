package Algorithms.Codility;

import java.util.Arrays;

public class PermCheck {
    public static int solution(int[] A){
        int N = A.length;

        int[] count = new int[1000];

        for (int i = 0; i < N; i++) {
            count[A[i]] += 1;
        }

        for (int i = 1; i <=N; i++) {
            if (count[i] == 0) {
                return 0;
            }
        }
            return 1;
    }

    public static void main(String[] args) {
        int[] myArray = {4, 1, 3, 2};

        System.out.println(solution(myArray));
    }
}
