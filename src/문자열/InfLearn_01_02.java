package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-02
// 대소문자 변환
public class InfLearn_01_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                sb.append(c);
            } else {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
