// 백준 문제 5596 시험 점수

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 민국이 점수 입력
        int mingukSum = 0;
        for (int i = 0; i < 4; i++) {
            mingukSum += stdIn.nextInt();
        }
        // 만세 점수 입력
        int manseaSum = 0;
        for (int i = 0; i < 4; i++) {
            manseaSum += stdIn.nextInt();
        }
        System.out.println(Math.max(mingukSum, manseaSum));
    }
}
