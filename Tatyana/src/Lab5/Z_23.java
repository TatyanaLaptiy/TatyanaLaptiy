package Lab5;

import java.util.Scanner;

public class Z_23 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        int x,y;
        x=str.nextInt();
        y=str.nextInt();
        if(x>=2&&y>=0 || x<=-1&&y>=1)
            System.out.println(" принадлежит ");
        else
            System.out.println(" не Принадлежит ");

    }
}
