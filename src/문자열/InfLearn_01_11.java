package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-11
// 문자열 압축
public class InfLearn_01_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 : KKHSSSSSSSE , 출력 : K2HS7E
        // 입력 : KSTTTSEEKFKKKDJJGG1 , 출력 : KST3SE2KFK3DJ2G2
        String str = br.readLine();
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(str.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }
        System.out.println(sb);


    }
}
