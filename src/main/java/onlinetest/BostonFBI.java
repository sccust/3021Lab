package onlinetest;

public class BostonFBI extends FBI
{

   private String location;
   
   public BostonFBI(int id, String description,String location) {
	 super(id, description);
	 this.location=location;
	 // TODO Auto-generated constructor stub
	 
   }
   
   public String toString()
   {
	 return id+":"+location+":"+description;
   }
   
   public String encryption(String s,int n)
   {
	 
	 if(n<0)
	 {
	     int nn=(0-n)%(s.length());
	     String rot=s.substring(s.length()-nn);
	     return rot+s.substring(0,s.length()-nn);
	 }
	 else if(n==0)return s;
	 else
	 { 
	     int nn=n%s.length();
	     System.err.println(nn);
	     String rot=s.substring(0,nn);
	     return s.substring(nn)+rot;
	 }
   }

}
