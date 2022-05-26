import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 상근이가 알고 있는 1제곱미터 당 사람 수 input
        int people = stdIn.nextInt();
        // 파티장의 넓이 input
        int area = stdIn.nextInt();
        // 5개의 신문
        int[] news = new int[5];
        // 5개의 신문의 예상 인원 수 입력 받음
        for(int i = 0; i < 5; i++) {
            news[i] = stdIn.nextInt();
        }
        // 5개의 신문이 상근이 예상과 몇명 틀리게 작성했는지 계산
        for(int i = 0; i < 5; i++) {
            System.out.print(news[i] - people * area + " ");
        }
    }
}