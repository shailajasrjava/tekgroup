package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;

public class PreparedStatementDemo {
	public static void main(String[] args) throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			String str = "insert into Employee2 values(?,?,?,?)";
			java.sql.PreparedStatement prst = obj.prepareStatement(str);
			prst.setInt(1, 12);
			prst.setString(2, "kavya");
			prst.setInt(3, 15);
			prst.setString(4, "Newjersey");
			int i = prst.executeUpdate();
			System.out.println("the total no. of rows " +i);
			prst.setInt(1, 8);
			prst.setString(2, "Sai");
			prst.setInt(3, 18);
			prst.setString(4, "NewYork");
			int j = prst.executeUpdate();
			System.out.println("rows inserted after second entry" +j);
		}
		catch(Exception e) {
			System.out.println("Handle Exception" +e);
		}
	}
}
