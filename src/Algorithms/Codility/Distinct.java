package Algorithms.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Distinct {
    //Codility score = 91%!
    public static int solution(int[] A){
        int N = A.length;
        int dist = 1;
        Arrays.sort(A);

        for (int i = 1; i < N; i++) {
            if (A[i] != A[i-1]){
                dist+=1;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        System.out.println("Should return 3 : "+solution(new int[]{2, 1, 1, 2, 3, 1}));
        //                                                         1, 1, 1, 2, 2, 3
    }
}
