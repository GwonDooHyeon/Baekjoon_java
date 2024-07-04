package Inflearn.MAP_SET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://cote.inflearn.com/contest/10/problem/04-02
// 아나그램(해쉬)
public class InfLearn_04_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // AbaAeCe
        // baeeACA
        String str1 = br.readLine();
        String str2 = br.readLine();

        // 로직
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                answer = "NO";
                break;
            }
            map.put(x, map.get(x) - 1);
        }

        // 출력 : YES , NO
        System.out.println(answer);
    }
}
