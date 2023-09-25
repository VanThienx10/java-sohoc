package model;

import thuvien.InputHelper;

public class MonHoc {
    private int  maMH,soTiet;
    private String tenMH;

    public MonHoc(){
        maMH = InputHelper.NhapSo("Nhap ma mon hoc: ","Nhap sai kieu du lieu !");
        tenMH  =InputHelper.NhapChuoi("Nhap ten mon hoc: ","Nhap sai do dai !",3,50);
        soTiet = InputHelper.NhapSo("Nhap so tiet: ","Nhap sai kieu du lieu");
    }
    public void InThongTin(){
        System.out.println(maMH+" - Ten Mon Hoc: "+tenMH+" - So tiet: "+soTiet);
    }
    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
}
