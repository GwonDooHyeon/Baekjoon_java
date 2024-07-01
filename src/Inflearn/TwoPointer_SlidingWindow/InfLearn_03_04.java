package Inflearn.TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/03-04
// 연속 부분 수열
public class InfLearn_03_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 8 6
        // 1 2 1 3 1 1 1 2
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
        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == k) cnt++;
            while (sum >= k) {
                sum -= arr[lt++];
                if (sum == k) cnt++;
            }
        }

        // 출력 : 3
        System.out.println(cnt);
    }
}
