/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;
import DOAN.JAVA.MODEL.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {
    public  List <NhanVien> DocTatCaNhanVien()
    {
        List <NhanVien> listNV = new ArrayList<>();
        try
        {
           String sql = "SELECT * FROM NHANVIEN";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                NhanVien n = new NhanVien();
                n.setMaNV(rs.getString(1));
                n.setTenNV(rs.getString(2));
                n.setDiaChi(rs.getString(3));
                n.setSDT(rs.getString(4));
                n.setEmail(rs.getString(5));
                n.setChucVU(rs.getString(6));
                listNV.add(n);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  listNV;
        
    }
    //-------------------------------------------------------//
    public int themNV (NhanVien nv)
    {
        try
        {
            String sql = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?)";
             Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nv.getMaNV());
            pstm.setString(2, nv.getTenNV());
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4, nv.getSDT());
            pstm.setString(5, nv.getEmail());
            pstm.setString(6, nv.getChucVU());
            
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
        return -1;
    }
    //-------------------------------------------------------//
    public  int xoaNV( String MaNV)
    {
        try
        {
            String sql = "DELETE NHANVIEN WHERE MANV=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaNV);
            return psmt.executeUpdate();
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
               
    }
    //-------------------------------------------------------//
    public  int suaNV ( NhanVien nv)
    {
        try
        {
            String sql = " UPDATE NHANVIEN SET TENNV =? , DIACHI=?, DIENTHOAI=?,EMAIL=?, CHUCVU=? WHERE MANV=? ";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1,nv.getTenNV());
             pstm.setString(2,nv.getDiaChi());
              pstm.setString(3,nv.getSDT());
               pstm.setString(4,nv.getEmail());
                pstm.setString(5,nv.getChucVU());
                 pstm.setString(6,nv.getMaNV());
                 
                 return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return  -1;
        
    }
    
    
}
