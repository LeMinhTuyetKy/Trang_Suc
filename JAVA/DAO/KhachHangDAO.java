/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;
import DOAN.JAVA.MODEL.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class KhachHangDAO {
    public List <KhachHang> DocTatCaKhachHang()
    {
        List <KhachHang> listKH = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM KHACHHANG";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                KhachHang k = new KhachHang();
                k.setMaKH(rs.getString(1));
                k.setTenKH(rs.getString(2));
                k.setDiaChi(rs.getString(3));
                k.setSDT(rs.getString(4));
                k.setEmail(rs.getString(5));
                k.setDiem(rs.getInt(6));
                listKH.add(k);        
            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listKH;
    }
     //----------------------------------------//
    public int themKH(KhachHang kh)
    {
        try
        {
            String sql = " INSERT INTO KHACHHANG VALUES(?,?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,kh.getMaKH());
            pstm.setString(2,kh.getTenKH());
            pstm.setString(3,kh.getDiaChi());
            pstm.setString(4,kh.getSDT());
            pstm.setString(5,kh.getEmail());
            pstm.setInt(6, kh.getDiem());
            
            return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
    //----------------------------------------//
    public  int xoaKH(String MaKH)
    {
        try
        {
            String sql = "DELETE KHACHHANG WHERE MAKH=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaKH);
            return psmt.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
        
        
    }
     //----------------------------------------//
    public int suaKH(KhachHang kh) {
    try {
        String sql = "UPDATE KHACHHANG SET TENKH = ?, DIACHI = ?, DIENTHOAI = ?, EMAIL = ?, DIEM = ? WHERE MAKH = ?";
        Connection con = KetNoiCSDL.openConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, kh.getTenKH());
        pstm.setString(2, kh.getDiaChi());
        pstm.setString(3, kh.getSDT());
        pstm.setString(4, kh.getEmail());
        pstm.setInt(5, kh.getDiem());
        pstm.setString(6, kh.getMaKH());
        return pstm.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return -1;
}

    
}
