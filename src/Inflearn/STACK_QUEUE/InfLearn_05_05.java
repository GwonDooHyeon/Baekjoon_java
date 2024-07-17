package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://cote.inflearn.com/contest/10/problem/05-05
// 쇠막대기
public class InfLearn_05_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력: ()(((()())(())()))(())
        String str = br.readLine();

        // 로직
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        // 출력: 17
        System.out.println(answer);
    }
}
