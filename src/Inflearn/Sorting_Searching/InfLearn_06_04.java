package Inflearn.Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/06-04
// Least Recently Used
public class InfLearn_06_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> cache = new LinkedList<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int cacheSize = Integer.parseInt(st1.nextToken()); // 캐시 크기
        int taskCount = Integer.parseInt(st1.nextToken()); // 작업의 갯수

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] tasks = new int[taskCount];
        for (int i = 0; i < taskCount; i++) {
            tasks[i] = Integer.parseInt(st2.nextToken());
        }

        for (int task : tasks) {
            if (cache.contains(task)) {
                cache.remove(cache.indexOf(task));
            }
            cache.addFirst(task);

            if (cache.size() > cacheSize) {
                cache.removeLast();
            }
        }

        for (int num : cache) {
            System.out.print(num + " ");
        }

    }
}
