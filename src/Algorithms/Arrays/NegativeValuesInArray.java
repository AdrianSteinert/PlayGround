package Algorithms.Arrays;

import java.util.Arrays;

public class NegativeValuesInArray {
    public static int numberOfNegativeValues(int[] array){
        int size = array.length-1;
        int numberOfValues = 0;
        for (int i = 0; i <= size; i++) {
            if (array[i] < 0){
                numberOfValues = numberOfValues + 1;
            }
        }
        return numberOfValues;
    }

    public static void main(String[] args) {
        int[] myArray = {6, 46, 0, -6, -18, 0, 12, 8, -24, -1};

        System.out.println("there are: "+numberOfNegativeValues(myArray)+" negative values in your array...");
    }
}
