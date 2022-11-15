package businessLogics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection kn;
	private static String url = "jdbc:mysql://localhost:3306/qlbansua?useUnicode=true&characterEncoding=UTF-8";
	public static Connection getKetNoi() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				try {
					kn = DriverManager.getConnection(url, "root", "");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			 	}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return kn;
	
}
////	public static void main(String[] args) {
////		try {
////			Connection kn =  getKetNoi();
////			System.out.println("Thanh cong");
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
//	}
}