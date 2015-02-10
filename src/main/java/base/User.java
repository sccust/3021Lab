package base;

/**
 * 
 * @author Ming WEN
 * @since 2013-2-10
 * 
 */

public class User {
	
	private int userId;
	private String userName;
	private String userEmail;
	
	/**
	 * Constructor
	 * @param userId
	 * @param userName
	 * @param userEmail
	 */
	public User(int userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}
	/**
	 * 
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * 
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * 
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userEmail=" + userEmail + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	
	
}
