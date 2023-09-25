package services;

import model.Meo;

import java.util.ArrayList;
import java.util.List;

public class MeoAppServices implements MeoInterface {
    private List<Meo> lstMeo;

    public MeoAppServices(){
        lstMeo = new ArrayList<>();
    }


    @Override
    public void addMeo(Meo meo) {
        for (Meo x: lstMeo){
            if(x.getId()== meo.getId()){
                System.out.println("Meo da ton tai !");
                return;
            }
        }
        lstMeo.add(meo);
        System.out.println("Them meo thanh cong!");
    }

    @Override
    public void remakeMeo(Meo newMeo, int id) {
        for (int i = 0;i<lstMeo.size();i++){
            if(lstMeo.get(i).getId()==id){
                lstMeo.set(i,newMeo);
                System.out.println("Sua meo thanh cong!");
            }else {
                System.out.println("Meo ko ton tai !");
            }
        }

    }

    @Override
    public void deleteMeo(int id) {
        for (Meo x: lstMeo){
            if(x.getId()==id){
                lstMeo.remove(x);
                System.out.println("Xoa thanh cong! ");
                break;
            }else {
                System.out.println("Meo ko ton tai !");
            }
        }

    }

    @Override
    public void showFellMeo() {
        if(lstMeo.size()==0){
            System.out.println("hien ko co Meo nao!");
            return;

        }else {
            System.out.println("Tat ca: ");
            for (Meo x:lstMeo){
                System.out.println("ID: "+x.getId()+" - Ten: "+x.getTen()+" - Tuoi: "+x.getTuoi()+" - Gioi tinh: "+x.getGioitinh()+" - Tieng keu: "+x.getTiengkeu());
            }
        }
    }

    @Override
    public void showMeoID(int id) {
            for (Meo x: lstMeo){
                if(x.getId()==id){
                    System.out.println("ID: "+x.getId()+" - Ten: "+x.getTen()+" - Tuoi: "+x.getTuoi()+" - Gioi tinh: "+x.getGioitinh()+" - Tieng keu: "+x.getTiengkeu());

                }
            }
    }

    @Override
    public void remakeTiengKeu(int id,String tiengnew) {
        for (Meo x: lstMeo){
            if(x.getId()==id){
                x.setTiengkeu(tiengnew);
                System.out.println("Thay doi thanh cong");
                break;
            }else {
                System.out.println("id ko ton tai !");
            }
        }

    }
}
