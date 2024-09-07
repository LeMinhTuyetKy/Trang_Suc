/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class KhachHang {
    // cài đặt thuộc tính cho cái class
    private String MaKH, TenKH, DiaChi, SDT, Email;
    private int Diem;
    
    //Khởi tạo ko tham số
    public KhachHang()
    {
        
    }
    // Khởi tạo có tham số

    public KhachHang(String MaKH, String TenKH, String DiaChi, String SDT, String Email, int Diem) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.Diem = Diem;
    }
    //get - set

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
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

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }
   
    
}
