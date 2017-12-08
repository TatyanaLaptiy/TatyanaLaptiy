package Lab7;

import java.util.Scanner;

public class Z_14 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a;
        String res=" ";
        a = str.nextLine();
        int t = a.indexOf(a);
        for (int i = 0; i < a.length(); i++) {
            char f = a.charAt(t);
            int r = a.indexOf(f);
            if (f == '"' && i % 2 == 0) {
                res = a.replaceFirst("\"", "]");
            } else if (f == '"' && i % 2 != 0) {
                res = a.replaceFirst("\"", "[");
            } else
                res = a;


        }
        System.out.println(res);


    }

}

