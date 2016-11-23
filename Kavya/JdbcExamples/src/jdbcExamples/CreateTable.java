package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		String str = "create table workers(id number(10), name varchar(10), salary number(10))";
		
		Statement stmt= obj.createStatement();
		
		stmt.executeUpdate(str);
		
		obj.close();
	}

}
