package Lab5;

import java.util.Scanner;

public class Z_28 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a,b,c,d;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        d=str.nextInt();
        if(c>=a&&d>=b)
            System.out.println("поместится ");
        else
            System.out.println(" не помастится ");
    }
}
