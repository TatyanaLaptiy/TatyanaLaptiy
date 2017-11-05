package Lab2;

import java.util.Scanner;

public class Z_24 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,g;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        g=9.8067;
        if (c<=0)
            System.out.println("Дистанция должна быть неотрицательной");
        else if (a<=0 || b<=0)
            System.out.println("Масса должна быть неотрицательной");
        else {
            System.out.printf("%.4f",g*((a*b)/(c*c)));
        }




    }
}
