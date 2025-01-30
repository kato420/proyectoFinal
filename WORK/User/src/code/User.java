package code;

public class User {
	private String user;
	private String pass;
	private static int count;
	static {
		count = 0;
	}

	public User(String user, String pass) {
		this.user = user;
		this.pass = pass;
		count++;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		User.count = count;
	}

}
