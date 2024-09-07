/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class NhanVien {
    private String MaNV, TenNV, DiaChi, SDT, Email,ChucVU;
    //khởi tạo ko tham số

    public NhanVien() 
    {
        
    }
    
    //khởi tạo có tham số

    public NhanVien(String MaNV, String TenNV, String DiaChi, String SDT, String Email, String ChucVU) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.ChucVU = ChucVU;
    }
    //phương thức get set

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getChucVU() {
        return ChucVU;
    }

    public void setChucVU(String ChucVU) {
        this.ChucVU = ChucVU;
    }
    
}
