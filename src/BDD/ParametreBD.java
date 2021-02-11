package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ParametreBD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gestioncongés?useUnicode=true"
							+ "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + "serverTimezone=UTC",
					"root", "pepito2A");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from salaries");
			System.out.println("nom" + " | " + "prenom");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "       | " + rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
