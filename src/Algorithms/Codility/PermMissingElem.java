package Algorithms.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermMissingElem {
    public static int solution (int[] A){
        int N = A.length;

        for (int i = 1; i <= N + 1; i++) {
            boolean missingElemFound = false;

            for (int j = 0; j < N; j++){
                if (A[j] == i){
                    missingElemFound = true;
                }
            }
            if (!missingElemFound){
                return i;
            }
        }
        return 0;
}


    public static void main(String[] args) {
        int[] myArray = {2, 3, 1, 5};
        int[] my2ndArray = {3, 2, 1, 4, 5};

        System.out.println(solution(myArray));
    }
}
