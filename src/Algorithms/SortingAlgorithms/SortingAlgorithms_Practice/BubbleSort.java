package Algorithms.SortingAlgorithms.SortingAlgorithms_Practice;

import java.util.Arrays;

public class BubbleSort {
    public static int[] BubbleSort(int[] A) {
        int arrayLength = A.length;
        if (arrayLength == 1)
            return A;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength-1; j++) {
                if (A[j+1] < A[j]){
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int array[] = {9, 5, 11, 2, 3, 0, 1};
        int myArray[] = {23, 1, 6, 12};
        int my2Array[] = {24};

        System.out.println(Arrays.toString(BubbleSort(my2Array)));
    }
}
