/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.XuatKho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class XuatKhoDAO {
    public List <XuatKho> DocTatCaPhieuXK()
    {
        List <XuatKho> listXK = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM PHIEUXUATHANG";
                    
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
               XuatKho x = new XuatKho();
               
               x.setMaPX(rs.getString(1));
               x.setMaNV(rs.getString(2));
               x.setNgayXuat(rs.getString(3));
               x.setTienXuat(rs.getFloat(4));
           
               listXK.add(x);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listXK;
    }
    //------------------------------------------//
    
    public int ThemXK (XuatKho xk)
    {
        try
        {
            String sql = " INSERT INTO PHIEUXUATHANG VALUES(?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, xk.getMaPX());
            pstm.setString(2, xk.getMaNV());
            pstm.setString(3, xk.getNgayXuat());
            pstm.setFloat(4,xk.getTienXuat());
            
            return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
     //------------------------------------------//
    
    public  int xoaXK (String MaPX )
    {
        try
        {
             String sql = "DELETE PHIEUXUATHANG WHERE MAPX=?";
             Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaPX);
            return psmt.executeUpdate();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
              
    }
     //------------------------------------------//
    public int suaXK(XuatKho xk)
    {
        try
        {
            String sql = "update phieuxuathang set MANV =? ,NGAYXUAT=?,TIENXUAT=? WHERE MAPX =?";
         Connection con = KetNoiCSDL.openConnection();
        PreparedStatement pstm = con.prepareStatement(sql);
        
            pstm.setString(1, xk.getMaNV());
            pstm.setString(2, xk.getNgayXuat());
            pstm.setFloat(3,xk.getTienXuat());
            pstm.setString(4, xk.getMaPX());
            return pstm.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
}
