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

	public int hunting(ArrayList<String> list, String target) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				index = i;
			}
		}
		return index;
	}

}
