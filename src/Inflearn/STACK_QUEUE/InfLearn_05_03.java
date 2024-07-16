package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/05-03
// 크레인 인형뽑기(카카오)
public class InfLearn_05_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 5
        // 0 0 0 0 0
        // 0 0 1 0 3
        // 0 2 5 0 1
        // 4 2 4 4 2
        // 3 5 1 3 1
        // 8
        // 1 5 3 5 1 2 1 4
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int moveCount = Integer.parseInt(br.readLine());
        int[] moves = new int[moveCount];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < moveCount; i++) {
            moves[i] = Integer.parseInt(st2.nextToken());
        }

        // 로직
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int temp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        // 출력 4
        System.out.println(answer);
    }
}
