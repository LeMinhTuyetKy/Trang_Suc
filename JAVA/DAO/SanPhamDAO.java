/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.SanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
public class SanPhamDAO {
    public  List <SanPham> DocTatCaSanPham()
    {
        List < SanPham> listSP = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM SANPHAM";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                SanPham sp = new SanPham();
                sp.setMaDM(rs.getString(1));
                sp.setMaSP(rs.getString(2));
                sp.setHinhAnh(rs.getString(3));
                sp.setTenSP(rs.getString(4));
                sp.setSoLuong(rs.getInt(5));
                sp.setMoTa(rs.getString(6));
                sp.setGiaTien(rs.getInt(7));
                listSP.add(sp);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listSP;
    }
    //-------------------------------------------------------//
    public  int themSP(SanPham sp)
    {
        try
        {
            String sql = " INSERT INTO SANPHAM VALUES (?,?,?,?,?,?,?) ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,sp.getMaDM());
            pstm.setString(2,sp.getMaSP());
            pstm.setString(3,sp.getHinhAnh());
            pstm.setString(4,sp.getTenSP());
            pstm.setInt(5,sp.getSoLuong());
            pstm.setString(6,sp.getMoTa());
            pstm.setInt(7,sp.getGiaTien());
            
            return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
    //-------------------------------------------------------//
    public int xoaSP(String MaSP)
    {
        try
        {
            String sql = "DELETE SANPHAM WHERE MASP=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaSP);
            return psmt.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  -1 ;
    }
    //-------------------------------------------------------//
    public  int suaSP(SanPham sp)
    {
        try
        {
            String sql = " UPDATE SANPHAM SET MADM =?, HINHANH=?, TENSP= ?, SOLUONG=?, MOTA=?, GIATIEN=? WHERE MASP =? ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, sp.getMaDM());
            pstm.setString(2, sp.getHinhAnh());
            pstm.setString(3, sp.getTenSP());
            pstm.setInt(4, sp.getSoLuong());
            pstm.setString(5, sp.getMoTa());
            pstm.setInt(6, sp.getGiaTien());
            pstm.setString(7, sp.getMaSP());
        
        return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
