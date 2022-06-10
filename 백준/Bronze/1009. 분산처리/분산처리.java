import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int t = stdIn.nextInt();
        int a, b, result;
        int[] arr = new int[t];
        for(int i = 0; i < t; i++) {
            a = stdIn.nextInt();
            b = stdIn.nextInt();
            result = 1;
            for(int j = 0; j < b; j++) {
                result *= a;
                result = result % 10;
            }
            arr[i] = result;
        }
        for(int temp : arr) {
            if(temp == 0) System.out.println(10);
            else System.out.println(temp);
        }
    }
}