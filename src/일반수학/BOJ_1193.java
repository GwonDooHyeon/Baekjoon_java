package 일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분수찾기
// https://www.acmicpc.net/problem/1193
public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0; // 대각선 라인 번호
        int prevSum = 0; // 숫자의 개수 누적 합

        // X가 속한 대각선 라인을 찾는다
        while (prevSum < n) {
            count++;
            prevSum += count;
        }

        int bunza;
        int bunmo;

        int offset = prevSum - n; // 라인의 끝에서 X까지의 거리

        if (count % 2 == 0) { // 짝수 라인
            bunza = count - offset;
            bunmo = 1 + offset;
        } else { // 홀수 라인
            bunza = 1 + offset;
            bunmo = count - offset;
        }

        System.out.println(bunza + "/" + bunmo);
        }
    }
