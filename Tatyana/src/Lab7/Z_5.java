package Lab7;



import java.util.Scanner;

public class Z_5 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a= "abcdefwxyz";

        int CA, CB,n;
        boolean x;
        CA=str.nextInt();
        CB=str.nextInt();
        x = a.contains(a);
        n = a.indexOf(a);

        if(CA>CB)
            System.out.println("Значение CA должно быть меньше CB");
        else if(CA<0)
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
        else if(CB<0)
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
        else{

            String k=a.substring(CA,CB+1);
            System.out.println(k);




        }


    }
}
