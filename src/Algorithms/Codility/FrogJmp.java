package Algorithms.Codility;

public class FrogJmp {
    public static int solution(int Xposition, int Ydestination, int Distance){
        if (Ydestination <= 0 || Distance <=0){
            return 0;
        }

        int loopCounter = 0;
        for (int i = 1; i <= Ydestination; i++) {
            Xposition = Xposition+(i*Distance)-((i-1)*Distance);
            loopCounter++;
            if (Xposition >= Ydestination){
                break;
            }
        }
        return loopCounter;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }
}
