package 직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3009
// 네 번째 점
public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        Map<Integer, Integer> xmap = new HashMap<>();
        Map<Integer, Integer> ymap = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            xmap.put(x, xmap.getOrDefault(x, 0) + 1);

            int y = Integer.parseInt(st.nextToken());
            ymap.put(y, ymap.getOrDefault(y, 0) + 1);
        }

        int x = 0;
        for (Integer key : xmap.keySet()) {
            if (xmap.get(key) == 1) {
                x = key;
            }
        }

        int y = 0;
        for (Integer key : ymap.keySet()) {
            if (ymap.get(key) == 1) {
                y = key;
            }
        }

        System.out.println(x + " " + y);
    }
}
