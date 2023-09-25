package model;

import thuvien.InputHelper;

import java.time.LocalDate;
import java.util.Locale;

public class DonDatHang {
    private int maDDH;
    private String soHieuDon;
    private LocalDate ngayTao;

    public DonDatHang(){
        maDDH = InputHelper.NhapSo("Nhap ma DDH: ","Nhap sai !");
        soHieuDon  = InputHelper.NhapChuoi("Nhap so hieu don: ","Nhap sai!",3,50);
        ngayTao =InputHelper.NhapNgayTao(2023,8,2);
    }
    public DonDatHang(int maDDH,String soHieuDon,LocalDate ngayTao){
        this.maDDH = maDDH;
        this.soHieuDon = soHieuDon;
        this.ngayTao = ngayTao;
    }
    public int getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(int maDDH) {
        this.maDDH = maDDH;
    }

    public String getSoHieuDon() {
        return soHieuDon;
    }

    public void setSoHieuDon(String soHieuDon) {
        this.soHieuDon = soHieuDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }
}
