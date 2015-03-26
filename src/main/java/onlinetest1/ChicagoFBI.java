package onlinetest1;

import java.util.ArrayList;

public class ChicagoFBI extends FBI {
	String location;

	public ChicagoFBI(int id, String location, String description) {
		super(id, description);
		this.location = location;
	}

	public String toString() {
		return super.id + ":" + location + ":" + super.description;
	}

	public int hunting(ArrayList<String> list, String target) {
		int count = 0;
		for (String s : list) {
			if (s.equals(target)) {
				count += 1;
			}
		}
		return count;
	}

}
