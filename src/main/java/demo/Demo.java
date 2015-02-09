package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.data.Pair;

public class Demo
{
   
	private static void welcomeInfo() {
		 System.out.println("===============================================");
		 System.out.println("==                                           ==");
		 System.out.println("==      Welcome to Microblog (COMP 3021)     ==");
		 System.out.println("==                                           ==");
		 System.out.println("===============================================");
		 System.out.println();
		 System.out.println("command option       function");
		 System.out.println("  exit               Exit the program");
		 System.out.println("  post  <Content>    Post a miroblog");
		 System.out.println("  list               List all your posts");
		 System.out.println("delete  <Index>      Delete one your post");
		 System.out.println("search  <Key Words>  Search from your posts");
	}
	
	private static void exitInfo() {
		 System.out.println("===============================================");
		 System.out.println("==                                           ==");
		 System.out.println("==      See you next Time:)  (COMP 3021)     ==");
		 System.out.println("==                                           ==");
		 System.out.println("===============================================");
	
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
	 String line = "";
	 List<Pair<String, String>> posts = new ArrayList<Pair<String, String>>();
	 // String posts[]={"The weather today is so great!!",""};
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 welcomeInfo();

	 
	 try
	 {
	    line = br.readLine();
	    while (!line.startsWith("exit"))
	    {
		  if (line.startsWith("post"))
		  {
			String content = line.substring(5);
			long time = System.currentTimeMillis();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String datetime = dateFormat.format(new Date(time));
			posts.add(Pair.create(content, datetime));
			System.out.println("Post:" + content + " [" + datetime + "]");
		  }
		  else if (line.startsWith("delete"))
		  {
			int index = Integer.parseInt(line.split(" ")[1]);
			posts.remove(index-1);
		  }
		  else if (line.startsWith("list"))
		  {
			System.out.println("Current Posts:");
			for (int i = 0; i < posts.size(); i++)
			{
			   Pair<String, String> post = posts.get(i);
			   System.out.println("post " + (i+1) + ": [" + post.second + "]" + post.first);
			}
		  }
		  else if (line.startsWith("search"))
		  {
			String keyword = line.split(" ")[1];
			for (int i = 0; i < posts.size(); i++)
			{
			   Pair<String, String> post = posts.get(i);
			   if (post.first.contains(keyword))
			   {
				 System.out
					  .println("post " + (i+1) + ": [" + post.second + "]" + post.first);
			   }
			}
		  }
		  line = br.readLine();
	    }
	    exitInfo();
	 } catch (IOException e)
	 {
	    e.printStackTrace();
	 }
   }
}
