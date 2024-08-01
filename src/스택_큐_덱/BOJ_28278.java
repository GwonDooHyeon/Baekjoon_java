package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/28278
// 스택2
public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            int operation = Integer.parseInt(command[0]);

            switch (operation) {
                case 1:
                    int pushData = Integer.parseInt(command[1]);
                    stack.push(pushData);
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }
}
