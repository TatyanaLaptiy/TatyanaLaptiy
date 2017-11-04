package Lab2;

import java.util.Scanner;

public class Z_6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a , c;
        a=str.nextFloat();
        c=str.nextFloat();
        if (a<=0)
            System.out.println("Значение base должно быть положительным");
        else if (c<=0)
            System.out.println("Значение height должно быть положительным");
        else
            System.out.printf("%.2f",a*c/2);
    }
}
