/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;


import DOAN.JAVA.MODEL.KhuyenMai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class KhuyenMaiDAO {
    public List <KhuyenMai> DocTatCaKhuyenMai()
    {
        List <KhuyenMai> listKM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM KHUYENMAI";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                KhuyenMai km = new KhuyenMai();
                km.setMaNV(rs.getString(1));
                km.setMaKM(rs.getString(2));
                km.setTenLoaiKM(rs.getString(3));
                km.setSoDiemCanDat(rs.getInt(4));
                km.setGioHanDoi(rs.getInt(5));
                km.setSoLanDoi(rs.getInt(6));
                km.setPhanTram(rs.getFloat(7));
                listKM.add(km);                
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listKM;
    }
    
    public int themKM(KhuyenMai KM){
        try
        {
            String sql = "INSERT INTO KHUYENMAI VALUES(?,?,?,?,?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, KM.getMaNV());
            pstm.setString(2, KM.getMaKM());
            pstm.setString(3, KM.getTenLoaiKM());
            pstm.setInt(4, KM.getSoDiemCanDat());
            pstm.setInt(5, KM.getGioHanDoi());
            pstm.setInt(6, KM.getSoLanDoi());
            pstm.setFloat(7, KM.getPhanTram());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int xoaKM(String MANV){
        try{
            String sql="Delete KHUYENMAI Where MAKM=?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1, MANV);
            return psmt.executeUpdate();
        }catch(Exception e){
        e.printStackTrace();
        }
        return -1;
    }
    
        public int suaKM(KhuyenMai KM){
        try
        {
            String sql = "update KHUYENMAI set TENLOAIKM = ?, SODIEMCANDAT=?, GIOIHANDOI =?, SOLANDOI=?, PHANTRAM=? WHERE MAKM=?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, KM.getTenLoaiKM());
            pstm.setInt(2, KM.getSoDiemCanDat());
            pstm.setInt(3, KM.getGioHanDoi());
            pstm.setInt(4, KM.getSoLanDoi());
            pstm.setFloat(5, KM.getPhanTram());
            pstm.setString(6, KM.getMaKM());
            return pstm.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
     public List <KhuyenMai> TimTheoMaNV(String MANV)
    {
        List <KhuyenMai> listKM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM KHUYENMAI WHERE MANV = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm= con.prepareStatement(sql);
            pstm.setString(1, MANV);
            ResultSet rs = pstm.executeQuery();
            listKM.clear();
            while (rs.next())
            {
                KhuyenMai km = new KhuyenMai();
                km.setMaNV(rs.getString(1));
                km.setMaKM(rs.getString(2));
                km.setTenLoaiKM(rs.getString(3));
                km.setSoDiemCanDat(rs.getInt(4));
                km.setGioHanDoi(rs.getInt(5));
                km.setSoLanDoi(rs.getInt(6));
                km.setPhanTram(rs.getFloat(7));
                listKM.add(km);                
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listKM;
    }
     
          public List <KhuyenMai> TimTheoMaKM(String MAKM)
    {
        List <KhuyenMai> listKM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM KHUYENMAI WHERE MAKM = ?";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm= con.prepareStatement(sql);
            pstm.setString(1, MAKM);
            ResultSet rs = pstm.executeQuery();
            listKM.clear();
            while (rs.next())
            {
                KhuyenMai km = new KhuyenMai();
                km.setMaNV(rs.getString(1));
                km.setMaKM(rs.getString(2));
                km.setTenLoaiKM(rs.getString(3));
                km.setSoDiemCanDat(rs.getInt(4));
                km.setGioHanDoi(rs.getInt(5));
                km.setSoLanDoi(rs.getInt(6));
                km.setPhanTram(rs.getFloat(7));
                listKM.add(km);                
            }            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listKM;
    }
     
}
