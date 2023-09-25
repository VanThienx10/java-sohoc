package view;

import controller.SoHocController;
import model.SoHoc;

import java.util.List;
import java.util.Scanner;

public class SoHocView {
    private SoHocController controller;


    public SoHocView(){
        controller = new SoHocController();
        menu();
    }

    public void menu(){
        System.out.println("1. Tao moi danh sach ");
        System.out.println("2. Hien thi toan bo danh sach");
        System.out.println("3. Danh sach so chan");
        System.out.println("4. Danh sach so le");
        System.out.println("5. Danh sach so nguyen to");
        System.out.println("6. Danh sach so doi xung");
        System.out.println("7. Thoat chuong trinh");
        System.out.print("\nCHON CHUONG TRINH (1-7): ");
        int reques = sc.nextInt();
        conTroller(reques);
    }

    Scanner sc = new Scanner(System.in);
    public void conTroller(int reques){
        switch (reques){
            case 1:
                System.out.print("Nhap so phan tu trong danh sach: ");;
                int n =sc.nextInt();
                controller.TaoSoNgauNhien(n);
                System.out.println("Dao tao thanh cong "+n+" so ngau nhien");
                break;
            case 2:
                HienThiDanhSach(controller.getDanhSach(),"Tat ca: ");
                break;
            case 3:
                HienThiDanhSach(controller.DSSoChan(),"Danh sach so chan: ");
                break;
            case 4:
                HienThiDanhSach(controller.DSSoLe(),"Danh sach so le: ");
                break;
            case 5:
                HienThiDanhSach(controller.DSSoNguyenTo(),"Danh sach so nguyen to: ");
                break;
            case 6:
                HienThiDanhSach(controller.DSSoDoiXung(),"Danh sach so doi xung : ");
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }


    public void HienThiDanhSach(List<SoHoc> ds, String title){
        System.out.println(title);
        if(ds.size() ==0){
            System.out.println("khong co phan tu nao trong danh sach!");
        }else {
            for (SoHoc x: ds){
                System.out.print(x.getSoNguyen()+" ");
            }
        }
    }
}
