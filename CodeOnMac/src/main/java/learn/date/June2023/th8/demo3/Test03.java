package main.java.learn.date.June2023.th8.demo3;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        byte[] b = {97,98,99,100,101};
        try(InputStream byteInput = new ByteArrayInputStream(b);
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream()){
            byteInput.transferTo(byteOutput);
            System.out.println(new String(byteOutput.toByteArray(),"UTF-8"));
        }



    }
}
