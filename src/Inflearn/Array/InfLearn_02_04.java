package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://cote.inflearn.com/contest/10/problem/02-04
// 피보나치 수열
public class InfLearn_02_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
