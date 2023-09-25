package assess;

import java.util.ArrayList;
import java.util.List;

public class TapChi extends TaiLieu{
    private String tenTapChi;
    private int soPhathanh,thangPhatHanh;

    public String getTenTapChi() {
        return tenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
        this.tenTapChi = tenTapChi;
    }

    public int getSoPhathanh() {
        return soPhathanh;
    }

    public void setSoPhathanh(int soPhathanh) {
        this.soPhathanh = soPhathanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void NhapThongTin(){
        NhapTaiLieu();
        System.out.print("Nhap ten ten tap chi: ");
        setTenTapChi(sc.nextLine());
        System.out.println("Nhap so phat hanh: ");
        setSoPhathanh(sc.nextInt());
        System.out.println("Nhap thang phat hanh: ");
        setThangPhatHanh(sc.nextInt());
    }

    public void InThongTin(){
        InTaiLieu();
        System.out.println("Ten tap chi: "+tenTapChi+" - So phat hanh: "+soPhathanh+" - Thang phat hanh : "+thangPhatHanh);
    }

    public static List<TapChi> TimTapChi(List<TapChi> lst, String ten){
        List<TapChi> lstKQ = new ArrayList<>();

        for (TapChi x:lst){
            if(x.getTenTapChi().trim().replaceAll(" ","").toLowerCase().contains(ten.toLowerCase())){
                lstKQ.add(x);
            }
        }
        return lstKQ;
    }
}
