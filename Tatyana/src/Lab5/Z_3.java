package Lab5;

import java.util.Scanner;

public class Z_3 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a;
        a=str.nextInt();
        if (a>0)
            System.out.println(Math.sqrt(a));
        else{
            System.out.println(a*a);
        }
    }
}
