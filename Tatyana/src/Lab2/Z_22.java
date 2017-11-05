package Lab2;

import java.util.Scanner;

public class Z_22 {
    public static void main(String[] args) {
        Scanner str=new Scanner( System.in);
        double a,b,r,g;
        a=str.nextDouble();
        b=str.nextDouble();
        g=9.8067f;
        r=a*g*Math.cos(Math.toRadians(b));
        if (a<=0)
            System.out.println("Масса должна быть положительной");
        else if (r==0)
            System.out.printf("%.0f",r);
        else {
            System.out.format("%.6f",r);
        }
    }
}
