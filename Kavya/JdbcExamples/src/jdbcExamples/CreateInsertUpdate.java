package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateInsertUpdate {

	public static void main(String[] args) 
		throws Exception
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		String str = "create table Student2(id number(10), name varchar(20), address varchar(20))";
		
		String str1 = "insert into Student2 values(123,'kavya','NewJersey')";
		
		String str2 = "insert into Student2 values(456,'shiva','Georgia')";
		
		String str3 = "insert into Student2 values(789,'Bharu','India')";
		
		Statement stmt = obj.createStatement();
		
		stmt.execute(str);
		
		stmt.execute(str1);
		
		stmt.execute(str2);
		
		stmt.execute(str3);
		
		String str4 = "update Student2 set name = 'Jaya' where id = 789";
		
		stmt.execute(str4);
		
		obj.close();
	}

}
