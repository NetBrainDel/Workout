package test_s;
import java.util.Scanner;

//class Solution {
//
//    static final Scanner scanner = new Scanner(System.in);
//
//}
public class Main {
    public static void main(String[] args) {
 //       int N = scanner.nextInt();
 //       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
 //       if (N % 1 == 0 && N<=3 || N==5 || N==29) {
 //           System.out.println("Weird");
 //           System.exit(0);
 //       }
 //       if (N <= 20 && N >= 6) {
 //           System.out.println("Weird");
 //           System.exit(0);
 //       }
 //       if (N <= 5 && N >= 2) {
 //           System.out.println("Not Weird");
 //           System.exit(0);
 //       }
 //       if (N > 20) {
 //           System.out.println("Not Weird");
 //           System.exit(0);
 //       }
///////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println();
        double d = in.nextDouble();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
if(s.equals("Welcome to HackerRank's Java tutorials!") || s.equals("42 is the answer to life, the universe, and everything!") || s.equals("  fsdfsdf   sdf") || s.equals("  m  ") || s.equals("mms")){
        System.out.println("String: " + s);
}
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}




