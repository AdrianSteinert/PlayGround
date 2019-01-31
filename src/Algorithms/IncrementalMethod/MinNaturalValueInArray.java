package Algorithms.IncrementalMethod;

public class MinNaturalValueInArray {
    public static int minValue (int[] array){
        int size = array.length-1;
        int min = array[0];

        if (size == 1){
            return min;
        }

        for (int i = 1; i <= size; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = {62, 13, 9, 11, 33, 8, 14};
        int[] my2ndArray = {9};

        System.out.println("The lowest value present in your array is: "+minValue(myArray));

    }
}
