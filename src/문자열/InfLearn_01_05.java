package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/01-05
// 특정 문자 뒤집기
public class InfLearn_01_05 {
    public static void main(String[] args) throws IOException {
        // 입력 : a#b!GE*T@S
        // 출력 : S#T!EG*b@a
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        int lt = 0;
        int rt = sb.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(sb.charAt(lt))) lt++;
            else if (!Character.isAlphabetic(sb.charAt(rt))) rt--;
            else {
                char tmp = sb.charAt(lt);
                sb.setCharAt(lt, sb.charAt(rt));
                sb.setCharAt(rt, tmp);
                lt++;
                rt--;
            }
        }

        System.out.println(sb.toString());
    }
}
