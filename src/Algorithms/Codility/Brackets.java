package Algorithms.Codility;

import java.util.Stack;

public class Brackets {

    // 100 score!
    public static int solution(String S) {

        if (S.isEmpty())
            return 1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char character = S.charAt(i);
            if (stack.empty()){
                stack.push(character);
            } else {
                if (isMatch(stack.peek(), character)){
                    stack.pop();
                } else
                    stack.push(character);
            }
        }
        if (stack.empty())
            return 1;
        else
        return 0;
    }

    public static boolean isMatch (char ch1, char ch2 ){
        if (ch1 == '{' && ch2 == '}') return true;
        if (ch1 == '(' && ch2 == ')') return true;
        if (ch1 == '[' && ch2 == ']') return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Should return 0 : " + solution("([)()]"));
        System.out.println("Should return 1 : " + solution("{[()()]}"));

        // {} albo {()} albo {([])} albo {([(){}[](())])}
//        " (, [, ), (, ), ] "
//        " (, ), {, [, },
    }
}
