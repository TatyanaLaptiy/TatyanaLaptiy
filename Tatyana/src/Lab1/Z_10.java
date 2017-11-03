package Lab1;

import java.util.Scanner;

public class Z_10 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int x, y;
        System.out.println("Напиши x");
        x= str.nextInt();
        System.out.println("Напиши Y ");
        y= str.nextInt();
        System.out.println("INSERT INTO points (x, y) VALUES ('"+ x +"', '"+y+ "');");
    }
}
