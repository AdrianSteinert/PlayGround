package Algorithms.Codility;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        int mod = 0;

        if (K > 2000000001) {
            return -1;
        }

        if (A == B) {
            return 0;
        } else {
            for (int i = 0; i < B - A; i++) {
                if (i % K == 0) {
                    mod += 1;
                }
            }
        }
        return mod;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }
}
