package Algorithms.SortingAlgorithms;

public class SortingAlgorithms {

    private int[] myArray = new int[50];
    private int arraySize = 10;

    public void swapValues(int indexOne, int indexTwo){
        int tmp = myArray[indexOne];
        myArray[indexOne] = myArray[indexTwo];
        myArray[indexTwo] = tmp;
    }

    public void generateRandomArray (){

        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int)(Math.random()*10)+10;
            //  Math.random - Returns a double value with a positive sign,
            //  greater than or equal to 0.0 and less than 1.0.
        }
    }

    public void printArray (){

        System.out.println("------------");
        System.out.println("Index| Value");
        System.out.println("------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("|  "+i+" | ");
            System.out.println(myArray[i]+"  |");
            System.out.println("------------");
        }
    }

    public void printHorzArray(int i, int j) {
        for (int n = 0; n < 51; n++)
            System.out.print("-");
            System.out.println();
        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");
        for (int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + myArray[n] + " ");
        }
        System.out.println("|");
        for (int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        // END OF FIRST PART
        // ADDED FOR BUBBLE SORT
        if (j != -1) {
            // ADD THE +2 TO FIX SPACING
            for (int k = 0; k < ((j * 5) + 2); k++) System.out.print(" ");
            System.out.print(j);
        }
        // THEN ADD THIS CODE
        if (i != -1) {
            // ADD THE -1 TO FIX SPACING
            for (int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }

    public void binarySearchForValue (int value){
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        while (lowIndex<=highIndex){
            int middleIndex = (highIndex+lowIndex)/2;
            if (myArray[middleIndex]<value){
                lowIndex = middleIndex +1;
            } else if (myArray[middleIndex]>value){
                highIndex = middleIndex-1;
            } else {
                System.out.println("Found a value for: "+value+" at index "+middleIndex);
                lowIndex = highIndex+1;
            }
            printHorzArray(middleIndex, -1);
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - 1; j++) {
                if (myArray[j] < myArray[j+1]){
                    swapValues(j, j+1);
                    printHorzArray(i, j);
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < arraySize; i++) {
            int minimumValue = i;
            for (int j = i; j < arraySize; j++) {
                if(myArray[minimumValue] > myArray[j]){
                    minimumValue = j;
                }
            }
            swapValues(i, minimumValue);
        }
    }

    public void insertionSort(){
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = myArray[i];
            while ((j>0)&&(myArray[j-1])>toInsert){
                myArray[j] = myArray[j-1];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        SortingAlgorithms anArray = new SortingAlgorithms();
        anArray.generateRandomArray();
        anArray.printArray();
        System.out.println("Printing te sorted array: ");
        anArray.selectionSort();
        anArray.printArray();
//        anArray.binarySearchForValue(11);
    }
}
