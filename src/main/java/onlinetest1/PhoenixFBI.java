package onlinetest1;

import java.util.ArrayList;

public class PhoenixFBI extends FBI {

	String location;

	public PhoenixFBI(int id, String location, String description) {
		super(id, description);
		this.location = location;
	}

	public String toString() {
		return super.id + ":" + location + ":" + super.description;
	}

	public int hunting(ArrayList<String> list) {
		int len = 0;
		for (String s : list) {
			len = s.length() > len ? s.length() : len;
		}
		return len;
	}

}
