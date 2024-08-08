package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12789
// 도키도키 간식드리미
public class BOJ_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 5
        // 5 4 1 3 2
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        // 로직
        String answer = "Nice";
        int now = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() == now) {
                now++;
                queue.poll();
            } else if (!stack.isEmpty() && stack.peek() == now) {
                now++;
                stack.pop();
            } else {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == now) {
                now++;
                stack.pop();
            } else {
                answer = "Sad";
                break;
            }
        }

        // 출력: Nice
        System.out.println(answer);
    }
}
