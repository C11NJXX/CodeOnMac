package main.java.learn.date.June2023.th8.demo1;

import java.io.File;
import java.io.IOException;

public class ListDIr {
    public static void main(String[] args) {
        File f = new File("/Users/c_11njxx/Documents");
        try {
            printFile(f);
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("I'm i executed?");
        }
    public static void printFile(File f) throws IOException {
        if(f.isDirectory()) {
            System.out.println("Path = " + f.getAbsolutePath());
            System.out.println(f.getName());
            String[] fileList = f.list();
            for(String file : fileList) {
                File f1 = new File(f.getAbsolutePath() + "/" + file);
                System.out.println(f1.getAbsolutePath());
                if(f1.isDirectory()) {
                    System.out.println(file + " is a dir");
                }else {
                    System.out.println(file + " is a file");
                }
            }
        }else {
            System.out.println("Not a dir");
            throw new IOException();
        }
    }
    }

