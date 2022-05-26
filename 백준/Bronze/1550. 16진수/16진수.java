import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성 stdIn
        Scanner stdIn = new Scanner(System.in);
        
        // 출력할 10진수 int 변수 result 선언
        // stdIn 객체로 String 입력받음
        // String을 16진수로 변환
        int result = Integer.parseInt(stdIn.next(),16);
        System.out.println(result);
    }
}