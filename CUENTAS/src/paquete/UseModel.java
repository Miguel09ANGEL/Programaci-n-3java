package paquete;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UseModel {

	public UseModel() {

	       
    	String query = "select * from users";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb", "root", "root");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Integer empId = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				Date dob = rs.getDate(4);
				System.out.println("empId:" + empId);
				System.out.println("firstName:" + firstName);
				System.out.println("lastName:" + lastName);
				System.out.println("dob:" + dob);
				System.out.println("");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
	}
}
	}

}
