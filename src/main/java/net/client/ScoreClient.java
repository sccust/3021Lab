package net.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 * @author Xiaodong
 *
 */
public class ScoreClient {  
   public static String HOST_NAME="msr.cse.ust.hk";
   public static String IP_ADDR = "175.159.109.153";//
   public static final int PORT = 3021;//   
     
   public static void main(String[] args) {    
       System.out.println("Client Startup...");     
       while (true) {    
           Socket socket = null;  
           try {  
               IP_ADDR=InetAddress.getByName(HOST_NAME).getHostAddress();//get ip name by domain name
               System.err.println("Connecting to "+HOST_NAME+"("+IP_ADDR+"):"+PORT);
               
               socket = new Socket("175.159.109.35", PORT); //create a stream socket and connect it to a specific port in a server  
                   
    
               /**
                * send message to server
                */
               DataOutputStream out = new DataOutputStream(socket.getOutputStream());    
               System.out.print("Input your student ID: \t");    
               String str = new BufferedReader(new InputStreamReader(System.in)).readLine();    
               out.writeUTF(str);    
               
               
               /**
                * read message from server
                */
               DataInputStream input = new DataInputStream(socket.getInputStream()); 
               String ret = input.readUTF();     
               System.out.println("Info from server: \n" + ret);    
               
               System.out.println("Close Client");    
               Thread.sleep(500);    
               break;    
    
                 
               //out.close();  
               //input.close();  
           } catch (Exception e) {  
               System.out.println("Client Error:" + e.getMessage());   
           } finally {  
               if (socket != null) {  
                   try {  
                       socket.close();  
                   } catch (IOException e) {  
                       socket = null;   
                       System.out.println("Client finally Error:" + e.getMessage());   
                   }  
               }  
           }  
       }    
   }    
}  
