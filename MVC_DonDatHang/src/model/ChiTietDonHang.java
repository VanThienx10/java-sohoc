package model;

import thuvien.InputHelper;

public class ChiTietDonHang {
    private int id,maDDH,maSP,soLuong;

    public ChiTietDonHang(){
        id = InputHelper.NhapSo("Nhap ID: ","Nhap sai!");
        maDDH = InputHelper.NhapSo("Nhap maDDH: ","Nhap sai!");
        maSP = InputHelper.NhapSo("Nhap maSP: ","Nhap sai!");
        soLuong = InputHelper.NhapSo("Nhap so luong: ","Nhap sai!");
    }
    public ChiTietDonHang(int id,int maDDH,int maSP, int soLuong){
        this.id = id;
        this.maDDH = maDDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
