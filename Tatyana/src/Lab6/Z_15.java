package Lab6;

import java.util.Scanner;

public class Z_15 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int sum;
        sum=0;
        System.out.print("Ход решения: 0");
        for(int i=20;i<=40; i++){
            System.out.print( " + ");
            System.out.print(i*i*i+ " = ");
            sum = sum+i*i*i;
            System.out.print(" ");
            System.out.print(sum);
            System.out.print(" ");
        }
        System.out.print("\nОтвет:");
        System.out.print(sum);
    }
}
