package Lab2;

import java.util.Scanner;

public class Z_14 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        float a,b;
        a=str.nextFloat();
        b=str.nextFloat();
        if (b>0)
            System.out.println("Значение B должно быть не положительным");
        else {
            System.out.printf("%.4f",a* Math.sqrt(-7*b));

        }

    }
}
