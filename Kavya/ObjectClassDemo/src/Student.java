
public class Student {
	
		private String regNo;
		
	public Student(String regNo)
	{
	this.regNo = regNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	@Override
	public boolean equals(Object s2) {
		// TODO Auto-generated method stub
		return this.regNo == ((Student)s2).regNo;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.regNo.hashCode();
	}
}