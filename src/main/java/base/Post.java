package base;

import java.util.Date;

/**
 * 
 * @author Ming WEN
 * @since 2015-2-10
 * 
 */

public class Post implements Comparable<Post> {

	private Date date;
	private String content;

	/**
	 * Constructor
	 * 
	 * @param date
	 * @param content
	 */
	public Post(Date date, String content) {
		this.date = date;
		this.content = content;
	}

	/**
	 * 
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 */

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @return the content of the blog
	 */

	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 */

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	/**
	 * Output this object in string format 
	 * @return String
	 * 
	 */
	public String toString() {
		String content = date.toString() + "\n";
		content += this.content;
		return content;
	}

	@Override
	/**
	 * Check whether this object equals object o
	 * @param object o
	 * @return Boolean
	 *  
	 */
	public boolean equals(Object o) {
		// an object should equals to itself
		if (o == this)
			return true;

		// an object should not equal to null
		if (o == null)
			return false;

		// If there are not in the same class, they shouldn't be equal
		if (o.getClass() != Post.class)
			return false;

		// Transfer o to object Post
		Post blog = (Post) o;

		// both the date and the content must the same
		if (this.date.equals(blog.getDate())
				&& this.content.equals(blog.getContent()))
			return true;
		else
			return false;
	}

	/**
	 * check whether this post contains some keyword
	 * 
	 * @param keyword
	 * @return
	 */

	public boolean contains(String keyword) {
		if (content.contains(keyword))
			return true;
		else
			return false;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {

		return (int) date.hashCode() * content.hashCode();
	}

	@Override
	public int compareTo(Post p) {
		// TODO write your code here
		return this.getDate().compareTo(p.getDate());
	}

}
