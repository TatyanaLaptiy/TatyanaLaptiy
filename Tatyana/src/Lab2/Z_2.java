package Lab2;

import java.util.Scanner;

public class Z_2 {
    public static void main(String[] args) {
        Scanner str= new Scanner( System.in);
        int r,a;
        System.out.println(" write a");
        a= str.nextInt();
        if (a<=0)
            System.out.println("Значение edge должно быть положительным");
        else {
            r=6*a*a;
            System.out.println(r);
        }
    }
}
