package Lab7;

import java.util.Scanner;

public class Z_4 {
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        String input="abcdacadbacdaabaadc",x;
        x=str.next();
        boolean t= x.length()!=2;
        int l = x.length();
        if(l>2|| l<2)
            System.out.println(" Вводимая строка должна содержать ровно 2 символа" );
        else {
            int a = input.indexOf(x);
            int b = input.indexOf(x, a + 1);
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
        }

    }
}
