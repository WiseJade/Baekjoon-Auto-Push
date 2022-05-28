import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean[][] boo;

    public static void main(String[] args) throws IOException {
        // 입력 스트림
        Scanner sc = new Scanner(System.in);

        // m(줄 개수) * n(칸 개수) 직사각형 크기 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        // int형 2차원 배열 board 선언
        // W(white):1 , B(Black):0
        // board의 크기: 전체 직사각형 크기(m * n)
        char[][] board = new char[n][m];

        // 가로줄 한 줄 씩 입력받을 변수 line
        String line;

        // 다시 칠해야하는 정사각형 개수의 최솟값
        // 초기값은 직사각형내 전체 사각형 개수로 설정
        int result = n * m;

        // 가로줄 한줄씩 m번 입력받음
        for(int i = 0; i < n; i++) {
            line = sc.next();
            // 입력받은 line을 board에 하나씩 입력해줌
            for(int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        // board[][]의 요소 값을 비교할 변수 선언
        // black은 board[0][0]이 Black인 경우
        // white은 board[0][0]이 White인 경우
        char black = 'B';
        char white = 'W';

        // 체스판 사각형 바꾸는 개수 선언
        int countB = 0;
        int countW = 0;


        // 만들 수 있는 모든 8X8 체스판 확인
        for(int i = 0; i <= n - 8; i++) {
            for(int j = 0; j <= m - 8; j++) {

                // 확인할 8x8칸의 모든 체스칸 순회
                for(int k = 0; k < 8; k++) {
                    for(int l = 0; l < 8; l++) {
                        // 체스판의 맨위, 맨왼쪽이 W로 설정할 경우 바꿔야하는 요소 계산
                        if(board[k + i][l + j] != white) {
                            countW++;
//                            System.out.println(board[k+i][l+j]);

                        }
                        // 체스판의 맨위, 맨왼쪽이 B로 설정할 경우 바꿔야하는 요소 계산
                        if(board[k + i][l + j] != black) {
                            countB++;

                        }
                        // black과 white 값 바꿔줌
                        char temp = white;
                        white = black;
                        black = temp;
                    }
                    // black과 white 값 바꿔줌
                    char temp = white;
                    white = black;
                    black = temp;
                }

                // countB와 countW, result 중 더 작은 수를 result에 넣어줌
                result = Math.min(Math.min(countB, countW), result);

                // countB, countW 변수 초기화
                countB = 0;
                countW = 0;
            }
        }
        // result 출력
        System.out.println(result);
    }
}
