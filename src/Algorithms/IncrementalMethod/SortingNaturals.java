package Algorithms.IncrementalMethod;

import java.util.Arrays;

public class SortingNaturals {
    public static int[] sort(int[] array){
        int size = array.length-1;
        int sorted = array[0];

        if(size == 1){
            return array;
        }

        for (int i = 1; i <= size; i++) {

            /*int j = i;
            while (j>0 && array[j]<array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }*/
            //TODO: Complete sorting method
        }
        return array;
    }

    public static void main(String[] args) {
        int [] myArray = {6, 4, 13, 6, 1, 3, 7};
        int [] my2ndArray = {17};

        System.out.println("The sorted array will be printed here: "+ Arrays.toString(sort(myArray)));
    }
}
