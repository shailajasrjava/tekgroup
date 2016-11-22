
public class UserRegistration {
	private int rollno;
    private String username;
    private String password;
    private String email;
    public UserRegistration() {
    }

    public UserRegistration(String userName, String password, String email) {
       this.username = username;
       this.password = password;
       this.email = email;
    }
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	    
}
