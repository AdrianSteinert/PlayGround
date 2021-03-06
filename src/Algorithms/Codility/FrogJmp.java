package Algorithms.Codility;

public class FrogJmp {

    //this solution1 works only 1/3 % of the time...
    public static int solution1(int Xposition, int Ydestination, int Distance){
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

    // this works 100%!!!
    public static int solution2 (int X, int Y, int D){
        return (Y - X + D - 1)/D;
    }

    // and this solution1...
    public static int solution3 (int X, int Y, int D){
        if((Y-X) % D == 0)
            return (Y-X)/D;
        else
            return (Y-X)/D+1;
    }

    public static void main(String[] args) {
        System.out.println(solution2(10, 85, 30));
    }
}
