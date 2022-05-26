import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        BigInteger n = new BigInteger(stdIn.next());
        BigInteger m = new BigInteger(stdIn.next());

        System.out.println(n.divide(m));

        System.out.println(n.remainder(m));
    }
}