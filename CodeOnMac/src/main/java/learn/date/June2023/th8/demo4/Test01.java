package main.java.learn.date.June2023.th8.demo4;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws IOException {
        try (Reader reader = new FileReader("/Users/c_11njxx/Documents/Code/readme.txt", StandardCharsets.UTF_8)){
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = reader.read() ) != -1) {
                sb.append((char) n);
            }
            char[] b = new char[1024];
            while((n = reader.read(b)) != -1) {
                System.out.println(n);
            }
            System.out.println(sb.toString());
        }
    }

}
