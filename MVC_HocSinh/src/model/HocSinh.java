package model;

import thuvien.InputHelper;

import java.time.LocalDate;

public class HocSinh {
    private int maHS;
    private String tenHS;
    private LocalDate ngaySinh;
    public HocSinh(){
        maHS = InputHelper.NhapSo("Nhap ma hoc sinh: ","Nhap sai kieu du lieu !");
        tenHS = InputHelper.NhapChuoi("Nhap ten: ","Nhap sai do dai !",3,50);
        ngaySinh = InputHelper.NhapNgaySinh("Nhap nam sinh: ","Nhap thang : ","Nhap ngay: ");
    }
    public void InThongTin(){
        System.out.println(maHS+" : "+tenHS+" - Ngay sinh : "+ngaySinh.getYear()+"/"+ngaySinh.getMonthValue()+"/"+ngaySinh.getDayOfMonth());
    }

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
