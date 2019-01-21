package Algorithms.Binary;

public class BinaryGap {
    public static int solution (int n){
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

    public static void main(String[] args) {
        System.out.println(solution(32));
    }
}
