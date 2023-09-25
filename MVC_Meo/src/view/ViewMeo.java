package view;

import model.Meo;
import services.MeoAppServices;
import thuvien.InputHelper;

import java.util.Scanner;

public class ViewMeo {
    private MeoAppServices controller;

    public ViewMeo(){

        controller = new MeoAppServices();
        menu();
    }

    public void menu(){
        System.out.println("1.Thêm mèo.");
        System.out.println("2.Sửa mèo thoe ID");
        System.out.println("3.Xóa Mèo theo ID");
        System.out.println("4.Hiển thị toàn bộ mèo");
        System.out.println("5.Hiển thị mèo theo ID.");
        System.out.println("6.Thay đổi tiếng kêu theo ID.");
        System.out.println("7. Thoát chương trình.");
        int reques = InputHelper.NhapSo("Chon chuong trinh: ","Nhap sai !");
        CONTROLLER(reques);

    }
    Scanner sc = new Scanner(System.in);
    public void CONTROLLER(int reques){
        switch (reques){
            case 1:
                controller.addMeo(new Meo() {
                    @Override
                    public int getId() {
                        return super.getId();
                    }

                    @Override
                    public int getTuoi() {
                        return super.getTuoi();
                    }

                    @Override
                    public void setTuoi(int tuoi) {
                        super.setTuoi(tuoi);
                    }

                    @Override
                    public String getTen() {
                        return super.getTen();
                    }

                    @Override
                    public void setTen(String ten) {
                        super.setTen(ten);
                    }

                    @Override
                    public String getGioitinh() {
                        return super.getGioitinh();
                    }

                    @Override
                    public void setGioitinh(String gioitinh) {
                        super.setGioitinh(gioitinh);
                    }

                    @Override
                    public String getTiengkeu() {
                        return super.getTiengkeu();
                    }

                    @Override
                    public void setTiengkeu(String tiengkeu) {
                        super.setTiengkeu(tiengkeu);
                    }
                });
                break;
            case 2:
                System.out.print("Nhap id can sua: ");
                int n = sc.nextInt();
                controller.remakeMeo(new Meo() {
                    @Override
                    public int getId() {
                        return super.getId();
                    }

                    @Override
                    public int getTuoi() {
                        return super.getTuoi();
                    }

                    @Override
                    public void setTuoi(int tuoi) {
                        super.setTuoi(tuoi);
                    }

                    @Override
                    public String getTen() {
                        return super.getTen();
                    }

                    @Override
                    public void setTen(String ten) {
                        super.setTen(ten);
                    }

                    @Override
                    public String getGioitinh() {
                        return super.getGioitinh();
                    }

                    @Override
                    public void setGioitinh(String gioitinh) {
                        super.setGioitinh(gioitinh);
                    }

                    @Override
                    public String getTiengkeu() {
                        return super.getTiengkeu();
                    }

                    @Override
                    public void setTiengkeu(String tiengkeu) {
                        super.setTiengkeu(tiengkeu);
                    }
                },n);
                break;

            case 3:
                System.out.print("Nhap id can xoa:");
                int x= sc.nextInt();
                controller.deleteMeo(x);
                break;
            case 4:
                controller.showFellMeo();
                break;
            case 5:
                System.out.print("Nhap id can show:");
                int y= sc.nextInt();
                controller.showMeoID(y);
                break;
            case 6:
                System.out.print("Nhap id meo can thay doi tieng keu :");
                int z= sc.nextInt();
                System.out.println();
                sc.nextLine();
                System.out.print("Nhap tieng meo can doi: ");
                String tiengmeo = sc.nextLine();
                controller.remakeTiengKeu(z,tiengmeo);
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }
}
