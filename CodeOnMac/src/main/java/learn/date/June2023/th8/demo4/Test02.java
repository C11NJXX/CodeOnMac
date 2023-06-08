package main.java.learn.date.June2023.th8.demo4;

import java.io.CharArrayReader;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        try(CharArrayReader charArrayReader = new CharArrayReader("Hello".toCharArray())) {
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = charArrayReader.read()) != -1) {
                sb.append((char)n);
            }
            System.out.println(sb.toString());
        }

    }
}
