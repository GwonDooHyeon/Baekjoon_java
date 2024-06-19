package Inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://cote.inflearn.com/contest/10/problem/02-05
// 소수(에라토스테네스 체)
public class InfLearn_02_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(br.readLine()); // 20
        int primeCount = 0;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        for (int number = 2; number <= limit; number++) {
            if (isPrime[number]) {
                primeCount++;
                for (int multiple = number; multiple <= limit; multiple += number) {
                    isPrime[multiple] = false;
                }
            }
        }
        System.out.println(primeCount);

    }
}
