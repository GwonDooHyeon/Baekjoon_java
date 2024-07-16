package Inflearn.STACK_QUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://cote.inflearn.com/contest/10/problem/05-04
// 후위식 연산(postfix)
public class InfLearn_05_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력: 352+*9-
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - '0');
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                if (x == '-') stack.push(lt - rt);
                if (x == '*') stack.push(lt * rt);
                if (x == '/') stack.push(lt / rt);
            }
        }

        // 출력: 12
        System.out.println(stack.pop());
    }
}
