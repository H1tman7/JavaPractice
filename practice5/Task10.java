package practice5;

import java.util.Scanner;

public class Task10 {
    public static int toReverseNumber(int n, int value) {
        if (n == 0) {
            return value;
        }
        return toReverseNumber(n / 10, value * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Answer = " + toReverseNumber(a,0));

    }
}
