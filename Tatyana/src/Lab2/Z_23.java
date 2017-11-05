package Lab2;

import java.util.Scanner;

public class Z_23 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        float a,b,c,r;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        r=2;
        if (a==0 || c==0)
            System.out.println("Данное уравнение не является квадратным");
        else{
            System.out.printf("%.4f",Math.pow(b,r)-4*a*c);
        }


    }
}
