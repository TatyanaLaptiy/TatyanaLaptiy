package Lab6;

import java.util.Scanner;

public class Z_6 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a,b,i;
        a=str.nextInt();
        b=str.nextInt();
        if (a<b)
        for ( i=a; i<=b; i++)
        System.out.print(" "+ i+ " ");
        else if (a>b)
            for ( i=b; i<=a; i++)
                System.out.print(" "+ i+ " ");




    }
}
