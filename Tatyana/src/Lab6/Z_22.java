package Lab6;

import java.util.Scanner;

public class Z_22 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String r;
        int n;
        n = str.nextInt();
        r = "!";
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0) {
                System.out.print(" ");
            }
            System.out.print(r);
        }




    }
}
