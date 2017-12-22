package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task6175 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            File target = new File("Res/task6175/test" + i + ".txt");
            System.out.println("\n" + target.getAbsolutePath());
            if (!target.exists()) {
                System.out.println("File " + target.getAbsolutePath() + " не существует ");
            } else {
                try (Scanner s = new Scanner(target)) {

                    if (s.hasNext()) {
                        String lines = s.nextLine();
                        System.out.print(lines);
                    } else {
                        System.out.println("Файл пуст ");
                    }

                    while (s.hasNext()) {
                        String line = s.nextLine();
                        System.out.print("," + line);
                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

