package Lab6;

import java.util.Scanner;

public class Z_26 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int r=0;
        for (int i=100; i<=1000; i++){
            if (i%13==0) {
                System.out.print(i + "+");
                r=r+1;
            }
            System.out.print(" " +i+ " ");

        }
        System.out.println("\n");
        System.out.println( "Ответ"+r);
    }
    }

