package Algorithms.Binary;

public class BinaryGap {
    public static int solution1(int n){
        int maxGap = 0;
        int priorIndex1 = 0;

        while (n != 0) {
            int index1 = Integer.numberOfTrailingZeros(n);
            int zeroGap = index1 - priorIndex1 - 1;
            if (zeroGap > maxGap) {
                maxGap = zeroGap ;
            }
            priorIndex1 = index1;
            n &= n - 1; // Remove the lowest bit;
        }
        return maxGap;
    }

    // 100% Solution!!!
    public static int solution2 (int N){
        int max = 0;
        int current = -100;

        while(N > 0){
            if (N % 2 == 0){
                current++;
            }
            else{
                if (current > max){
                    max = current;
                }
                current = 0;
            }
            N /= 2;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution1(32));
    }
}
