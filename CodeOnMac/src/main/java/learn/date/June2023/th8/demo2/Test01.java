package main.java.learn.date.June2023.th8.demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        InputStream inputFile = new FileInputStream("/Users/c_11njxx/Documents/Code/readme.txt");
        while(true) {
            int n = inputFile.read();
            if(n == -1) {
                break;
            }
            System.out.println(n);
        }
        inputFile.close();
    }
}
