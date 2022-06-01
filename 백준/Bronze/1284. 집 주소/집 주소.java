// 백준 문제 1284 집 주소

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 집 주소들을 담을 list 선언
        ArrayList<String> address = new ArrayList<>();
        // 집 주소를 하나씩 입력 받을 변수 선언
        String a;

        while (true) {
            // 집 주소를 입력받아서 변수에 저장
            a = stdIn.nextLine();
            // 집 주소 변수에 0이 입력될 때까지 반복한다
            if (a.equals("0")) break;
            // 집 주소 변수를 리스트에 추가
            address.add(a);
        }
        // 집 주소 리스트 개수만큼 반복 -> 향상된 for 문
        for (String s : address) {
            // 필요한 칸 수를 저장할 변수 0으로 초기화
            int count = 0;
            // 해당 인덱스의 String의 길이 만큼 반복
            for (int i = 0; i < s.length(); i++) {
                // 만약에 인덱스의 값이 0일 경우 -> 4칸 더한다
                if(s.charAt(i) == '0') count += 4;
                // 만약에 인덱스의 값이 1일 경우 -> 2칸 더한다
                else if(s.charAt(i) == '1') count += 2;
                // 0, 1이 아닌 다른 숫자일 경우 -> 3칸 더한다
                else count += 3;
            }
            // 양끝과 숫자 사이 여백 개수도 계산 -> 숫자 개수 + 1만큼 더한다
            count += (s.length() + 1);
            // 필요한 칸 출력
            System.out.println(count);
        }
    }
}
