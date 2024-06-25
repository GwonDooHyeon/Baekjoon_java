package Inflearn.TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/03-01
// 두 배열 합치기
public class InfLearn_03_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        // 입력
        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            list.add(Integer.parseInt(st1.nextToken()));
        }

        int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }

}
