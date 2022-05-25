import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int horizon, length;

        if((double)x < (double)w / 2) {
            horizon = x;
        }
        else horizon = w - x;

        if((double)y < (double)h / 2) {
            length = y;
        }
        else length = h - y;

        System.out.print(Math.min(horizon, length));
    }
}