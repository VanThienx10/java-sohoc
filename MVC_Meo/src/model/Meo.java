package model;

import thuvien.InputHelper;

public  abstract   class Meo {
    private int id,tuoi;
    private String ten, gioitinh,tiengkeu;
    public Meo(){
        id = InputHelper.NhapSo("Nhap id: ","Nhap sai !");
        ten = InputHelper.NhapChuoi("Nhap ten: ","Nhap sai !",3,50);
        tuoi = InputHelper.NhapSo("Nhap tuoi: ","Nhap sai!");
        gioitinh = InputHelper.NhapChuoi("Gioi tinh: ","Nhap sai ",1,6);
        tiengkeu = InputHelper.NhapChuoi("Nhap tieng keu: ","Nhap sai",3,100);
    }

    public Meo(int id, int tuoi, String ten, String gioitinh, String tiengkeu) {
        this.id = id;
        this.tuoi = tuoi;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.tiengkeu = tiengkeu;
    }



    public int getId() {
        return id;
    }



    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTiengkeu() {
        return tiengkeu;
    }

    public void setTiengkeu(String tiengkeu) {
        this.tiengkeu = tiengkeu;
    }
}
