package Lab2;

import java.util.Scanner;

public class Z_8 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,r,c;
        a=str.nextInt();
        b=str.nextInt();
        if (a<=0)
            System.out.println("Значение partInCm должно быть положительным");
        else if (b<=0)
            System.out.println("Значение totalInM должно быть положительным");
        else {
            r=a*100/b;
            c=a*100%b;
            System.out.println(r+"шт и "+ c + "см");

        }

    }
}
