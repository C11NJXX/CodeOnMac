package main.java.experiment.sy52蔡英杰.sy09.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClientDemo {
    public static void main(String[] args) throws IOException {

        Socket client = new Socket("127.0.0.1", 8899);
        PrintWriter toServer = new PrintWriter(client.getOutputStream(), true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

        String sfs, sts;

        System.out.print("Client: ");
        sts = sin.readLine();
        while (true) {
            toServer.println(sts);

            System.out.print("Server: ");
            sfs = fromServer.readLine();
			System.out.println(sfs);

            System.out.print("Client: ");
            sts = sin.readLine();
        }
    }
}
