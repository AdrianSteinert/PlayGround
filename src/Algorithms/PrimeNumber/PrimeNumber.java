package Algorithms.PrimeNumber;

public class PrimeNumber {
    private static void isPrime (int number)  {
        int tmp = 0;
        for (int i = 2; i <= number-1; i++) {
            if (number%i==0){
                tmp = tmp+1;
            }
        }
            if (tmp==0){
                System.out.println(number+" is prime!");
            } else {
                System.out.println(number+" is NOT a prime!");
            }

    }

    public static void main(String[] args) {
        isPrime(6);
    }
}
