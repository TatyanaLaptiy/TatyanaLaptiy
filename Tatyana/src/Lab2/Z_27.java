package Lab2;

import java.util.Scanner;

public class Z_27 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,w=2;
        a=str.nextFloat();
        System.out.printf("%.4f",Math.sqrt(1-((Math.pow(Math.sin(a),w)))));
    }
}
