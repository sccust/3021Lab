package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

import base.Post;
import base.User;
import blog.Blog;

public class TestSearchSort {

	public static void main(String[] args) {

		// ********************Task 1: sort users by ID

		User userA = new User(2, "A", "a@cse.ust.hk");
		User userB = new User(1, "B", "b@cse.ust.hk");
		User userC = new User(4, "C", "c@cse.ust.hk");
		User userD = new User(3, "D", "d@cse.ust.hk");
		ArrayList<User> allusers = new ArrayList<User>();
		allusers.add(userA);
		allusers.add(userB);
		allusers.add(userC);
		allusers.add(userD);

		System.out.println("***Sort users by ID in ascending order***");
		Collections.sort(allusers);
		for (User u : allusers) {
			System.out.println(u);
		}

		// *******************Task 2: sort posts by date

		ArrayList<Post> allposts = new ArrayList<Post>();
		// Month starts with 0, not 1
		Calendar cal1 = new GregorianCalendar(2015, 02, 1); // March 1, 2015

		Date date1 = cal1.getTime();
		allposts.add(new Post(date1, "No sunshine these days"));

		Calendar cal4 = new GregorianCalendar(2014, 11, 25); // Dec. 25, 2014
		allposts.add(new Post(cal4.getTime(), "Merry Xmas @Amy!"));

		Calendar cal3 = new GregorianCalendar(2015, 01, 2); // Feb 2, 2015
		allposts.add(new Post(cal3.getTime(),
				"New semester starts. Fighting!!!"));

		Calendar cal2 = new GregorianCalendar(2015, 01, 18); // Feb 18, 2015
		allposts.add(new Post(cal2.getTime(),
				"Thanks @Amy for your beautiful gift"));

		System.out.println("\n***Sort posts by date (latest to earliest)***");
		Collections.sort(allposts, Collections.reverseOrder());
		for (Post p : allposts) {
			System.out.println(p);
		}

		// *****************Task 3: sort post by the length of content

		System.out.println("\n***Sort posts by the length of content***");
		Collections.sort(allposts, new Comparator<Post>() {
			@Override
			public int compare(Post p1, Post p2) {
				int size1 = p1.getContent().length();
				int size2 = p2.getContent().length();
				if (size1 < size2) {
					return -1;
				}
				return (size1 > size2) ? 1 : 0;
			}
		});
		for (Post p : allposts) {
			System.out.println(p);
		}

		// ******************Task 4: search posts

		System.out
				.println("\n***Search posts created in Feb and mentioned Amy***");
		Blog blog = new Blog(userA);
		blog.setPosts(allposts);
		blog.search(2, "Amy");

	}

}
