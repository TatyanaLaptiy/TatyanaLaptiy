package Lab10;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Z_1 {
    public static void main(String[] args) {
        String filename = "out 123.html";
        try(PrintWriter writer =new PrintWriter (filename,"UTF-8")) {
            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\" stroke-width=\"4\" fill=\"red\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>\n" +
                    "\t");
            Desktop.getDesktop().open(new File(filename));
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

}
