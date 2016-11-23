import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="create table Table3(id number(10),name varchar(20),address varchar(20))";
		Statement stmt=obj.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Table3");
		System.out.println("-IF   "+rs.next());
		while(rs.next()){
			System.out.println("--ID " + rs.getString("id"));
		}
		
		System.out.println("--"+rs.getFetchSize());
	//stmt.execute(str);
/*		String str1="insert into Table3 values(1,'shailu','Hyd')";
		String str2="insert into Table3 values(2,'shailaja','India')";
		String str3="insert into Table3 values(3,'abc','Hyderabad')";
		String str4="insert into Table3 values(4,'bcd','USA')";
		stmt.execute(str1);
		stmt.execute(str2);
		stmt.execute(str3);
		stmt.execute(str4);
		obj.close();*/
}
}
