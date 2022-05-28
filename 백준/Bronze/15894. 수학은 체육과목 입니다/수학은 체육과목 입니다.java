import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 가장 아랫부분의 정사각형 개수 n 입력받음
        long n = stdIn.nextInt();
        // n번째 둘레(f(n))와 n+1번째 둘레(f(n++1))의 관계
        // n+1번째값 = n번째값 - n(n번째 줄의 맨 아래 줄) + 1(n+1번째 줄의 맨 위 길이) + 2 (양 사이드) + n+1(n+1번째 줄의 맨 아래 길이)
        // => f(n+1) = f(n) + 4
        // 4 -> 8 -> 12 -> 16 -> ...
        // f(n) = 4 * n

        // 맨 아래 n개의 도형이 있을 때 둘레
        System.out.println(n * 4);
    }
}