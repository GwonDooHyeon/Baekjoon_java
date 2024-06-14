package Inflearn.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-08
// 유효한 팰린드롬
public class InfLearn_01_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase().replaceAll("[^a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(str);

        if (str.contentEquals(sb.reverse())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
