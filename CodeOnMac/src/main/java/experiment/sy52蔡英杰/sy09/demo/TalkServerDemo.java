package main.java.experiment.sy52蔡英杰.sy09.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServerDemo {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(8899);
        Socket s = ss.accept();
        System.out.println("accept!");

        PrintWriter toClient = new PrintWriter(
                s.getOutputStream(), true);
        BufferedReader fromClient = new BufferedReader(
                new InputStreamReader(s.getInputStream()));
        BufferedReader sin = new BufferedReader(
                new InputStreamReader(System.in));

        String sfc = null;
        String stc = null;

        while (true) {
            sfc = fromClient.readLine();
            System.out.print("Client: ");
            System.out.println(sfc);

            System.out.print("Server: ");
            stc = sin.readLine();
            toClient.println(stc);
        }
    }
}
