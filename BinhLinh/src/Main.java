import assess.BinhLinh;
import assess.CungThu;
import assess.DauSi;
import assess.KiemSi;

public class Main {
    public static void main(String[] args) {
        BinhLinh bl= new BinhLinh();
        bl.setTenBinhLinh("Linh 1");
        bl.setTrangBi(true);

        BinhLinh cung1 = new CungThu();
        cung1.setTenBinhLinh("cung1");
        cung1.setTrangBi(true);

        BinhLinh cung2 = new CungThu();
        cung2.setTenBinhLinh("cung2");

        BinhLinh dausi = new DauSi();
        dausi.setTenBinhLinh("dausi");
        dausi.setTrangBi(true);

        BinhLinh kiemsi = new KiemSi();
        kiemsi.setTenBinhLinh("kiem si");
        kiemsi.setTrangBi(true);

        bl.InThongTin();
        cung1.InThongTin();
        cung2.InThongTin();
        dausi.InThongTin();
        kiemsi.InThongTin();


        dausi.ChienDau(cung1);


    }
}