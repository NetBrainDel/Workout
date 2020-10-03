package test_s;
import java.util.Scanner;

class Solution {

    static final Scanner scanner = new Scanner(System.in);

}
public class Main extends Solution {
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 1 == 0 && N<=3 || N==5 || N==29) {
            System.out.println("Weird");
            System.exit(0);
        }
        if (N <= 20 && N >= 6) {
            System.out.println("Weird");
            System.exit(0);
        }
        if (N <= 5 && N >= 2) {
            System.out.println("Not Weird");
            System.exit(0);
        }
        if (N > 20) {
            System.out.println("Not Weird");
            System.exit(0);
        }
    }
}
