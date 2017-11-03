package Lab2;

import java.util.Scanner;

public class Z_10 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,r;
        a=str.nextDouble();
        System.out.format("%.4f\n", Math.sin(Math.toRadians(a)));
    }
}
