/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.HoaDon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;
public class HoaDonDAO {
    public  List <HoaDon> DocTatCaHoaDon()
    {
        List <HoaDon> listHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM HOADON";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayLap(rs.getString(4));
                hd.setTongTien(rs.getInt(5));
                listHD.add(hd);
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listHD;
    }
    
    public int themHD(HoaDon HD){
        try
        {
            String sql = "INSERT INTO HOADON VALUES(?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, HD.getMaHD());
            pstm.setString(2, HD.getMaNV());
            pstm.setString(3, HD.getMaKH());
            pstm.setString(4, HD.getNgayLap());
            pstm.setInt(5, HD.getTongTien());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int xoaHD(String MAHD){
        try{
            String sql="Delete HOADON Where MAHD=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAHD);
            return psmt.executeUpdate();
        }catch(Exception e){
        e.printStackTrace();
        }
        return -1;
    }
    
    public  List <HoaDon> TimTheoMaHD(String MAHD)
    {
        List <HoaDon> listHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM HOADON WHERE MAHD = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAHD);
            ResultSet rs = psmt.executeQuery();
            while (rs.next())
            {
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaKH(rs.getString(3));
                hd.setNgayLap(rs.getString(4));
                hd.setTongTien(rs.getInt(5));
                listHD.add(hd);
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listHD;
    }
    
}
