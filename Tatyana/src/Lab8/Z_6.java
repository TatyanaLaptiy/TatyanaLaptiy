package Lab8;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.12.2017.
 */
public class Z_6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a;
        a=str.nextLine();
        String[]mass=a.split(" ");
        String mas= mass[mass.length-1];
        for(int i=mass.length-1;i>0; i--){
            mass[i]=mass[i-1];
        }
//        mass[5]=mass[4];
//        mass[4]=mass[3];
//        mass[3]=mass[2];
//        mass[2]=mass[1];
//        mass[1]=mass[0];
        mass[0]=mas;
        for(int i=0; i<mass.length; i++)
            System.out.print(mass[i]+" ");


    }
}
