import java.io.*;
import java.util.*;

public class day1 {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        double d1 = scanner.nextDouble();

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();

        String s2 = s.concat(s1);

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s2);
    }
}
