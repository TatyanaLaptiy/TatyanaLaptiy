package Lab2;

import java.util.Scanner;

public class Z_3 {
    public static void main(String[] args) {
        Scanner str= new Scanner( System.in);
        int a,b,r;
        a=str.nextInt();
        if (a<=0)
            System.out.println("Значение edge должно быть положительным");
        else {
            b=3;
            System.out.printf("%.0f", Math.pow(a,b));

        }

    }
}
