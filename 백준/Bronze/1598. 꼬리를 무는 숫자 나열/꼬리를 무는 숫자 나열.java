import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int from = stdIn.nextInt() - 1;
        int to = stdIn.nextInt() - 1;
        System.out.println(Math.abs(from % 4 - to % 4) + Math.abs((int)(from/4) - (int)(to / 4)));
    }
}
