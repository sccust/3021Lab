package net.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadHandler implements Runnable {
	Socket csocket;
	int visitor;

	public ThreadHandler(Socket csocket, int visitor) {
		this.csocket = csocket;
		this.visitor = visitor;
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(csocket.getOutputStream(), true);
			BufferedReader input = new BufferedReader(new InputStreamReader(
					csocket.getInputStream()));
			String inputLine;
			while ((inputLine = input.readLine()) != null) {
				if (inputLine.equals("quit")) {
					break;
				} else if (inputLine.equals("visitor")) {
					out.println("You're the " + visitor + " visitor today");
				} else {
					out.println("echo: " + inputLine);
				}
			}
			input.close();
			out.close();
			csocket.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}