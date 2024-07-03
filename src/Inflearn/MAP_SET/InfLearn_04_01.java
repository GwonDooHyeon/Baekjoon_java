package Inflearn.MAP_SET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://cote.inflearn.com/contest/10/problem/04-01
// 학급 회장(해쉬)
public class InfLearn_04_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 15
        // BACBACCACCBDEDE
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // 로직
        Map<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }

        // 출력 : C
        System.out.println(answer);

    }
}
