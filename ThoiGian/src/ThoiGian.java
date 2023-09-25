import java.util.Calendar;
import java.util.Scanner;

public class ThoiGian {
    private int ngay, thang, nam, thu;
    private Boolean laNamNhuan = false;

    public int getNgay() {
        return ngay;
    }

    Calendar cal = Calendar.getInstance();

    public void setNgay(int ngay) {

        this.ngay = ngay;
        cal.set(nam, thang - 1, ngay);
        thu = cal.get(Calendar.DAY_OF_WEEK);
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
        if (this.nam % 4 == 0 && this.nam % 100 != 0 || this.nam % 400 == 0) laNamNhuan = true;
        else laNamNhuan = false;
    }

    public int getThu() {
        setNgay(ngay);
        return thu;
    }

    public Boolean getLaNamNhuan() {
        setNam(nam);
        return laNamNhuan;
    }

    Scanner sc = new Scanner(System.in);

    private int NhapNgayThangNam(String mes, String error, int min, int max) {
        System.out.print(mes);
        int so = 0;
        try {
            so = Integer.parseInt(sc.nextLine());
            return so;
        } catch (Exception e) {
            System.out.println(error);
            return NhapNgayThangNam(mes, error, min, max);
        }
    }

    public ThoiGian(int nam, int thang, int ngay) {
        setNam(nam);
        setThang(thang);
        setNgay(ngay);
    }

    public ThoiGian() {
        setNam(NhapNgayThangNam("Nhap nam: ", "Nhap sai nam !", 1000, cal.get(Calendar.YEAR)));
        setThang(NhapNgayThangNam("Nhap thang: ", "Nhap sai thang", 1, 12));
        if (thang == 2) {
            if (laNamNhuan) {
                setNgay(NhapNgayThangNam("Nhap ngay: ", "Nhap sai ngay", 1, 29));
            } else {
                setNgay(NhapNgayThangNam("Nhap ngay: ", "Nhap sai ngay", 1, 28));


            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            setNgay(NhapNgayThangNam("Nhap ngay: ", "Nhap sai ngay", 1, 30));


        } else {
            setNgay(NhapNgayThangNam("Nhap ngay: ", "Nhap sai ngay", 1, 31));


        }
    }

    public long LayKhoangThoiGian(ThoiGian tg) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(getNam(), getThang() - 1, getNgay());
        cal1.set(tg.getNam(),tg.getThang()-1,tg.getNgay());
        long n = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        return n;
    }

    public void LayThongTin() {
        System.out.println("Thu " + getThu() + " ngay " + ngay + " thang " + thang + " nam " + nam + " " + laNamNhuan + " la nam nhuan");
    }


}
