package Lab2;

import java.util.Scanner;

public class Z_16 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        float x,b;
        x=str.nextFloat();
        b=str.nextFloat();
        if (b<=0)
            System.out.println("Значение y должно быть неотрицательным");
        else if (x+(Math.sqrt(b))<=0)
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        else {
            System.out.printf("%.4f", -5* Math.sqrt(x+Math.sqrt(b)));
        }



    }
}
