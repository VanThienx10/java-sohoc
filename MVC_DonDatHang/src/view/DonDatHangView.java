package view;

import controller.DonDatHangConTroller;
import model.ChiTietDonHang;
import model.DonDatHang;
import model.SanPham;
import thuvien.InputHelper;

public class DonDatHangView {
    private DonDatHangConTroller controller;
    public DonDatHangView(){
        controller = new DonDatHangConTroller();
        menu();
    }
    public void menu(){
        System.out.println("1.Them don hang");
        System.out.println("2. Them san pham");
        System.out.println("3. Them chi tiet don hang");
        System.out.println("4. Hien thi thong tin don hang");
        System.out.println("5. Thoat");
        int reques= InputHelper.NhapSo("Chon chuong chinh: ","Nhap sai!");
        ConTroller(reques);
    }


    public void ConTroller(int reques){
        switch (reques){
            case 1:
                controller.ThemDonDatHang(new DonDatHang());
                break;
            case 2:
                controller.ThemSanPham(new SanPham());
                break;
            case 3:
                controller.ThemChiTietDonHang(new ChiTietDonHang());
                break;
            case 4:
                int mADDH = InputHelper.NhapSo("Nhap maDDH: ","nhap sai!");

                controller.HienThiDon(mADDH);
                break;
            case 5:System.exit(0);
        }
        menu();
    }
}
