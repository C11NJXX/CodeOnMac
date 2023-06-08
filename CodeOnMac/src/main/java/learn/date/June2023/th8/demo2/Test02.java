package main.java.learn.date.June2023.th8.demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("/Users/c_11njxx/Documents/Code/readme.txt");
        try {
            int n;
            while((n = input.read())!= -1) {
                System.out.println(n);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            input.close();
        }

    }
}
