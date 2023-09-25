package model;

import thuvien.InputHelper;

public class LoaiSanPham {
    private int loaiSp;
    private String tenLoai;

    public LoaiSanPham(){
        loaiSp = InputHelper.Nhapso("Nhap loai san pham","Nhap sai kieu du lieu !");
        tenLoai = InputHelper.NhapChuoi("Nhap ten loai san pham: ","Nhap sai do dai !",3,50);
    }
    public LoaiSanPham(int loaiSp, String tenLoai){
        this.loaiSp = loaiSp;
        this.tenLoai = tenLoai;
    }

    public void InThongTin(){
        System.out.println("Ma loai: "+loaiSp+" - Ten loai Sp: "+tenLoai);
    }
    public int getLoaiSp() {
        return loaiSp;
    }

    public void setLoaiSp(int loaiSp) {
        this.loaiSp = loaiSp;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
