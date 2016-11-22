package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		Statement st = con.createStatement();
		st.addBatch("create table saalad(id number(10), name varchar(20), price number)");
		st.addBatch("insert into saalad values (111,'ceasar salad',12)");
		st.addBatch("insert into saalad values (222,'Lettuice',8)");
		st.addBatch("insert into saalad values (333,'spinach',9)");
		Thread.sleep(20000);
		st.addBatch("update saalad set price=price+5 where price>7");
		int[] x = st.executeBatch();
		for(int temp : x)
		System.out.println(temp);
		con.close();
	}
}
