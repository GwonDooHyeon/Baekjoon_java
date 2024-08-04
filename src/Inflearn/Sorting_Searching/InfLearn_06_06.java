package Inflearn.Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/06-06
// 장난 꾸러기
public class InfLearn_06_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력:
        // 9
        // 120 125 152 130 135 135 143 127 160
        int studentCount = Integer.parseInt(br.readLine());
        int[] students = new int[studentCount];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < studentCount; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        int[] copyStudents = Arrays.copyOf(students, studentCount);
        Arrays.sort(students);

        for (int i = 0; i < studentCount; i++) {
            if (copyStudents[i] != students[i]) {
                sb.append(i + 1).append(" ");
            }
        }

        // 출력: 3 8
        System.out.println(sb);
    }
}
