/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.CTXuatKho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CTXuatKhoDAO {
    public List <CTXuatKho>  DocTatCaKhachHang()
    {
         List <CTXuatKho> list = new ArrayList<>();
         try
         {
             String sql = "SELECT * FROM chitietxhang";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTXuatKho k =  new CTXuatKho();
                k.setMaPX(rs.getString(1));
                k.setMaSP(rs.getString(2));
                k.setSoLuong(rs.getInt(3));
                k.setGiamGia(rs.getFloat(4));
                k.setThanhTien(rs.getFloat(5));
                 list.add(k);   
            }
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return  list;
         
    }
    //-------------------------------------------------------------//
    public int themXK (CTXuatKho ct)
    {
        try
        {
            
            String sql = " insert into chitietxhang values( ?,?,?,?,?) ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setString(1, ct.getMaPX());
            pstm.setString(2, ct.getMaSP());
            pstm.setInt(3, ct.getSoLuong());
            pstm.setFloat(4,ct.getGiamGia());
            pstm.setFloat(5,ct.getThanhTien());
            
            return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    //-------------------------------------------------------------//
    public  int Xoact ( String MaPX , String MaSP )
    {
        try
        {
            String sql = " delete chitietxhang where MAPX =? AND MASP =?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaPX);
            psmt.setString(2,MaSP);
             return psmt.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    //-------------------------------------------------------------//
    public  int SuaCT ( CTXuatKho ct)
    {
        try
        {
            String sql ="update chitietxhang set SOLUONG = ?, GIAMGIA =?, THANHTIEN=? WHERE MAPX=? AND MASP = ? ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, ct.getSoLuong());
            pstm.setFloat(2,ct.getGiamGia());
            pstm.setFloat(3,ct.getThanhTien());
             pstm.setString(4, ct.getMaPX());
            pstm.setString(5, ct.getMaSP());
            return pstm.executeUpdate();
            
            
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
}
