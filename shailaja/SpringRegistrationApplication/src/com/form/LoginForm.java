package com.form;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
public class LoginForm 
{
	@NotEmpty
	@Size(min =1, max = 50)
private String name;
	@NotEmpty
	@Size(min = 1, max = 20)
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
