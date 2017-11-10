package Lab6;

public class Z_10 {
    public static void main(String[] args) {
        int s;
        s=0;
        System.out.print("Ход решения:");
        for ( int i=100;i<=500; i++) {
            s = s + i;


            System.out.print(s);
            System.out.print(" ");

        }
        System.out.println(" \n Ответ: " + s);
    }
}
