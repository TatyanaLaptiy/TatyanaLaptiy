package Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z_25 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String k=str.nextLine();
        int[] numArr = Arrays.stream(k.split(" ")).mapToInt(Integer::parseInt).toArray();



        int n = numArr.length;

        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if (numArr [j] != numArr[i] )
                {
                    if ( m != j ) numArr[m] = numArr[j];
                    m++;
                }
            }
        }


        if ( n != numArr.length )
        {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = numArr[i];

            numArr = b;
        }

        for ( int x : numArr ) System.out.print( x + " " );
        System.out.println();
    }
}


