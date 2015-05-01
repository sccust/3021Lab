package net.server;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {

	public static void main(String args[]) throws Exception {
		ServerSocket ssock = new ServerSocket(3021);
		int visitor = 1;
		while (true) {
			Socket csock = ssock.accept();
			System.out.println("connection: " + visitor);
			new Thread(new ThreadHandler(csock, visitor++)).start();
		}
	}

}
