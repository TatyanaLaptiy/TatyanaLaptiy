package Lab2;

import java.util.Scanner;

public class Z_25 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        float a,b,c,d,k;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        k=2;
        System.out.printf("%.4f",Math.sqrt((Math.pow(a,k))+(Math.pow(b,k))-2*a*b*(Math.cos(Math.toRadians(c)))));


    }
}
