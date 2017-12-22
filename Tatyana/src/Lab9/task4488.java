package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4488 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 6; i++) {

            File target = new File("Res/task4488/test" + i + ".txt");
            System.out.println("\n");
            if (!target.exists()) {
                System.out.println("File " + target.getAbsolutePath() + " не существует ");
            } else {
                try (Scanner s = new Scanner(target)) {

                    if (s.hasNext()) {
                        sum=sum+1;
                        String lines = s.nextLine();
                        System.out.print(lines);
                    } else {
                        System.out.println("Файл пуст ");
                    }
                    while (s.hasNext()) {
                        String line = s.nextLine();
                        System.out.print("," + line);}

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
