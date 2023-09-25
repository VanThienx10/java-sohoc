package controller;

import model.Diem;
import model.HocSinh;
import model.MonHoc;
import thuvien.InputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiemController {
    private List<Diem> lstDiem;
    private  List<HocSinh> lstHocSinh;
    private  List<MonHoc> lstMonHoc;
    public DiemController(){
        lstDiem = new ArrayList<>();
        lstHocSinh = new ArrayList<>();
        lstMonHoc = new ArrayList<>();
    }

    public void ThemHocSinhMoi(HocSinh hs){
        for(HocSinh x: lstHocSinh){
            if(x.getMaHS()==hs.getMaHS()){
                System.out.println("Ma hoc sinh da ton tai !");
            }
        }
        lstHocSinh.add(hs);
    }
    public void ThemMonHocMoi(MonHoc mh){
        for(MonHoc x: lstMonHoc){
            if(x.getMaMH()==mh.getMaMH()){
                System.out.println("Ma mon hoc da ton tai !");
            }
        }
        lstMonHoc.add(mh);
    }

    Scanner sc = new Scanner(System.in);
    public void ChamDiem(int maHS,int maMH,double diem ){

        Boolean daChamDiem = false;
        for(Diem x: lstDiem){
            if(x.getMaMH()==maMH && x.getMaHS() ==maHS){
                x.setDiem(diem);
                daChamDiem = true;
                break;
            }
        }
        if(!daChamDiem){
            Diem diemMoi = new Diem(maHS,maMH,diem);
            lstDiem.add(diemMoi);
        }

    }

    public void BangDiem(int maHS){


        for (Diem x: lstDiem){
            if(x.getMaHS()==maHS){
                System.out.println("Ma HS: "+x.getMaHS());
                System.out.println("Ma MH: "+x.getMaMH());
                System.out.println("Diem: "+x.getDiem());
            }
        }
    }

    public void TongKetMon(int maMH){

        for (Diem x: lstDiem){
            if(x.getMaMH()==maMH){
                System.out.println("Ma HS: "+x.getMaHS());
                System.out.println("Ma MH: "+x.getMaMH());
                System.out.println("Diem: "+x.getDiem());
            }
        }
    }






}
