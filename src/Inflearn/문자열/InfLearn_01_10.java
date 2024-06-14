package Inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/01-10
// 가장 짧은 문자거리
public class InfLearn_01_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = 100;

        // 입력 : teachermode e
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken(); // 11
        char c = st.nextToken().charAt(0);
        int[] arr = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            arr[i] = p;
        }

        p = 100;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                arr[i] = Math.min(arr[i], p);
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
