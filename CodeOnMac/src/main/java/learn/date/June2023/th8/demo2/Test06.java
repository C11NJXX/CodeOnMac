package main.java.learn.date.June2023.th8.demo2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
//利用 bytearrayStream 可以很好的测试，不需要传入一个真实存在的文件
public class Test06 {
    public static void main(String[] args) throws IOException {
        byte[] source = {97,98,99,100,101};
        try(InputStream input = new ByteArrayInputStream(source)) {
            StringBuilder sb = new StringBuilder();
            int n;
            while((n = input.read()) != -1) {
                sb.append((char)n);
            }
            String s = sb.toString();
            System.out.println(s);
        }

    }
}
