package task.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqltest {

	 static String result;
	 public static void main(String[] args) throws IOException,
	 ClassNotFoundException, SQLException {


	 Class.forName("oracle.jdbc.driver.OracleDriver");// ������������

		//<ConfigItem name="USER_LOGIN_LOG_DB_URL" remarks="���Ӵ�">jdbc:oracle:thin:@130.38.27.112:1521:netdb</ConfigItem>
	//	<ConfigItem name="USER_LOGIN_LOG_DB_DRIVER" remarks="����">oracle.jdbc.driver.OracleDriver</ConfigItem>
	 String url = "jdbc:oracle:thin:@130.38.27.112:1521:netdb";// URLָ��Ҫ���ʵ����ݿ���message_old

	 String user = "netuser";// oracle����ʱ���û���

	 String password = "netuser";// oracle����ʱ������

	 Connection connection = DriverManager.getConnection(url, user, password);// �������ݿ�

	 if (!connection.isClosed()) {

	 System.out.println("Succeeded connecting to the Database!");
	 }


	 Statement statement = connection.createStatement();// statement����ִ��SQL���
	 String sql = "select * from ord_order_info where order_id=314";
	 ResultSet rs = statement.executeQuery(sql);// ִ��SQL��䲢���ؽ����

	 while (rs.next()) {


	    result=rs.getString(2).toString();
	    System.out.println(result);
	  
	 }
	 rs.close();// �رչ���

	 connection.close();

	// return result;
	 }
	 }