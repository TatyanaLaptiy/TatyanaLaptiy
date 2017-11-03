package Lab5;

import java.util.Scanner;

public class Z_2 {
    public static void main(String[] args) {
        Scanner str= new Scanner (System.in);
        int P,Q;
        P=str.nextInt();
        Q=str.nextInt();
        if (P<Q)
            System.out.println(" Максимальное "+Q + "минимальное "+ P);
        else if (Q<P)
            System.out.println(" Максимальное "+ P + " минимальное "+ Q);
    }
}
