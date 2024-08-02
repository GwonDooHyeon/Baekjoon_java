package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/9012
// 괄호
public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean isValid = true;

            for (char x : str.toCharArray()) {
                if (x == '(') stack.push(x);
                else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) isValid = false;

            if (isValid) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);

    }
}
