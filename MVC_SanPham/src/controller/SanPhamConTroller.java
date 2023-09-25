package controller;

import model.LoaiSanPham;
import model.NhaCungCap;
import model.SanPham;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SanPhamConTroller {
    private List<SanPham> lstSP;
    private List<NhaCungCap> lstNhaCC;
    private List<LoaiSanPham> lstLoaiSP;

    public SanPhamConTroller(){
        lstSP = new ArrayList<>();
        lstLoaiSP = new ArrayList<>();
        lstNhaCC = new ArrayList<>();
    }


    public void ThemNhaCungCap(NhaCungCap nhaCC){
        for (NhaCungCap x: lstNhaCC){
            if(x.getNhaCC() == nhaCC.getNhaCC()){
                System.out.println("Ma nha CC da ton tai !!!");
                break;
            }
        }
        lstNhaCC.add(nhaCC);
        System.out.println("Them thanh cong !!!");

    }

    public void ThemLoaiSanPham(LoaiSanPham loaiSP){
        for (LoaiSanPham x: lstLoaiSP){
            if(x.getLoaiSp()==loaiSP.getLoaiSp()){
                System.out.println("Ma loai san pham da ton tai !!!");
                break;
            }
        }
        lstLoaiSP.add(loaiSP);
        System.out.println("Them thanh cong !!!");
    }


    public void ThemSanPham(SanPham sp){
        for(LoaiSanPham x: lstLoaiSP){
            if(sp.getLoaiSP().getLoaiSp()==x.getLoaiSp()){
                System.out.println("Loai san pham da ton tai");
                break;
            }else{
                System.out.println("Loai san pham chua ton tai! . Ban có muốn thêm loại sản phẩm này ko?");
                ThemLoaiSanPham(sp.getLoaiSP());
            }

        }

        for(NhaCungCap y: lstNhaCC){
            if(sp.getNhaCC().getNhaCC() == y.getNhaCC() ){
                System.out.println("Nha cung cap da ton tai");
                break;
            }else{
                System.out.println("Nha cung cap chua ton tai! . Ban có muốn thêm nha cung cap này ko?");
                ThemNhaCungCap(sp.getNhaCC());
            }

        }

        lstSP.add(sp);
        System.out.println("Them san pham thanh công");

    }

    public void HienThiLoaiSP(int loaiSP){

        for (SanPham x: lstSP){
            if(x.getLoaiSP().getLoaiSp()==loaiSP ){
                System.out.println(x.getLoaiSP().getLoaiSp()+ " - tên loại: "+x.getLoaiSP().getTenLoai());
            }
        }
    }



}
