package Inflearn.MAP_SET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://cote.inflearn.com/contest/10/problem/04-04
// 모든 아나그램 찾기
public class InfLearn_04_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // bacaAacba
        // abc
        String s = br.readLine();
        String t = br.readLine();
        int k = t.length();

        // 로직
        Map<Character, Integer> repeatMap = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        int lt = 0;
        int cnt = 0;

        // 첫번째 검증 로직
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            repeatMap.put(s.charAt(i), repeatMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (map.equals(repeatMap)) cnt++;

        // 슬라이딩 윈도우 이용 로직
        for (int rt = k; rt < s.length(); rt++) {
            char right = s.charAt(rt);
            char left = s.charAt(lt);
            // 오른쪽 추가
            repeatMap.put(right, repeatMap.getOrDefault(right, 0) + 1);
            // 왼쪽 제거
            repeatMap.put(left, repeatMap.get(left) - 1);
            if (repeatMap.get(left) == 0) repeatMap.remove(left);
            lt++;
            if (map.equals(repeatMap)) cnt++;
        }

        // 출력 : 3
        System.out.println(cnt);
    }
}
