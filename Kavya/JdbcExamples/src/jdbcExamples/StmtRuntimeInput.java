package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StmtRuntimeInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		Statement st = con.createStatement();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter table name");
		String tname = scn.next();
		
		String q1 = "create table "+tname+"(id number,name varchar2(30),age number)";
		int a = st.executeUpdate(q1);
		System.out.println("Table is created "+a);
		
		while(true)
		{
			System.out.println("Enter visitor id");
			int id = scn.nextInt();
			System.out.println("Enter visitor name");
			String name = scn.next();
			System.out.println("Enter visitor age");
			int age = scn.nextInt();
			
			String q2 = "insert into "+tname+" values("+id+",'"+name+"',"+age+")";
			st.executeUpdate(q2);
			System.out.println(q2);
			System.out.println("values are inserted");
			
			System.out.println("Do u want to insert more records(yes/no)");
			String option = scn.next();
			if(option.equals("no")) { 
				break;
			} 
			}
			Thread.sleep(20000);
			
			System.out.println("Enter the table you want to drop");
			String dtable = scn.next();
			
			String q3 = ("drop table "+dtable);
			st.executeUpdate(q3);
			System.out.println("table dropped successfully " +dtable);
			scn.close();
	}
	}
