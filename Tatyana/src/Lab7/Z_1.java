package Lab7;

import java.util.Scanner;

public class Z_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a,str;
        boolean b;
        str="abcdefwxyz";
        a=s.next();
        b=str.contains(a);
        if(b) {
            System.out.println(" Содержится ");
        }
        else
            System.out.println(" Не содержится ");
    }
}
