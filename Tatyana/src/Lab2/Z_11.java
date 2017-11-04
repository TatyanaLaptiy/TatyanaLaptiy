package Lab2;

import java.util.Scanner;

public class Z_11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a;
        a=str.nextFloat();
        if (a<0)
            System.out.println("Значение X должно быть неотрицательным");
        else {
            System.out.printf("%.4f", Math.sqrt(a));
        }
    }
}
