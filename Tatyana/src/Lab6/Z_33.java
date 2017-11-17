package Lab6;

import java.util.Scanner;

public class Z_33 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a,r;
        String b,c;

        b="-";
        c=".";
        a=str.nextInt();
        r=a-2;
        if (a<0) {
            System.out.println("Значение W должно быть неотрицательно ");

        }


        else {
            System.out.print("+");
            for(int i=0; i<r; i++){
                System.out.print(b);

            }
            System.out.println("+");
            System.out.print("|");
            for(int i=0;i<r;i++){
                System.out.print(c);
            }
            System.out.println("|");
            System.out.print("+");
            for(int i=0; i<r; i++) {
                System.out.print(b);
            }
            System.out.print("+");


        }

    }
}
