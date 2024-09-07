/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class KhuyenMai {
    private String MaNV, MaKM, TenLoaiKM;
    private int SoDiemCanDat,GioHanDoi,SoLanDoi;
    private Float PhanTram;
    // không tham số

    public KhuyenMai() {
    }
    // có tham số

    public KhuyenMai(String MaNV, String MaKM, String TenLoaiKM, int SoDiemCanDat, int GioHanDoi, int SoLanDoi, Float PhanTram) {
        this.MaNV = MaNV;
        this.MaKM = MaKM;
        this.TenLoaiKM = TenLoaiKM;
        this.SoDiemCanDat = SoDiemCanDat;
        this.GioHanDoi = GioHanDoi;
        this.SoLanDoi = SoLanDoi;
        this.PhanTram = PhanTram;
    }
    // get- set

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenLoaiKM() {
        return TenLoaiKM;
    }

    public void setTenLoaiKM(String TenLoaiKM) {
        this.TenLoaiKM = TenLoaiKM;
    }

    public int getSoDiemCanDat() {
        return SoDiemCanDat;
    }

    public void setSoDiemCanDat(int SoDiemCanDat) {
        this.SoDiemCanDat = SoDiemCanDat;
    }

    public int getGioHanDoi() {
        return GioHanDoi;
    }

    public void setGioHanDoi(int GioHanDoi) {
        this.GioHanDoi = GioHanDoi;
    }

    public int getSoLanDoi() {
        return SoLanDoi;
    }

    public void setSoLanDoi(int SoLanDoi) {
        this.SoLanDoi = SoLanDoi;
    }

    public Float getPhanTram() {
        return PhanTram;
    }

    public void setPhanTram(Float PhanTram) {
        this.PhanTram = PhanTram;
    }
    
    
    
}
