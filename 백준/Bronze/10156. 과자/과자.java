// 백준 문제 10156 과자

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 과자 한 개의 가격 k
        int k = stdIn.nextInt();
        // 사려는 과자의 개수 n
        int n = stdIn.nextInt();
        // 현재 동수가 가진 돈 m
        int m = stdIn.nextInt();
        // 만약에 동수가 가진 돈이 (과자 한개의 가격) * (사려는 과자의 개수) 보다 같거나 클 경우
        if(m >= k * n) {
            System.out.println(0);
        }
        else {  // 더 작을 경우 엄마한테 받아야 하는 돈 액수 출력
            System.out.println(k * n - m);
        }
    }
}
