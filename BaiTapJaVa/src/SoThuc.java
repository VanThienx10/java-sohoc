import java.util.Scanner;

public class SoThuc {
    private double giaTri;
    private Boolean laSoDuong;

    public double getGiaTri() {
        return giaTri;
    }
    Scanner sc = new Scanner(System.in);
    public SoThuc(){
        System.out.println("Nhap gia tri:");
        double soThuc = sc.nextDouble();
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public Boolean getLaSoDuong() {
        setLaSoDuong();
        return laSoDuong;
    }

    private void setLaSoDuong() {
       if(giaTri>0) laSoDuong = true;
       laSoDuong = false;
    }
}
