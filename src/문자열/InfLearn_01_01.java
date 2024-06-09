package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-01
// 문자 찾기
public class InfLearn_01_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        char ch = Character.toUpperCase(br.readLine().charAt(0));
        int count = 0;

        for (char x : str.toCharArray()) {
            if (x == ch) {
                count++;
            }
        }

        System.out.println(count);
    }
}
