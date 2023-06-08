package main.java.learn.date.June2023.th8.demo3;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        OutputStream output = new FileOutputStream("out/text.txt");
        String s = "Hello World!";
        for(int i = 0; i<s.length() ; i++) {
            output.write((int)s.charAt(i));
        }
        output.close();
        inputShow(new FileInputStream("out/text.txt"));
        outputMethod1();
        inputShow(new FileInputStream("out/text.txt"));
        outputMethod2();
        inputShow(new FileInputStream("out/text.txt"));


    }
    //包内默认可以访问
    static void inputShow(InputStream input) throws IOException{
        try(input) {
            int n;
            StringBuilder sb = new StringBuilder();
            while((n = input.read()) != -1) {
                sb.append((char) n);
            }
            System.out.println(sb.toString());
        }
    }

    static void outputMethod1() throws IOException{
        OutputStream output = new FileOutputStream("out/text.txt");
        output.write("This is a line wirte by output.write()".getBytes("UTF-8"));
        output.close();
    }
    static void outputMethod2() throws IOException{
        try(OutputStream output = new FileOutputStream("out/text.txt")){
            output.write("This is a line wirte by output.write() and source in the try()".getBytes("UTF-8"));
        }
    }
}
