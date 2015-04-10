package net.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main
{
   static public final int student_id=20126604;
   
   public static void main(String[] args)
   {
	try
	 {
	   Socket clientSocket=new Socket("msr.cse.ust.hk",3021);
		 PrintWriter out =new PrintWriter(clientSocket.getOutputStream(),true);
	    BufferedReader in =new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	    out.println(student_id);
	    System.out.println("score:"+in.readLine()+"\n"
	    +in.readLine()+"\n"+in.readLine());
	 } catch (IOException e)
	 {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	 }
   }
}
