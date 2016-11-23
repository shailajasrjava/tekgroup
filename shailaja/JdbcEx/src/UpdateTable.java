import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="create table Student(id number(10),name varchar(20),address varchar(20))";
		Statement stmt=obj.createStatement();
		stmt.execute(str);
		String str1="insert into Student values(1,'shailu','Hyd')";
		String str2="insert into Student values(2,'shailaja','India')";
		String str3="insert into Student values(3,'abc','xyz')";
		String str4="insert into Student values(4,'bcd','USA')";
		stmt.execute(str1);
		stmt.execute(str2);
		stmt.execute(str3);
		stmt.execute(str4);
		String str5="update Student set name='java',address='Hyderabad' where id=3";
		stmt.execute(str5);
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
		}
		
		
		obj.close();	

}
}