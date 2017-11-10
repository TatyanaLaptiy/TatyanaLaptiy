package Lab6;

import java.util.Scanner;

public class Z_21 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int x, r;
        x = str.nextInt();
        for (int i = 10; i <= 20; i++) {
            if (i == x) {
                System.out.println(i + "+");
            } else {
                System.out.println(i);
            }
        }
    }
    }

