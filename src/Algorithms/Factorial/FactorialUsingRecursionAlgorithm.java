package Algorithms.Factorial;

public class FactorialUsingRecursionAlgorithm {
    public static int factorial (int factorlialValue){
        if(factorlialValue == 0 || factorlialValue == 1){
            return 1;
        }
        else {
            int temporary = factorial(factorlialValue - 1);
            int sum = factorlialValue * temporary;
            System.out.println("Factorial for number "+factorlialValue+" equals: "+sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
