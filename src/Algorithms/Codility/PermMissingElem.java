package Algorithms.Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermMissingElem {
    public static int solution (int[] A){
        Arrays.sort(A);

        int a, b, c;
        for (int i = 0; i < A.length+1; i++) {
                a = A[i];
                b = A[i+1];
                if (b - a != 1){
                    c = b - 1;
                    return c;
                }
        }
        return 0;
    }

    public static int solution2 (int[] A){
        Arrays.sort(A);

        List<Integer> aList = new ArrayList<>();

        int arrayElem = 0;

        for (int i = 0; i < A.length + 1; i++) {
            arrayElem = A[i];
            aList.add(arrayElem);
            if (!(aList.contains(i))){
            //TODO: complete code...
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {2, 3, 1, 5};
        //              {1, 2, 3, 5}

        System.out.println("The missing element in your array is: "+solution(myArray));
    }
}
