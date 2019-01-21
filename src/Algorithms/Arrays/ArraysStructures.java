package Algorithms.Arrays;

public class ArraysStructures {

    private int [] myArray = new int[50];
    private int arraySize = 10;

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

    public int getValueAtIndex (int index) {
        if (index<arraySize) return myArray[index];
        return 0;
    }

    public boolean doesArrayContainsThisValue(int value){
        boolean containsValue = false;
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == value){
                containsValue = true;
            }
        }
        return containsValue;
    }

    public void deleteIndex (int index){
        if (index<arraySize)
        for (int i = index; i <arraySize ; i++) {
            myArray[i] = myArray[i+1];
        }
        arraySize--;
    }

    public void addValue (int value) {
        if (arraySize < 50){
            myArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue (int value){
        boolean valueInArray = false;
        String indexesWithValue = " ";
        System.out.println("The value was found in the following: ");
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == value){
                valueInArray = true;
                System.out.println(i+" ");
//                indexesWithValue += i+" ";
                indexesWithValue = indexesWithValue+i+" ";
            }
        }
    if (!valueInArray){
        indexesWithValue = "None";
        System.out.println(indexesWithValue);
    }
        System.out.println();
        return indexesWithValue;
    }


    public static void main(String[] args) {

        ArraysStructures newArray = new ArraysStructures();

        newArray.generateRandomArray();
        newArray.printArray();

        System.out.println("The value at index: "+newArray.getValueAtIndex(4));
        System.out.println();
        System.out.println("Does the array contain this value? "+newArray.doesArrayContainsThisValue(16));
        System.out.println();
        /*newArray.deleteIndex(2);
        newArray.printArray();
        newArray.addValue(6);
        newArray.printArray();*/
        newArray.linearSearchForValue(16);
}
}
