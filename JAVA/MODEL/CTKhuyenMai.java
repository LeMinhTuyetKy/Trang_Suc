/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class CTKhuyenMai {
    private String MaKM, MaKH, HanSD;
    private int SoLuong, Diem;
    //khởi tạo ko tham số

    public CTKhuyenMai() 
    {
        
    }
    //Khởi tạo có tham số

    public CTKhuyenMai(String MaKM, String MaKH, int Diem, String HanSD, int SoLuong) {
        this.MaKM = MaKM;
        this.MaKH = MaKH;
        this.Diem = Diem;
        this.HanSD = HanSD;
        this.SoLuong = SoLuong;
    }
    // phương thức get set

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHanSD() {
        return HanSD;
    }

    public void setHanSD(String HanSD) {
        this.HanSD = HanSD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
