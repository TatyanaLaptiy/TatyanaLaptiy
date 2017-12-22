package Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z_17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        int[] numArr = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();

        int b=str.nextInt();

        int s = 0;
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i]<b){
                s=s+1;

            }
            else s=s+0;
            System.out.println(s);
        }
        System.out.println(s);
    }
    }

