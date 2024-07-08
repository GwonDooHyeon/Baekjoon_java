package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://cote.inflearn.com/contest/10/problem/05-02
// 괄호문자제거
public class InfLearn_05_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        // (A(BC)D)EF(G(H)(IJ)K)LM(N)
        String str = br.readLine();

        // 로직
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(x);
            }
        }
        for (char x : stack) {
            sb.append(x);
        }

        // 출력 : EFLM
        System.out.println(sb);
    }
}
