package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/02-08
// 등수 구하기
public class InfLearn_02_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 5
        // 87 89 92 100 76
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        int[] rankArr = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            rankArr[i] = rank;
        }

        // 출력
        // 4 3 2 1 5
        for (int i : rankArr) {
            System.out.print(i + " ");
        }
    }
}
