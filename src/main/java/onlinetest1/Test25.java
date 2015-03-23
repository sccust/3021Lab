package onlinetest1;

import java.util.ArrayList;

public class Test25 {

	public static void main(String[] args) {

		ArrayList<FBI> fbis = new ArrayList<FBI>();

		FBI fbi = new FBI(1, "I am FBI");

		MiamiFBI fbi2 = new MiamiFBI(2, "Miami", "I am FBI");

		PhoenixFBI fbi3 = new PhoenixFBI(3, "Phoenix", "I am FBI");

		fbis.add(fbi);

		fbis.add(fbi2);

		fbis.add(fbi3);

		for (int i = 0; i < fbis.size(); i++) {
			System.out.println(fbis.get(i));
		}

		System.out.println(fbi2.encryption("abc", 4));
		System.out.println(fbi2.encryption("abc", -2));
		System.out.println(fbi2.encryption("xyz", 28));
		System.out.println(fbi2.encryption("xyz", -1));
		System.out.println(fbi2.encryption("xyz", 0));

		ArrayList<String> names = new ArrayList<String>();

		names.add("Mike");
		System.out.println(fbi3.hunting(names));

		names.add("Amy");

		names.add("Justin");

		names.add("Amy");
		System.out.println(fbi3.hunting(names));

	}

}