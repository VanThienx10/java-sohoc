import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class DongHo {
    private int gio, phut, giay;
    private Boolean laBuoiSang;

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    public Boolean getLaBuoiSang() {
        setLaBuoiSang();
        return laBuoiSang;
    }

    private void setLaBuoiSang() {
        if (gio < 12) laBuoiSang = true;
        laBuoiSang = false;
    }

    public static int NhapGioPhutGiay(String mes, String error, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mes);
        int so = 0;

        try {
            so = sc.nextInt();
            if (so >= min && so <= max) {
                return so;
            } else {
                System.out.println(error);
                return NhapGioPhutGiay(mes, error, min, max);
            }
        } catch (Exception c) {
            System.out.println(error);
            return NhapGioPhutGiay(mes, error, min, max);
        }

    }

    public DongHo() {
        gio = NhapGioPhutGiay("Nhap gio: ", "Nhap sai gio ! ", 0, 24);
        phut = NhapGioPhutGiay("Nhap phut: ", "Nhap sai phut !", 0, 60);
        giay = NhapGioPhutGiay("Nhap giay: ", "Nhap sai giay! ", 0, 60);
    }

    public DongHo(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public LocalDateTime HamThoiGian() {
        LocalDate ld = LocalDate.of(2023, 7, 25);
        LocalDateTime ldtime = ld.atTime(gio, phut, giay);
        return ldtime;
    }

    public void InThongTin() {


        System.out.print(HamThoiGian());
        if (getLaBuoiSang()) {
            System.out.print(" la buoi sang");
        } else {
            System.out.println(" la buoi chieu");
        }
    }

    public DongHo LayKhoangThoiGian(DongHo dh) {
        int a = Math.abs(gio * 3600 + phut * 60 + giay - dh.gio * 3600 + dh.phut * 60 + dh.giay);
        return new DongHo(a / 3600, (a % 3600) / 60, (a % 3600) % 60);
    }


}
