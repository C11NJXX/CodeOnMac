package main.java.learn.date.June2023.th8.demo3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        try(ByteArrayOutputStream bout = new ByteArrayOutputStream()){
            bout.write("Hello".getBytes("UTF-8"));
            System.out.println(new String(bout.toByteArray(),"UTF-8"));
        }

    }
}
