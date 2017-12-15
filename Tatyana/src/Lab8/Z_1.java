package Lab8;

import java.util.Scanner;

/**
 * Created by pro-27 on 15.12.2017.
 */
public class Z_1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String st = str.nextLine();
        int a = str.nextInt();
        String[] srr = st.split(" ");
        int line = st.length();
        int lines = srr.length;
        if (a < 0 || a > lines) {
            System.out.println("Число A должно быть в интервале [0, размер массива");
        }
        else if (st.equals(""))
            System.out.println("Исходная строка пуста");
        else
            System.out.println(srr[a]);
    }

    }

