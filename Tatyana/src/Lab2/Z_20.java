package Lab2;

import java.util.Scanner;

public class Z_20 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double m,v,h,r,p,g=9.8067;
        m=str.nextDouble();
        v=str.nextDouble();
        h=str.nextDouble();
        if (m<0)
            System.out.println("Значение mass должно быть положительным");
        else if (v<0)
            System.out.println("Значение velocity должно быть положительным");
        else if (h<0)
            System.out.println("Значение height должно быть неотрицательным");
        else {
            r=m*v*v/2;
            p=m*g*h;
            System.out.printf( "Кинетическая энергия составляет: "+ "%.4f" , r );
            System.out.print("дж\n");
            System.out.printf( "Потенциальная энергия составляет: " + "%.4f", p );
            System.out.print("дж");



        }
    }
}
