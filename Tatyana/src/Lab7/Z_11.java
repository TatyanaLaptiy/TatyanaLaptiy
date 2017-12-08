package Lab7;

import java.util.Scanner;

public class Z_11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String x,b;
        x=str.nextLine();
        if(x.startsWith("\"") && x.endsWith("\"")) {
            b = x.substring(1, x.length() - 1);
            System.out.println(b.trim());
        }
        else
            System.out.println("Строка должна начинаться и заканчиваться кавычкой");

    }
}
