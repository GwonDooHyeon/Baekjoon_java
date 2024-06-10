package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-09
// 숫자만 추출
public class InfLearn_01_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        Integer num = Integer.parseInt(sb.toString());
        System.out.println(num);
    }
}
