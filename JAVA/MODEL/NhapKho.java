/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;




public class NhapKho {
   private String MaPN,MaNV,NgayNhap;
   private int ThanhTien;

    public NhapKho() {
    }

    public NhapKho(String MaPN, String MaNV, String NgayNhap, int ThanhTien) {
        this.MaPN = MaPN;
        this.MaNV = MaNV;
        this.NgayNhap = NgayNhap;
        this.ThanhTien = ThanhTien;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
   

    

    

   
    
    
}
