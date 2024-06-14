package Inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-07
// 회문 Inflearn.문자열
public class InfLearn_01_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder(str);

        if (str.contentEquals(sb.reverse())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
