package onlinetest;

import java.util.ArrayList;

public class ChicagoFBI extends FBI
{

   private String location;
   public ChicagoFBI(int id, String description,String location) {
	 super(id, description);
	 this.location=location;
	 // TODO Auto-generated constructor stub
   }
   
   public String toString()
   {
	 return id+":"+location+":"+description;
   }
   
   public int hunting(ArrayList<String> names, String targetName)
   {
	 int count=0;
       for(String s:names)
       {
     	if(s.equals(targetName))count++;
       }
       return count;
   }

}
