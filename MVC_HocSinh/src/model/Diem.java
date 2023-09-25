package model;

import thuvien.InputHelper;

public class Diem {
    private int maHS,maMH;
    private double diem;

    public Diem(){
        maHS = InputHelper.NhapSo("Nhap ma hoc sinh: ","Nhap sai kieu du lieu !");
        maMH = InputHelper.NhapSo("Nhap ma mon hoc: ","Nhap sai kieu du lieu !");
        diem = InputHelper.NhapDiem("Nhap so diem: ","Nhap sai kieu du lieu!");
    }
    public  Diem(int maHS, int maMH, double diem){
        this.maHS = maHS;
        this.maMH = maMH;
        this.diem = diem;
    }
    public void InThongTin(){
        System.out.println("Ma HS: "+maHS+" - Ma MH: "+maMH+" - Diem: "+diem);
    }
    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
