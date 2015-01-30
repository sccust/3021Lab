package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Demo
{
   public static void main(String[] args) {
	 String line="";
	 List<Pair<String,String>> posts=new ArrayList<String>();
	 //String posts[]={"The weather today is so great!!",""};
	 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  try {
        line = br.readLine();
        if(line.startsWith("post"))
        {
     	 posts.add(line.split(" ")[1]);
     	 System.out.println("Post:"+" "+System.currentTimeMillis());
        }
        else if(line.startsWith("delete"))
        {
     	 
        }
        else if(line.startsWith("list"))
        {
     	 
        }
        else if(line.startsWith("search"))
        {
     	 
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("readString 方法的输入：" + line);
}
}
