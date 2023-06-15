package main.java.experiment.sy52蔡英杰.sy09.demo;

import java.net.*;
import java.io.*;
public class URLReader {
	public static void main(String args[]) throws Exception {
		URL url = new URL("https://www.zust.edu.cn/");
		BufferedReader in = new BufferedReader(
				new InputStreamReader(url.openStream(),"UTF-8"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		in.close();
	}
}
