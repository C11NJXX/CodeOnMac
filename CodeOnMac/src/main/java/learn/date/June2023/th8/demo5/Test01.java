package main.java.learn.date.June2023.th8.demo5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test01 {
    public static void main(String[] args) throws IOException {
        try(Writer writer = new FileWriter("out/test.txt", StandardCharsets.UTF_8)){
            writer.write('c');
            writer.write("Hello");
            writer.write("Hello".toCharArray());
        }
        try(Reader reader = new InputStreamReader(new FileInputStream("out/test.txt"),"UTF-8")){
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = reader.read() ) !=  -1) {
                sb.append((char) n);
            }
            System.out.println(sb.toString());
        }
    }
}
