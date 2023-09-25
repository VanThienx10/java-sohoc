import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
    private int maHocVien;
    private String hoTen,ho,email;
    private LocalDate ngaySinh;
    private double hocPhi;
      Scanner sc = new Scanner(System.in);
    public HocVien(){
        System.out.print("Nhap ma hoc vien: ");
        setMaHocVien(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho ten hoc vien: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap ngay sinh: ");
        setNgaySinh(LocalDate.parse(sc.nextLine()));
        System.out.print("Nhap hoc phi: ");
        setHocPhi(sc.nextDouble());
    }
    public void InThongTin(){
        HamHoTen();
        System.out.println("Ma hoc vien: "+maHocVien+" - Ho ten: "+hoTen+" - Ngay sinh: "+ngaySinh+" Hoc phi:"+hocPhi+ " - Email: "+email+" Ho:"+ho);
    }
    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHo() {
        HamHoTen();
        return ho;
    }



    public String getEmail() {
        HamHoTen();
        return email;
    }



    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getHocPhi() {
        setHocPhi(hocPhi);
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        if(hocPhi>3000000){
            this.hocPhi = hocPhi*0.95;
        }else {
            this.hocPhi = hocPhi;
        }
    }

    public void HamHoTen(){
        String[] arr = hoTen.trim().split(" ");
        ho = arr[0];
        String chuoi = hoTen.trim().toLowerCase();
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.contains(" ")){
               chuoi =  chuoi.replaceAll(" ","");
            }
        }

        email = chuoi+"@edusolution.com";

    }

    public static List<HocVien> TimKiemHocVien(List<HocVien> listHv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tim hoc vien can tim: ");
        String tk = sc.nextLine();

        List<HocVien> lstResult = new ArrayList<>();
        for(HocVien hv:listHv){
            if(hv.getHoTen().toLowerCase().contains(tk)){
                lstResult.add(hv);
            }
        }

        return lstResult;

    }


}
