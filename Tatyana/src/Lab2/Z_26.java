package Lab2;

import java.util.Scanner;

public class Z_26 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c,d;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        d=str.nextFloat();
        if (a==0)
            System.out.println("Значение a должно быть не равно нулю");
        else if (d==0)
            System.out.println("Значение d должно быть не равно нулю");
        else{
            System.out.printf("%.4f",(a*b+d*c)/(a*d));
        }
    }
}
