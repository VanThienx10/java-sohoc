package services;

import model.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class AppServices  implements AppHocSinhInterface{
    private List<HocSinh> db;

    public AppServices() {
        db = new ArrayList<>();
    }

    @Override
    public boolean addNew(HocSinh input) {
        for (HocSinh hs: db){
            if(hs.getId()==input.getId()){
                System.out.println("Id da ton tai !");
                return false;
            }
        }
        db.add(input);
        System.out.println("Them thanh cong");
        return true;
    }

    @Override
    public boolean remakeHocSinh(HocSinh dataNew, int id) {
        for(int i = 0;i<db.size();i++){
            if(db.get(i).getId() ==id){
                db.set(i,dataNew);
                System.out.println("Sua thanh cong");
                return true;
            }
        }
        System.out.println("Sua that bai");
        return false;
    }

    @Override
    public boolean deleteHocSinh(int id) {
        for (HocSinh hs: db){
            if(hs.getId()==id){
                db.remove(hs);
                System.out.println("Xoa thanh cong");
                return true;
            }
        }
        System.out.println("Xoa that bai");
        return false;
    }

    @Override
    public boolean showHocSinh() {
        for (HocSinh hs:db){
            if (db.size()==0){
                System.out.println("Khong co du lieu trong danh sach!");
                return false;
            }else {
                hs.showInFo();

            }
        }
        return true;
    }
}
