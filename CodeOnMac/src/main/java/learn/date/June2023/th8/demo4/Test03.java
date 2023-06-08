package main.java.learn.date.June2023.th8.demo4;

import java.io.IOException;
import java.io.StringReader;

public class Test03 {
    public static void main(String[] args) throws IOException {
        try(StringReader sr = new StringReader("Hello")) {
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = sr.read()) != -1) {
                sb.append( (char) n);
            }
            System.out.println(sb.toString());
        }

    }
}
