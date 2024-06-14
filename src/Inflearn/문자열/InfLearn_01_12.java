package Inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-12
// 암호
public class InfLearn_01_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int n = Integer.parseInt(br.readLine()); // 4
        String str = br.readLine(); // #****###**#####**#####**##**
        String tmp = "";

        for (int i = 0; i < n; i++) {
            tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int answer = Integer.parseInt(tmp, 2);
            sb.append((char) answer);
            str = str.substring(7);
        }
        System.out.println(sb);
    }
}
