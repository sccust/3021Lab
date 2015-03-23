package onlinetest1;

public class BostonFBI extends FBI {

	String location;

	public BostonFBI(int id, String location, String description) {
		super(id, description);
		this.location = location;
	}

	public String toString() {
		return super.id + ":" + location + ":" + super.description;
	}

	public String encryption(String plain, int key) {
		int len = plain.length();
		int shift = Math.abs(key) % len;
		if (key >= 0) {
			return plain.substring(shift, len) + plain.substring(0, shift);
		}
		return plain.substring(len - shift, len)
				+ plain.substring(0, len - shift);
	}

}
