package Lab2;

import java.util.Scanner;

public class Z_17 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        float a,b,r,w;
        a=str.nextFloat();
        b=str.nextFloat();
        w=str.nextFloat();
        if (a<0 || b<0)
            System.out.println("Скорость должна быть неотрицательна ");
        else {
            r=a+b;
            System.out.printf("%.4f", w/r);
        }

    }
}
