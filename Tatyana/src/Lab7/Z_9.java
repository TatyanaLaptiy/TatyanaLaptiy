package Lab7;

import java.util.Scanner;

public class Z_9 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a,r;
        a=str.next();
        char f=a.charAt(0);
        if(f=='s')
            r=a.toLowerCase();
        else if(f=='U')
            r=a.toUpperCase();
        else
            r=a;
        System.out.println(r);



    }
}
