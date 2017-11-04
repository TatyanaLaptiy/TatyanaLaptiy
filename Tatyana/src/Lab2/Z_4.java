package Lab2;

import java.util.Scanner;

public class Z_4 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        float a,b,c;
        a=str.nextFloat();
        if (a<=0)
            System.out.println("Радиус должен быть положительным");
        else
            System.out.printf("%.4f", Math.PI*a*2);
    }
}
