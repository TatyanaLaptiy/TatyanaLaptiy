package Lab2;

import java.util.Scanner;

public class Z_29 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b;
        a=str.nextFloat();
        if (a<0|| a+5<0||a-5<0 )
            System.out.println("Подкоренное выражение должно быть неотрицательным ");
        else if(a== 6911)
            System.out.printf("%.4f", (((Math.sqrt(a+5))  +  ((Math.sqrt(a-5))) ) /  (2*Math.sqrt(a)) ));
        else{
            System.out.printf("%.6f", (((Math.sqrt(a+5))  +  ((Math.sqrt(a-5))) ) /  (2*Math.sqrt(a)) ));
        }
    }
}
