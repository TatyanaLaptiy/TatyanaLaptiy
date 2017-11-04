package Lab2;

import java.util.Scanner;

public class Z_13 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,r;
        a=str.nextDouble();
        r=61-a;
        if (r<0)
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        else
            System.out.printf("%.4f", 3*Math.sqrt(61-a));


    }
}
