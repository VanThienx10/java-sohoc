package controller;

import model.SoHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoHocController {
    private List<SoHoc> sh ;

    public SoHocController(){
        sh = new ArrayList<>();
    }


    public void TaoSoNgauNhien(int n){
        sh.clear();

        Random rd= new Random();
        for(int i=0;i<n;i++){
            int value = rd.nextInt(10000)+1;
            SoHoc sohoc = new SoHoc(value);
            sh.add(sohoc);

        }
    }


    public List<SoHoc> getDanhSach(){
        return sh;
    }


    public List<SoHoc> DSSoChan(){
        List<SoHoc> DSChan = new ArrayList<>();

        for (SoHoc x: sh){
            if (x.KtraChan()){
                DSChan.add(x);
            }
        }
        return DSChan;

    }
    public List<SoHoc> DSSoLe(){
        List<SoHoc> DSLe = new ArrayList<>();

        for (SoHoc x: sh){
            if (x.KtraChan()==false){
                DSLe.add(x);
            }
        }
        return DSLe;

    }

    public List<SoHoc> DSSoNguyenTo(){
        List<SoHoc> DSNgTo = new ArrayList<>();

        for (SoHoc x: sh){
            if (x.KtraSoNgTo()){
                DSNgTo.add(x);
            }
        }
        return DSNgTo;

    }

    public List<SoHoc> DSSoDoiXung(){
        List<SoHoc> DSDoiXung = new ArrayList<>();

        for (SoHoc x: sh){
            if (x.KtraSoDoiXung()){
                DSDoiXung.add(x);
            }
        }
        return DSDoiXung;

    }
}
