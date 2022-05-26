import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 5자리 숫자 입력 받음
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();
        int e = stdIn.nextInt();
        // 6번째 자리수를 담을 변수 result
        // 각 자리수의 제곱의 합을 10으로 나눈 나머지를 대입
        int result = (a*a + b*b + c*c + d*d + e*e) % 10;

        // 6번째 자리수 result 출력
        System.out.println(result);
    }
}