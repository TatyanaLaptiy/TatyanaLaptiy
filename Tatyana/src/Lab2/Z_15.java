package Lab2;

import java.util.Scanner;

public class Z_15 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        double a,b;
        a=str.nextDouble();
        b= a*1.8+32;
        if (b<0)
            System.out.println("Температура должна быть выше абсолютного нуля");
        else if (a ==-123.15 )
            System.out.printf("%.4f",b);
        else
            System.out.printf("%.4f",b);

    }
}
