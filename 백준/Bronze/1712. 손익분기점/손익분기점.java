// 백준 문제 1712 손익분기점

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 고정비용 A만원
        // 1대의 노트북을 생산하는데 들어가는 비용 B만원
        // 노트북 가격 C만원
        // 입력: A,B,C는 21억 이하의 자연수 (long형)
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        // 수익분기점 = 총수입 > 총비용 되는 지점
        // 총수입 = C * 판매수
        // 총비용 = A + B * 판매수
        // 수익분기점이 존재하지 않을 경우 -1 출력
        if(b>=c) System.out.println(-1);
        // 수익분기점이 존재할 경우
        else {   // 총수입 = 총비용 지점의 판매수(i)
            // => i = A/(C-B)
            double i = a / (c - b);
            // 수익분기점의 판매량 출력
            System.out.println((long) (i + 1));
        }
    }
}
