package 약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 약수 구하기
// https://www.acmicpc.net/problem/2501
public class BOJ_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        for (int i = 2; i <= first; i++) {
            if (first % i == 0) {
                list.add(i);
            }
        }

        if (list.size() < second) {
            System.out.println(0);
        } else {
            System.out.println(list.get(second - 1));
        }
    }
}
