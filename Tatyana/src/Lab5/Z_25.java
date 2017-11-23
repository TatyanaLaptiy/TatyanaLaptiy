package Lab5;

import java.util.Scanner;

public class Z_25 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        int x,y;
        x=str.nextInt();
        y=str.nextInt();
        if(x>=1 && x<=3 && y>=-2 &&y<=-1)
            System.out.println(" принадлежит ");
        else
            System.out.println(" не Принадлежит ");

    }
}
