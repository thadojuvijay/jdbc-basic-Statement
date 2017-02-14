package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tiger");
Statement statement= connection.createStatement();
statement.executeUpdate("insert into employee values(123,'deepthi',18646)");
connection.close();
System.out.println("record insered");
	}

}
