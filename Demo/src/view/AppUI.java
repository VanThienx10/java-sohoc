package view;

import lib.InputHelper;
import model.HocSinh;
import services.AppServices;

public class AppUI {
    public AppServices app;

    public AppUI() {
        app = new AppServices();
        menu();
    }

    public void menu(){
        System.out.println("1. Them hoc sinh");
        System.out.println("2. Sua hoc sinh");
        System.out.println("3. Xoa hoc sinh");
        System.out.println("4. Show hoc sinh");
        System.out.println("5. Thoat chuong trinh");
        int reques = InputHelper.NhapSo("Chon chuong trinh","Nhap sai kieu du lieu!");
        controller(reques);
    }

    public void controller(int reques){
        switch (reques){
            case 1:
                app.addNew(new HocSinh());
                break;
            case 2:
                app.remakeHocSinh(new HocSinh(), InputHelper.NhapSo("Nhap Id can sua","Nhap sai kieu du lieu!"));
                break;
            case 3:
                app.deleteHocSinh( InputHelper.NhapSo("Nhap Id can xoa","Nhap sai kieu du lieu!"));
                break;
            case 4:
                app.showHocSinh();
                break;
            case 5:
                System.exit(0);
        }
        menu();
    }
}
