package net.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class BlogClient {
	public static final String IP = "127.0.0.1";
	public static final int PORT = 3021;

	public static void main(String[] args) {

		try {
			Socket clientSocket = new Socket("127.0.0.1", 3021);
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
					true);
			BufferedReader input = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String read = null;
			while ((read = br.readLine()) != null) {
				out.println(read);
				if (read.equals("quit")) {
					break;
				}
				System.out.println(input.readLine());
			}
			out.close();
			input.close();
			br.close();
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
