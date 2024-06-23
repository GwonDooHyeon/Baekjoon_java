package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/02-09
// 격자판 최대합
public class InfLearn_02_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        // 5
        // 10 13 10 12 15
        // 12 39 30 23 11
        // 11 25 50 53 15
        // 19 27 29 37 27
        // 19 13 30 13 19
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE; // 최댓값
        int row; // 행
        int column; // 열

        // 로직
        // 행열의 합
        for (int i = 0; i < n; i++) {
            row = 0;
            column = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
                column += arr[j][i];
            }
            max = Math.max(max, row);
            max = Math.max(max, column);
        }

        int cross1 = 0;
        int cross2 = 0;
        // 대각선 합
        for (int i = 0; i < n; i++) {
            cross1 += arr[i][i];
            cross2 += arr[i][n - i - 1];
        }
        max = Math.max(max, cross1);
        max = Math.max(max, cross2);

        // 출력 : 155
        System.out.println(max);
    }
}
