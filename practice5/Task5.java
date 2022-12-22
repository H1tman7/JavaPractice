package practice5;

import java.util.Scanner;

public class Task5 {
    public static void Sum_of_figures(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n % 10;
        Sum_of_figures(n / 10, sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Sum_of_figures(a, 0);
    }
}
