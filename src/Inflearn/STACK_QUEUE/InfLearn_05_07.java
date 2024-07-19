package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://cote.inflearn.com/contest/10/problem/05-07
// 교육과정 설계
public class InfLearn_05_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // CBA
        // CBDAGE
        String need = br.readLine();
        String plan = br.readLine();
        Queue<Character> queue = new LinkedList<>();
        for (char x : need.toCharArray()) {
            queue.offer(x);
        }

        // 로직
        String answer = "YES";
        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (queue.poll() != x) {
                    answer = "NO";
                }
            }
        }

        if (!queue.isEmpty()) answer = "NO";

        // 출력: YES
        System.out.println(answer);
    }
}
