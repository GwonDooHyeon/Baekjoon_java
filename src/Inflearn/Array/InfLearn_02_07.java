package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/02-07
// 점수 계산
public class InfLearn_02_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 10
        // 1 0 1 1 1 0 0 1 1 0
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0; // 합계

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                sum += map.get(arr[i]);
            } else {
                map.clear();
            }
        }

        // 출력 10
        System.out.println(sum);

    }

}
