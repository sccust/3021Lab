package onlinetest1;

public class FBI {

	String description;
	int id;

	public FBI(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public String toString() {
		return id + ":" + description;
	}

}
