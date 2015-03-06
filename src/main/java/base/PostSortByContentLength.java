package base;

import java.util.Comparator;

public class PostSortByContentLength implements Comparator<Post> {
	@Override
	public int compare(Post p1, Post p2) {
		// TODO write your code here
		int size1 = p1.getContent().length();
		int size2 = p2.getContent().length();
		if (size1 < size2) {
			return -1;
		}
		return (size1 > size2) ? 1 : 0;
	}
}
