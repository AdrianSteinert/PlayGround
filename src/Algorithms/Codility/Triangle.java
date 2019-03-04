package Algorithms.Codility;

import java.util.Arrays;

public class Triangle {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int hasTriangular = 0;

        if (A.length < 3) {
            return 0;
        } else {
            int P = 0;
            int Q = 1;
            int R = 2;

            for (int i = 2; i < A.length; i++) {
                if ((long) A[P] + (long) A[Q] > (long) A[R]) {
                    hasTriangular = 1;
                    break;
                } else {
                    P++;
                    Q++;
                    R++;
                }
            }

        }
        return hasTriangular;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 2, 5, 1, 8 , 20}));
    }
}
