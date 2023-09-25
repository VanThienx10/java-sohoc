package view;

import controller.SanPhamConTroller;
import model.SanPham;
import thuvien.InputHelper;

public class ViewSanPham {
    private SanPhamConTroller conTroller;
    public ViewSanPham(){
        conTroller =new SanPhamConTroller();
        menu();
    }

    public void menu(){
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị sản phẩm của loại");
        System.out.println("3. Hiển thị sản phẩm của nhà cung cấp");
        System.out.println("4. Thoát");
        int reques = InputHelper.Nhapso("Chọn chương chình","Nhập sai kiểu dữ liệu");
        ConTrolLer(reques);
    }
    public void ConTrolLer(int reques){
        switch (reques){
            case 1:
                conTroller.ThemSanPham(new SanPham());
                break;
            case 2:
                int malsp = InputHelper.Nhapso("Nhập mã loại sp: ","Nhập sai kiểu dữ liệu");
               conTroller.HienThiLoaiSP(malsp);
               break;
            case 3:
                System.exit(0);

        }
        menu();
    }
}
