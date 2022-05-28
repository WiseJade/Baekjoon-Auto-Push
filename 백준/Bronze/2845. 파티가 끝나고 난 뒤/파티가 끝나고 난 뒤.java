import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int people = stdIn.nextInt();
        int area = stdIn.nextInt();
        int[] news = new int[5];
        for(int i = 0; i < 5; i++) {
            news[i] = stdIn.nextInt();
        }
        for(int i = 0; i < 5; i ++) {
            System.out.print(news[i] - people*area + " ");
        }
    }
}