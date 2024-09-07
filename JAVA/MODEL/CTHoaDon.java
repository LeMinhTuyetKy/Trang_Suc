/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class CTHoaDon {
    private String MaHD,MaSP,MaNV,MaKH,MaKM;
    private int SoLuong, TongTien;
    private Float DaGiam, ThanhTien;

    public CTHoaDon() {
    }

    public CTHoaDon(String MaHD, String MaSP, String MaNV, String MaKH, String MaKM, int SoLuong, int TongTien, Float DaGiam, Float ThanhTien) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.MaKM = MaKM;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
        this.DaGiam = DaGiam;
        this.ThanhTien = ThanhTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public Float getDaGiam() {
        return DaGiam;
    }

    public void setDaGiam(Float DaGiam) {
        this.DaGiam = DaGiam;
    }

    public Float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    

}
