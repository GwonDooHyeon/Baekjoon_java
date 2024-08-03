package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/4949
// 균형잡힌 세상
public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            for (char x : str.toCharArray()) {
                switch (x) {
                    case '(':
                    case '[':
                        stack.push(x);
                        break;
                    case ')':
                        if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                        else stack.push(x);
                        break;
                    case ']':
                        if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                        else stack.push(x);
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}
