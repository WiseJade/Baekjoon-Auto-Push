import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // Input number of music to int type variable
        int musicNum = stdIn.nextInt();
        // Input average(int type)
        // average = round up (number of melody with copyright in music)/(number of music)
        int average = stdIn.nextInt();
        
        // Output minimum of number of melody with copyright
        // copyright num = average * number of music
        // min of copyright num 
        // => average - 1(it can be round up. so min is average - 1) * num of music + 1
        System.out.println(musicNum * (average - 1) + 1);
    }
}