package Algorithms.Codility;

import java.util.ArrayList;
import java.util.List;

public class MissingInteger {
    public static int solution(int[] A){
        List<Integer> list = new ArrayList<>();
        int N = A.length;

        for (int i = 0; i < N; i++) {
            if(A[i] > 0){
                list.add(A[i]);
            }
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!list.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Should return 5 : "+solution(new int [] {1, 3, 6, 4, 1, 2}));
        System.out.println("Should return 4 : "+solution(new int [] {1, 2, 3}));
        System.out.println("Should return 1 : "+solution(new int [] {-1, -3}));
    }
}
