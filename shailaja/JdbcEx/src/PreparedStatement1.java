import java.sql.*;

public class PreparedStatement1 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="create table Emp (Id number(10),Name varchar(20), Address varchar(20),designation varchar(20))";
		Statement stmt=obj.createStatement();
		stmt.execute(str);
		PreparedStatement ps = obj.prepareStatement("insert into Emp values(?,?,?,?)");
		ps.setInt(1, 100);
		ps.setString(2, "shailaja");
		ps.setString(3, "hyd");
		ps.setString(4, "xyz");
		int count = ps.executeUpdate();
		System.out.println("no of rows inserted:" + count);
		ps.setInt(1, 101);
		ps.setString(2, "abc");
		ps.setString(3, "hyderabad");
		ps.setString(4, "xyz");
		count = ps.executeUpdate();
		System.out.println("no of rows inserted:" + count);
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
		}
		obj.close();
	}

}
