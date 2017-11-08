package Lab5;

import java.util.Scanner;

public class Z_16 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int x,y,z;
        x=str.nextInt();
        y=str.nextInt();
        z=str.nextInt();
        if (x>y && x>z  )
            System.out.println(x);
        if (y>z&& y>z )
            System.out.println(y);
        if (z>x && z> y)
            System.out.println(z);
    }
}
