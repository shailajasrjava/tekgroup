package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updatecolumn {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		String str = "create table Employee2(id number(10), name varchar(20), age number(10))";
		
		String str1 = "insert into Employee2 values(12,'kirthi',25)";
		
		String str2 = "insert into Employee2 values(13,'kavya',24)";
		
		String str3 = "insert into Employee2 values(14,'Bharu',22)";
		
		Statement stmt  = obj.createStatement();
		
		stmt.execute(str);
		
		stmt.execute(str1);
		
		stmt.execute(str2);
		
		stmt.execute(str3);
		
		String str4 = "update Employee2 set id = 08 where name = 'kavya'";
		
		stmt.execute(str4);
		
		String str5 = "alter table Employee2 add address varchar(20)";
		
		stmt.execute(str5);
		
		obj.close();

	}

}
