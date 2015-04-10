package blog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

public class Blog implements Serializable{

	private User user;
	private ArrayList<Post> allPosts;

	public void save(String filepath) 
	{
		 // TODO Auto-generated method stub
		 FileOutputStream fo=null;
		 ObjectOutputStream os=null;
	    try
	    {
		  fo = new FileOutputStream(filepath);
	       os=new ObjectOutputStream(fo);
		 os.writeObject(this);
		 os.close();
	    } catch (IOException e)
	    {
		  // TODO Auto-generated catch block
		 e.printStackTrace();
	    }
	   
	}
	   
	   
	public void load(String filepath) 
	{
		// TODO Auto-generated method stub
		 FileInputStream fi=null;
		 ObjectInputStream is=null;
	    try
	    {
		  fi = new FileInputStream(filepath);
	       is=new ObjectInputStream(fi);
		 
		 Blog b=(Blog)is.readObject();
		 this.user=b.user;
		 this.allPosts=b.allPosts;
		  
		 is.close();
	    } catch (ClassNotFoundException e)
	    {
		  // TODO Auto-generated catch block
		 e.printStackTrace();
		 
	    } catch (FileNotFoundException e)
	    {
		  System.out.println("Wait! There is something wrong. I cannot find the file..");
		  
	    } catch (IOException e)
	    {
		  // TODO Auto-generated catch block
		 e.printStackTrace();
	    }
		 
	}
	   
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
	 * 
	 * @return
	 */
	public ArrayList<Post> getPost(){
		return allPosts;
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
	 * @param someone
	 */
	public void search(int month, String someone) {

		Calendar cal = Calendar.getInstance();
		// search from all posts
		for (Post p : allPosts) {
			// get the current post's month (note that Calendar.Month starts
			// with 0, not 1)
			cal.setTime(p.getDate());
			int postMonth = cal.get(Calendar.MONTH);

			// TODO write your code here
			if (postMonth == month - 1
					&& p.getContent().contains("@" + someone)) {
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
