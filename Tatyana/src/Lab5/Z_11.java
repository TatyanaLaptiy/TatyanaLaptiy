package Lab5;

import java.util.Scanner;

public class Z_11 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        int a,b,c;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        if (a<b && b<c)
            System.out.println("Выполняется ");
        else
            System.out.println(" Не выполняется ");
    }
}
