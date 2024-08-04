package Inflearn.Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// https://cote.inflearn.com/contest/10/problem/06-07
// 좌표 정렬
public class InfLearn_06_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력:
        // 5
        // 2 7
        // 1 3
        // 1 2
        // 2 5
        // 3 6
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        // 로직
        Collections.sort(list);

        // 출력
        // 1 2
        // 1 3
        // 2 5
        // 2 7
        // 3 6
        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }


    }
}

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
