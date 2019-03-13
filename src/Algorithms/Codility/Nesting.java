package Algorithms.Codility;

public class Nesting {
    public static int solution(String S) {
        if (S.isEmpty())
            return 1;

        char[] chars = S.toCharArray();
        int stack = 0;
        char openingBracket = '(';

        for (int i = 0; i < chars.length; i++) {
            //filling the stack with '('
            if (chars[i] == openingBracket){
                stack += 1;
            } else
            stack -= 1;

            if (stack < 0)
                return 0;
        }
        return stack == 0 ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println("Should return 1 : " + solution("(()(())())"));
        System.out.println("Should return 0 : " + solution("())"));

        //"((()"
        //")()())"
    }

    // 100% score!

    public static int solution2(String S) {
        int result = 0;
        char[] chars = S.toCharArray();

        for (char ch :
                chars) {
            if (ch == '(')
                result += 1;
            else
                result -= 1;
            if (result < 0) return 0;
        }
        return result == 0 ? 1 : 0;
    }
}
