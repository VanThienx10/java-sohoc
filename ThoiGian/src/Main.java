import assess.Sach;
import assess.TaiLieu;
import assess.TruyenTranh;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sach> lst = new ArrayList<>();

        Sach sach1 = new Sach();
        sach1.NhapThongTin();
        Sach sach2 = new Sach();
        sach2.NhapThongTin();
        Sach sach3 = new Sach();
        sach3.NhapThongTin();
        sach1.InThongTin();
        sach2.InThongTin();
        sach3.InThongTin();
        lst.add(sach1);
        lst.add(sach2);
        lst.add(sach3);

        Sach.TimSach(lst,"Khoa hoc").forEach(x->x.InThongTin());

    }
}