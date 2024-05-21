// https://www.acmicpc.net/problem/2292
// 벌집
import java.io.*;
public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1; // 방 갯수
        int range = 2; // 범위

        if(n == 1) {
            System.out.println(1);
        } else{
            while (range <= n) {
                range = range + count * 6;
                count++;
            }
            System.out.println(count);
        }
    }
}

