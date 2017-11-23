package Lab5;

import java.util.Scanner;

public class Z_27 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a;
        a=str.nextInt();
        if(a<-10|| a>100)
            System.out.println(" Значение A должно быть в интервале [-10, 100] ");
        else{
            if(a==1|| a==4 || a== 5|| a==9 || a==-10|| a==11|| a==12 || a==13|| a==14|| a==15 || a==100)
                System.out.println(a+"'ый");
            else if (a==2||a==8||a==26||a==40)
                System.out.println(a+"'ой");
            else if(a==3)
                System.out.println(a+"'ий");
        }
    }
}
