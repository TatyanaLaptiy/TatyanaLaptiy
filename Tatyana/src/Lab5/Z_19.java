package Lab5;

import java.util.Scanner;

public class Z_19 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        int x,y;
        x=str.nextInt();
        y=str.nextInt();
        if(y<1 || x>-2)
            System.out.println(" не принадлежит ");
        else
            System.out.println(" принадлежит ");
    }
}
