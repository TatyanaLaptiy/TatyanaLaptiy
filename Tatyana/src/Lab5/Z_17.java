package Lab5;

import java.util.Scanner;

public class Z_17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float m,p,f;
        m=str.nextFloat();
        p=str.nextFloat();
        f=m%p;
        if (m==0)
            System.out.println("Значение M должно быть не равно нулю");
        else if (p==0)
            System.out.println("Значение P должно быть не равно нулю ");
        else if (f==0)
            System.out.printf("%.0f",m/p);
        else
            System.out.println("M не делится нацело на P");



    }
}
