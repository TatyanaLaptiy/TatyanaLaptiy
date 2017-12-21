package Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z_12 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a,b;
        a=str.nextLine();
        String[]mass=a.split(" ");
        int line=mass.length;


        b=str.nextLine();
        String[]masb=a.split(" ");
        int lineb=masb.length;

        int sum=0;

        for(int i=0;i< line;i++)
            for(int j=i;j<lineb;j++)
                if(mass[i].equals( masb[j])) {

                    sum=sum+1;}
                    System.out.println(sum);




    }
}
