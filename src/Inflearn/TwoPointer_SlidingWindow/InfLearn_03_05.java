package Inflearn.TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/03-05
// 연속된 자연수의 합
public class InfLearn_03_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 15
        int n = Integer.parseInt(br.readLine());

        // 로직
        int k = n / 2 + 1;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = i + 1;
        }
        int lt = 0;
        int sum = 0;
        int cnt = 0;
        for (int rt = 0; rt < k; rt++) {
            sum += arr[rt];
            if (sum == n) cnt++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) cnt++;
            }
        }

        // 출력 : 3
        System.out.println(cnt);
    }
}
