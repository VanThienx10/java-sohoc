package controller;

import model.ChiTietDonHang;
import model.DonDatHang;
import model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonDatHangConTroller {
    private List<DonDatHang> lstddh;
    private List<ChiTietDonHang> lstctdh;
    private List<SanPham> lstsp;

    public DonDatHangConTroller(){
        lstctdh= new ArrayList<>();
        lstddh = new ArrayList<>();
        lstsp = new ArrayList<>();
    }

    public void ThemSanPham(SanPham sp){
        lstsp.add(sp);
        System.out.println("Them san pham thanh cong !");
    }
    public void ThemDonDatHang(DonDatHang ddh){
        lstddh.add(ddh);
        System.out.println("Them don dat hang thanh cong!");
    }

    Scanner sc = new Scanner(System.in);
    public void ThemChiTietDonHang(ChiTietDonHang ct){



        for (ChiTietDonHang x: lstctdh){
            if(x.getMaSP()==ct.getMaSP() || x.getMaDDH()==ct.getMaDDH()){
                System.out.println("San pham da ton tai !");
                break;
            }
        }
        System.out.println("San pham chua co trong gio hang ! Ban co muon them ko ?");
        System.out.println("1. CO");
        System.out.println("2. Khong");
        System.out.print("Chon: ");
        int kq = sc.nextInt();
        switch (kq){
            case 1:
                lstctdh.add(ct);
                System.out.println("Them chi tiet don hang thanh cong!");
                break;
            case 2:
                System.out.println("Them that bai!");
                break;
        }


    }


    public void HienThiDon(int MaDDH){
        for (ChiTietDonHang x: lstctdh){

            if(x.getMaDDH()== x.getMaDDH()){
                System.out.println("MaDDH: "+x.getMaDDH()+" - ID: "+x.getId()+" - MaSP: "+x.getMaSP()+" - so luong: "+x.getSoLuong());

            }
        }
    }
}
