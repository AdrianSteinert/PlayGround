package Algorithms.Codility;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution (int[] A){
        int size = A.length-1;
        int min = A[0];
        if (size == 1){
            return min;
        }

        Arrays.sort(A);

        int missingElem = 0;
            for (int j = 0; j < A.length+1; j++) {
//                int k = A[j];
//                if (k != j){
//                    missingElem = k;
//                }
                //TODO: complete function
            }

        return missingElem;
    }

    public static void main(String[] args) {
        int[] myArray = {2, 3, 1, 4, 5, 7};

        System.out.println("The missing element in your array is: "+solution(myArray));
    }
}
