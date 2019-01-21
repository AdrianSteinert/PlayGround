package Algorithms.Arrays;

public class SquareMadeOfStars {
    public static void main(String[] args) {
        int length = 10;
        int height = 5;

        for (int i = 0; i <=length; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i <=height/2 ; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <length ; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i <=length; i++) {
            System.out.print("*");
        }
    }
}
