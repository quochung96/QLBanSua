package businessLogics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javaBeans.KhachHang;

public class KhachHangBL {
	public static int themKhachHang(KhachHang kh) {
		String sql = "insert into khach_hang(Email,Dien_thoai,Dia_chi,Phai,Ten_khach_hang,Ma_khach_hang) values (?,?,?,?,?,?)";
		int smt=0;
		Connection kn = CSDL.getKetNoi();
		try {
			PreparedStatement pst = kn.prepareStatement(sql);
			pst.setString(1, kh.getEmail());
			pst.setString(2, kh.getDienThoai());
			pst.setString(3, kh.getDiaChi());
			pst.setInt(4, kh.getPhai());
			pst.setString(5, kh.getTenKhachHang());
			pst.setString(6, kh.getMaKhachHang());
			smt = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return smt;
}
}
