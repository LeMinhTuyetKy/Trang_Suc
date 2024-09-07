/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DOAN.JAVA.MODEL;

/**
 *
 * @author KHOI
 */
public class DMSanPham {
    private String MaNV, MaDM, TenDM;
    //-----------------------//

    public DMSanPham() {
    }

    public DMSanPham(String MaNV, String MaDM, String TenDM) {
        this.MaNV = MaNV;
        this.MaDM = MaDM;
        this.TenDM = TenDM;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaDM() {
        return MaDM;
    }

    public void setMaDM(String MaDM) {
        this.MaDM = MaDM;
    }

    public String getTenDM() {
        return TenDM;
    }

    public void setTenDM(String TenDM) {
        this.TenDM = TenDM;
    }
    
}