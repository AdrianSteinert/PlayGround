package Algorithms.Factorial;

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        System.out.println("Dla jakiej liczby obliczyć silnię? \n");
        int silnia = new Scanner(System.in).nextInt();

        int a = 0, b = 1, suma=0;

        for (int i = 0; i <=silnia ; i++) {
            suma = b * a;
            a = suma;
            b++;
        }
            System.out.println("Silnia dla liczby "+silnia+" wynosi: "+suma);
    }
}
