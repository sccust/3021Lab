package onlinetest1;

public class MiamiFBI extends FBI {

	String location;

	public MiamiFBI(int id, String location, String description) {
		super(id, description);
		this.location = location;
	}

	public String toString() {
		return super.id + ":" + location + ":" + super.description;
	}

	public String encryption(String plain, int key) {
		int shift = key % 26;
		shift = shift < 0 ? shift + 26 : shift;
		String newStr = "";
		for (int i = 0; i < plain.length(); i++) {
			int ascii = (int) plain.charAt(i) + shift;
			ascii = ascii > 122 ? ascii - 26 : ascii;
			char newChar = (char) ascii;
			newStr += newChar;
		}
		return newStr;
	}

}
