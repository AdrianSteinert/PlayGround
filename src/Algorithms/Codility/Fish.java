package Algorithms.Codility;

import java.util.Stack;

public class Fish {
    public static int solution(int[] A, int[] B){
        int N = A.length;
        if(N == 1){
            return 1;
        }

        int P = 1, Q = 0;
        int stack = 1;

        for (int i = 0; i < N; i++) {
            if (stack == 0)
                stack += 1;
            if (A[P] > A[Q]){
                P += 1;
                stack-=1;
            } else if (A[Q] > A[P]){
                Q += 1;
                stack-=1;
            }
            if (stack < 0){
                return 0;
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        System.out.println("Should return 2 : "+solution(new int[] {4, 3, 2, 1, 5}, new int[] {0, 1, 0, 0, 0}));
    }
}
