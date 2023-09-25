package model;

import thuvien.InputHelper;

public class NhaCungCap {
    private int nhaCC,soDT;
    private String tenNhaCC;

    public NhaCungCap(){
        nhaCC = InputHelper.Nhapso("Nhap ma nha CC: ","Nhap sai kieu du lieu !");
        soDT = InputHelper.Nhapso("Nhap so dien thoai: ","Nhap sai kieu du lieu !");
        tenNhaCC  =InputHelper.NhapChuoi("Nhap ten nha CC: ","Nhap sai do dai !",3,50);
    }
    public NhaCungCap(int nhaCC,String tenNhaCC,int soDT){
        this.nhaCC = nhaCC;
        this.tenNhaCC = tenNhaCC;
        this.soDT = soDT;
    }
    public void InThongTin(){
        System.out.println("Ma nhaCC: "+nhaCC+" - Ten nhaCC: "+tenNhaCC+" - So DT: "+soDT);
    }
    public int getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(int nhaCC) {
        this.nhaCC = nhaCC;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getTenNhaCC() {
        return tenNhaCC;
    }

    public void setTenNhaCC(String tenNhaCC) {
        this.tenNhaCC = tenNhaCC;
    }
}
