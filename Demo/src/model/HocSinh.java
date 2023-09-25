package model;

import lib.InputHelper;

public class HocSinh {
    private int id;
    private String name;
    private int age;

    public HocSinh() {
        id = InputHelper.NhapSo("Nhap ID:","Nhap sai kieu du lieu!");
        name = InputHelper.NhapChuoi("Nhap ten: ","Nhap sai do dai!",3,50);
        age = InputHelper.NhapSo("Nhap tuoi: ","Nhap sai kieu du lieu!");
    }
    public void showInFo(){
        System.out.println("ID: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
