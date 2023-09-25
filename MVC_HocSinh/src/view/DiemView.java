package view;

import controller.DiemController;
import model.HocSinh;
import model.MonHoc;
import thuvien.InputHelper;

public class DiemView {
    private DiemController controller;

    public DiemView() {
        controller = new DiemController();
        menu();
    }

    public void menu() {
        System.out.println("1. Them hoc sinh");
        System.out.println("2. Them mon hoc");
        System.out.println("3.Cham diem");
        System.out.println("4.Xem bang diem hoc sinh");
        System.out.println("5. Xem diem tong ket hoc sinh");
        System.out.println("6. Thoat");
        int reques = InputHelper.NhapSo("Chon chuong trinh: ","Nhap sai kieu du lieu !");
        ConTroller(reques);
    }

    public void ConTroller(int reques) {
        switch (reques) {
            case 1:
                controller.ThemHocSinhMoi(new HocSinh());
                System.out.println("Them thanh cong !!!!!");
                break;
            case 2:
                controller.ThemMonHocMoi(new MonHoc());
                System.out.println("Them thanh cong !!!!!");
                break;
            case 3:
                int maHS = InputHelper.NhapSo("Nhap ma hoc sinh can sua: ","Nhap sai kieu du lieu");
                int maMH = InputHelper.NhapSo("Nhap ma mon hoc can sua: ","Nhap sai kieu du lieu");
                double diem = InputHelper.NhapDiem("Nhap diem: ","Nhap sai kieu du lieu !");
                controller.ChamDiem(maHS,maMH,diem);
                break;
            case 4:
                int mahs = InputHelper.NhapSo("Nhap ma hoc sinh : ","Nhap sai kieu du lieu");

                System.out.println("Bang diem: ");
                controller.BangDiem(mahs);
                break;

            case 5:
                int mamh = InputHelper.NhapSo("Nhap ma mon hoc can sua: ","Nhap sai kieu du lieu");
                System.out.println("Tong ket mon: ");
                controller.TongKetMon(mamh);
                break;
            case 6:
                System.exit(0);
        }
        menu();
    }

}
