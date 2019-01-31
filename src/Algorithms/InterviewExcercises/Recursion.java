package Algorithms.InterviewExcercises;

public class Recursion {
    public static int func (int a){
        if (a == 0 || a == 1){
            return 1;
        }
        if (a % 2 == 0){
            return func(a - 2)* 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing function: "+func(10));
    }
}
