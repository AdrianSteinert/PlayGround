package Algorithms.Arrays;

public class ReversedTriangle {
    public static void main(String[] args) {
        int length = 16;
        int height = 10;

        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                }
                for (int k = i+1; k < length-i; k++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
