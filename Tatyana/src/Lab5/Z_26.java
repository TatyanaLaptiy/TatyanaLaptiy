package Lab5;

import java.util.Scanner;

public class Z_26 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        int x,y;
        x=str.nextInt();
        y=str.nextInt();
        if(x<2&&y<0.5 || x<2&&y>1.5)
            System.out.println("не принадлежит ");
        else
            System.out.println(" Принадлежит ");

    }
}
