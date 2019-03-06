
package Algorithms.Codility;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        //works in 18%
        int count[] = new int[X+1];

        for (int k = 0; k < A.length; k++) {
            count[A[k]] = 1;

            if (A[k] == X) {

                for (int i = 1; i <= X; i++) {

                    if (count[i] != 0) {
                        return k;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}
