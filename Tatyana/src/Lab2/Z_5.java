package Lab2;

import java.util.Scanner;

public class Z_5 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        float a,r;
        a=str.nextFloat();
        if (a<=0)
            System.out.println("Значение radius должно быть положительным");
        else {
            r=3;
            System.out.printf("%.4f", Math.PI*4* Math.pow(a,r)/3);
        }
    }
}
