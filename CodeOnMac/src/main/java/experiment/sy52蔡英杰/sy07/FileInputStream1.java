package main.java.experiment.sy52蔡英杰.sy07;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String[] args) {
        File file = new File("path_to_file"); // 将"path_to_file"替换为实际文件的路径

        long startTime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("使用FileInputStream读取时间：" + totalTime + "毫秒");
    }
}
