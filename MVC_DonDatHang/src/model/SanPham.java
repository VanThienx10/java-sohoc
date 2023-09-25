package model;

import thuvien.InputHelper;

public class SanPham {
    private int maSP;
    private String tenSP,ghiChu;
    private float giaBan;
    public SanPham(){
        maSP = InputHelper.NhapSo("Nhap ma SP:","Nhap sai!");
        tenSP = InputHelper.NhapChuoi("Nhap ten sp: ","Nhap sai !",3,100);
        ghiChu = InputHelper.NhapChuoi("Nhap ghi chu: ","Nhap sai !",3,100);
        giaBan = (float) InputHelper.NhapSo("Nhap gia ban: ","Nhap sai !");
    }
    public SanPham(int maSP, String tenSP, String ghiChu,float giaBan){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.ghiChu = ghiChu;
        this.giaBan = giaBan;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
}
