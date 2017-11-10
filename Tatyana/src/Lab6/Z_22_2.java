package Lab6;

import java.util.Scanner;

public class Z_22_2 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int i=0,n;
        int j=0;
        n=str.nextInt();
        while (i<n) {
            if (j==5) {
                System.out.println(" ");
                j=0;

            }
            j++;
            i++;
            System.out.println("!");
        }

    }
}
