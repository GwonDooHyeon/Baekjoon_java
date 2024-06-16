package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/02-03
// 가위 바위 보
public class InfLearn_02_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(st2.nextToken());
        }

        // 1 : 가위, 2: 바위, 3: 보
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                System.out.println("D");
            } else if (arrA[i] == 1 && arrB[i] == 3 || arrA[i] == 2 && arrB[i] == 1 || arrA[i] == 3 && arrB[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
