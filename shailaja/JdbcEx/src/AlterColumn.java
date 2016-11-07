import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AlterColumn {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shailaja");
		String str="create table Emp4 (Id number(10),Name varchar(20), Address varchar(20))";
		Statement stmt=obj.createStatement();
		//stmt.execute(str);
		int e=stmt.executeUpdate(str);
		String str1="insert into Emp4 values(101,'shailaja','California')";
		String str2="insert into Emp4 values(102,'kavya','NewJersy')";
		String str3="insert into Emp4 values(103,'emp','Cali')";
		String str4="insert into Emp4 values(104,'emp','Georgia')";
		String str5="update emp4 set name='java',address='Hyderabad' where id=102";
		stmt.execute(str1);
		stmt.execute(str2);
		stmt.execute(str3);
		int b=stmt.executeUpdate(str4);
		int c=stmt.executeUpdate(str5);//here updating only one row so retunrs 1
		System.out.println(e);//create str 0
		String str6="alter table Emp4 add Designation varchar(20)";
		int a=stmt.executeUpdate(str6);
		System.out.println(b);//insert str4 1
		System.out.println(c);
		System.out.println(a);//here adding col is not updating so returns 0
		String str7="update Emp4 set name='ammu' where id=103 or id=104";
		int d=stmt.executeUpdate(str7);
		System.out.println(d);//update row str7 no of rows updated
		String str8="drop table Emp4";
		int f=stmt.executeUpdate(str8);
		System.out.println(f);//drop str8 returns 0 after dropping
		obj.close();
		
		

}
}