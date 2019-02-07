package Algorithms.Arrays;

import java.util.Arrays;

public class ReverseValuesInArray {
    public static int[] reverseValues (int [] array){
        int size = array.length-1;
        int reversingSize = size;

        if (size == 1){
            return array;
        }

        int [] reversedArray = new int[array.length];
        int temporary = 0;
        for (int i = 0; i <size ; i++) {
            temporary = array[reversingSize];
            reversedArray[i] = temporary;
            reversingSize--;
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int [] myArray = {0, 9, 14, 85, 106, 227, 573, 1088};
        int [] my2ndArray = {11};

        System.out.println(Arrays.toString(reverseValues(myArray)));

    }

}
