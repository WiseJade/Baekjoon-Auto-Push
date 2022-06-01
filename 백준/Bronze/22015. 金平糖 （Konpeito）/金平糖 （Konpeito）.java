import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int max = Math.max(Math.max(a, b), c);
        System.out.println(max - a + max - b + max - c);
    }
}
