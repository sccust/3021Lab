package onlinetest;

import java.util.ArrayList;

public class OnlineTest
{
   public static void main(String[] args) {
	 ArrayList<FBI> fbis = new ArrayList<FBI>();
	 FBI fbi = new FBI(1, "I am FBI");
	 BostonFBI fbi2 = new BostonFBI(2, "Boston","I am FBI");
	 ChicagoFBI fbi3 = new ChicagoFBI(3, "Chicago","I am FBI");
	 fbis.add(fbi);
	 fbis.add(fbi2);
	 fbis.add(fbi3);
	 for (int i = 0; i < fbis.size(); i++)
	 System.out.println(fbis.get(i));
	 System.out.println(fbi2.encryption("hello", -4));
	 ArrayList<String> names = new ArrayList<String>();
	 names.add("Mike");
	 names.add("Amy");
	 names.add("Justin");
	 names.add("Amy");
	 System.out.println(fbi3.hunting(names, "Amy"));
   }
}