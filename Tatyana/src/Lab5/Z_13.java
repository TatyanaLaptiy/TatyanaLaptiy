package Lab5;

import java.util.Scanner;

public class Z_13 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int x,y,z;
        x=str.nextInt();
        y=str.nextInt();
        z=str.nextInt();
        if (x==y || y==z|| z== x)
            System.out.println("Среди чисел есть равные");
        else {
            System.out.println("Числа не равны друг другу.");
        }

    }
}
