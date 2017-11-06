package Lab2;

import java.util.Scanner;

public class Z_28 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        float a,b,c,x,r;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        x=str.nextFloat();
        r=a*x*x+b*x+c;
        if (a==0&&b==0&&c==0&& x==0)
            System.out.println("Знаменатель не может быть равен нулю");
        else if(r<0)
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        else{
            System.out.printf("%.4f", 1/(Math.sqrt(r)));
        }
    }
}
