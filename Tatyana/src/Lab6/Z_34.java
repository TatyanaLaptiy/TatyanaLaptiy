package Lab6;

import java.util.Scanner;

public class Z_34 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a,b,h;
        String t,j;
        j="-";
        t=".";
        a=str.nextInt();
        b=str.nextInt();
        h=0;

        System.out.print(" ");
        for(int i=0;i<a;i++){
            System.out.print(i);
        }
//        System.out.print("\n");
//        System.out.print(h);
//        for(int i=0; i<a;i++){
//            System.out.print(t);
//        }
//        System.out.print("|");


        while(h<b){
            System.out.print("\n");

        System.out.print(h);
        for(int i=0; i<a;i++) {
            System.out.print(t);


        }
            System.out.print("|");
            h=h+1;
        }

        System.out.println();
        System.out.print(" ");

        for (int i=0;i<a;i++){
            System.out.print(j);
        }


    }
}
