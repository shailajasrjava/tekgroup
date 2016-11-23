package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public void Method() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		
		Statement stmt = obj.createStatement();
		
		String str = "update Myfamily1 set name = 'Shiva' where age = 23";
		
		stmt.execute(str);
		
		obj.close();
	}
public static void main(String args[]) throws Exception
{
	Update ss = new Update();
	
	ss.Method();
}
}
