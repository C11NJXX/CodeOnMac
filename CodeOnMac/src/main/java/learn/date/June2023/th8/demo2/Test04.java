package main.java.learn.date.June2023.th8.demo2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {
        byte[] b = {97,98,99,100,101};
        int n;
        try(InputStream input = new ByteArrayInputStream(b)) {
            while((n = input.read()) != -1 ) {
                System.out.println((char) n);
            }
        }

    }
}
