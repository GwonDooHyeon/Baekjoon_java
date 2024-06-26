package Inflearn.TwoPointer_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/03-02
// 공통원소 구하기
public class InfLearn_03_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        // 5
        // 1 3 9 5 2
        // 5
        // 3 2 5 7 8
        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        // 로직
        List<Integer> list = new LinkedList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int lt = 0;
        int rt = 0;
        while (lt < n1 && rt < n2) {
            if (arr1[lt] == arr2[rt]) {
                list.add(arr1[lt++]);
                rt++;
            } else if (arr1[lt] < arr2[rt]) {
                lt++;
            } else {
                rt++;
            }
        }

        // 출력 : 2 3 5
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
