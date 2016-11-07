package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		String str = "create table coffeeshop(Supp_id number(10), coffeename varchar(20), price number(10))";
		Statement stmt = obj.createStatement();
		stmt.execute(str);
		//inserting data using prepared statement//
		PreparedStatement prs = obj.prepareStatement("insert into coffeeshop values(?,?,?)");
		prs.setInt(1, 123);
		prs.setString(2, "Cold Coffee");
		prs.setFloat(3, 4.75f);
		int i = prs.executeUpdate();
		System.out.println("First row inserted " +i);
		prs.setInt(1, 321);
		prs.setString(2, "Hot Chocolate");
		prs.setFloat(3, 5.25f);
		int j = prs.executeUpdate();
		System.out.println("Second row inserted " +j);
		prs.setInt(1, 432);
		prs.setString(2, "capuccino");
		prs.setFloat(3, 3.50f);
		int k = prs.executeUpdate();
		System.out.println("Third row inserted " +k);
		//Retrieving record using ResultSet//
		try {
		Statement stmt1 = obj.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt1.executeQuery("select * from coffeeshop");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
	}
		catch(Exception e) {
			System.out.println("SQLException" +e);
		}
} }
