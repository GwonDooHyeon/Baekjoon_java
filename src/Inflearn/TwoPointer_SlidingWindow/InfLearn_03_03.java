package Inflearn.TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/03-03
// 최대 매출
public class InfLearn_03_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 10 3
        // 12 15 11 20 25 10 20 19 13 15
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // 로직
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int rt = k; rt < n; rt++) {
            sum = sum + (arr[rt] - arr[rt - k]);
            max = Math.max(max, sum);
        }

        // 출력
        System.out.println(max);
    }
}
