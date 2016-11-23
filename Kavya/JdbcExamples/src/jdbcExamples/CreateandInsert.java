package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CreateandInsert {

	 public void method() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		String str = "create table Myfamily1(name varchar(20), age number(5))";
		
		String str1= "insert into Myfamily1 values('kavya', 25)";
		
		String str2= "insert into Myfamily1 values('Bharu', 23)";
	
		Statement stmt = obj.createStatement();
		
		stmt.execute(str);
		
		stmt.execute(str1);
		
		stmt.execute(str2);
		
		obj.close(); 
	}	
public static void main(String args[]) throws Exception
	{
		CreateandInsert kk = new CreateandInsert();
		kk.method();
	}
}