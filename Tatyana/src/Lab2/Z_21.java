package Lab2;

import java.util.Scanner;

public class Z_21 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        float a,b;
        a=str.nextFloat();
        b=str.nextFloat();
        if (a<=0)
            System.out.println("Значение r1 должно быть не равно нулю");
        else if (b<=0)
            System.out.println("Значение r2 должно быть не равно нулю");
        else {
            System.out.printf("%.4f", 1/a+1/b);
        }
    }
}
