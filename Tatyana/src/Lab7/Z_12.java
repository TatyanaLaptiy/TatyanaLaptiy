package Lab7;

import java.util.Scanner;

public class Z_12 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a;
        int s=0;
        a=str.nextLine();
        for(int i=0; i<a.length(); i++) {
            char f = a.charAt(i);
            if (f == ',')
            s = s + 1;

        }
        System.out.println(s+1);

    }
}
