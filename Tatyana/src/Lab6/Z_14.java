package Lab6;

import java.util.Scanner;

public class Z_14 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int a, s = 1, b;
        a = str.nextInt();
        b = str.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                s = s * i;
            }
            System.out.println(s);

        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                s = s * i;
            }
            System.out.println(s);
        }
    }}
