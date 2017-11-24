package Lab7;

import java.util.Scanner;

public class Z_2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = "abcdefwxyz";
        int n, l;
        String b;
        boolean x;
        b = str.next();
        x = a.contains(b);
        n = a.indexOf(b);
        if (x) {
            n = a.indexOf(b);
            l = a.length();
            System.out.println(l - n - 1);
        } else
            System.out.println("Значение отсутствует в строке");

        if (n > -1)
            System.out.println("n>-1");
        else
            System.out.println("n<-1");


    }


}



