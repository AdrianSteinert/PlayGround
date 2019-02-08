package Algorithms.Codility;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] array, int k) {
        if (array == null)
            return null;

        int arrayLength = array.length;

        int[] sol = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sol[(i + k) % arrayLength] = array[i];
        }

        return sol;
    }

    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4};
        int [] my2ndArray = {3, 8, 9, 7, 6};

        System.out.println(Arrays.toString(my2ndArray));

        CyclicRotation arrayRotation = new CyclicRotation();

        System.out.println(Arrays.toString(arrayRotation.solution(my2ndArray, 4)));
    }
}
