package Algorithms.Codility;

public class PassingCars {
    //works 100%!!
    public static int solution(int[] A) {
        int N = A.length;
        int P[] = new int[N + 1];
        int pairCounter = 0;

        for (int k = 1; k <= N; k++) {
            P[k] = P[k - 1] + A[k - 1];
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                pairCounter += P[N] - P[i];
                if (pairCounter > 1000000000) {
                    return -1;
                }
            }
        }
        return pairCounter;
    }

    public static void main(String[] args) {
        System.out.println("Should return 5 : "+solution(new int[]{0, 1, 0, 1, 1}));
    }
}
