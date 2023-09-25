package assess;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TaiLieu {
    protected int maTaiLieu,soBanPH;
    protected String tenNhaSX;

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public String getTenNhaSX() {
        return tenNhaSX;
    }

    public void setTenNhaSX(String tenNhaSX) {
        this.tenNhaSX = tenNhaSX;
    }

    Scanner sc =  new Scanner(System.in);
    public void NhapTaiLieu(){
        System.out.print("Nhap ma tai lieu: ");
        setMaTaiLieu(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        setTenNhaSX(sc.nextLine());
        System.out.print("Nhap so ban phat hanh: ");
        setSoBanPH(sc.nextInt());
    }

    public  void InTaiLieu(){
        System.out.println("Ma ta lieu: "+maTaiLieu+" - Ten nha xuat ban: "+tenNhaSX+" - So ban phat hanh "+soBanPH);
    }

    public static List<TaiLieu> TimTaiLieu(List<TaiLieu> lst,String ten){
        List<TaiLieu> lstKQ = new ArrayList<>();
        for(TaiLieu x:lst){
            if(x.getTenNhaSX().trim().replaceAll(" ","").toLowerCase().contains(ten.toLowerCase())){
                lstKQ.add(x);
            }
        }
        return lstKQ;
    }

}
