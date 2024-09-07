
package DOAN.JAVA.DAO;

import DOAN.JAVA.MODEL.DMSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class DMSanPhamDAO {
    public  List <DMSanPham> DocTatCaDanhMuc()
    {
        List <DMSanPham> listDM = new ArrayList<>();
        try
        {
            String sql = "SELECT * FROM DANHMUCSP";
            Connection con = KetNoiCSDL.openConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next())
            {
                DMSanPham dm = new DMSanPham();
                dm.setMaNV(rs.getString(1));
                dm.setMaDM(rs.getString(2));
                dm.setTenDM(rs.getString(3));
                listDM.add(dm);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return listDM;
    }
    //----------------------------------------//
    public  int themDM(DMSanPham dm)
    {
        try
        {
            String sql = " INSERT INTO DANHMUCSP VALUES(?,?,?)";
            Connection con = KetNoiCSDL.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, dm.getMaNV());
            pstm.setString(2, dm.getMaDM());
            pstm.setString(3, dm.getTenDM());
            
            return pstm.executeUpdate();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
     //----------------------------------------//
    
    public  int xoaDM(String MaDM)
    {
        try
        {
            String sql = " DELETE DANHMUCSP WHERE MADM = ?";
            Connection con=KetNoiCSDL.openConnection();
            PreparedStatement psmt=con.prepareStatement(sql);
            psmt.setString(1,MaDM);
            return psmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  -1;
    }
}