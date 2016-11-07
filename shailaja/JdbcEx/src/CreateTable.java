import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="Create table Student3(id number(10),name varchar(20),address varchar(20))";
		Statement stmt=obj.createStatement();
		stmt.execute(str);
		//System.out.println(stmt.getClass().getName());
		obj.close();
		
		
	}

}
