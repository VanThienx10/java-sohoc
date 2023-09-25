package model;

import thuvien.InputHelper;

public class SanPham {
    private int maSP;
    private String tenSP;
    private LoaiSanPham loaiSP;
    private NhaCungCap nhaCC;

    public SanPham(){
        maSP = InputHelper.Nhapso("Nhap ma san pham: ","Nhap sai kieu du lieu !");
        tenSP  =InputHelper.NhapChuoi("Nhap ten san pham: ","Nhap sai do dai !",3,50);
        loaiSP = new LoaiSanPham();
        nhaCC = new NhaCungCap();
    }

    public void InThongTin(){
        System.out.println("Ma SP: "+maSP+" - Ten san pham: "+tenSP+"Loai san pham:  ma loai[ "+loaiSP.getLoaiSp()+" ] tenLoai[ "+loaiSP.getTenLoai()+" ] - Nha cung cap: maloai[ "+nhaCC.getNhaCC()+" ] tenNhaCC[ "+nhaCC.getTenNhaCC()+" ] soDT ["+nhaCC.getSoDT()+" ] ");
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

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public NhaCungCap getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(NhaCungCap nhaCC) {
        this.nhaCC = nhaCC;
    }
}
