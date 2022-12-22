package practice5;

import java.util.Scanner;

public class Task3 {
    public static void Up_to_Down(int a, int b) {
        if (a <= b) {
            if (a > b) {
                return;
            }
            System.out.println(a);
            Up_to_Down(++a, b);
        }
    }
    public static void Down_to_Up(int a, int b) {
        if (a < b) {
            return;
        }
        System.out.println(a);
        Down_to_Up(--a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a < b)
            Up_to_Down(a, b);
        else {
            Down_to_Up(a, b);
        }
    }
}
