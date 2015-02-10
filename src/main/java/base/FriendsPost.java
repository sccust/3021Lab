package base;

import java.util.Date;

public class FriendsPost extends Post{
	
	private User friend;
	
	
	//TODO
	
	public User getFriend() {
		return friend;
	}


	public void setFriend(User friend) {
		this.friend = friend;
	}


	@Override
	public String toString() {
		return friend.toString() + "\n" + super.toString();
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((friend == null) ? 0 : friend.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FriendsPost other = (FriendsPost) obj;
		if (friend == null) {
			if (other.friend != null)
				return false;
		} else if (!friend.equals(other.friend))
			return false;
		return true;
	}


	public FriendsPost(Date date, String content, User friend) {
		super(date, content);
		// TODO Auto-generated constructor stub
		this.friend = friend;
	}

}
