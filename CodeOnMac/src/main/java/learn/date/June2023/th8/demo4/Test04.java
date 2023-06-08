package main.java.learn.date.June2023.th8.demo4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Test04 {
    public static void main(String[] args) throws IOException {
        try(Reader reader = new InputStreamReader(new FileInputStream("/Users/c_11njxx/Documents/Code/readme.txt"), StandardCharsets.UTF_8)){
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = reader.read() ) != -1) {
                sb.append((char) n);
            }
            System.out.println(sb.toString());
        }

    }
}
