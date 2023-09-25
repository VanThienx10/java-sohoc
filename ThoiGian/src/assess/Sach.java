package assess;

import java.util.ArrayList;
import java.util.List;

public class Sach extends TaiLieu{
    private String tenSach,tenTG;
    private int soTrang;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public void NhapThongTin(){
        NhapTaiLieu();
        sc.nextLine();
        System.out.print("Nhap ten sach: ");
        setTenSach(sc.nextLine());
        System.out.println("Nhap ten tac gia: ");
        setTenTG(sc.nextLine());
        System.out.println("Nhap so trang");
        setSoTrang(sc.nextInt());
    }

    public void InThongTin(){
        InTaiLieu();
        System.out.println("Ten sach: "+tenSach+" - Ten tac gia: "+tenTG+" - So trang: "+soTrang);
    }


    public static List<Sach> TimSach(List<Sach> lst,String ten){
        List<Sach> lstKQ = new ArrayList<>();

        for (Sach x:lst){
            if(x.getTenSach().trim().replaceAll(" ","").toLowerCase().contains(ten.toLowerCase())){
                lstKQ.add(x);
            }
        }
        return lstKQ;
    }
}
