package Lab2;

import java.util.Scanner;

public class Z_12 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        float a;
        a=str.nextFloat();
        if (a==360|| a==90)
            System.out.printf("%.0f",5*Math.cos(Math.toRadians(a)));
        else
        System.out.printf("%.4f",5*Math.cos(Math.toRadians(a)));
    }
}
