package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/01-03
// 문장 속 단어
public class InfLearn_01_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.MIN_VALUE;
        String maxStr = "";

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            int len = str.length();

            if (len > m) {
                m = len;
                maxStr = str;
            }
        }

        System.out.println(maxStr);
    }
}
