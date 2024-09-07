/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class XuatKho {
    private String NgayXuat, MaPX, MaNV;
   
    private float  TienXuat;

    public XuatKho() {
    }

    public XuatKho(String NgayXuat, String MaPX, String MaNV, float TienXuat) {
        this.NgayXuat = NgayXuat;
        this.MaPX = MaPX;
        this.MaNV = MaNV;
        this.TienXuat = TienXuat;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public String getMaPX() {
        return MaPX;
    }

    public void setMaPX(String MaPX) {
        this.MaPX = MaPX;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public float getTienXuat() {
        return TienXuat;
    }

    public void setTienXuat(float TienXuat) {
        this.TienXuat = TienXuat;
    }
    
    
    
}
