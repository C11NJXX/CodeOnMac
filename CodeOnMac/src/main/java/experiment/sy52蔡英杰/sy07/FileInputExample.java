package main.java.experiment.sy52蔡英杰.sy07;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("path_to_directory/test1.txt")) {
            byte[] b = new byte[20];
            int bytesRead = fis.read(b, 3, 20);

            if (bytesRead != -1) {
                System.out.println("读取的数据：");
                for (int i = 3; i < bytesRead + 3; i++) {
                    System.out.print((char) b[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}