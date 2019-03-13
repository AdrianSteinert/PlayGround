package Algorithms.Codility;

public class MinAvgTwoSlice {

    // 60% score!
    public static int solution(int[] A){
        int N = A.length;
        double best_avg = 20000;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int sum = A[i];
            for (int j = i+1; j < N; j++) {
                sum += A[j];
                // for (int k = i; k <= j; k++) {
                //     sum += A[k];
                // }
                double avg = (double)sum / (j - i + 1);

                if (avg < best_avg) {
                    best_avg = avg;
                    answer = i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Should return 1 : "+solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
