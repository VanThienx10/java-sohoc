import java.util.Arrays;
import java.util.Scanner;

public class SoNguyen {
    private int soNguyen;
    private Boolean laSoChan;
    private Boolean laNguyenTo;
    private Boolean laSoDoiXung;

    public SoNguyen() {
        soNguyen = NhapSo();
    }

    public void InThongTin() {
        System.out.println("So nguyen vua nhap: " + soNguyen + " - " + KtraSoChan(soNguyen) + " - " + KtraNguyenTo(soNguyen) + " - " + KtraDoiXung(soNguyen));
    }

    public int getSoNguyen() {
        return soNguyen;
    }

    private void setSoNguyen(int soNguyen) {
        this.soNguyen = soNguyen;
    }

    public Boolean getLaSoChan() {
        return laSoChan;
    }

    public Boolean getLaNguyenTo() {
        return laNguyenTo;
    }

    public Boolean getLaSoDoiXung() {
        return laSoDoiXung;
    }

    Scanner sc = new Scanner(System.in);


    public static int NhapSo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int so = 0;
        try {
            so = Integer.parseInt(sc.nextLine());
            return so;
        } catch (Exception e) {
            System.out.println("Nhap sai ! Nhap lai !");
            return NhapSo();
        }
    }

    public String KtraSoChan(int so) {
        if (so % 2 == 0) {
            return "la so chan";
        } else {
            return "la so le";
        }
    }

    public String KtraNguyenTo(int a) {
        int dem = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                dem++;
            }
        }
        if (dem == 0) {
            return "la so nguyen to";
        } else {
            return "ko la so nguyen to";
        }
    }


    public String KtraDoiXung(int so) {
        String a = Integer.toString(so);
        char[] arr = a.toCharArray();
        int dem = 0;
        for (int i = 0; i < arr.length / 2-1; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                dem++;
                break;
            }
        }
        if (dem == 0) {
            return " là số đối xứng";
        } else {
            return "Khong la số đối xứng" + Arrays.toString(arr);
        }
    }


}
