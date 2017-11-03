package Lab1;

import java.util.Scanner;

public class Z_11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String cx, cy, r, fill;
        System.out.println("cx it is ");
        cx=str.nextLine();
        System.out.println("cy it is ");
        cy=str.nextLine();
        System.out.println("r it is ");
        r=str.nextLine();
        System.out.println("Fill it is ");
        fill=str.nextLine();
        System.out.println("<circle cx=\""+ cx + "\" cy=\""+ cy);
        System.out.println("r=\""+ r+ "\" fill=" + fill +"\"/>" );
    }
}
