/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.CTNhapKho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CTNhapKhoDAO {
    public  List<CTNhapKho> DocTatCaCTNK()
    {
        List<CTNhapKho> listctnk = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CHITIETPNH ";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTNhapKho n = new CTNhapKho();
                n.setMaPN(rs.getString(1));
                 n.setMaSP(rs.getString(2));
                 n.setSoLuong(rs.getInt(3));
                 n.setThanhTien(rs.getInt(4));
                 listctnk.add(n);
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listctnk;
    }
    
    //----------------------------------------------------------------------------/
    public int themNK ( CTNhapKho ct)
    {
        try
        {
            String sql = "INSERT INTO CHITIETPNH VALUES(?,?,?,?)";
             Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, ct.getMaPN());
            pstm.setString(2, ct.getMaSP());
            pstm.setInt(3, ct.getSoLuong());
            pstm.setInt(4, ct.getThanhTien());
            
            
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        return -1;
    }
    //----------------------------------------------------------------------------//
    public  int xoactxk(String MaPN ,String MaSP)
    {
        try
        {
            String sql = "DELETE CHITIETPNH WHERE MAPN = ? and MASP = ? ";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaPN);
            psmt.setString(2,MaSP);
            return psmt.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
        
        
    }
    //----------------------------------------------------------------------------//
    
    
    public int SuaCTXK (CTNhapKho xk)
    {
        try
        {
            String sql = " update CHITIETPNH SET SOLUONG = ?, THANHTIEN = ? WHERE MAPN = ? AND MASP = ?  ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
        
            pstm.setInt(1,xk.getSoLuong());
             pstm.setInt(2,xk.getThanhTien());
              pstm.setString(3, xk.getMaPN());
                pstm.setString(4, xk.getMaSP());
            return pstm.executeUpdate();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
}
