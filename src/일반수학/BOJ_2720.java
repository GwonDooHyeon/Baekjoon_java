package 일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세탁소 사장 동혁
// https://www.acmicpc.net/problem/2720
public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());
        int[] changes = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine()); // 거스름돈
            int[] result = new int[4];

            for (int j = 0; j < changes.length; j++) {
                result[j] = c / changes[j];
                c = c % changes[j];
            }

            for (int res : result) {
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
