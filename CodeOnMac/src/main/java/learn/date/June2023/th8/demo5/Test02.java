package main.java.learn.date.June2023.th8.demo5;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Test02 {
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("Hello World!".toCharArray());
        char[] arr = charArrayWriter.toCharArray();
        System.out.println(arr);

        try(StringWriter stringWriter = new StringWriter()) {
            stringWriter.write("Hello stringWriter");
            char[] arr1 = stringWriter.toString().toCharArray();
            System.out.println(arr1);
        }
    }
}
