package net.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BlogServer
{
   public static final int PORT = 3021;//¼àÌýµÄ¶Ë¿ÚºÅ     
   
   public static void main(String[] args)
   {
	 // TODO Auto-generated method stub
	 ServerSocket serverSocket;
	 try
	 {
	    serverSocket = new ServerSocket(PORT);
	    Socket clientSocket = serverSocket.accept();  
	    BufferedReader input =new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	    String clientInputStr = input.readLine();// 
	    System.out.println("New Post:" + clientInputStr);  
	    
	 } catch (IOException e)
	 {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	 } 
	  
      
   }
}
