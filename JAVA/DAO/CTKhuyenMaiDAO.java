/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.CTKhuyenMai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
public class CTKhuyenMaiDAO {
    
    public  List <CTKhuyenMai> DocTatCaCTKM()
    {
        List <CTKhuyenMai> listCTKM = new ArrayList<>();
        try
        {
            String sql = "SELECT MAKM, CTKHUYENMAI.MAKH, SOLUONGHIENCO, NGAYHETHAN, DIEM FROM CTKHUYENMAI, KHACHHANG WHERE CTKHUYENMAI.MAKH = KHACHHANG.MAKH";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTKhuyenMai ct = new CTKhuyenMai();
                ct.setMaKM(rs.getString(1));
                ct.setMaKH(rs.getString(2));                
                ct.setSoLuong(rs.getInt(3));
                ct.setHanSD(rs.getString(4));
                ct.setDiem(rs.getInt(5));
                listCTKM.add(ct);
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listCTKM;
    }
    
    public  List <CTKhuyenMai> Doc3CTKM()
    {
        List <CTKhuyenMai> listCTKM = new ArrayList<>();
        try
        {
            String sql = " SELECT TOP 3 MAKM, CTKHUYENMAI.MAKH, SOLUONGHIENCO, NGAYHETHAN, DIEM FROM CTKHUYENMAI, KHACHHANG WHERE CTKHUYENMAI.MAKH = KHACHHANG.MAKH ORDER BY CTKHUYENMAI.SOLUONGHIENCO DESC";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                CTKhuyenMai ct = new CTKhuyenMai();
                ct.setMaKM(rs.getString(1));
                ct.setMaKH(rs.getString(2));                
                ct.setSoLuong(rs.getInt(3));
                ct.setHanSD(rs.getString(4));
                ct.setDiem(rs.getInt(5));
                listCTKM.add(ct);
                
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listCTKM;
    }
    
    public int themKM(CTKhuyenMai KM){
        try
        {
            String sql = "INSERT INTO CTKHUYENMAI VALUES(?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, KM.getMaKM());
            pstm.setString(2, KM.getMaKH());
            pstm.setInt(3, KM.getSoLuong());
            pstm.setString(4, KM.getHanSD());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int xoaKM(String MAKM, String MAKH){
        try{
            String sql="Delete CTKHUYENMAI Where MAKM = ? AND MAKH=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAKM);
            psmt.setString(2, MAKH);
            return psmt.executeUpdate();
        }catch(Exception e){
        e.printStackTrace();
        }
        return -1;
    }
    
        public int suaKM(CTKhuyenMai KM){
        try
        {
            String sql = "update CTKHUYENMAI set SOLUONGHIENCO = ?, NGAYHETHAN=? WHERE MAKM=? AND MAKH =?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);             
            
            pstm.setInt(1, KM.getSoLuong());
            pstm.setString(2, KM.getHanSD());
            pstm.setString(3, KM.getMaKM());
            pstm.setString(4, KM.getMaKH());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
        
    public List <CTKhuyenMai> TimTheoMaKM(String MAKM)
    {
        List <CTKhuyenMai> listCTKM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CTKHUYENMAI WHERE MAKM = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAKM);
            ResultSet rs = psmt.executeQuery();
            listCTKM.clear();
            while (rs.next())
            {
                CTKhuyenMai ct = new CTKhuyenMai();
                ct.setMaKM(rs.getString(1));
                ct.setMaKH(rs.getString(2));
                ct.setSoLuong(rs.getInt(3));
                ct.setHanSD(rs.getString(4));
                listCTKM.add(ct);           
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listCTKM;
    }    
    
    public List <CTKhuyenMai> TimTheoMaKH(String MAKH)
    {
        List <CTKhuyenMai> listCTKM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM CTKHUYENMAI WHERE CTKHUYENMAI.MAKH=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MAKH);
            ResultSet rs = psmt.executeQuery();
            listCTKM.clear();
            while (rs.next())
            {
                CTKhuyenMai ct = new CTKhuyenMai();
                ct.setMaKM(rs.getString(1));
                ct.setMaKH(rs.getString(2));
                ct.setSoLuong(rs.getInt(3));
                ct.setHanSD(rs.getString(4));
                listCTKM.add(ct);           
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listCTKM;
    }    
}
