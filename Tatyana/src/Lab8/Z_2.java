package Lab8;


import java.util.Scanner;

/**
 * Created by pro-27 on 15.12.2017.
 */
public class Z_2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String p=str.nextLine();
        String[]mass=p.split(" ");
        int line=mass.length;
        for(int i=0; i<line; i++){
            System.out.print(mass[i] +" ");
            System.out.println(i);
        }
    }
}
