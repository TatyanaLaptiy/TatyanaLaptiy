package Lab6;

import java.util.Scanner;

public class Z_35 {
    public static void main(String[] args) {
        Scanner str=new Scanner (System.in);
        int a,j=1;
        String b;
        a=str.nextInt();
        b=str.next();
        if (a<0)
            System.out.println("Значение H должно быть неотрицательно");
        else{

//            for(int i=1; i<=a; i++){
//                System.out.print(b);
//            }
//            j=j+1;
//            System.out.println("#");
//            for(int i=0; i<j; i++){
//                System.out.print("#");
//            }
//            j=j+1;
//            for (int i=0;i<j; i++){
//                System.out.println("#");
//            }
//            j=j+1;
//            for (int i=0; i<j; i++){
//                System.out.println("#");
//            }
            System.out.print("#");
            while(j<a){
                j = j + 1;
                System.out.println();
                for (int i = 0; i < j; i++) {
                    System.out.print("#");
                }
            }





        }

    }
}
