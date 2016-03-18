package task.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	 static String result;
	 public static String sql_test(String sql) throws IOException,
	 ClassNotFoundException, SQLException {


	 Class.forName("oracle.jdbc.driver.OracleDriver");// 加载驱动程序

		//<ConfigItem name="USER_LOGIN_LOG_DB_URL" remarks="连接串">jdbc:oracle:thin:@130.38.27.112:1521:netdb</ConfigItem>
	//	<ConfigItem name="USER_LOGIN_LOG_DB_DRIVER" remarks="驱动">oracle.jdbc.driver.OracleDriver</ConfigItem>
	 String url = "jdbc:oracle:thin:@130.38.27.112:1521:netdb";// URL指向要访问的数据库名message_old

	 String user = "netdb";// oracle配置时的用户名

	 String password = "netdb";// oracle配置时的密码

	 Connection connection = DriverManager.getConnection(url, user, password);// 连续数据库

	 if (!connection.isClosed()) {

	 System.out.println("Succeeded connecting to the Database!");
	 }


	 Statement statement = connection.createStatement();// statement用来执行SQL语句

	 ResultSet rs = statement.executeQuery(sql);// 执行SQL语句并返回结果集

	 while (rs.next()) {


	    result=rs.getString(1).toString();
	  
	 }
	 rs.close();// 关闭果集

	 connection.close();

	 return result;
	 }
	 }
