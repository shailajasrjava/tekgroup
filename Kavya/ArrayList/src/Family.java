
public class Family implements Comparable<Family> {
	String fname;
	String lname;
	int age;
		
	public Family(String fname, String lname, int age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public int compareTo(Family f)
	{
		/*if(age==f.age)
		return 0;
		else if(age>f.age)
			return 1;
		else
			return -1;*/
			
	return this.fname.compareTo(f.getFname());	
	}
	
}