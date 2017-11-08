package Lab5;

import java.util.Scanner;

public class Z_8 {
    public static void main(String[] args) {
        Scanner str =new Scanner (System.in);
        double a,b,c,D;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        D= (b*b)-(4*a*c);

        if (a==0) {
            System.out.print(" уравнение ");
            System.out.printf("%.0f",a );
            System.out.print(" x^2 + ");
            System.out.printf("%.0f", b);
            System.out.print(" x +");
            System.out.printf("%.0f", c);
            System.out.print(" =0 не является квадратным ");
        }
        else if (D<0) {
            System.out.print(" Вещественных корней уравнения ");
            System.out.printf("%.0f", a);
            System.out.print(" x^2 + ");
            System.out.printf("%.0f",b);
            System.out.print("x +");
            System.out.printf("%.0f",c);
            System.out.print(" =0 нет ");
        }
        else if (D>0) {
            System.out.print("У уравнения");
            System.out.printf("%.0f", a);
            System.out.print(" x^2 + ");
            System.out.printf("%.0f", b);
            System.out.print(" x +");
            System.out.printf("%.0f", c);
            System.out.print(" =0 два вещественных корня");
        }
        else if (D==0) {
            System.out.print("Уравнение");
            System.out.printf("%.0f", a);
            System.out.print(" x^2 + ");
            System.out.printf("%.0f", b);
            System.out.print(" x +");
            System.out.printf("%.0f", c);
            System.out.print(" =0 имеет один корень");
        }



    }
}
