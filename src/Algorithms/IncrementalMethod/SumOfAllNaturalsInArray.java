package Algorithms.IncrementalMethod;

public class SumOfAllNaturalsInArray {
    public static int sumOfNaturals (int[] array){
        int size = array.length-1;
        int s = array[0];

        if (size == 1){
            return s;
        }

        for (int i = 1; i <= size; i++){
            s = s + array[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int[] myArray = {6, 4, 3, 2, 2, 1};
        int[] my2ndArray = {10};

        System.out.println("The sum of all naturals equals: "+sumOfNaturals(my2ndArray));
    }
}
