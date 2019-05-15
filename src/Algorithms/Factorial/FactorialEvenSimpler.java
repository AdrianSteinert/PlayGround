package Algorithms.Factorial;

public class FactorialEvenSimpler {
    public int factorial(int n){
        if (n < 2)
            return 1;
        return factorial(n - 1) * n;
    }
    public static void main(String[] args) {
        FactorialEvenSimpler fes = new FactorialEvenSimpler();
        int liczba = 5;
        System.out.println("Silnia od liczby "+liczba+" wynosi: "+fes.factorial(liczba));
    }
}

