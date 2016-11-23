
public class TestUse {

	
String name;
Float salary;
String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Float getSalary() {
	return salary;
}
public void setSalary(Float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "TestUse [name=" + name + ", salary=" + salary + ", address=" + address + "]";
}


}
