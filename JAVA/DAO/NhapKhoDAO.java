/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.NhapKho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NhapKhoDAO {
    public  List <NhapKho> ReadAllNK()
    {
        List <NhapKho> listnk = new ArrayList<>();
        try
        {
            String sql ="SELECT * FROM PHIEUNHAPHANG";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                NhapKho n = new NhapKho();
                n.setMaPN(rs.getString(1));
                n.setMaNV(rs.getString(2));
                n.setNgayNhap(rs.getString(3));
                n.setThanhTien((rs.getInt(4)));
                listnk.add(n);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listnk;
    }
    //-------------------------------------------------//
    public  int themNK (NhapKho n)
    {
        try
        {
            String sql = "INSERT INTO PHIEUNHAPHANG VALUES (?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,n.getMaPN());
            pstm.setString(2,n.getMaNV());
            pstm.setString(3,n.getNgayNhap());
            pstm.setInt(4,n.getThanhTien());
            return pstm.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    //-------------------------------------------------//
    public int xoaNK (String MaPN )
    {
        try
        {
            String sql = " DELETE PHIEUNHAPHANG WHERE MAPN =?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaPN);
            return psmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    //-------------------------------------------------//
    public   int suaNK (NhapKho nk)
    {
        try
        {
            String sql = "UPDATE PHIEUNHAPHANG SET MANV = ?, NGAYNHAP = ?, TIENNHAP = ? WHERE MAPN = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1,nk.getMaNV());
            pstm.setString(2,nk.getNgayNhap());
            pstm.setInt(3,nk.getThanhTien());
            pstm.setString(4,nk.getMaPN());
            return pstm.executeUpdate();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    
    
    
    
    
}
