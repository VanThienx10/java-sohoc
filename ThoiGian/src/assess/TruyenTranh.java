package assess;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TruyenTranh extends TaiLieu{
    private String tenTruyen;
    private int ngayPhatHanh;

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void NhapThongTin(){
        NhapTaiLieu();
        System.out.print("Nhap ten truyen tranh: ");
        setTenTruyen(sc.nextLine());
        System.out.println("Nhap ngay phat hanh: ");
        setNgayPhatHanh(sc.nextInt());
    }

    public void InThongTin(){
        InTaiLieu();
        System.out.println("Ten truyen : "+tenTruyen+" - Ngay phat hanh: "+ngayPhatHanh);
    }

    public static List<TruyenTranh> TimTapChi(List<TruyenTranh> lst, String ten){
        List<TruyenTranh> lstKQ = new ArrayList<>();

        for (TruyenTranh x:lst){
            if(x.getTenTruyen().trim().replaceAll(" ","").toLowerCase().contains(ten.toLowerCase())){
                lstKQ.add(x);
            }
        }
        return lstKQ;
    }
}
