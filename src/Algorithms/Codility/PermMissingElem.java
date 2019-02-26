package Algorithms.Codility;

public class PermMissingElem {
        public static int solution (int [] A){
        int N = A.length+1;
        int missingElem = N*(N+1)/2;

        for (int i =0; i < A.length; i++) {
            missingElem -= A[i];
        }
        return missingElem;
    }


    public static void main(String[] args) {
        System.out.println("Should return 4 : "+solution(new int [] {2, 3, 1, 5}));
        System.out.println("Should return 6 : "+solution(new int [] {3, 2, 1, 4, 5}));
    }
}
