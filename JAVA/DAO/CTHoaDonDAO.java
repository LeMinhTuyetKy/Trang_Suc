/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.CTHoaDon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;

public class CTHoaDonDAO {
    public  List <CTHoaDon> DocTatCaCTHD()
    {
        List < CTHoaDon > listCTHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CHITIETHD";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTHoaDon ct = new CTHoaDon();
                ct.setMaHD(rs.getString(1));
                ct.setMaSP(rs.getString(2));
                ct.setMaNV(rs.getString(3));
                ct.setMaKH(rs.getString(4));
                ct.setMaKM(rs.getString(5));
                ct.setSoLuong(rs.getInt(6));
                ct.setTongTien(rs.getInt(7));
                ct.setDaGiam(rs.getFloat(8));
                ct.setThanhTien(rs.getFloat(9));
                listCTHD.add(ct);                             
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listCTHD;
    }
    
    public  List <CTHoaDon> ThanhtienGiam()
    {
        List < CTHoaDon > listCTHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CHITIETHD order by THANHTIEN desc";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTHoaDon ct = new CTHoaDon();
                ct.setMaHD(rs.getString(1));
                ct.setMaSP(rs.getString(2));
                ct.setMaNV(rs.getString(3));
                ct.setMaKH(rs.getString(4));
                ct.setMaKM(rs.getString(5));
                ct.setSoLuong(rs.getInt(6));
                ct.setTongTien(rs.getInt(7));
                ct.setDaGiam(rs.getFloat(8));
                ct.setThanhTien(rs.getFloat(9));
                listCTHD.add(ct);                             
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listCTHD;
    }
    
    public  List <CTHoaDon> ThanhtienTang()
    {
        List < CTHoaDon > listCTHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CHITIETHD order by THANHTIEN asc";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTHoaDon ct = new CTHoaDon();
                ct.setMaHD(rs.getString(1));
                ct.setMaSP(rs.getString(2));
                ct.setMaNV(rs.getString(3));
                ct.setMaKH(rs.getString(4));
                ct.setMaKM(rs.getString(5));
                ct.setSoLuong(rs.getInt(6));
                ct.setTongTien(rs.getInt(7));
                ct.setDaGiam(rs.getFloat(8));
                ct.setThanhTien(rs.getFloat(9));
                listCTHD.add(ct);                             
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listCTHD;
    }
    public int themHD(CTHoaDon HD){
        try
        {
            String sql = "INSERT INTO CHITIETHD (MAHD, MASP, MANV, MAKH, MAKM, SOLUONG) VALUES (?,?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, HD.getMaHD());
            pstm.setString(2, HD.getMaSP());
            pstm.setString(3, HD.getMaNV());
            pstm.setString(4, HD.getMaKH());
            pstm.setString(5, HD.getMaKM());
            pstm.setInt(6, HD.getSoLuong());
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
            String sql="Delete CHITIETHD Where MAHD=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAHD);
            return psmt.executeUpdate();
        }catch(Exception e){
        e.printStackTrace();
        }
        return -1;
    }
    
    public int suaCTHD(CTHoaDon HD){
        try
        {
            String sql = "update CHITIETHD set MANV=?, MAKH=?, MAKM=?, SOLUONG=? WHERE MAHD =? and MASP=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);             
            
            
            pstm.setString(1, HD.getMaNV());
            pstm.setString(2, HD.getMaKH());
            pstm.setString(3, HD.getMaKM());
            pstm.setInt(4, HD.getSoLuong());
            pstm.setString(5, HD.getMaHD());
            pstm.setString(6, HD.getMaSP());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    public  List <CTHoaDon> TimTheoMaHD(String MAHD)
    {
        List <CTHoaDon> listHD = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CHITIETHD WHERE MAHD = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAHD);
            ResultSet rs = psmt.executeQuery();
            while (rs.next())
            {
                CTHoaDon hd = new CTHoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaSP(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setMaKH(rs.getString(4));
                hd.setMaKM(rs.getString(5));
                hd.setSoLuong(rs.getInt(6));
                hd.setTongTien(rs.getInt(7));
                hd.setDaGiam(rs.getFloat(8));
                hd.setThanhTien(rs.getFloat(9));
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






