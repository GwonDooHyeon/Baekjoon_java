package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/05-08
// 응급실
public class InfLearn_05_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 5 2
        // 60 50 70 80 90
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        Queue<Patient> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(i, Integer.parseInt(st1.nextToken())));
        }

        // 로직
        int answer = 0;
        while (!queue.isEmpty()) {
            Patient current = queue.poll();
            boolean hasGreaterPriority = false;

            for (Patient patient : queue) {
                if (patient.priority > current.priority) {
                    hasGreaterPriority = true;
                    break;
                }
            }

            if (hasGreaterPriority) {
                queue.offer(current);
            } else {
                answer++;
                if (m == current.id) {
                    System.out.println(answer);
                }
            }
        }
    }
}

class Patient {
    int id;
    int priority;

    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}


