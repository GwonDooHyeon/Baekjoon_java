package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://cote.inflearn.com/contest/10/problem/05-01
// 올바른 괄호
public class InfLearn_05_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 : (()(()))(()
        String s = br.readLine();

        // 로직
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) answer = "NO";

        // 출력 : NO
        System.out.println(answer);
    }
}
