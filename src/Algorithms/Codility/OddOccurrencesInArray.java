package Algorithms.Codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int Solution (int[] array){
        int size = array.length-1;
        Arrays.sort(array);

        int numberOfPairsFound = 0, i, j;
        for (i = 0; i < size; i++) {
            for (j = 1; j < size; j++) {
                if (array[i] == array[j]) {
                    numberOfPairsFound++;
                } else {
                    break;
                }
            }
            if (numberOfPairsFound % 2 == 0){
            return array[i];
            } else {
                numberOfPairsFound = 0;
                    i = j - 1;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrence = new OddOccurrencesInArray();

        int[] myArray = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(oddOccurrence.Solution(myArray));
    }
}
