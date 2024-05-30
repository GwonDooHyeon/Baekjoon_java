package 약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
//https://www.acmicpc.net/problem/1978
public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        // 1. 에라토스테네스의 체 사용 x
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) count++;
        }
        System.out.println(count);
    }

    // 1. 에라토스테네스의 체 사용 x
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

