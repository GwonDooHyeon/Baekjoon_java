package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1316
// 그룹 단어 체커
public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 갯수
        int n = Integer.parseInt(br.readLine());

        // 그룹 단어의 갯수
        int groupWordCount = 0;

        // 로직
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        // 출력 3
        System.out.println(groupWordCount);

        br.close();
    }

    // 그룹단어 확인 메소드
    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (visited[currentChar - 'a'] && (i > 0 && word.charAt(i - 1) != currentChar)) {
                return false;
            }
            visited[currentChar - 'a'] = true;
        }

        return true;
    }

}
