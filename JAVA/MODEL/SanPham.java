/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class SanPham {
    private String MaDM,MaSP,HinhAnh,TenSP,MoTa;
    private int SoLuong, GiaTien;
    //---------------------------------------//

    public SanPham() 
    {
        
    }
    //---------------------------------------//

    public SanPham(String MaDM, String MaSP, String HinhAnh, String TenSP, String MoTa, int SoLuong, int GiaTien) {
        this.MaDM = MaDM;
        this.MaSP = MaSP;
        this.HinhAnh = HinhAnh;
        this.TenSP = TenSP;
        this.MoTa = MoTa;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
    }
    //--------------------------------------//

    public String getMaDM() {
        return MaDM;
    }

    public void setMaDM(String MaDM) {
        this.MaDM = MaDM;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(int GiaTien) {
        this.GiaTien = GiaTien;
    }
    
    
}
