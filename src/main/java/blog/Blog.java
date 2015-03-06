package blog;

import java.util.ArrayList;
import java.util.Calendar;

import base.Post;
import base.User;

/**
 * 
 * @author Yingke Zhu
 * @since 2015-2-25
 * 
 */

public class Blog {

	private User user;
	private ArrayList<Post> allPosts;

	/**
	 * Constructor
	 * 
	 * @param user
	 */
	public Blog(User user) {
		this.user = user;
		allPosts = new ArrayList<Post>();
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * 
	 * @param p
	 */
	public void setPosts(ArrayList<Post> p) {
		allPosts = p;
	}

	/**
	 * create a new post in your blog
	 * 
	 * @param post
	 */
	public void post(Post p) {
		allPosts.add(p);
		System.out.println("A new Post:" + "\n" + p.toString());
	}

	/**
	 * list all posts in the blog
	 * 
	 */
	public void list() {

		System.out.println("Current posts:");
		for (int i = 0; i < allPosts.size(); i++) {
			System.out.println("Post[" + (i + 1) + "]:" + allPosts.get(i));
		}
	}

	/**
	 * delete a post from the blog
	 * 
	 * @param index
	 */
	public void delete(int index) {
		if (index > 0 && index <= allPosts.size()) {
			allPosts.remove(index - 1);
		} else {
			System.out.println("Illegal deletion.");
		}
	}

	/**
	 * Search posts created in month and mentioned someone
	 * 
	 * @param month
	 * @param mention
	 */
	public void search(int month, String mention) {
		Calendar cal = Calendar.getInstance();
		for (Post p : allPosts) {
			cal.setTime(p.getDate());
			if (cal.get(Calendar.MONTH) == month - 1
					&& p.getContent().contains("@" + mention)) {
				System.out.println(p);
			}
		}
	}

	@Override
	/**
	 * Output this object in string format 
	 * @return String
	 * 
	 */
	public String toString() {
		String blogInfo = user.toString() + "\n";
		for (int i = 0; i < allPosts.size(); i++) {
			blogInfo += allPosts.get(i) + "\n";
		}
		return blogInfo;
	}

	@Override
	/**
	 * 
	 */
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Blog other = (Blog) o;
		return user.equals(other.getUser());
	}

	@Override
	/**
	 * 
	 * @return
	 */
	public int hashCode() {
		return user.hashCode();
	}
}
