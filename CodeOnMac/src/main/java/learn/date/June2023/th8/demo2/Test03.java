package main.java.learn.date.June2023.th8.demo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //将 source 语句放到 try（）中，这样可以不用手写finally 也能确保文件io流正常回收
        try(InputStream input = new FileInputStream("/Users/c_11njxx/Documents/Code/readme.txt")) {
            byte[] b = new byte[1024];
            int n;
            while((n = input.read(b)) != -1) {
                System.out.println("read " + n + "bytes");//返回读取的字节数
            }
        }
    }
}
