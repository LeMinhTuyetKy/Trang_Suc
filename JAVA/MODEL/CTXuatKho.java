/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class CTXuatKho {

    public String getMaPX() {
        return MaPX;
    }

    public CTXuatKho(String MaPX, String MaSP, int SoLuong, float GiamGia, float ThanhTien) {
        this.MaPX = MaPX;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
    }
    

    public void setMaPX(String MaPX) {
        this.MaPX = MaPX;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public CTXuatKho() {
    }
     private String MaPX, MaSP;
     private int SoLuong;
     private  float GiamGia, ThanhTien;
}
