package Algorithms.Codility;

public class TapeEquilibrium {
    public static int solution(int[] A){
        int total = 0;

        for (int i = 0; i < A.length; i++)
            total += A[i];

        int diff = Integer.MAX_VALUE;
        int prev = 0;
        int next = total;

        for (int p = 1; p < A.length; p++) {
            prev += A[p - 1];
            next = total - prev;
            diff = Math.min(diff, Math.abs(prev - next));
        }

        return diff;
    }

    public static void main(String[] args) {
        int [] myArray = {3, 1, 2, 4, 3};
        int myArraySize = myArray.length;

        System.out.println(solution(myArray));
//        System.out.println(myArraySize);
    }
}
