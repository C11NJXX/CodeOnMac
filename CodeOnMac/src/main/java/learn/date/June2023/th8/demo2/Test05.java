package main.java.learn.date.June2023.th8.demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test05 {
    public static void main(String[] args) throws IOException {
        try(InputStream input = new FileInputStream("/Users/c_11njxx/Documents/Code/readme.txt")){
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = input.read()) != -1) {
                sb.append((char)n);
            }
            String s = sb.toString();
            System.out.println(s);
        }
    }
}
