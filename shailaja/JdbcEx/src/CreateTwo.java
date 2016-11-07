import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTwo {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="create table Student(sId number(10),sName varchar(20),sAddress varchar(20))";
		String str1="create table Faculty(fId number(10),fName varchar(20),fAddress varchar(20))";
		Statement stmt=obj.createStatement();
		stmt.execute(str);
		stmt.execute(str1);
		PreparedStatement ps = obj.prepareStatement("insert into Student values(?,?,?)");
		PreparedStatement ps1 = obj.prepareStatement("insert into Faculty values(?,?,?)");
		
		ps.setInt(1, 100);
		ps.setString(2, "shailaja");
		ps.setString(3, "hyd");
		int count = ps.executeUpdate();
		System.out.println("no of rows inserted:" + count);
		
		ps.setInt(1, 106);
		ps.setString(2, "shailaja6");
		ps.setString(3, "hyd6");
		int count2 = ps.executeUpdate();
		System.out.println("no of rows inserted:" + count2);
		
		ps1.setInt(1, 101);
		ps1.setString(2, "shailaja1");
		ps1.setString(3, "hyd1");
		int count1 = ps1.executeUpdate();
		System.out.println("no of rows inserted:" + count1);
		
		ps1.setInt(1, 107);
		ps1.setString(2, "shailaja13");
		ps1.setString(3, "hyd13");
		int count3 = ps1.executeUpdate();
		System.out.println("no of rows inserted:" + count3);
		
		ResultSet rs=stmt.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
		}
		ResultSet rs1=stmt.executeQuery("select * from Faculty");
		while(rs1.next())
		{
			System.out.println(rs1.getInt(1));
			System.out.println(rs1.getString(2));
			System.out.println(rs1.getString(3));
			
		}
		obj.close();
	

}
}