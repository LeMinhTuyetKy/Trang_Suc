/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;


import DOAN.JAVA.MODEL.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TPC
 */
public class TaiKhoanDAO {
    public TaiKhoan dangNhap(String tentk, String password) {
        TaiKhoan tk = null;
        try {
            Connection con = KetNoiCSDL.openConnection();
            String sql = "SELECT * FROM TAIKHOAN WHERE DANGNHAP = ? AND MATKHAU = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, tentk);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                tk = new TaiKhoan();
                tk.setTaiKhoan(rs.getString("DANGNHAP"));
                tk.setTaiKhoan(rs.getString("MATKHAU"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
    
        public int DangKy(TaiKhoan TK){
        try
        {
            String sql = "INSERT INTO TAIKHOAN VALUES(?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, TK.getTaiKhoan());
            pstm.setString(2, TK.getMatKhau());
            pstm.setString(3, TK.getMaNV());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
